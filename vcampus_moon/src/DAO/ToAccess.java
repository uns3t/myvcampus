package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.lang.Exception;

public class ToAccess {
    private static Connection con=null;

    private DAOusr usr=new DAOusr();
    private DAOstudent student=new DAOstudent();
    private DAOshop shop=new DAOshop();
    // more


    public DAOusr getlogin(){
        return usr;
    }
    public DAOstudent getstudent(){
        return student;
    }
    public DAOshop getshop(){
        return shop;
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
            System.out.println("添加完毕");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
