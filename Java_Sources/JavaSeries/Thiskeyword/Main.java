package JavaSeries.Thiskeyword;

public class Main {

    void showdetails(){
        Thiskeyword obj = new Thiskeyword();
        System.out.println(obj.getName());
    }
    public static void main(String[] args) {
        Thiskeyword obj = new Thiskeyword();
        obj.dataadd("Bahir", 24);
        obj.display();
        Main mnobj = new Main();
        mnobj.showdetails();
    }
}
