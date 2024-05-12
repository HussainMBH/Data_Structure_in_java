package JavaSeries.Thiskeyword;

public class Thiskeyword {
    String name;
    int age;

    //data assign
    void dataadd(String name, int age){ //set same name variable and for not confusing assign this key word
//        name = newname;
//        age = newage;
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


}

