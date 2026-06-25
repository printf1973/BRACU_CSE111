public class TaxiLagbe {
    public String number;
    public String area = "Khulna";
    public String [] passenger = new String [4];
    public int count;
    public int fare;

    public TaxiLagbe(String number) {
        this.number = number;
        System.out.println("A new taxi has been created");
    }

    public TaxiLagbe(String number, String area) {
        this.number = number;
        this.area = area;
        System.out.println("A new taxi has been created");
    }

    public void printDetails() {
        System.out.println("Taxi Number: " + this.number);
        System.out.printf("This taxi can cover %s area%n", this.area);
        System.out.println("Total Passenger: " + this.count);
        System.out.println("Passenger List:");
        for (int i = 0; i < count; i++) {
            System.out.print(passenger[i] + " ");
        }
        System.out.println();
        System.out.println("Total collected fare: " + this.fare + " Taka");
    }

    public void addPassenger(String p1, int f1) {
        if (count < 4) {
            this.passenger[count++] = p1;
            this.fare += f1;
            System.out.printf("Dear %s! Welcome to TaxiLagbe%n", p1);
        }
        else {
            System.out.println("Taxi full! No more passengers can be added");
        }
    }
    public void addPassenger(String p1, int f1, String p2, int f2) {
    if (count < 4) {
        addPassenger(p1, f1);
    }
    addPassenger(p2, f2);
    }
}
