public class Tester {

    public static void main(String[] args) {

        int count = 1;

        Gandalf var1 = new Frodo();
        Gandalf var2 = new Bilbo();
        Gandalf var3 = new Gandalf();
        Object var4 = new Bilbo();
        Bilbo var5 = new Frodo();
        Object var6 = new Gollum();

        System.out.printf("STATEMENT-%02d\n", count++);
        var1.method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        var2.method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("CTE");
        // var4.method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("CTE");
        // var6.method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        var1.method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        var3.method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("CTE");
        // var4.method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        var5.method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("CTE");
        // var6.method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Frodo) var4).method3();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Frodo) var6).method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Gollum) var1).method3();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Gollum) var4).method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Gandalf) var1).method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Frodo) var4).method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Gollum) var6).method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Gandalf) var2).method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Bilbo) var6).method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Frodo) var1).method3();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("CTE");
        // ((Gandalf) var5).method3();

    }
}

class Gandalf {
    public void method1() {
        System.out.println("Gandalf 1");
    }

    public void method2() {
        System.out.println("Gandalf 2");
        method1();
    }
}

class Bilbo extends Gandalf {
    public void method1() {
        System.out.println("Bilbo 1");
    }
}

class Gollum extends Gandalf {
    public void method3() {
        System.out.println("Gollum 3");
    }
}

class Frodo extends Bilbo {
    public void method1() {
        System.out.println("Frodo 1");
        super.method1();
    }

    public void method3() {
        System.out.println("Frodo 3");
    }
}
