package client;
/**
 * 类 {@code Client} 客户端.
 *
 * <p> 客户端作为程序主入口
 *
 * @since 2019/8/19
 */
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

    /**
     * <p> 创建一个客户端
     *
     * <p><pre>{@code
     * 演示如何使用该类
     * 创建客户端传入IP地址和端口
     * Client client = new Client(hostIp,port);
     * }
     * </pre>
     * @param hospIp IP地址
     * @param port 端口
     */
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

    /**
     * @see {@link ClientThread}
     * @see {@link Server.Server}
     * @see {@link Server.ServerThread}
     */
}
