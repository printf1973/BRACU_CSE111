public class Tester {

    public static void main(String[] args) {

        int count = 1;

        Chocolate choco1 = new Chocolate();
        KitKat kit = new KitKat();
        DairyMilk dairyMilk1 = new DairyMilk();
        DairyMilk dairyMilk2 = new SilkOreo();
        Object obj1 = new DairyMilk();
        Object obj2 = new KitKat();
        Chocolate caramel1 = new Caramel();

        System.out.printf("STATEMENT-%02d\n", count++);
        choco1.method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        dairyMilk1.method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("CTE");
        // dairyMilk2.method4();
        System.out.printf("STATEMENT-%02d\n", count++);
        caramel1.method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println(caramel1);
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println(caramel1.texture);
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Chocolate) kit).method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((SilkOreo) dairyMilk2).method3();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("CTE");
        // ((DairyMilk) kit).method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("CTE");
        // ((Chocolate) kit).method3();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Chocolate) dairyMilk2).method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Chocolate) obj1).method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Caramel) obj1).method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((SilkOreo) obj2).method3();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println(((Object) choco1).toString());
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println(((Chocolate) kit).texture);

    }
}

class Caramel extends SilkOreo {
    String texture = "Softy";

    public void method1() {
        System.out.println("Caramel m1");
    }

    public void method4() {
        System.out.println("Caramel m4");
    }

    public String toString() {
        method2();
        return "Caramel is " + texture;
    }
}

class Chocolate {
    String texture = "Chocolaty";

    public void method1() {
        method2();
        System.out.println("Chocolate m1");
    }

    public void method2() {
        System.out.println("Chocolate m2");
    }

    public String toString() {
        method2();
        return "Chocolate is " + texture;
    }
}

class DairyMilk extends Chocolate {
    String texture = "Yummy";

    public void method2() {
        System.out.println(this.texture);
        System.out.println("DairyMilk m2");
    }

    public void method3() {
        System.out.println("DairyMilk m3");
    }
}

class KitKat extends Chocolate {
    String texture = "Crunchy";

    public void method1() {
        System.out.println("KitKat m1");
    }

    public void method4() {
        System.out.println("KitKat m4");
    }

    public String toString() {
        method2();
        return "KitKat is " + texture;
    }
}

class SilkOreo extends DairyMilk {
    String texture = "Silky";

    public void method1() {
        super.method1();
        System.out.println("SilkOreo m1");
    }

    public void method3() {
        System.out.println("SilkOreo m3");
        System.out.println(this);
    }
}
