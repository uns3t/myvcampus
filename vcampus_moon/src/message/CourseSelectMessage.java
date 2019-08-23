package message;

import java.io.Serializable;

public class CourseSelectMessage implements Serializable {
    private String Student_id;
    private String Student_name;
    private String Course_id;
    private String Course_name;
    private String type = "CourseSelect";

    public void setCourse_name(String course_name) {
        Course_name = course_name;
    }

    public void setCourse_id(String course_id) {
        Course_id = course_id;
    }

    public void setStudent_id(String student_id) {
        Student_id = student_id;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }

    public String getCourse_name() {
        return Course_name;
    }

    public String getCourse_id() {
        return Course_id;
    }

    public String getStudent_id() {
        return Student_id;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public String getType() {
        return type;
    }
}
