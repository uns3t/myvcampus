package message;
/**
 * 类 {@code StudentMessage} 学生学籍信息消息类.
 *
 * <p> 传输学生学籍相关信息
 *
 * @since 2019/8/19
 */
import java.io.Serializable;
import java.util.ArrayList;

public class StudentMessage implements Serializable {

    /** Message类型 {@value} */
    private String type = "Student";

    /** 学生学籍对象列表 {@value} */
    private ArrayList<Studentinfo> studentinfo = null;

    public StudentMessage(){
        studentinfo = new ArrayList<Studentinfo>();
    }
    public void addStudentInfo(Studentinfo s){
        studentinfo.add(s);
    }
    public void setStudentlist(ArrayList<Studentinfo> studentlist){
        studentinfo=studentlist;
    }

    public ArrayList getStudent(){
        return studentinfo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @see {@link Message}
     * @see {@link Studentinfo}
     */
}
