public class Ride {
    private int distance;

    public Ride(int distance) {
        this.distance = distance;
    }

    public double calculateFare() {
        return distance * 10;
    }

    public double getDistance() {
        return distance;
    }

    public String toString() {
        return "Distance: " + this.distance + " km";
    }
}
