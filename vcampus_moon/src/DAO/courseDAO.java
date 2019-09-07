package DAO;

import java.lang.Exception;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import message.*;
import java.util.ArrayList;

public class courseDAO {
    private static Connection con;
    private static PreparedStatement sql=null;
    private static ResultSet result=null;
    public void setcon(Connection c){
        this.con=c;
    }

    public boolean addcourse(String course_name,String course_id,String course_teacher,String course_time) throws Exception{
        sql = con.prepareStatement("insert into Coursetbl (Course_name, Course_id, Course_teacher,Course_time) values (?, ?, ?,?)");

        sql.setString(1, course_name);
        sql.setString(2, course_id);
        sql.setString(3, course_teacher);
        sql.setString(4, course_time);
        sql.executeUpdate();
        return true;
    }

    public boolean updatecourse(String course_name,String course_id,String course_teacher,String course_time) throws Exception{
        sql = con.prepareStatement("update Coursetbl set Course_name=?, Course_id=?, Course_teacher=?,Course_time=? where Course_id=?");

        sql.setString(1, course_name);
        sql.setString(2, course_id);
        sql.setString(3, course_teacher);
        sql.setString(4, course_time);
        sql.setString(5, course_id);
        sql.executeUpdate();
        return true;
    }

    public void deletecourse(String course_id) throws Exception {
        System.out.println("删除"+course_id);
        sql=con.prepareStatement("DELETE FROM Coursetbl WHERE Course_id"+"="+"'"+course_id+"'");
        sql.executeUpdate();
    }

    public ArrayList<CourseInfo> listcourse() throws Exception{
        ArrayList<CourseInfo> courselist=new ArrayList<CourseInfo>();
        sql=con.prepareStatement("select * from Coursetbl");
        result=sql.executeQuery();
        while (result.next()){
            CourseInfo temp=new CourseInfo();
            temp.setCourse_name(result.getString("Course_name"));
            temp.setCourse_id(result.getString("Course_id"));
            temp.setCourse_teacher(result.getString("Course_teacher"));
            temp.setCourse_time(result.getString("Course_time"));
            courselist.add(temp);
        }
        return courselist;
    }


    public boolean addCourseSelect(String course_id,String usr_id) throws Exception{
        sql = con.prepareStatement("insert into CourseSelecttbl (Usr_id,Course_id) values (?,?)");

        sql.setString(1, usr_id);
        sql.setString(2, course_id);
        sql.executeUpdate();
        return true;
    }

    public ArrayList<CourseInfo> showCourseSelect(String usr_id) throws Exception{
        ArrayList<CourseInfo> courselist=new ArrayList<CourseInfo>();
        sql = con.prepareStatement("select * from CourseSelecttbl where Usr_id"+"="+"'"+usr_id+"'");
        result=sql.executeQuery();
        while (result.next()){
            CourseInfo temp=new CourseInfo();
            String Course_id = result.getString("Course_id");
            sql=con.prepareStatement("select * from Coursetbl where Course_id"+"="+"'"+Course_id+"'");
            ResultSet res = sql.executeQuery();
            while (res.next()){
                temp.setCourse_name(res.getString("Course_name"));
                temp.setCourse_id(res.getString("Course_id"));
                temp.setCourse_teacher(res.getString("Course_teacher"));
                temp.setCourse_time(res.getString("Course_time"));
                courselist.add(temp);
            }
        }

        return courselist;
    }
}
