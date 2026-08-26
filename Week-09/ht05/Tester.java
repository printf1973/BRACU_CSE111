public class Tester {

    public static void main(String[] args) {

        int count = 1;

        Foo foo1 = new Foo();
        Bar bar1 = new Bar();
        Bux bux1 = new Bux();
        Foo foo2 = new Buzz();
        Bar bar2 = new Buzz();
        Object obj1 = new Foo();

        System.out.printf("STATEMENT-%02d\n", count++);
        bar1.call1();
        System.out.printf("STATEMENT-%02d\n", count++);
        foo2.call1();
        System.out.printf("STATEMENT-%02d\n", count++);
        foo2.call2();
        System.out.printf("STATEMENT-%02d\n", count++);
        bar2.call3();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println(bar1.name);
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println(bar2.name);
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println(((Buzz) bar2).name);
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Buzz) bar1).call4();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Bar) foo1).call3();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Foo) bux1).call1();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Bux) foo1).call1();
        System.out.printf("STATEMENT-%02d\n", count++);
        bux1.call1();
        System.out.printf("STATEMENT-%02d\n", count++);
        bux1.call2();
        System.out.printf("STATEMENT-%02d\n", count++);
        ((Foo) foo2).call2();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Buzz) obj1).call3();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Buzz) obj1).call2();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Bux) foo2).call2();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // ((Buzz) obj1).call1();
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println(foo2.name);
        System.out.printf("STATEMENT-%02d\n", count++);
        System.out.println("RTE");
        // System.out.println(((Bux) foo2).name);

    }
}

class Foo {
    String name = "foo";

    public void call1() {
        System.out.println("Foo 1");
    }

    public void call2() {
        call1();
        System.out.println("Foo 2");
    }
}

class Bar extends Foo {
    public void call2() {
        System.out.println("Bar 2");
    }

    public void call3() {
        System.out.println("Bar 3");
    }
}

class Buzz extends Bar {
    String name = "Buzz";

    public void call1() {
        System.out.println("Buzz 1");
    }

    public void call4() {
        call3();
        System.out.println("Buzz 4");
    }
}

class Bux extends Foo {
    String name = "Bux";

    public void call1() {
        System.out.println("Bux 1");
    }

    public void call3() {
        System.out.println("Bux 3");
    }
}
