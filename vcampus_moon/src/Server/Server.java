package Server;
/**
 * 类 {@code Server} 服务器端.
 *
 * <p> 服务器端run开始监听
 *
 * @since 2019/8/19
 */
import java.io.*;
import java.net.BindException;
import java.net.ServerSocket;
import java.util.Date;
import java.util.Vector;
import java.net.Socket;


public class Server extends Thread {
    private ServerSocket server;
    private static int Socketnum=0;

    public Server() {
        try {
            server = new ServerSocket(10001);
            System.out.println("主线程开始监听10001");
            this.start();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server();
    }

    public void run() {
        //当服务器在运行
        while(!server.isClosed()) {
            try {
                Socket client = server.accept();//监听新的客户端
                wrinlog(client);

                ServerThread current = new ServerThread(client, this);
                current.start();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    public void wrinlog(Socket client){

        File temp=new File("./","log.txt");
        try {
            FileWriter fileWriter=new FileWriter(temp,true);
            String date=new Date().toString();
            fileWriter.write("\n当前连接数:   "+Socketnum+"\n");
            fileWriter.write("当前时间:   "+date+"\n");
            fileWriter.write("此连接客户端ip:   "+client.getInetAddress()+"\n");
            fileWriter.write("连接客户端port:   "+client.getPort()+"\n"+"\n");
            fileWriter.close();
        }catch (Exception e){

        }


    }

    public void close() {
        //如果服务器Socket已被打开
        if (server != null) {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


/**
 * @see {@link ServerThread}
 */


//    public boolean searchClientConnection(String curUser) {
//        for (ServerThread ct: manyserver) {
//            if (ct.curUser != null && ct.curUser.equals(curUser)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
}
