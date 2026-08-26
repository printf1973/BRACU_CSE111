public class Tester {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Account a1 = new Account();
        Account a2 = new Account(a1);
        a1.deposit(3, 4);
        a2.withdraw(1, 6);
    }
}

class Bank {
    public static int rs = 3;
    public static int cd = -8;
    public int bl = 0;
    public int br = 0;

    public Bank() {
        br = rs - 2;
        bl = rs + 1;
        rs -= 2;
    }

    public void deposit(int a, int b) {
        int cd = 0;
        br = br + a + (rs++);
        cd = cd + 1 + b;
        bl = bl + cd + br;
        System.out.println(cd + " " + br + " " + bl);
    }
}

class Account extends Bank {
    public static int cd = 1;
    public int bl = -4;

    public Account() {
        bl = 0;
        br = rs + 3;
        super.bl = 2 + rs + 3;
        rs -= 2;
    }

    public Account(Account acc) {
        bl = acc.bl + super.bl;
        cd = acc.cd;
        acc.withdraw(2, 3);
    }

    public void withdraw(int a, int b) {
        int br = 0;
        br = br + this.br;
        cd = br + 2 + (++rs);
        deposit(cd, br);
        bl = cd + br + bl;
        System.out.println(cd + " " + br + " " + bl);
    }
}
