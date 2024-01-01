package Synchronized_key_word;

class CakeCounter{
    int cakeCount = 0;

    public synchronized void increment(){
        cakeCount++;
    }
}

class Team implements Runnable{
    CakeCounter counter;

    //Constructor
    Team(CakeCounter counter){
        this.counter = counter;
    }
    public void run(){
        for(int i=0; i<1000; i++){
            counter.increment();
        }
    }
}

public class Synchronized_key_word_class {
    public static void main(String[] args) {
        CakeCounter counter = new CakeCounter();

        // u just tell which is share button i'll give to all that one button only
        Thread team1 = new Thread(new Team(counter));
        Thread team2 = new Thread(new Team(counter));

        team1.start();
        team2.start();

        try{
            team1.join();
            team2.join();
        }
        catch (Exception E){

        }

        System.out.println(counter.cakeCount);
    }
}
