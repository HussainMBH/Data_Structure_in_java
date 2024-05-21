package JavaSeries.OOP.InheritanceOOP.School;

public class Teachers  extends Principle{
    void setschedulesubjects(){
        System.out.println("Today Subjects........................");
        System.out.println("Maths");
        System.out.println("Science");
        System.out.println("English");
    }
    void setschedulesubjects(String mathsname, String sciencename, String englishname){
        System.out.println("Today Subjects........................");
        System.out.println("Hey "+ mathsname);
        System.out.println("Hello " + sciencename);
        System.out.println("Oai " + englishname);
    }
    void Showdetails(){
        System.out.println("my name is Bahir");
        System.out.println("I'm a software engineer");
    }
}

class showdetails{
    public static void main(String[] args) {
        Principle objprn = new Teachers();
        objprn.setschedulesubjects();
        Teachers objthr = new Teachers();
        objthr.setschedulesubjects("Maths", "Science", "English");
        objthr.Showdetails();

    }
}
