public class Car extends Vehicle {

    public String model;
    public int doors;
    public boolean ai;

    public Car(String brand, String name, int year, int doors, int wheels, boolean ai) {
        super(brand, year);
        setWheels(wheels);
        this.model = name;
        this.doors = doors;
        this.ai = ai;
    }

    public String toString() {
        String ret = "Car " + super.toString();
        ret += ", Model: " + this.model;
        ret += ", Doors: " + this.doors;
        ret += ", AI: " + this.ai;

        return ret;
    }

    public void startAutoPilot() {
        if (!ai) {
            System.out.printf("%s:%s has NO AutoPilot\n", getBrand(), model);
            return;
        }

        System.out.printf("%s:%s AutoPilot Started\n", getBrand(), model);
    }
}
