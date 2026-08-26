public class Concert {

    public static int totalSold;

    public String[] artists = new String[5];
    public int count;
    public String venue;
    public String showtime;
    public int sold;

    public Concert(String v, String s) {
        venue = v;
        showtime = s;
    }

    public void showDetails() {
        System.out.println("Venue: " + venue);
        System.out.println("Showtime: " + showtime);
        System.out.println("Artist:");
        for (int i = 0; i < count; i++) {
            System.out.println("-" + artists[i]);
        }
        System.out.println("Tickets sold in this concert: " + sold);
    }

    public void addArtist(String n) {
        if (count >= 5) {
            System.out.println("A maximum of 5 artists can be added to a concert.");
            return;
        }
        artists[count++] = n;
    }

    public void buyTicket(String zone, int quantity) {
        if (zone.equals("A")) {
            System.out.println("Total price: " + quantity * 500);
        }

        if (zone.equals("B")) {
            System.out.println("Total price: " + quantity * 1000);
        }

        if (zone.equals("VIP")) {
            System.out.println("Total price: " + quantity * 2000);
        }

        sold += quantity;
        totalSold += quantity;
    }

    public void buyTicket(String zone) {
        buyTicket(zone, 1);
    }

    public static void showTotalTicketsSold() {
        System.out.println("Total tickets sold (all venues): " + totalSold);
    }

}
