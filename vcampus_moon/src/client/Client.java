package client;

import java.net.Socket;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import message.*;

public class Client{
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
