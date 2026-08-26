public class UpsideDown extends Hawkins {
    public static int totalBridges;
    public Hawkins bridge1, bridge2;
    public int count;

    public UpsideDown(String name) {
        super(name);
    }

    public Hawkins getBridge1() {
        return bridge1;
    }

    public Hawkins getBridge2() {
        return bridge2;
    }

    public void connect(Hawkins p) {
        if (bridge1 == null) {
            bridge1 = p;
            totalBridges++;
        } else if (bridge2 == null) {
            bridge2 = p;
            totalBridges++;
        }

        System.out.println("No further bridges with " + name);
        System.out.println("Invalid bridge number!");

    }

    public void disconnect(int b) {
        if (b == 1) {
            bridge1 = null;
            totalBridges--;
        } else if (b == 2) {
            bridge2 = null;
            totalBridges--;
        }
    }

    public void details() {
        System.out.println(name + " Details:");
        if (bridge1 != null) {
            System.out.printf("Bridge 1: %s\n", bridge1.name);
        }
        if (bridge2 != null) {
            System.out.printf("Bridge 2: %s\n", bridge2.name);
        }
    }

    public void activate(Hawkins b) {
        System.out.println("Activating the door of " + b.name);
    }

}
