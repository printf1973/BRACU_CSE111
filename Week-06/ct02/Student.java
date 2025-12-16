public class Student {

    public static int total_students = 0;
    public static double marks = 0;

    public String name;
    public int id = ++total_students;
    public int codingMarks;
    public int tracingMarks;

    public Student(String n) {
        this(n, 0, 0);
    }

    public Student(String n, int c, int t) {
        name = n;
        setCodingMarks(c);
        setTracingMarks(t);
    }

    public void setCodingMarks(int codingMarks) {
        this.codingMarks = codingMarks;
        marks += codingMarks;
    }

    public void setTracingMarks(int tracingMarks) {
        this.tracingMarks = tracingMarks;
        marks += tracingMarks;
    }

    public static double averageMarks() {
        if (total_students == 0) {
            return 0;
        }
        return marks / total_students;
    }

    public void individualDetail() {
        int total = codingMarks + tracingMarks;
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Coding Marks: " + codingMarks);
        System.out.println("Tracing Marks: " + tracingMarks);
        if (total < 50) {
            System.out.println(name + " has failed with " + total + " marks");
        } else {
            System.out.println(name + " has passed with " + total + " marks");
        }
    }
}
