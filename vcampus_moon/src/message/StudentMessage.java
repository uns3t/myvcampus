package message;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentMessage implements Serializable {
    private String type = "Student";
    private ArrayList<Studentinfo> Studentinfo = null;

    public StudentMessage(){
        Studentinfo = new ArrayList<Studentinfo>();
    }
    public void addStudentInfo(Studentinfo s){
        Studentinfo.add(s);
    }

    public ArrayList getStudent(){
        return Studentinfo;
    }

    public String getType() {
        return type;
    }
}
