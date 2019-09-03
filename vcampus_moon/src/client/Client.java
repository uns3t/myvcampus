package client;

import java.net.Socket;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import message.*;

public class Client{

    public static void main(String[] args) {
        Client client = new Client("127.0.0.1",10001);
        System.out.println("客户端连接");
        ClientThread test = new ClientThread(client);
        System.out.println("客户端线程");

        test.handleLoginMessage("admin","admin");
        Message message=(Message)test.getREMessage();
        System.out.println(message.getResponse()+"登陆成功");

        test.handleShowStudentMessage();
        message=(Message)test.getREMessage();
        StudentMessage studentMessage=(StudentMessage)message.getData();
        Studentinfo studentinfo=(Studentinfo)studentMessage.getStudent().get(0);
        System.out.println(studentinfo.Student_birthday);

        test.handleAddStudentMessage("1","1","1","1","1","1","1","1","1","1","1");
        message=(Message)test.getREMessage();
        System.out.println(message.getResponse()+"添加成功");

        test.handleUpdateStudentMessage("1","2","2","1","1","1","1","1","1","1","1");
        message=(Message)test.getREMessage();
        System.out.println(message.getResponse()+"修改成功");

        test.handleDeleteStudentMessage("2");
        message=(Message)test.getREMessage();
        System.out.println(message.getResponse()+"删除成功");

    }

    public Client(String hospIp,int port){
        connectServer(hospIp,port);
    }
    private Socket socket;

    private boolean isConnected = false;

    public boolean getCon(){ return isConnected; }

    public boolean connectServer(String hostIP, int port){
        try{
            socket = new Socket(hostIP,port);
            isConnected = true;
            return true;

        }catch (Exception e){
            isConnected = false;
            e.printStackTrace();
            return false;
        }
    }

    public boolean closeConnect(){
        try {
            socket.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Socket getSocket() {
        return socket;
    }
}
