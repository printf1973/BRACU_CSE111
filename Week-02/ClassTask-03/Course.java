public class Course {
    public String name;
    public String code;
    public int credit;

    public void updateDetails(String name, String code, int credit) {
        this.name = name;
        this.code = code;
        this.credit = credit;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Course Credit: " + this.credit);
    }
}
