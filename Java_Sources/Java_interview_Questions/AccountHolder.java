package Java_interview_Questions;

public class AccountHolder {
    public static void main(String[] args) {
        Bank bn = new Bank();
        int bnk = bn.getMinimumBalance();
        System.out.println();
        bn.setMinibalance(5000);
        System.out.println(bnk);
    }
}
