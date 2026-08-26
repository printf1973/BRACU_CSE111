public class VIPConcert extends Concert {

    public VIPConcert(String v, String s) {
        super(v, s);
    }

    public void buyTicket() {
        System.out.println("Total price: 2000");
        sold++;
        Concert.totalSold++;
    }

}
