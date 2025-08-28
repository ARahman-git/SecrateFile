import java.io.IOException;
import java.io.RandomAccessFile;

public class StudentFile {
    public static final String studentFile = "student.txt";
    public static final String courseFile = "courses.txt";

    public static  void addStudent(Student student) throws IOException{
        try (RandomAccessFile raf = new RandomAccessFile(studentFile, "rw")){
            raf.seek(raf.length());
            raf.writeBytes(student.toString());
        }
    }

    public static void displayStudent() throws IOException{
        try (RandomAccessFile raf = new RandomAccessFile(studentFile, "r")){
            String line;
            while ((line = raf.readLine()) != null){
                System.out.println(line);
            }
        }
    }

    public static void addCourse(Course course) throws IOException{
        try (RandomAccessFile raf = new RandomAccessFile(courseFile, "rw")){
            raf.seek(raf.length());
            raf.writeBytes(course.toString() + "\n");
        }
    }

    public static void search(String id) throws IOException{
        try(RandomAccessFile raf = new RandomAccessFile(courseFile, "r")){
            String line;
            boolean found = false;
            System.out.println("Advised courses for student ID: " + id);
            while ((line = raf.readLine()) != null){
                String[] parts = line.split(",");
                if ( parts[0].equals(id)){
                    System.out.println("-" + parts[1]);
                    found = true;

                }
            }
            if (!found){
                System.out.println("No advised course found");
            }
        }
    }
}
