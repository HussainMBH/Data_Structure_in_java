package Core_Java;

public class ConstructorQuestion {
    ConstructorQuestion(){
        System.out.println("Constructor");
    }

    public static void main(String[] args){
        ConstructorQuestion obj = new ConstructorQuestion();
        ConstructorQuestion obj1 = obj;
    }
}
