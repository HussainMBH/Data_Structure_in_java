package Encapsulation_OOP;

class Person {
    private String name;
    private int age;
    private String job;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getJob(){
        return job;
    }
    public void setJob(String job){
        this.job = job;
    }
}

public class PersonDetails{
    public static void main(String[] args) {
        Person objperson = new Person();
        objperson.setName("Bahir");
        objperson.setAge(24);
        objperson.setJob("SE");


        System.out.println("Name: " + objperson.getName());
        System.out.println("Age: " + objperson.getAge());
        System.out.println("Job: " + objperson.getJob());
    }
}
