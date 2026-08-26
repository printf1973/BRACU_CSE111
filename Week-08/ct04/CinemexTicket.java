public class CinemexTicket extends MovieTicket {
    public static int totalTickets;
    public String id, genre, status;

    public CinemexTicket(String movie, String showtime, String genre, String date) {
        super(movie, date, showtime, 0.0);
        totalTickets++;
        this.genre = genre;
        status = "Not Paid";
        seat = "Regular";
        id = movie + "-R-" + totalTickets;
    }

    public CinemexTicket(String movie, String showtime, String genre, String date, String seatType) {
        super(movie, date, showtime, 0.0);
        totalTickets++;
        this.genre = genre;
        seat = seatType;
        status = "Not Paid";
        id = movie + "-" + seatType.charAt(0) + "-" + totalTickets;
    }

    public static int getTotalTickets() {
        return totalTickets;
    }

    public void calculateTicketPrice() {
        int time = Integer.parseInt(showtime.split(":")[0]);
        double price = 0;
        for (int i = 0; i < seatTypes.length; i++) {
            if (seatTypes[i].equals(seat)) {
                price = seatPrices[i];
            }
        }
        if (time >= 18) {
            price += price * (nightShowCharge / 100.0);
        }
        System.out.println("Ticket price is calculated successfully.");
        super.setPrice(price);
    }

    @Override
    public String toString() {
        String ret = "Ticket ID: " + id;
        ret += "\n" + super.toString();
        ret += "\nGenre: " + genre;
        ret += "\nSeat type: " + seat;
        ret += "\nPrice(tk): " + getPrice();
        ret += "\nStatus: " + status;

        return ret;
    }

    public String confirmPayment() {
        if (status.equals("Paid")) {
            return "Ticket price is already paid!";
        }
        status = "Paid";
        return "Payment Successful.";
    }
}
