public class Trace {
    public static int[] x = { 3, -4 };
    public int y = 4;
    public static int temp = -5;
    private int sum = 2;

    public Trace() {
        y = temp + 3;
        sum = 3 + temp + x[1];
        temp -= 2;
        x[0] = ++x[1] - 2;
    }

    public Trace(Trace trace) {
        sum = trace.sum;
        x = trace.x;
        trace.methodB(1, 3);
    }

    public void methodA(int m, int n) {
        int x = 2 - this.x[0] - Trace.x[1];
        y = y + m + (temp++);
        x = x + 7 + n;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
    }

    public void methodB(int m, int n) {
        int y = 0;
        y = y + this.y;
        Trace.x[0] = this.y + 3 + temp;
        methodA(x[1], y);
        sum = Trace.x[1] + y + sum;
        System.out.println(this.x[0] + " " + y + " " + sum);
    }

    public static void methodC(Trace trace1, Trace trace2) {
        temp = x[0] - Trace.x[1];
        x = new int[] { trace1.y, trace2.y };
    }
}
