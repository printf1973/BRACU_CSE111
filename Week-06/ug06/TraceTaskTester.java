public class TraceTaskTester {
    public static void main(String[] args) {
        TraceTask t1 = new TraceTask(4);
        TraceTask t2 = new TraceTask(2);
        t1.methodA(3);
        int res = t2.methodB(t1, 5);
        System.out.println(res + " " + TraceTask.x);
    }
}
