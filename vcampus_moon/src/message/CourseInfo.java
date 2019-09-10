package message;

/**
 * 类 {@code CourseInfo} 课程对象.
 *
 * <p> 存储课程相关信息
 *
 * @since 2019/8/19
 */
import java.io.Serializable;

public class CourseInfo implements Serializable {

    /** 课程名称 {@value} */
    private String Course_name;

    /** 课程ID {@value} */
    private String Course_id;

    /** 任课老师 {@value} */
    private String Course_teacher;

    /** 上课时间 {@value} */
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

    /**
     *
     * @see {@link CourseMessage}
     */
}
