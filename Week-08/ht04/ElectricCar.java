public class ElectricCar extends Vehicle {
    public static ElectricCar[] cars = new ElectricCar[3];
    public static int id;

    public String type;
    public int capacity;

    public ElectricCar(String model, int price, int capacity) {
        super(model, price);
        this.capacity = capacity;
        this.type = "Electric Car";
        cars[id++] = this;
        vehicleId = "EV000";

        System.out.println("Vehicle ID: " + vehicleId + " created");
    }

    @Override
    public void vehicleDetail() {
        super.vehicleDetail();
        System.out.println("Type: " + type);
        System.out.println("Battery Capacity: " + capacity + "kWh");
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

    public static void markAsSoldEV(ElectricCar c) {
        c.sold = true;
    }
}
