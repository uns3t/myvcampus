package Server;

import message.*;
import DAO.*;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.StringTokenizer;
import java.lang.Exception;



public class ServerThread extends Thread {
    private Server server;
    private int max;
    private Connection con;

    public void getAccessConnection(String path, String user, String pwd) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");//加载ucanaccess驱动
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        try {
            //获取Access数据库连接(Conn)
            this.con = DriverManager.getConnection("jdbc:ucanaccess://" + path, user, pwd);
            System.out.println("已连接数据库");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }



    public ServerThread(Server server, int max) {
        this.server = server;
        this.max = max;
        getAccessConnection("C:\\Users\\uns3t\\Desktop\\summer\\java\\Usrtbl.accdb", "", "");

    }


    public void run() {
        while (true) {
            try {
                System.out.println("已启动");
                Socket socket = server.getServerSocket().accept();

                ObjectInputStream ob_is = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
                ObjectOutputStream ob_os = new ObjectOutputStream(socket.getOutputStream());

                Message message = (Message) ob_is.readObject();
                if(message.getType()=="login"){
                    DAOlogin testlogin=new DAOlogin();
                    LoginMessage loginMessage=(LoginMessage)message.getData();
                    try {
                        if(testlogin.Logincheck(con,loginMessage.getLogin_id(),loginMessage.getLogin_pwd())){

                        }
                    }catch (Exception e){

                    }

                }



            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

}
