package client;

import java.net.Socket;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import message.*;

public class Client{

    public static void main(String[] args) {
        Client client = new Client("127.0.0.1",10001);
        ClientThread test = new ClientThread(client);
        test.handleBuyMessage("111",111);
        Message message = test.getREMessage();
        boolean response = message.getResponse();
        System.out.println(response);

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
            return false;
        }
    }


    public Socket getSocket() {
        return socket;
    }
}
