public class Student {
    String name;
    String id;
    String password;
    String batch;
    String program;
    double cgpa;

    public Student(String name, String id, String password, String batch, String program, double cgpa){
        this.name = name;
        this.id = id;
        this.password = password;
        this.batch = batch;
        this.program = program;
        this.cgpa = cgpa;

    }
    @Override
    public String toString(){
        return name + "," + id + "," + password + "," + program + "," + batch + "," + cgpa;
    }
}
