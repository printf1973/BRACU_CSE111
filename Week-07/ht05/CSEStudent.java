public class CSEStudent extends Student {
    public static int count;
    public static String[] cseCourses = { "CSE110", "CSE111", "CSE220", "CSE221" };

    public CSEStudent(String n, int i) {
        super(n, i);
        count++;
    }

    public void addLabBasedCourse(String c) {
        for (int i = 0; i < cseCourses.length; i++) {
            if (cseCourses[i].equals(c)) {
                super.courses += c + " ";
                return;
            }
        }
        System.out.println("It is not a lab based course!");
    }

    public static void details() {
        System.out.println("Total CSE Students: " + count);
        System.out.println("Available Lab Based Courses:");
        for (int i = 0; i < cseCourses.length; i++) {
            System.out.print(cseCourses[i] + " ");
        }
        System.out.println();
    }

}
