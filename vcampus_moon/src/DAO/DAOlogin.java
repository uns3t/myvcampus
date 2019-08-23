package DAO;


import java.lang.Exception;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class DAOlogin {
    private static Connection con;
    public void setcon(Connection c){
        this.con=c;
    }


    public boolean Logincheck(String name,String pwd) throws Exception {
        Statement statement = con.createStatement();
        ResultSet result = statement.executeQuery("select * from Usrtbl where Uname="+"'"+name+"'");
        while (result.next()) {
            String temppwd=result.getString("pwd") ;
            if(temppwd==pwd){
                statement.close();
                return true;
            }
        }
        statement.close();
        return false;
    }

}
