package message;

/**
 * 类 {@code Studentinfo} 学生学籍对象.
 *
 * <p> 存储学生学籍相关信息
 *
 * @since 2019/8/19
 */
import java.io.Serializable;


public class Studentinfo implements Serializable {

    /** 学生学号 {@value} */
    private String Student_id;

    /** 学生姓名 {@value} */
    private String Student_name;

    /** 学生学院 {@value} */
    private String Student_college;

    /** 学生性别 {@value} */
    public String Student_sex;

    /** 学生生日 {@value} */
    public String Student_birthday;

    /** 生源地 {@value} */
    public String Student_shengyuandi;

    /** 一卡通 {@value} */
    public String Student_onecardid;

    /** 电话 {@value} */
    public String Student_phone;

    /** 证件类型 {@value} */
    public String Student_card_type;

    /** 证件ID {@value} */
    public String Student_card_id;

    /** 学生简介 {@value} */
    public String Student_ins;

    public void setStudent_ins(String student_ins) {
        Student_ins = student_ins;
    }


    public String getStudent_ins() {
        return Student_ins;
    }



    public void setStudent_id(String id){ this.Student_id = id; }
    public String getStudent_id(){ return this.Student_id; }
    public void setStudent_college(String college){ this.Student_college = college; }
    public String getStudent_college(){ return this.Student_college; }
    public void setStudent_name(String name){ this.Student_name = name; }
    public String getStudent_name(){ return this.Student_name; }

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
/**
 *
 * @see {@link StudentMessage}
 */
}
