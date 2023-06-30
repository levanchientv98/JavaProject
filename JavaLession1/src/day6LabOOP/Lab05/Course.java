package day6LabOOP.Lab05;

public class Course {
    private String courseId;
    private String couresName;

    public Course(String courseId, String couresName) {
        this.courseId = courseId;
        this.couresName = couresName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCouresName() {
        return couresName;
    }

    public void setCouresName(String couresName) {
        this.couresName = couresName;
    }
}
