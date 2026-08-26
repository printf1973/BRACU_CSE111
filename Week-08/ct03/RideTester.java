public class RideTester {
    public static void main(String[] args) {
        Ride r1 = new Ride(7);
        PremiumRide r2 = new PremiumRide(15, true);
        PremiumRide r3 = new PremiumRide(12, false);
        System.out.println("1============");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("2============");
        System.out.println("Regular Ride: " + r1.calculateFare() + " TK");
        System.out.println("Premium Ride " + r2.getId() + ": " + r2.calculateFare() + " TK");
        System.out.println("Premium Ride " + r3.getId() + ": " + r3.calculateFare(40) + " TK");
        System.out.println("3============");
        System.out.println(r3);
    }
}
