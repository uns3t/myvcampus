package DAO;

import java.lang.Exception;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import message.*;
import java.util.ArrayList;

public class DAOstudent {
    private static Connection con;
    private static PreparedStatement sql=null;
    private static ResultSet result=null;
    public void setcon(Connection c){
        this.con=c;
    }

    public boolean addStudent(String student_id,String student_name,String student_college,String student_age) throws Exception{
        sql = con.prepareStatement("insert into Studenttbl (Student_id, Student_name, Student_college,Student_age) values (?, ?, ?,?)");

        sql.setString(1, student_id);
        sql.setString(2, student_name);
        sql.setString(3, student_college);
        sql.setString(4, student_age);
        sql.executeUpdate();
        return true;
    }

    public void deleteStudent(String student_id) throws Exception {
        System.out.println("删除"+student_id);
        sql=con.prepareStatement("DELETE FROM Studenttbl WHERE Student_id"+"="+"'"+student_id+"'");
        sql.executeUpdate();
    }

    public ArrayList<Studentinfo> listStudent() throws Exception{
        ArrayList<Studentinfo> studentinlist=new ArrayList<Studentinfo>();
        sql=con.prepareStatement("select * from Studenttbl");
        result=sql.executeQuery();
        while (result.next()){
            Studentinfo temp=new Studentinfo();
            temp.setStudent_name(result.getString("Student_name"));
            temp.setStudent_id(result.getString("Student_id"));
            temp.setStudent_age(result.getInt("Student_age"));
            temp.setStudent_college(result.getString("Student_college"));
            studentinlist.add(temp);
        }
        return studentinlist;
    }
}
