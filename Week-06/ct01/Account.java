public class Account {
    public static String bankName = "Badda Bank";
    public static int count;
    public static double totalBalance;

    public String name;
    public String address;
    private double balance;

    public Account(String n, String a) {
        name = n;
        address = a;
        count++;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        if (b > 0) {
            balance += b;
            totalBalance += b;
        }
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", address: " + address);
        System.out.println("Balance: " + getBalance() + " Taka");
    }
}
