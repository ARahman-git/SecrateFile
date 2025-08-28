public class Course {
    String studentId;
    String courseCode;

    public Course(String studentId, String courseCode){
        this.studentId = studentId;
        this.courseCode = courseCode;
    }
    @Override
    public String toString(){
        return studentId + "," + courseCode;
    }
}
