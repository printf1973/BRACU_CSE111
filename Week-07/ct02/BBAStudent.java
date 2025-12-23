public class BBAStudent extends Student {

    public BBAStudent(String name) {
        super();
        setName(name);
        setDepartment("BBA");
    }

    public BBAStudent() {
        this("Default");
    }
}
