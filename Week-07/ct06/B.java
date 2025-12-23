public class B extends A {
    public int x = 6;

    public void methodB(int m, int n) {
        int y = 0;
        y = ++y + this.y;
        x = this.y + 2 + temp;
        methodA(x, y);
        sum = x + y + super.sum;
        System.out.println(x + " " + y + " " + sum);
    }
}
