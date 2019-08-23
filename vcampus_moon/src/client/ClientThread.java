package client;

import message.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClientThread extends Thread {
    private Client client;
    private int max;
    private ObjectInputStream ob_is = null;
    private ObjectOutputStream ob_os = null;

    public ClientThread(Client client,int max){
        this.client = client;
        this.max = max;
        ob_is = this.client.getOb_is();
        ob_os = this.client.getOb_os();
    }

    public void run(){
        while (true){
            client.getMessage();
        }
    }


}
