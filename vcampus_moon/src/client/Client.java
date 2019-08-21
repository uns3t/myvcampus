package client;

import java.net.Socket;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import message.*;

public class Client{
    private Socket socket;
    private ObjectInputStream ob_is = null;
    private ObjectOutputStream ob_os = null;
    private boolean isConnected = false;

    public boolean connectServer(String hostIP, int port, String id, String pwd){
        try{
            socket = new Socket(hostIP,port);
            ob_os = new ObjectOutputStream(socket.getOutputStream());
            ob_is = new ObjectInputStream(socket.getInputStream());
            isConnected = true;

            LoginMessage temp = new LoginMessage();
            temp.setLogin_id(id);
            temp.setLogin_pwd(pwd);
            Message Login_message = new Message("0","Login",temp);
            return sendMessage(Login_message);
        }catch (Exception e){
            isConnected = false;
            return false;
        }
    }

    public boolean sendMessage(Message message){
        if (!isConnected) {
            System.out.println("客户端还未启动,不能发送消息！");
            return false;
        }
        if (message == null ) {
            System.out.println("消息不能为空！");
            return false;
        }
        try {
            ob_os.writeObject(message);
            ob_os.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}