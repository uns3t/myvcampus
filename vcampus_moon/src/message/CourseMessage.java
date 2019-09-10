package message;

/**
 * 类 {@code CourseMessage} 图书信息消息类.
 *
 * <p> 传输课程相关信息
 *
 * @since 2019/8/19
 */
import java.io.Serializable;
import java.util.ArrayList;

public class CourseMessage implements Serializable {

    /** Message类型 {@value} */
    private String type = "Course";

    /** 课程对象列表 {@value} */
    private ArrayList<CourseInfo> courseInfo = null;

    public CourseMessage(){
        courseInfo = new ArrayList<CourseInfo>();
    }
    public void addCourseInfo(CourseInfo c){
        courseInfo.add(c);
    }
    public void setCourselist(ArrayList<CourseInfo> courselist){
        courseInfo=courselist;
    }

    public ArrayList getCourse(){
        return courseInfo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @see {@link Message}
     * @see {@link CourseInfo}
     */
}
