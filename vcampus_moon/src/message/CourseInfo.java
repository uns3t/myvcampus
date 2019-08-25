package message;

import java.io.Serializable;

public class CourseInfo implements Serializable {
    private String Course_name;
    private String Course_id;
    private String Course_teacher;
    private String Course_time;



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


}
