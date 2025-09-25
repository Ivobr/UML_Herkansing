package code.Bridge.src;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BenzineAuto blueCar = new DAutoBenzine(new Blue());
//        BenzineAuto redCar = new DAutoBenzine(new Red());
//        BenzineAuto greenCar = new DAutoBenzine(new Green());
//        BenzineAuto blankCar = new DAutoBenzine(new Blank());
        blueCar.informatie();
        System.out.println(" ");
//        greenCar.informatie();
//        System.out.println(" ");
//        blueCar.informatie();
//        System.out.println(" ");
//        blankCar.informatie();
    }
}