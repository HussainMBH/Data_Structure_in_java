package InterfaceJAVA;

public class human implements companywork, trafficrules{

   public void morningmeeting(){
       System.out.println("Ecommerce Project Update Meeting");
    }

    public void todotask(){
        System.out.println("Payment side Added");
    }

    public void projectupdate(){
        System.out.println("Ecommerce Project Update");
    }





    public static void main(String[] args) {
        human h = new human();
        h.morningmeeting();
    }
}
