package TechnicalTestJava.Test01;

public class Day01 {
    public static void main(String[] args) {
//        String s1 = args[1];
//        String s2 = args[2];
//        String s3 = args[3];
//        String s4 = args[4];
//        System.out.println(s2);
//        System.out.println("////////////////////////////////////////////////////////");
        int [] [] [] x = new int [3] [] [];
        int i, j;
        x[0] = new int[4][];
        x[1] = new int[2][];
        x[2] = new int[5][];
        for (i = 0; i < x.length; i++)
        {
            for (j = 0; j < x[i].length; j++)
            {
                x[i][j] = new int [i + j + 1];
                System.out.println("size = " + x[i][j].length);
            }
        }
    }
}
