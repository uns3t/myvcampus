package message;

import java.io.Serializable;
import java.util.ArrayList;

public class CourseMessage implements Serializable {
    private String type = "Course";
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
}
