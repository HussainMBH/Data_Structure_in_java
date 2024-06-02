package InterfaceExample;

public interface Smartphone {
    void call();
//    void camera();
//    void videocall();
//    void browse();
}

class Samsung implements Smartphone{
    @Override
    public void call() {
        System.out.println("You can Call in this phone");
    }

    public static void main(String[] args) {
        Samsung obj = new Samsung();
        obj.call();
    }

}

