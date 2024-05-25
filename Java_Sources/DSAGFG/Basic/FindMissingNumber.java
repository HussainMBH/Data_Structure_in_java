package DSAGFG.Basic;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6}; // Example array
        int missingNumber = findMissingNumber(numbers);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] numbers) {
        int n = numbers.length + 1; // Since one number is missing, the length of the complete array should be n+1
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : numbers) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }


}
