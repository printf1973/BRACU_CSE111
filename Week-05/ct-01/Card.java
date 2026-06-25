public class Card {
    public String name;
    public double balance;

    public Card(double n, String s) {
        name = s;
        balance = n;
        System.out.println(name + " Card created successfully.");
        System.out.println("Balance: " + balance + " tk");
    }

    public void addMoneyFromAccount(double n, MFS acc) {
        if (acc.balance < n) {
            System.out.println("Insufficient account balance!");
            return;
        }
        balance += n;
        acc.balance -= n;
        System.out.println("Added " + n + " tk from MFS account#" + acc.acc + ".");
        System.out.println("New balance in card: " + balance + " tk");
    }
}
