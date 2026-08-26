public class PremiumRide extends Ride {

    public static int id;
    public boolean surge, discount;
    public int discountAmount;
    public String uid = "" + (++id);

    public PremiumRide(int d, boolean s) {
        super(d);
        surge = s;
        discount = false;
        uid += "-" + d;
    }

    public String toString() {
        String ret = super.toString();
        ret += "\nID: " + this.uid;
        ret += "\nService Charge: " + 50 + " TK";
        ret += "\nSurge: " + surge;
        ret += "\nDiscount: " + discount;

        return ret;
    }

    public String getId() {
        return uid;
    }

    @Override
    public double calculateFare() {
        if (surge) {
            return (super.calculateFare() + 50) * 1.2;
        }
        return (super.calculateFare() + 50);
    }

    public double calculateFare(int d) {
        this.discount = true;
        return calculateFare() - d;
    }

}
