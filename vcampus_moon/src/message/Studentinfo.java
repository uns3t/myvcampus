package message;
import java.io.Serializable;


public class Studentinfo implements Serializable {
    private String Student_id;
    private String Student_name;
    private String Student_college;
    private int Student_age;


    public void setStudent_id(String id){ this.Student_id = id; }
    public String getStudent_id(){ return this.Student_id; }
    public void setStudent_college(String college){ this.Student_college = college; }
    public String getStudent_college(){ return this.Student_college; }
    public void setStudent_name(String name){ this.Student_name = name; }
    public String getStudent_name(){ return this.Student_name; }
    public void setStudent_age(int age){ this.Student_age = age; }
    public int getStudent_int(){ return this.Student_age; }

}
