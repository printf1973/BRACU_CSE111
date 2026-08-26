public class Manager extends Employee {

    public double finalSalary, bonus;

    public Manager(String name, double salary, int hours, double bonus) {
        super(name, salary, hours);
        this.bonus = bonus;
    }

    public void calculateSalary() {
        if (getHoursWorked() > 40) {
            finalSalary = getBaseSalary() * (1 + bonus / 100.0);
            return;
        }
        finalSalary = getBaseSalary();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Bonus: %.01f %%\n", bonus);
        System.out.printf("Final Salary: $%.01f\n", finalSalary);
    }

    public void requestIncrement(int n) {
        if (getHoursWorked() > 100) {
            setBaseSalary(getBaseSalary() + n);
            System.out.printf("$%d Increment approved.\n", n);
        } else if (getHoursWorked() > 80) {
            setBaseSalary(getBaseSalary() + n * 0.5);
            System.out.printf("$%d Increment approved.\n", n / 2);
        } else {
            System.out.println("Increment denied.");
        }
    }

}
