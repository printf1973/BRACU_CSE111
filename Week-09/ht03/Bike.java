public class Bike extends Vehicle {

    public String model;
    public boolean sideCar;

    public Bike(String brand, String name, int year, int wheels, boolean sideCar) {
        super(brand, year);
        setWheels(wheels);
        this.model = name;
        this.sideCar = sideCar;
    }

    public String toString() {
        String ret = "Bike " + super.toString();
        ret += ", Model: " + this.model;
        ret += ", SideCar: " + this.sideCar;

        return ret;
    }

    public void doAWheelie() {
        if (sideCar) {
            System.out.printf("Wheelie Failed. %s:%s has SideCar\n", getBrand(), model);
            return;
        }

        System.out.printf("%s:%s is doing a Wheelie!!\n", getBrand(), model);
    }
}
