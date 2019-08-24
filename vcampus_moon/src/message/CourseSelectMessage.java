package message;

import java.io.Serializable;

public class CourseSelectMessage implements Serializable {
    private String Usr_id;
    private String Course_id;
    private String type = "CourseSelect";


    public void setCourse_id(String course_id) {
        Course_id = course_id;
    }

    public void setStudent_id(String student_id) {
        Usr_id = student_id;
    }



    public String getCourse_id() {
        return Course_id;
    }

    public String getStudent_id() {
        return Usr_id;
    }


    public String getType() {
        return type;
    }
}
