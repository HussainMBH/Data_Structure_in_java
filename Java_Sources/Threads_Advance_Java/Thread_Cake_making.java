package Threads_Advance_Java;

class Cakemaking extends Thread{
    public void run(){
        System.out.println("Mixing Ingredients for cake " + Cakemaking.currentThread().getId());
        System.out.println("Baking cake " + Cakemaking.currentThread().getId());
        System.out.println("Decorating cake " + Cakemaking.currentThread().getId());
    }
        }

public class Thread_Cake_making {
    public static void main(String[] args) {

        int cakecount = 4;
        for(int i=0; i<cakecount; i++){
            Cakemaking ckmng = new Cakemaking();
            ckmng.start();
        }
        //ckmng.run();
    }
}
