public class Garage {

    public Car[] cars;
    public Bike[] bikes;
    public int cCount, bCount;

    public Garage(int c, int b) {
        cars = new Car[c];
        bikes = new Bike[b];
        System.out.println("Welcome to the Garage!");
        System.out.println("Car Capacity: " + c);
        System.out.println("Bike Capacity: " + b);
    }

    public void addVehicle(Vehicle v) {
        if (v instanceof Car) {
            if (cCount >= cars.length) {
                System.out.println("Can't add more Cars! Capacity: " + cars.length);
                return;
            }
            cars[cCount++] = (Car) v;
            System.out.printf("A %s CAR has been added to the Garage\n", v.getBrand());
        } else if (v instanceof Bike) {
            if (bCount >= bikes.length) {
                System.out.println("Can't add more Bikes! Capacity: " + bikes.length);
                return;
            }
            bikes[bCount++] = (Bike) v;
            System.out.printf("A %s BIKE has been added to the Garage\n", v.getBrand());
        }
    }
}
