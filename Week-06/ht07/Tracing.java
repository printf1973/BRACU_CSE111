public class Tracing {
    public static int x = 0, y = 0;
    public int a;
    private int b = 3;

    public Tracing(int a, int b) {
        this.a = a;
        this.b = b - this.b;
        x += 1;
        y += Tracing.y - 2;
    }

    public void set_b(int b) {
        this.b = b;
    }

    public int get_b() {
        return this.b;
    }

    public void methodA(int x) {
        this.a = x + this.x - Tracing.x;
        this.b = this.a + this.methodB() - this.b;
        System.out.println(this.a + " " + this.b + " " + x);
    }

    public int methodB() {
        int y = -3;
        this.b = y - this.y + this.a;
        System.out.println(this.a + " " + this.b + " " + x);
        this.y -= y;
        x += this.b + this.y;
        return this.b;
    }

    public void methodB(Tracing t1) {
        int t = this.y - t1.get_b() + this.b;
        t1.set_b(t);
        t1.a = this.x - t1.a + this.a;
        System.out.println(t1.a + " " + t1.get_b() + " " + x);
    }
}
