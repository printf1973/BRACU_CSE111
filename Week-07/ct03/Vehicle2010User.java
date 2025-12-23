public class Vehicle2010User {
    public static void main(String[] args) {
        Vehicle2010 car1 = new Vehicle2010();
        System.out.println(car1.getPosition());
        car1.moveLowerLeft();
        System.out.println(car1.getPosition());
        Vehicle2010 car2 = new Vehicle2010();
        System.out.println(car2.getPosition());
        car2.moveUpperRight();
        System.out.println(car2.getPosition());
        car2.moveLowerRight();
        System.out.println(car2.getPosition());
    }
}
