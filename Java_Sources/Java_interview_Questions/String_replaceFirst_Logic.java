package Java_interview_Questions;

public class String_replaceFirst_Logic {
    public static void main(String[] args){
        String firstline  = "Rose flower is give Rose smell";
        //change first element only
        firstline = firstline.replaceFirst("Rose", "Jasmine");
        System.out.printf(firstline);

    }
}
