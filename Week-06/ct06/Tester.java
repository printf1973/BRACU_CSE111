class Tester {
    public static void main(String[] args) {
        Trace6CW s1 = new Trace6CW();
        Trace6CW s2 = new Trace6CW();
        s1.methodA(3, 2);
        Trace6CW.methodB(s2, 4);
        s2.methodA(1, 1);
    }
}
