public class Employee {
    public String name;
    public double salary;
    public String designation;
    public int rank = 1;

    public void newEmployee(String name) {
        this.name = name;
        this.salary = 30000;
        this.designation = "junior";
    }

    public void calculateTax() {
        if (this.salary <= 30000) {
            System.out.println("No need to pay tax");
        }
        else if (30000 < this.salary && this.salary <= 50000) {
            System.out.println(this.name + " Tax Amount: " + this.salary*0.1 + " Tk");
        }
        else if (this.salary > 50000) {
            System.out.println(this.name + " Tax Amount: " + this.salary*0.3 + " Tk");
        }
    }

    public void promoteEmployee(String designation) {
        if (designation.equalsIgnoreCase("senior") && rank < 2) {
            this.designation = designation;
            this.rank = 2;
            this.salary += 25000;
            System.out.println(this.name + " has been promoted to " + this.designation);
            System.out.println("New salary: " + this.salary + " Tk");
        }

        else if (designation.equalsIgnoreCase("lead") && rank < 3) {
            this.designation = designation;
            this.rank = 3;
            this.salary += 50000;
            System.out.println(this.name + " has been promoted to " + this.designation);
            System.out.println("New salary: " + this.salary + " Tk");
        }

        else if (designation.equalsIgnoreCase("manager") && rank < 4) {
            this.designation = designation;
            this.rank = 4;
            this.salary += 75000;
            System.out.println(this.name + " has been promoted to " + this.designation);
            System.out.println("New salary: " + this.salary + " Tk");
        }
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary + " Tk");
        System.out.println("Employee Designation: " + this.designation);
    }
}
