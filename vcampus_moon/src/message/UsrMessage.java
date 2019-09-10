package message;

/**
 * 类 {@code StudentMessage} 用户信息消息类.
 *
 * <p> 传输用户相关信息
 *
 * @since 2019/8/19
 */
import java.io.Serializable;

public class UsrMessage implements Serializable{

    /** 用户ID {@value} */
    private String Usr_id;

    /** 用户密码 {@value} */
    private String Usr_pwd;

    /** 用户名 {@value} */
    private String Usr_name;

    /** 是否为管理员 {@value} */
    private boolean isadmin;

    /** Message类型 {@value} */
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
    /**
     * @see {@link Message}
     */
}
