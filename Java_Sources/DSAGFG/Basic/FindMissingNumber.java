package DSAGFG.Basic;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6}; // Example array
        int missingNumber = findMissingNumber(numbers);
        System.out.println("The missing number is: " + missingNumber);
        FindMissingNumber obj = new FindMissingNumber();
        obj.findmissing();
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

    public void findmissing(){
        int a[] = {2,1,3,5,4,7};
        int l = a.length;
        int rl = a.length+1;
        int t = 0;
        int expctdnum = rl * (rl +1)/2;
        System.out.println(expctdnum);
        for(int num : a){
            t = t+num;
        }
        System.out.println(t);
        int missnum = expctdnum - t;
        System.out.println("Finding Missing Number: " + missnum);
    }


}
