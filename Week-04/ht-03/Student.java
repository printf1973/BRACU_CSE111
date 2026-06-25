public class Student {
    public String name;
    public int id;
    public String dept;
    public String email;
    public String password;
    public String[] courses = new String[3];
    public boolean status = false;

    public Student(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        System.out.println("Student object is created");
    }
}
