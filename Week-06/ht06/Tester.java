public class Tester {
    public static void main(String[] args) {
        Trace trace1 = new Trace();
        Trace trace2 = new Trace(trace1);
        trace1.methodA(3, 2);
        Trace.methodC(trace1, trace2);
        trace2.methodB(1, 2);

    }
}
