package Server;

import message.*;
import DAO.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.StringTokenizer;
import java.lang.Exception;


public class ServerThread extends Thread {
    private Server currentServer;
    /**
     * 客户端Socket
     */
    private Socket client;
    /**
     * Socket对象输入流
     */
    private ObjectInputStream ois;
    /**
     * Socket对象输出流
     */
    private ObjectOutputStream oos;
    /**
     * 当前登录用户
     */
    public String curUser;

    public static ToAccess con;



    public ServerThread(Socket s, Server st) {
        client = s;
        currentServer = st;
        curUser = "";
        try {
            //建立输入输出流（次序与客户端相反）
            ois = new ObjectInputStream(client.getInputStream());
            oos = new ObjectOutputStream(client.getOutputStream());

            System.out.println("Client connected");

        } catch (IOException e) {
            System.out.println("Cannot get IO stream");
            e.printStackTrace();
        }
    }

    public void run() {
        con.getcon();
        Message message=null;
        while (true) {
            //读取消息
            try {
                message = (Message) ois.readObject();
                System.out.println(message.getType());
            } catch (Exception e) {
                //读不到指令，说明已登出
                return;
            }

            //判断消息属于哪一类型，调用对应模块函数完成相应功能
            switch (message.getType()) {


                //登录模块
                case "login":
                    Login(message);
                    break;

                //学籍管理模块
                case "student":
                    Student();
                    break;

                //图书馆模块
                case "book":
                    Library();
                    break;

                //商店模块
                case "shop":
                    Shop();
                    break;

                //课程选择模块
                case "course":
                    Course();
                    break;


            }
        }
    }

    public void close() {
        if (client != null) {
            try {
                oos.close();
                ois.close();


                client.close();

                currentServer.closeClientConnection(this);//在服务器线程中关闭该客户端

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //------------------------------具体功能模块----------------------------------------------------
    //--------------------------------------------------------------------------------------------
    public void Login(Message message){
        LoginMessage loginMessage=(LoginMessage) message.getData();

    }

    public void Library(){

    }

    public void Student(){

    }

    public void Course(){

    }

    public void Shop(){

    }

}
