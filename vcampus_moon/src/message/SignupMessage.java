package message;
import java.io.Serializable;



public class SignupMessage implements Serializable {
    private String Signup_id;
    private String Signup_pwd;
    private String Signup_name;
    private String type = "Signup";

    public void setSignup_id(String id){ this.Signup_id = id; }
    public String getSignup_id(){ return this.Signup_id; }
    public void setSignup_pwd(String pwd){ this.Signup_pwd = pwd; }
    public String getSignup_pwd(){ return this.Signup_pwd; }
    public void setSignup_name(String name){ this.Signup_name = name; }
    public String getSignup_name(){ return this.Signup_name; }

    public String getType() {
        return type;
    }
}
