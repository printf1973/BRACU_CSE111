public class UberEatsUser {

    public String name, adress;

    public UberEatsUser(String s) {
        this(s, null);
    }

    public UberEatsUser(String s, String a) {
        name = s;
        adress = a;
    }

    public void updateLocation(String a) {
        if (adress == null) {
            adress = a;
            System.out.println("Update Successful!");
            return;
        }
        System.out.println("We already have your location. Please place an order!");
    }

}
