public class Connect {
    public int totalAdvisee;
    public Student[] students = new Student[5];

    public Connect() {
        System.out.println("Connect is ready to use!");
    }

    public void login(Student s) {
        if (s.email == null || s.password == null) {
            System.out.println("Email and password need to be set.");
        }
        else {
            s.status = true;
            System.out.println("Login successful");
        }
    }

    public void advising(Student s) {
        if (!s.status) {
            System.out.println("Please login to advise courses!");
        }
        else {
            System.out.println("You haven't selected any courses.");
        }
    }

    public void advising(Student s, String c1, String c2, String c3) {
        if (!s.status) {
            System.out.println("Please login to advise courses!");
        }
        else {
            if (totalAdvisee < 5) {
                s.courses[0] = c1;
                s.courses[1] = c2;
                s.courses[2] = c3;
                students[totalAdvisee++] = s;
                System.out.println("Advising successful!");
            }
            else {
                System.out.println("Connect can take at most 5 advisees.");
            }
        }
    }

    public void advising(Student s, String c1, String c2, String c3, String c4) {
        if (!s.status) {
            System.out.println("Please login to advise courses!");
        }
        else {
            System.out.println("You need special approval to take more than 3 courses.");
        }
    }

    public void allAdviseeInfo() {
        if (totalAdvisee == 0) {
            System.out.println("No advisee added");
        }
        else {
            System.out.println("Total Advisee: " + totalAdvisee);
            for (int i = 0; i < totalAdvisee; i++) {
                Student s = students[i];
                System.out.println("Name: " + s.name + " ID: " + s.id);
                System.out.println("Department: " + s.dept);
                System.out.println("Advised Courses:");
                for (int j = 0; j < 3; j++) {
                    System.out.print(s.courses[j] + " ");
                }
                System.out.print("\n==============\n");
            }
        }
    }
}
