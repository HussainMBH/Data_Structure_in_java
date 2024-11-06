package ConcurrencyInJava;

public class ConcurrencyTest {
    public static void main(String[] args){
        //Creating two threads that execute separate tasks concurrency
        Thread thread1 = new Thread(new Task("Task 1"));
        Thread thread2 = new Thread(new Task("Task 2"));

        // Starting both threads
        thread1.start();
        thread2.start();
    }
}

class Task implements Runnable{
    private String taskName;
    public Task(String taskName){
        this.taskName = taskName;
    }

    public void run(){
        for(int i=1; i<= 5; i++){
            System.out.println(taskName + " - Number: " + i);
            try {
                Thread.sleep(500); //pause the thread for 500ms
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}