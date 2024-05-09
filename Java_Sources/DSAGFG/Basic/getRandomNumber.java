package DSAGFG.Basic;

import java.util.Random;

public class getRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Random Integer: "+random.nextInt(1000));
        System.out.println("Random Double: "+random.nextDouble(1000));
        System.out.println("Random Boolean: " + random.nextBoolean());
    }
}
