package DAO;

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

    public void deleteBook(String book_id) throws Exception {
        System.out.println("删除"+book_id);
        sql=con.prepareStatement("DELETE FROM Booktbl WHERE Book_id"+"="+"'"+book_id+"'");
        sql.executeUpdate();
    }

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

    public void returnBook(String book_id, String usr_id) throws Exception {
        if (deleteBookborrow(book_id,usr_id)){

        }
        sql=con.prepareStatement("select * from Borrowtbl WHERE Usr_id"+"="+"'"+usr_id+"'");
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
            deleteBookborrow(book_id,usr_id);
        }
    }

    public boolean deleteBookborrow(String book_id, String usr_id) throws Exception{
        System.out.println("删除"+ book_id + " "+ usr_id);
        sql=con.prepareStatement("DELETE FROM Borrowtbl WHERE Book_id"+"="+"'"+book_id+"' and where Usr_id"+"="+"'"+usr_id+"'");
        sql.executeUpdate();
        return true;
    }

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
}
