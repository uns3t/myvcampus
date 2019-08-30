package DAO;

import java.lang.Exception;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import message.*;
import java.util.ArrayList;

public class studentDAO {
    private static Connection con;
    private static PreparedStatement sql=null;
    private static ResultSet result=null;
    public void setcon(Connection c){
        this.con=c;
    }

    public boolean addStudent(String student_id,String student_name,String student_college,String student_card,String student_phone,String student_type,
                              String student_uid,String student_ins,String student_brith,String student_place,String student_sex) throws Exception{
        sql = con.prepareStatement("insert into Studenttbl (Student_id, Student_name, Student_college,Student_card,Student_phone,Student_type,Student_uid,Student_ins,Student_brith,Student_place,Student_sex) values (?, ?, ?,?,?,?,?,?,?,?,?)");

        sql.setString(1, student_id);
        sql.setString(2, student_name);
        sql.setString(3, student_college);
        sql.setString(4, student_card);
        sql.setString(5, student_phone);
        sql.setString(6, student_type);
        sql.setString(7, student_uid);
        sql.setString(8, student_ins);
        sql.setString(9, student_brith);
        sql.setString(10, student_place);
        sql.setString(11, student_sex);
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
//Student_id, Student_name, Student_college,Student_card,Student_phone,Student_type,Student_uid,Student_ins,Student_brith,Student_place,Student_sex) values (?, ?, ?,?,?,?,?,?,?,?,?)");
            Studentinfo temp=new Studentinfo();
            temp.setStudent_name(result.getString("Student_name"));
            temp.setStudent_id(result.getString("Student_id"));
            temp.setStudent_college(result.getString("Student_college"));
            temp.setStudent_birthday(result.getString("Student_brith"));
            temp.setStudent_card_id(result.getString("Student_uid"));
            temp.setStudent_card_type(result.getString("Student_type"));
            temp.setStudent_ins(result.getString("Student_ins"));
            temp.setStudent_sex(result.getString("Student_sex"));
            temp.setStudent_shengyuandi(result.getString("Student_place"));
            temp.setStudent_onecardid(result.getString("Student_card"));
            temp.setStudent_phone(result.getString("Student_phone"));

            studentinlist.add(temp);
        }
        return studentinlist;
    }
}
