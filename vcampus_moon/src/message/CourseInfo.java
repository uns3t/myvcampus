package message;

import java.io.Serializable;

public class CourseInfo implements Serializable {
    private String Course_name;
    private String Course_id;
    private String Course_teacher;
    private String Course_address;
    private String Course_time;
    private int Course_credit;
    private boolean Course_available;

    public void setCourse_address(String course_address) {
        Course_address = course_address;
    }

    public void setCourse_credit(int course_credit) {
        Course_credit = course_credit;
    }

    public void setCourse_id(String course_id) {
        Course_id = course_id;
    }

    public void setCourse_name(String course_name) {
        Course_name = course_name;
    }

    public void setCourse_teacher(String course_teacher) {
        Course_teacher = course_teacher;
    }

    public void setCourse_time(String course_time) {
        Course_time = course_time;
    }

    public int getCourse_credit() {
        return Course_credit;
    }

    public String getCourse_address() {
        return Course_address;
    }

    public String getCourse_id() {
        return Course_id;
    }

    public String getCourse_name() {
        return Course_name;
    }

    public String getCourse_teacher() {
        return Course_teacher;
    }

    public String getCourse_time() {
        return Course_time;
    }

    public void setCourse_available(boolean course_available) {
        Course_available = course_available;
    }
    public boolean getCourse_available(){
        return Course_available;
    }
}
