public class Employee {
    public String name;
    public int id;
    public String pos;

    public Employee() {
        System.out.println("A default employee has been created");
    }

    public Employee(String n, int i, String p) {
        name = n;
        id = i;
        pos = p;
    }
}
