public class Car extends Vehicle {
    public static Car[] cars = new Car[3];
    public static int id;

    public String type;
    public int seat;

    public Car(String model, int price, int seat) {
        super(model, price);
        this.seat = seat;
        this.type = "Regular Car";
        cars[id++] = this;
        vehicleId = "CAR" + String.format("%03d", id);

        System.out.println("Vehicle ID: " + vehicleId + " created");
    }

    @Override
    public void vehicleDetail() {
        super.vehicleDetail();
        System.out.println("Type: " + type);
        System.out.println("Seats: " + seat);
    }

    public static void showAllCars() {
        System.out.println("Total Car: " + id);
        System.out.println("Available Cars:");
        for (int i = 0; i < id; i++) {
            String sold = (cars[i].sold) ? "sold" : "available";
            System.out.println(cars[i].vehicleId + " : " + cars[i].model + " - " + sold);
        }
    }

    public static void showAllAvailableCars() {
        System.out.println("Total Car: " + id);
        System.out.println("Available Cars:");
        for (int i = 0; i < id; i++) {
            if (!cars[i].sold) {
                System.out.println(cars[i].vehicleId + " : " + cars[i].model);
            }
        }
    }

    public static void markAsSold(Car c) {
        c.sold = true;
    }
}
