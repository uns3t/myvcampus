package client;

import message.Message;

public class MessageBuffer {
    Message message = null;
    public MessageBuffer(Message message){
        this.message = message;
    }

    public Message getMessage(){return message;}
}
