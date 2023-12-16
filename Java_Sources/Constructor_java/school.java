package Constructor_java;

public class school {
    String name;
    int age;
    public school(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        school firststudent = new school("Bahir", 23);
        firststudent.showname();
    }

    void showname(){
        System.out.println("Student name is " + name);
        System.out.println("Student age is " + age);
    }
}
