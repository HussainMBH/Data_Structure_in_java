package Inheritance_OOP;

class vehicle {
    public void car(){
        System.out.println("Can drive on Beach Side");
    }
}

class RangRover extends vehicle{
    //Override here car method
    public void car(){
        System.out.println("RangeRover car can drive on Beach.");
    }
    public void cardetails(){
        System.out.println("It's a totally Hybrid Model.");
    }
}

class Main{
    public static void main(String[] args) {
        RangRover Range = new RangRover();
        Range.car();
        Range.cardetails();
    }
}
