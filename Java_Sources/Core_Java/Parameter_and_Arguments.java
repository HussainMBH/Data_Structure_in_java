package Core_Java;

public class Parameter_and_Arguments {
    public String addcalculat(int x, int y){
        int z = x+y;
        String results = "Your additional number is ";
        return results + z;
    }

    public static void main(String[] args) {
        Parameter_and_Arguments objtest = new Parameter_and_Arguments();
        System.out.println(objtest.addcalculat(10,20));
    }
}
