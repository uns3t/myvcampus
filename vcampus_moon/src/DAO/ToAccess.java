package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.lang.Exception;

public class ToAccess {
    private static Connection con=null;

    private usrDAO usr=new usrDAO();
    private studentDAO student=new studentDAO();
    private shopDAO shop=new shopDAO();
    private bookDAO book=new bookDAO();
    private courseDAO course=new courseDAO();
    // more


    public usrDAO getusr(){
        return usr;
    }
    public studentDAO getstudent(){
        return student;
    }
    public shopDAO getshop(){
        return shop;
    }
    public bookDAO getBook(){
        return book;
    }
    public courseDAO getCourse(){
        return course;
    }


    //more

    public void getcon() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");//加载ucanaccess驱动
        } catch (Exception e) {
//            throw new RuntimeException(e.getMessage());
        }

        try {
            //获取Access数据库连接
            String path="C:\\Users\\uns3t\\Desktop\\summer\\java\\idea\\myvcampus\\vcampus_moon\\database\\vcampus.accdb";
            this.con = DriverManager.getConnection("jdbc:ucanaccess://" + path, "", "");

            usr.setcon(con);
            student.setcon(con);
            shop.setcon(con);
            book.setcon(con);
            course.setcon(con);
            //more

            System.out.println("数据库初始化终了");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void main(String[] args) {
        //用于测试
        ToAccess toAccess=new ToAccess();
        toAccess.getcon();
        try {
//            toAccess.getstudent().addStudent("123","123","231","123");
//            toAccess.getstudent().listStudent();
//            toAccess.getstudent().deleteStudent("123");
//            toAccess.getstudent().addStudent("1","1","2","1","1","1"
//            ,"1","1","1","1","1");
            toAccess.getBook().updateBook("好的写真","00001","老何","506","10000","0","test");
            System.out.println("完毕");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
