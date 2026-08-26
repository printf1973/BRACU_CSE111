public class Trace6CW {
    public static int temp = 10;
    public int sum = 0;
    public static int[] y = { 2, 5 };

    public Trace6CW() {
        temp -= 2;
        sum = temp + y[0];
        y[1] = sum - temp;
    }

    public void methodA(int m, int n) {
        int temp = 0;
        temp = Trace6CW.temp + m;
        this.sum = this.sum + temp + Trace6CW.y[1];
        Trace6CW.y[0] = this.sum - n;
        System.out.println(this.sum + " " + temp + " " + Trace6CW.y[0]);
    }

    public static void methodB(Trace6CW s1, int m) {
        int sum = 5;
        y[0] = s1.sum + sum;
        s1.sum = temp + y[1] + m;
        System.out.println(s1.sum + " " + y[0] + " " + temp);
    }
}
