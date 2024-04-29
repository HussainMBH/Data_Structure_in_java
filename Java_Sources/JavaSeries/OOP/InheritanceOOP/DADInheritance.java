package JavaSeries.OOP.InheritanceOOP;

class GrandDad{
    int GDadBankMoney = 10000000;
    String GName = "John";
}
class DAD extends GrandDad{
    int DadBankMoney = 400000;
    String DName = "Peter";

}

class Son extends DAD{
    int SonBankMoney = 10000;
    String Name = "Kane";

}
public class DADInheritance{
    public static void main(String[] args) {
        Son objson = new Son();
        System.out.println(objson.SonBankMoney);
        System.out.println(objson.DadBankMoney);
        System.out.println(objson.GName);
    }
}
