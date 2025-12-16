public class Character {

    public static int kids, teens, adults, id;
    public static double totalHP;
    public static Character strongest;

    public String name, group;
    public int hp, uid = ++id;

    public Character(String n, String g, int h) {
        name = n;
        group = g;
        hp = h;
        totalHP += h;

        if (g.equals("Kid")) {
            kids++;
        } else if (g.equals("Teen")) {
            teens++;
        } else if (g.equals("Adult")) {
            adults++;
        }

        if (strongest == null) {
            strongest = this;
        } else if (h > strongest.hp) {
            strongest = this;
        }
    }

    public Character(String n, int h) {
        this(n, "Teen", h);
    }

    public void printDetails() {
        System.out.printf("ID: %d, Name: %s%n", uid, name);
        System.out.printf("Group: %s%n", group);
        System.out.printf("Health: %d%n", hp);
    }

    public static void printStats() {
        System.out.printf("Total Characters: %d%n", id);
        System.out.printf("Kids: %d%n", kids);
        System.out.printf("Teens: %d%n", teens);
        System.out.printf("Adults: %d%n", adults);
        if (id == 0) {
            System.out.println("Average Health: 0");
        } else {
            System.out.printf("Average Health: %.1f%n", totalHP / id);
        }
        System.out.print("Strongest Character: ");
        if (strongest == null) {
            System.out.println("None");
        } else {
            System.out.println();
            System.out.printf("%s (Health %d)%n", strongest.name, strongest.hp);
        }
    }
}
