public class MFS {
    public String acc;
    public double balance;
    public Card card;
    

    public MFS(String s) {
        acc = s;
        System.out.println("Account created.");
        System.out.println("AccNo: " + s);
        System.out.println("Balance: " + balance + " tk");
        if (card == null) {
            System.out.println("Card not saved.");
        }
    }

    public void addNewCard(Card c) {
        if (card == null) {
            card = c;
            System.out.println("VISA card added to MFS#" + acc);
        }
        else {
            System.out.println("There can be at most 1 card per MFS account.");
        }
    }

    public void addMoneyFromCard(double n) {
        if (card == null) {
            System.out.println("Please add a card to your account to your MFS account");
            return;
        }
        if (card.balance < n) {
            System.out.println("Insufficient balance in VISA Card.");
            return;
        }
        balance += n;
        card.balance -= n;
        System.out.println("Transfer successful.");
        System.out.println("New MFS account balance: " + balance + " tk");
        System.out.println("Card balance: " + card.balance + " tk");
    }
}
