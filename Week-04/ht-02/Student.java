public class Student {
    public int id;
    public double cgpa;
    public int count;
    public int capacity = 4;
    public String[] courses;

    public Student(int n) {
        id = n;
        System.out.println("A student with ID " + id + " has been created.");
    }

    public Student(int n, double cg) {
        id = n;
        cgpa = cg;
        if (cgpa < 3) {
            capacity = 3;
        }
        courses = new String[capacity];
        System.out.println("A student with ID " + n + " and cgps " + cgpa + " has been created.");
    }

    public void storeCG(double cg) {
        cgpa = cg;
        if (cgpa < 3) {
            if (capacity == 4) {
                capacity = 3;
                String[] temp = new String[capacity];
                for (int i = 0; i < count; i++) {
                    temp[i] = courses[i];
                }
                courses = temp;
            }
        }
        else {
            if (capacity == 3) {
                capacity = 4;
                String[] temp = new String[capacity];
                for (int i = 0; i < 3; i++) {
                    temp[i] = courses[i];
                }
                courses = temp;
            }
        }
    }

    public void storeID(int n) {
        id = n;
    }

    public void showAdvisee() {
        System.out.println("Student ID: " + id + ", CGPA: " + cgpa);
        if (count == 0) {
            System.out.println("No courses added.");
        }
        else {
            System.out.println("Added courses are:");
            for (int i = 0; i < count; i++) {
                System.out.print(courses[i] + " ");
            }
            System.out.println();
        }
    }

    public void addCourse(String s) {
        if (cgpa == 0) {
            System.out.println("Failed to add " + s);
            System.out.println("Set CG first");
            return;
        }

        else if (count == capacity) {
            if (capacity == 3) {
                System.out.println("Failed to add " + s);
                System.out.println("CG is low. Can't add more than 3 courses.");
            }
            else {
                System.out.println("Failed to add " + s);
                System.out.println("Maximum 4 courses allowed.");
            }
        }

        else {
            courses[count++] = s;
        }
    }

    public void addCourse(String[] arr) {
        int temp = count;
        for (int i = 0; i < arr.length; i++) {
            addCourse(arr[i]);
            if (temp == count) {
                break;
            }
        }
    }

    public void removeAllCourse() {
        courses = new String[4];
        count = 0;
    }
}
