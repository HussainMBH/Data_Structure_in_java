package Collection_Java.List.ArrayList;

public class student {
    static int studentId;
    String name;
    String grade;


    public student(String name, String grade){
        this.name = name;
        this.grade = grade;

        this.studentId = studentId++;
    }
}
