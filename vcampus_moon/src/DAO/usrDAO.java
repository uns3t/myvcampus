package DAO;
/**
 * 类 {@code usrDAO} 管理usertbl的类.
 *
 * <p> 管理usertbl
 *
 * @since 2019/8/19
 */

import java.lang.Exception;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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


    public int Logincheck(String id,String pwd) throws Exception {
        String thepwd = null;
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(pwd.getBytes());
        thepwd = new BigInteger(1,messageDigest.digest()).toString();
        System.out.println(id+" "+pwd);
        sql=con.prepareStatement("select * from Usrtbl where Usr_id="+"'"+id+"'");
        result = sql.executeQuery();
        while (result.next()) {
            String temppwd=result.getString("pwd") ;
            boolean isadmin=result.getBoolean("isadmin");
            System.out.println(temppwd);
            if(temppwd.equals(thepwd)){
                if(isadmin)
                    return 1;
                System.out.println("login suss");
                return 0;
            }
        }
        return -1;
    }

    public boolean signup(String name,String pwd,String id) throws Exception{
        String thepwd = null;
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(pwd.getBytes());
        thepwd = new BigInteger(1,messageDigest.digest()).toString();
        sql = con.prepareStatement("insert into Usrtbl (Usr_id, pwd, Usr_name,isadmin) values (?, ?, ?,?)");
        sql.setString(1, id);
        sql.setString(2, thepwd);
        sql.setString(3, name);
        sql.setString(4, "false");
        sql.executeUpdate();
        return true;
    }

    public boolean updateusr(String name,String pwd,String id) throws Exception{
        sql = con.prepareStatement("update Usrtbl set Usr_id=?, pwd=?, Usr_name=? where Usr_id=?");
        sql.setString(1, id);
        sql.setString(2, pwd);
        sql.setString(3, name);
        sql.setString(4, id);
        sql.executeUpdate();
        return true;
    }

    public void deleteUsr(String usr_id) throws Exception {
        System.out.println("删除"+usr_id);
        sql=con.prepareStatement("DELETE FROM Usrtbl WHERE usr_id=?");
        sql.setString(1,usr_id);
        sql.executeUpdate();
    }

}
