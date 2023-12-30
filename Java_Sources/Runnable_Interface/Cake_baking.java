package Runnable_Interface;

// Runnable interface, in runnable interface have Thread class, it's doing parellel running system
class Cake_make implements Runnable{
    public void run(){
        System.out.println("Mixing Ingredients for cake " + Thread.currentThread().getId());
        System.out.println("Baking cake " + Thread.currentThread().getId());
        System.out.println("Decorating cake " + Thread.currentThread().getId());
    }
}

public class Cake_baking {
    public static void main(String[] args) {
        Cake_make ckmk = new Cake_make();
        int cakecount  = 4;
        for(int i=0; i<cakecount; i++){
            Thread th = new Thread(ckmk);
            th.start();
        }

    }
}
