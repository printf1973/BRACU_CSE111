public class Department {
    public String name;
    public Student[] students = new Student[5];
    public int count;

    public Department(String n) {
        name = n;
    }

    public void findStudent(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].id == id) {
                System.out.println("Student info: ");
                System.out.println("Student Name: " + students[i].name);
                System.out.println("ID: " + students[i].id);
                System.out.println("CGPA: " + students[i].cgpa);
                return;
            }
        }
        System.out.println("Student with this ID doesn't exist, Please give a valid ID");
    }

    public void addStudent(Student s) {
        if (count >= 5) {
            System.out.println("A department can add a maximum of 5 students.");
            return;
        }
        for (int i = 0; i < count; i++) {
            if (students[i].id == s.id) {
                System.out.println("Student with the same ID already exists, Please try with another ID");
                return;
            }
        }
        students[count++] = s;
        System.out.println("Welcome to " + name + " department, " + s.name);
    }

    public void addStudent(Student s1, Student s2, Student s3) {
        int temp = count;
        addStudent(s1);
        if (temp != count) {
            temp = count;
            addStudent(s2);
            if (temp != count) {
                addStudent(s3);
            }
        }
    }

    public void details() {
        System.out.println("Department Name: " + name);
        System.out.println("Number of Students: " + count);
        System.out.println("Details of the students: ");
        for (int i = 0; i < count; i++) {
            System.out.println("Student name: " + students[i].name + ", ID: " + students[i].id + ", cgpa: " + students[i].cgpa);
        }
    }

}
