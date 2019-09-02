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
        test.handleShowBookMessage();
        BookMessage bookMessage = (BookMessage)test.getREMessage().getData();
        System.out.println(bookMessage.getbook());
        test.handleLoginMessage("abc","123456",false);
        Message message=(Message)test.getREMessage();
        System.out.println(message.getResponse());


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


    public Socket getSocket() {
        return socket;
    }
}
