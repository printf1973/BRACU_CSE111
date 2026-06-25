public class Student {
    public String name;
    public int id;
    public double cgpa;

    public Student(String n, int i, double c) {
        name = n;
        id = i;
        cgpa = c;
    }

    public void updateId(int i) {
        id = i;
    }
}
