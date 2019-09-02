package message;

import java.io.Serializable;

public class UsrMessage implements Serializable{
    private String Usr_id;
    private String Usr_pwd;
    private String Usr_name;
    private boolean isadmin;
    private String type = "Login";
    public void set_isadmin(boolean temp){
        isadmin=temp;
    }
    public boolean get_isadmin(){return isadmin;}
    public void setUsr_id(String id){ this.Usr_id = id; }
    public String getUsr_id(){ return this.Usr_id; }
    public void setUsr_pwd(String pwd){ this.Usr_pwd = pwd; }
    public String getUsr_pwd(){ return this.Usr_pwd; }
    public void setUsr_name(String name){ this.Usr_name = name; }
    public String getUsr_name(){ return this.Usr_name; }
    public void setType(String type){this.type=type;}
    public String getType() {
        return type;
    }
}
