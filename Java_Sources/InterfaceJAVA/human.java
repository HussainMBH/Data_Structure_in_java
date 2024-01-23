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

    public void speedcontrol(){
        System.out.println("want to ride under 60km/h speed");
    }

    public void wearhelmet(){
        System.out.println("every bike riders should wear helmet for their safety");
    }

    public void obeyrules(){
        System.out.println("have many traffic rules so everyone should follow that");
    }


    public static void main(String[] args) {
        human h = new human();
        h.morningmeeting();
    }
}
