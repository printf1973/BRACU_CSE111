public class Animalkeepers {

    public static int id = 100;
    public static String[] Animals = { "Lion", "Tiger", "Seal", "Gorilla", "Deer" };
    public static String[] tasks = new String[Animals.length];
    public static String[] keepers = new String[Animals.length];

    public String name;
    private int uid = ++id;

    public Animalkeepers(String n) {
        name = n;
        System.out.printf("%s with ID %d got the job!%n", name, uid);
    }

    public void doTask(String a, String t) {
        for (int i = 0; i < Animals.length; i++) {
            if (Animals[i].equals(a)) {
                tasks[i] = t;
                keepers[i] = name;
                System.out.println("Task assigned to " + name);
                return;
            }
        }
        System.out.println("Animal not in Safari");
    }

    public static void details() {
        if (tasks[0] == null) {

            System.out.println("No Animal Keepers working yet.");
            return;
        }
        int taskCount = 0;
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null) {
                taskCount++;
            }
        }
        System.out.println("Total Animal Keeper: " + (id - 100));
        System.out.println("Total Task assigned: " + taskCount);
        printTasks();
    }

    public static void printTasks() {
        if (tasks[0] == null) {
            System.out.println("No tasks assigned.");
            return;
        }
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null) {
                System.out.printf("%s (Keeper - %s) === %s%n", tasks[i], keepers[i], Animals[i]);
            }
        }
    }
}
