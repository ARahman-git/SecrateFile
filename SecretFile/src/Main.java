import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Student management system");
            System.out.println("1. Add student");
            System.out.println("2. Display students");
            System.out.println("3. add courses");
            System.out.println("4. Search courses by Student ID");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice){
                    case 1: {
                        System.out.println("Enter name:");
                        String name = sc.nextLine();
                        System.out.println("Enter id");
                        String id = sc.nextLine();
                        System.out.println("Enter password");
                        String password = sc.nextLine();
                        System.out.println("Enter program");
                        String program = sc.nextLine();
                        System.out.println("Enter Batch");
                        String batch = sc.nextLine();
                        System.out.println("Enter CGPA");
                        double cgpa = sc.nextDouble();
                        sc.nextLine();

                        Student student = new Student(name, id, password, program, batch, cgpa);
                        StudentFile.addStudent(student);
                        System.out.println("Student added Successfully");
                    }
                    break;
                    case 2: StudentFile.displayStudent();
                    break;

                    case 3: {
                        System.out.println("Enter Sudent ID: ");
                        String id = sc.nextLine();
                        System.out.println("Enter course code: ");
                        String course = sc.nextLine();

                        Course crs = new Course(id, course);
                        StudentFile.addCourse(crs);
                        System.out.println("Course added Successfully");
                    }
                    break;

                    case 4:{
                        System.out.println("Enter Student ID: ");
                        String id = sc.nextLine();
                        StudentFile.search(id);
                    }
                    break;

                    case 5: {
                        System.out.println("Exited.........");
                        return;

                    }
                    default:
                        System.out.println("Invalid choice..... Try again........");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
