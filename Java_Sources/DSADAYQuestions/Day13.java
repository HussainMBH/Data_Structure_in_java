package DSADAYQuestions;

public class Day13 {
    static void patternRectangualr(int N){
        System.out.println("Rectangular Star Pattern");
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patternPyramid(int N){
        System.out.println("Pyramid Star Pattern");
        for(int i=0; i<N; i++){
            for(int j=0; j<N-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }

            for(int j=0; j<N-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Design Patterns...");
        System.out.println("Rectangular Star Pattern");
        int N = 5;
        patternRectangualr(N);
        patternPyramid(N);
    }
}
