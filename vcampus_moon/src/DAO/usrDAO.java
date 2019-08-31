package DAO;


import java.lang.Exception;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import message.*;
import java.util.ArrayList;



public class usrDAO {
    private static Connection con;
    private static PreparedStatement sql=null;
    private static ResultSet result=null;
    public void setcon(Connection c){
        this.con=c;
    }


    public boolean Logincheck(String id,String pwd) throws Exception {
        System.out.println(id+" "+pwd);
        sql=con.prepareStatement("select * from Usrtbl where Usr_id="+"'"+id+"'");
        result = sql.executeQuery();
        while (result.next()) {
            String temppwd=result.getString("pwd") ;
            System.out.println(temppwd);
            if(temppwd.equals(pwd)){
                System.out.println("login suss");
                return true;
            }
        }
        return false;
    }

    public boolean signup(String name,String pwd,String id) throws Exception{
        sql = con.prepareStatement("insert into Usrtbl (Usr_id, pwd, Usr_name) values (?, ?, ?)");
        sql.setString(1, id);
        sql.setString(2, pwd);
        sql.setString(3, name);
        sql.executeUpdate();
        return true;
    }

    public void deleteUsr(String usr_id) throws Exception {
        System.out.println("删除"+usr_id);
        sql=con.prepareStatement("DELETE FROM Usrtbl WHERE Student_id"+"="+"'"+usr_id+"'");
        sql.executeUpdate();
    }

}
