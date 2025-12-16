public class Artifact {

    private String name, owner;

    private static Artifact[] vault = new Artifact[4];
    private static int count;
    private static Artifact strongest;

    public Artifact(String n, String o) {

        name = n;
        owner = o;

        if (strongest == null) {
            strongest = this;
        } else if (CalcPower() > strongest.CalcPower()) {
            strongest = this;
        }

    }

    public Artifact(String n) {
        this(n, "Okabe");
    }

    public String GetName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void changeName(String n) {
        name = n;
        System.out.println("Name changed and power recalculated.");
        if (CalcPower() > strongest.CalcPower()) {
            strongest = this;
        }

    }

    public int CalcPower() {
        int power = 0;
        for (int i = name.length() % 2; i < name.length(); i += 2) {
            power += name.codePointAt(i);
        }
        return power;
    }

    public void revealArtifact() {
        System.out.printf("%s added by %s has power of %d.%n", name, owner, CalcPower());
    }

    public static void AddtoVault(Artifact a) {
        if (count >= 4) {
            System.out.printf("!!%s unsuccessful in adding artifact to the vault!!%n", a.getOwner());
            return;
        }
        vault[count++] = a;
        System.out.printf("%s added %s successfully to the vault.%n", a.getOwner(), a.GetName());
    }

    public static void labReport() {
        System.out.println("=== Future Gadget Lab ===");
        for (int i = 0; i < count; i++) {
            vault[i].revealArtifact();
        }
    }

    public static String strongest() {
        return strongest.GetName();
    }
}
