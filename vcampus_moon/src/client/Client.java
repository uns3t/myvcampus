package client;

import java.math.BigInteger;
import java.net.Socket;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import login.*;
import shop.*;

import message.*;

public class Client{

    public static void main(String[] args) throws IOException {
        Client client = new Client("127.0.0.1",10001);
        ClientThread clientThread=new ClientThread(client);
        System.out.println("客户端连接");
        new LoginPage(clientThread);

//        new ShopBuy(clientThread);
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
