public class Developer extends Employee {

    public double finalSalary;
    public String lang;

    public Developer(String name, double salary, int hours, String lang) {
        super(name, salary, hours);
        this.lang = lang;
    }

    public void calculateSalary() {
        if (lang.equals("Java")) {
            finalSalary += getBaseSalary() + 700;
            return;
        }
        finalSalary = getBaseSalary();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Language: " + lang);
        System.out.printf("Final Salary: $%.01f\n", finalSalary);
    }

}
