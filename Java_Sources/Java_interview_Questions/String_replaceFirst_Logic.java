package Java_interview_Questions;

public class String_replaceFirst_Logic {
    public static void main(String[] args){
        String firstline  = "Rose flower is give Rose smell";
        //change first element only
        firstline = firstline.replaceFirst("Rose", "Jasmine");
        System.out.println(firstline);

        String s1 = "Rose flower is give Rose smell";
        contains(s1);
    }

    public static void contains(String s1){
        String s2 = "Rose";
        int start =0, ending =0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(0)){
                start =i;
                int count =0;
                for(int j=0; j<s2.length(); j++){
                    if(s2.charAt(j) == s1.charAt(i)){
                        count++;
                        i++;
                        ending = i;

                    }
                }
                if(count == s2.length()){
                    System.out.println("yes, Contains");
                    System.out.println(start + " "+ ending);
                    replaceFirst(s1, "Jasmine", start, ending); // calling method replacefirst
                    break;
                }
                else {
                    System.out.println("In here not Contains");
                }
            }
        }
    }
    private static void replaceFirst(String old, String replacement, int start, int ending){
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<start; i++){
            sb.append(old.charAt(i));
        }
        sb.append((replacement + " "));

        for (int i=ending; i<old.length(); i++){
            sb.append(old.charAt(i));
        }
        System.out.println(sb);
    }
}
