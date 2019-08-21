package message;

import java.io.Serializable;

class LoginMessage implements Serializable{
    private String Login_id;
    private String Login_pwd;
    private String Login_cardID;

    void setLogin_id(String id){ this.Login_id = id; }
    String getLogin_id(){ return this.Login_id; }
    void setLogin_pwd(String pwd){ this.Login_pwd = pwd; }
    String getLogin_pwd(){ return this.Login_pwd; }
    void setLogin_cardID(String cardID){ this.Login_cardID = cardID; }
    String getLogin_cardID(){ return this.Login_cardID; }

}