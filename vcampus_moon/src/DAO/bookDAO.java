package DAO;
/**
 * 类 {@code courseDAO} 管理booktbl的类.
 *
 * <p> 管理booktbl
 *
 * @since 2019/8/19
 */
import java.lang.Exception;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import message.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class bookDAO {
    private static Connection con;
    private static PreparedStatement sql=null;
    private static ResultSet result=null;
    public void setcon(Connection c){
        this.con=c;
    }

    /**
     *
     * <p>
     *     添加图书
     * </p>
     * @param book_name 书籍名称
     * @param book_id 书籍编号
     * @param book_author 书籍作者
     * @param book_press 书籍出版社
     * @param book_total 书籍总数
     * @param book_borrowed 借书数量
     * @param book_introduction 书籍简介
     * @return 是否成功
     * @throws Exception sql异常
     */
    public boolean addBook(String book_name,String book_id,String book_author,String book_press,String book_total,String book_borrowed,String book_introduction) throws Exception{
        sql = con.prepareStatement("insert into Booktbl (Book_name, Book_id, Book_author,Book_press,Book_total,Book_borrowed,Book_introduction) values (?, ?, ?,?,?,?,?)");

        sql.setString(1, book_name);
        sql.setString(2, book_id);
        sql.setString(3, book_author);
        sql.setString(4, book_press);
        sql.setString(5, book_total);
        sql.setString(6, book_borrowed);
        sql.setString(7, book_introduction);
        sql.executeUpdate();
        return true;
    }

    /**
     *
     * <p>
     *     更新图书
     * </p>
     * @param book_name 书籍名称
     * @param book_id 书籍编号
     * @param book_author 书籍作者
     * @param book_press 书籍出版社
     * @param book_total 书籍总数
     * @param book_borrowed 借书数量
     * @param book_introduction 书籍简介
     * @return 是否成功
     * @throws Exception sql异常
     */
    public boolean updateBook(String book_name,String book_id,String book_author,String book_press,String book_total,String book_borrowed,String book_introduction) throws Exception{
        sql = con.prepareStatement("update Booktbl set Book_name=?, Book_id=?, Book_author=?,Book_press=?,Book_total=?,Book_borrowed=?,Book_introduction=? where Book_id=?");

        sql.setString(1, book_name);
        sql.setString(2, book_id);
        sql.setString(3, book_author);
        sql.setString(4, book_press);
        sql.setString(5, book_total);
        sql.setString(6, book_borrowed);
        sql.setString(7, book_introduction);
        sql.setString(8, book_id);
        sql.executeUpdate();
        return true;
    }

    /**
     *
     * <p>
     *     删除图书
     * </p>
     * @param book_id 书籍编号
     * @throws Exception sql异常
     */
    public void deleteBook(String book_id) throws Exception {
        System.out.println("删除"+book_id);
        sql=con.prepareStatement("DELETE FROM Booktbl WHERE Book_id"+"="+"'"+book_id+"'");
        sql.executeUpdate();
    }

    /**
     *
     * <p>
     *     获得图书列表
     * </p>
     * @return 图书对象列表
     * @throws Exception sql异常
     */
    public ArrayList<BookInfo> listBook() throws Exception{
        ArrayList<BookInfo> booklist=new ArrayList<BookInfo>();
        sql=con.prepareStatement("select * from Booktbl");
        result=sql.executeQuery();
        while (result.next()){
            BookInfo temp=new BookInfo();
            temp.setBook_name(result.getString("Book_name"));
            temp.setBook_id(result.getString("Book_id"));
            temp.setBook_author(result.getString("Book_author"));
            temp.setBook_press(result.getString("Book_press"));
            temp.setBook_total(result.getInt("Book_total"));
            temp.setBook_borrowed(result.getInt("Book_borrowed"));
            temp.setBook_introduction(result.getString("Book_introduction"));
            booklist.add(temp);
        }
        return booklist;
    }

    /**
     *
     * <p>
     *     借书
     * </p>
     * @param book_id 书籍编号
     * @param usr_id 用户id
     * @throws Exception sql异常
     */
    public void borrowBook(String book_id,String usr_id) throws Exception{
        sql=con.prepareStatement("select * from Booktbl where Book_id=?");
        sql.setString(1,book_id);
        result=sql.executeQuery();
        int borrowed_num=0;
        int total_num=0;
        while (result.next()){
            borrowed_num=result.getInt("Book_borrowed");
            total_num=result.getInt("Book_total");
        }

        if(total_num-borrowed_num>0){
            borrowed_num++;
            sql=con.prepareStatement("update Booktbl set Book_borrowed=? where Book_id=?");
            sql.setString(1,borrowed_num+"");
            sql.setString(2,book_id);
            sql.executeUpdate();
            addBookborrow(book_id,usr_id);
        }
    }

    /**
     *
     * <p>
     *     获得借书列表
     * </p>
     * @return 管理员借书列表
     * @throws SQLException sql异常
     */
    public ArrayList<BookInfo> listBookBorrow() throws SQLException {
        ArrayList<BookInfo> booklist=new ArrayList<BookInfo>();
        sql=con.prepareStatement("select * from Borrowtbl");
        result=sql.executeQuery();
        while (result.next()){
            BookInfo temp=new BookInfo();
            temp.setBook_id(result.getString("Book_id"));
            temp.setBook_borrowStartTime(result.getString("StartTime"));
            temp.setBook_introduction(result.getString("Usr_id"));
            booklist.add(temp);
        }
        return booklist;
    }

    /**
     *
     * <p>
     *     获得用户端借书列表
     * </p>
     * @param usr_id 用户ID
     * @return 用户借书列表
     * @throws SQLException sql异常
     */
    public ArrayList<BookInfo> listUsrBookBorrow(String usr_id) throws SQLException {
        ArrayList<BookInfo> booklist=new ArrayList<BookInfo>();
        sql=con.prepareStatement("select * from Booktbl where Book_id"+"="+"'"+usr_id+"'");
        result=sql.executeQuery();
        while (result.next()){
            BookInfo temp=new BookInfo();
            temp.setBook_id(result.getString("Book_id"));
            temp.setBook_borrowStartTime(result.getString("StartTime"));
            temp.setBook_introduction(result.getString("Usr_id"));
            booklist.add(temp);
        }
        return booklist;
    }

    /**
     *
     * <p>
     *     还书
     * </p>
     * @param book_id 书籍编号
     * @param usr_id 用户ID
     * @throws Exception sql异常
     */
    public void returnBook(String book_id, String usr_id) throws Exception {
        if (deleteBookborrow(book_id,usr_id)) {
            sql = con.prepareStatement("select * from Borrowtbl WHERE Book_id" + "=" + "'" + book_id + "'");
            result = sql.executeQuery();
            int borrowed_num = 0;
            while (result.next()) {
                borrowed_num = result.getInt("Book_borrowed");
            }
            borrowed_num--;
            sql = con.prepareStatement("update Booktbl set Book_borrowed=? where Book_id=?");
            sql.setString(1, borrowed_num + "");
            sql.setString(2, book_id);
            sql.executeUpdate();
        }
    }

    /**
     *
     * <p>
     *     删除借书信息
     * </p>
     * @param book_id 书籍编号
     * @param usr_id 用户ID
     * @return 是否成功
     * @throws Exception sql异常
     */
    public boolean deleteBookborrow(String book_id, String usr_id) throws Exception{
        System.out.println("删除"+ book_id + " "+ usr_id);
        sql=con.prepareStatement("DELETE FROM Borrowtbl WHERE Book_id"+"="+"'"+book_id+"' and where Usr_id"+"="+"'"+usr_id+"'");
        sql.executeUpdate();
        return true;
    }

    /**
     *
     * <p>
     *     添加借书信息
     * </p>
     * @param book_id 书籍编号
     * @param usr_id 用户ID
     * @return
     * @throws Exception
     */
    public boolean addBookborrow(String book_id,String usr_id) throws Exception{
        String time=new Date().toString();
        System.out.println(time);
        sql = con.prepareStatement("insert into Borrowtbl (Book_id, StartTime,Usr_id) values (?,?,?)");

        sql.setString(1, book_id);
        sql.setString(2, time);
        sql.setString(3, usr_id);
        sql.executeUpdate();
        return true;
    }

    /**
     * @see {@link ToAccess}
     */
}
