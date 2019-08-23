package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.StringTokenizer;
import java.lang.Exception;

public class ToAccess {
    private static Connection con=null;

    private DAOlogin login=new DAOlogin();
    // more


    public DAOlogin getlogin(){
        return login;
    }
    //more

    public void getcon() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");//加载ucanaccess驱动
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        try {
            //获取Access数据库连接
            String path="C:\\Users\\uns3t\\Desktop\\summer\\java\\idea\\myvcampus\\vcampus_moon\\database\\vcampus.accdb";
            this.con = DriverManager.getConnection("jdbc:ucanaccess://" + path, "", "");

            login.setcon(con);
            //more

            System.out.println("已连接数据库");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
