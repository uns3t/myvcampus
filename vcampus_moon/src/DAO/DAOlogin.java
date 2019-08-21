package DAO;


import java.lang.Exception;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class DAOlogin {
    private Connection con;

    public boolean Logincheck(Connection connection, String name,String pwd) throws Exception {
        Statement statement = connection.createStatement();
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
