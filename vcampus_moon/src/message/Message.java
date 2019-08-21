
package message;

import java.io.Serializable;

public class Message implements Serializable{
    private String type;
    private Object data;
    private String uid;

    public void setType(String t){ this.type = t; }
    public String getType(){ return this.type; }
    public void setData(Object d){ this.data = d; }
    public Object getData(){ return this.data; }
    public void setUid(String u){ this.uid = u; }
    public String getUid(){ return this.uid; }

    public Message(String uid, String type, Object data){
        this.uid = uid;
        this.type = type;
        this.data = data;
    }


}
