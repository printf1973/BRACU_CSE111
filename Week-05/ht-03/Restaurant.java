public class Restaurant {

    public String name, adress;
    public UberEatsUser[] user = new UberEatsUser[3];
    public int count;

    public Restaurant(String n, String a) {
        name = n;
        adress = a;
    }

    public void takeOrder(UberEatsUser u) {
        if (u.adress == null) {
            System.out.println("Location: Unknown. Please update your location information!");
            return;
        }
        if (count >= 3) {
            System.out.println("We are really busy right now. Please order after some time. Thank you!");
            return;
        }
        for (int i = 0; i < count; i++) {
            if (user[i] == u) {
                System.out.println("You already have a pending order!");
                return;
            }
        }
        user[count++] = u;
        System.out.println("Your order has been added!");
    }

    public void completeOrders() {
        if (count == 0) {
            System.out.println("No pending orders at the moment.");
            return;
        }
        System.out.println("Showing " + name + "'s order:");
        for (int i = 0; i < count; i++) {
            System.out.println("Order by " + user[i].name + " at " + user[i].adress + " completed");
            user[i] = null;
        }
        count = 0;
    }
}
