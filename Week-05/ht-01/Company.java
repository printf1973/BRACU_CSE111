public class Company {
    public String name = "ABC Company";
    public Employee[] emp = new Employee[3];
    public int count;

    public void details() {
        System.out.println("Company Name: " + name);
        System.out.println("Total Employee: " + count);
        System.out.println("Fulltime Employees: ");
        for (int i = 0; i < count; i++) {
            if (emp[i].pos.equals("Fulltime")) {
                System.out.println("Name: " + emp[i].name + ", ID: " + emp[i].id);
            }
        }
        System.out.println("Part-Time Employees: ");
        for (int i = 0; i < count; i++) {
            if (emp[i].pos.equals("Part-time")) {
                System.out.println("Name: " + emp[i].name + ", ID: " + emp[i].id);
            }
        }
    }

    public void addEmployee(Employee e) {
        if (count >= 3) {
            System.out.println("No more vacancy");
            return;
        }
        emp[count++] = e;
        System.out.println(e.name + " has joined the company");
    }

    public void removeEmployee(Employee e) {
        for (int i = 0; i < count; i++) {
            if (emp[i] == e) {
                for (int j = i; j < count - 1; j++) {
                    emp[j] = emp[j + 1];
                }
                count--;
                System.out.println(e.name + " has left the company");
                return;
            }
        }
    }
}
