public class Tester {

    public static void main(String[] args) {

        int count = 1;

        Moo var1 = new Crew();
        Blue var2 = new Moo();
        Object var3 = new Sue();
        Sue var4 = new Sue();
        Blue var5 = new Crew();
        Blue var6 = new Blue();

        System.out.printf("STATEMENT-%02d\n", count++);
        var1.method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        var2.method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("CTE");
        // var3.method1(); // CTE
        System.out.printf("STATEMENT-%02d\n", count++);
        var4.method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        var5.method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        var6.method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        var1.method3();
        System.out.printf("STATEMENT-%02d\n", count++);
        var2.method3();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("CTE");
        // var3.method3();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Blue) var1).method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Crew) var1).method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("CTE");
        // ((Sue) var1).method3();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Blue) var3).method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Crew) var3).method1();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Sue) var3).method3();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Moo) var2).method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Crew) var3).method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Moo) var5).method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Moo) var6).method2();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Moo) var2).method1();

    }
}

class Sue {
    void method1() {
        System.out.println("sue 1");
    }

    void method3() {
        System.out.println("sue 3");
    }
}

class Blue {
    void method1() {
        System.out.println("blue 1");
        method3();
    }

    void method3() {
        System.out.println("blue 3");
    }
}

class Moo extends Blue {
    void method2() {
        super.method3();
        System.out.println("moo 2");
        this.method3();
    }

    void method3() {
        System.out.println("moo 3");
    }
}

class Crew extends Moo {
    void method1() {
        System.out.println("crew 1");
    }

    void method3() {
        System.out.println("crew 3");
    }
}
