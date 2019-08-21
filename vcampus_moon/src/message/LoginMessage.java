package message;

import java.io.Serializable;

public class LoginMessage implements Serializable{
    private String Login_id;
    private String Login_pwd;
    private String Login_cardID;

    public void setLogin_id(String id){ this.Login_id = id; }
    public String getLogin_id(){ return this.Login_id; }
    public void setLogin_pwd(String pwd){ this.Login_pwd = pwd; }
    public String getLogin_pwd(){ return this.Login_pwd; }
    public void setLogin_cardID(String cardID){ this.Login_cardID = cardID; }
    public String getLogin_cardID(){ return this.Login_cardID; }

}
