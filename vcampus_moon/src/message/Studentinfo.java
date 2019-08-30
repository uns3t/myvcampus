package message;
import java.io.Serializable;


public class Studentinfo implements Serializable {
    private String Student_id;
    private String Student_name;
    private String Student_college;
    private int Student_age;
    public String Student_sex;
    public String Student_birthday;
    public String Student_shengyuandi;
    public String Student_onecardid;
    public String Student_xuehao;
    public String Student_phone;
    public String Student_card_type;
    public String Student_card_id;



    public void setStudent_id(String id){ this.Student_id = id; }
    public String getStudent_id(){ return this.Student_id; }
    public void setStudent_college(String college){ this.Student_college = college; }
    public String getStudent_college(){ return this.Student_college; }
    public void setStudent_name(String name){ this.Student_name = name; }
    public String getStudent_name(){ return this.Student_name; }
    public void setStudent_age(int age){ this.Student_age = age; }
    public int getStudent_age(){ return this.Student_age; }

    public void setStudent_birthday(String student_birthday) {
        Student_birthday = student_birthday;
    }

    public void setStudent_card_id(String student_card_id) {
        Student_card_id = student_card_id;
    }

    public void setStudent_card_type(String student_card_type) {
        Student_card_type = student_card_type;
    }

    public void setStudent_onecardid(String student_onecardid) {
        Student_onecardid = student_onecardid;
    }

    public void setStudent_phone(String student_phone) {
        Student_phone = student_phone;
    }

    public void setStudent_sex(String student_sex) {
        Student_sex = student_sex;
    }

    public void setStudent_shengyuandi(String student_shengyuandi) {
        Student_shengyuandi = student_shengyuandi;
    }

    public void setStudent_xuehao(String student_xuehao) {
        Student_xuehao = student_xuehao;
    }

    public String getStudent_birthday() {
        return Student_birthday;
    }

    public String getStudent_card_id() {
        return Student_card_id;
    }

    public String getStudent_card_type() {
        return Student_card_type;
    }

    public String getStudent_onecardid() {
        return Student_onecardid;
    }

    public String getStudent_phone() {
        return Student_phone;
    }

    public String getStudent_sex() {
        return Student_sex;
    }

    public String getStudent_shengyuandi() {
        return Student_shengyuandi;
    }

    public String getStudent_xuehao() {
        return Student_xuehao;
    }
}
