public class Tester {

    public static void main(String[] args) {

        int count = 1;

        Device d1 = new GamingLaptop();
        Device d2 = new Laptop();
        Device d3 = new Device();
        Object d4 = new Laptop();
        Laptop d5 = new GamingLaptop();
        Object d6 = new Smartphone();

        System.out.printf("STATEMENT-%02d\n", count++);
        d1.start();
        System.out.printf("STATEMENT-%02d\n", count++);
        d2.start();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("CTE");
        // d4.start();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("CTE");
        // d6.start();
        System.out.printf("STATEMENT-%02d\n", count++);
        d1.shutdown();
        System.out.printf("STATEMENT-%02d\n", count++);
        d3.shutdown();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("CTE");
        // d4.shutdown();
        System.out.printf("STATEMENT-%02d\n", count++);
        d5.shutdown();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("CTE");
        // d6.shutdown();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((GamingLaptop) d4).notifyUser();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((GamingLaptop) d6).shutdown();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Smartphone) d1).notifyUser();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Smartphone) d6).start();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((GamingLaptop) d5).start();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((GamingLaptop) d5).notifyUser();

    }
}

class Device {
    public void start() {
        System.out.println("Device starting");
    }

    public void shutdown() {
        System.out.println("Device shutting down");
        start();
    }
}

class Laptop extends Device {
    public void start() {
        System.out.println("Laptop booting up");
    }
}

class Smartphone extends Device {
    public void notifyUser() {
        System.out.println("Smartphone notification");
    }
}

class GamingLaptop extends Laptop {
    public void start() {
        System.out.println("GamingLaptop powering on");
        super.start();
    }

    public void notifyUser() {
        System.out.println("GamingLaptop notification alert");
    }
}
