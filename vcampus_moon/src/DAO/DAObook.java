package DAO;

import java.lang.Exception;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import message.*;
import java.util.ArrayList;

public class DAObook {
    private static Connection con;
    private static PreparedStatement sql=null;
    private static ResultSet result=null;
    public void setcon(Connection c){
        this.con=c;
    }

    public boolean addBook(String book_name,String book_id,String book_author,String book_total,String book_borrowed,String book_available,String book_introduction) throws Exception{
        sql = con.prepareStatement("insert into Booktbl (Book_name, Book_id, Book_author,Book_total,Book_borrowed,Book_available,Book_introduction) values (?, ?, ?,?,?,?)");

        sql.setString(1, book_name);
        sql.setString(2, book_id);
        sql.setString(3, book_author);
        sql.setString(4, book_total);
        sql.setString(5, book_borrowed);
        sql.setString(6, book_available);
        sql.setString(7, book_introduction);
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
            temp.setBook_total(result.getInt("Book_total"));
            temp.setBook_borrowed(result.getInt("Book_borrowed"));
            temp.setBook_available(result.getBoolean("Book_available"));
            temp.setBook_introduction(result.getString("Book_introduction"));
            booklist.add(temp);
        }
        return booklist;
    }
}
