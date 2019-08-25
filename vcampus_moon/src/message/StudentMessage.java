package message;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentMessage implements Serializable {
    private String type = "Student";
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
}
