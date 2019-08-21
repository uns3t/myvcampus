package message;

import java.io.Serializable;

public class Message implements Serializable{
    private String type;
    private Object data;
    private String uid;

    void setType(String t){ this.type = t; }
    String getType(){ return this.type; }
    void setData(Object d){ this.data = d; }
    Object getData(){ return this.data; }
    void setUid(String u){ this.uid = u; }
    String getUid(){ return this.uid; }

    Message(String uid, String type, Object data){
        this.uid = uid;
        this.type = type;
        this.data = data;
    }


}