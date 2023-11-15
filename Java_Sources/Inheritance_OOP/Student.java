package Inheritance_OOP;
public class Student {
    static int id = 1;
    int studentid;
    String Studentname;
    int Age;
    String Grade;
    String City;
    public Student(String studentname, int age, String grade, String city){
        this.Studentname = studentname;
        this.Age = age;
        this.Grade = grade;
        this.City = city;

        this.studentid = id++;
    }

}