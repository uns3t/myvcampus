package DAO;
/**
 * 类 {@code studentDAO} 管理studenttbl的类.
 *
 * <p> 管理studenttbl
 *
 * @since 2019/8/19
 */

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

    /**
     *
     * <p>
     *     添加学生学籍信息
     * </p>
     * @param student_id 学号
     * @param student_name 姓名
     * @param student_college 学院
     * @param student_card 一卡通
     * @param student_phone 电话
     * @param student_type 证件类型
     * @param student_uid 证件ID
     * @param student_ins 简介
     * @param student_brith 生日
     * @param student_place 生源地
     * @param student_sex 性别
     * @return 是否成功
     * @throws Exception sql异常
     */
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

    /**
     *
     * <p>
     *     更新学生学籍信息
     * </p>
     * @param student_id 学号
     * @param student_name 姓名
     * @param student_college 学院
     * @param student_card 一卡通
     * @param student_phone 电话
     * @param student_type 证件类型
     * @param student_uid 证件ID
     * @param student_ins 简介
     * @param student_brith 生日
     * @param student_place 生源地
     * @param student_sex 性别
     * @return 是否成功
     * @throws Exception sql异常
     */
    public boolean updateStudent(String student_id,String student_name,String student_college,String student_card,String student_phone,String student_type,
                              String student_uid,String student_ins,String student_brith,String student_place,String student_sex) throws Exception{
        sql = con.prepareStatement("update Studenttbl set Student_id=?, Student_name=?, Student_college=?,Student_card=?,Student_phone=?,Student_type=?,Student_uid=?,Student_ins=?,Student_brith=?,Student_place=?,Student_sex=?  where Student_id=?");

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
        sql.setString(12, student_id);
        sql.executeUpdate();
        return true;
    }

    /**
     *
     * <p>
     *     删除学生学籍信息
     * </p>
     * @param student_id 学号
     * @throws Exception sql异常
     */
    public void deleteStudent(String student_id) throws Exception {
        System.out.println("删除"+student_id);
        sql=con.prepareStatement("DELETE FROM Studenttbl WHERE Student_id"+"="+"'"+student_id+"'");
        sql.executeUpdate();
    }

    /**
     *
     * <p>
     *     获得管理员端学生学籍信息
     * </p>
     * @return 管理员端学生学籍信息列表
     * @throws Exception sql异常
     */
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

    /**
     *
     * <p>
     *     获得用户端学籍信息
     * </p>
     * @param usr_id 用户ID
     * @return 学籍信息列表
     * @throws Exception sql异常
     */
    public ArrayList<Studentinfo> usrStudent(String usr_id) throws Exception{
        ArrayList<Studentinfo> studentinlist=new ArrayList<Studentinfo>();
        sql=con.prepareStatement("select * from Studenttbl where Student_id=?");
        sql.setString(1,usr_id);
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
        if(studentinlist.size()>=1){
            return studentinlist;
        }
        return null;
    }
    /**
     * @see {@link ToAccess}
     */
}
