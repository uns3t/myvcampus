
package message;

import java.io.Serializable;

public class Message implements Serializable{
    private String type;
    private Object data;
    private static int uid = 0;
    private boolean response = false;
    //sssss
    public void setType(String t){ this.type = t; }
    public String getType(){ return this.type; }
    public void setData(Object d){ this.data = d; }
    public Object getData(){ return this.data; }

    public int getUid(){ return uid; }
    public void setResponse(boolean response){ this.response = response; }
    public boolean getResponse(){ return response; }

    public Message(String type, Object data){
        uid++;
        this.type = type;
        this.data = data;
    }


}
