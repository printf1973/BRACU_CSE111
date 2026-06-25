public class MoneyTracker {
    public String name;
    public double balance;
    public double lastIncome;
    public double lastExpense;

    public MoneyTracker() {
        System.out.println("A new money tracker has been launched.");
    }

    public String info() {
        return "Name: " + this.name + "\nCurrent Balance: " + this.balance;
    }

    public void createTracker(String name) {
        this.name = name;
        this.balance = 1;
    }

    public void income(double amount) {
        this.balance += amount;
        this.lastIncome = amount;
        System.out.println("Balance Updated!");
    }

    public void expense(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            this.lastExpense = amount;
            if (balance == 0) {
                System.out.println("You're broke!");
            }
            else {
                System.out.println("Balance Updated.");
            }
        }
        else {
            System.out.println("Not enough balance.");
        }
    }

    public void showHistory() {
        System.out.println("Last added: " + lastIncome);
        System.out.println("Last spent: " + lastExpense);
    }
}
