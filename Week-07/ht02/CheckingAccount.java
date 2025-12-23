public class CheckingAccount extends Account {
    public static int count;

    public CheckingAccount() {
        super(0);
        CheckingAccount.count++;
    }

    public CheckingAccount(double b) {
        super(b);
        CheckingAccount.count++;
    }
}
