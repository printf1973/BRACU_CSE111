public class Trainer {

    public static int id;

    public String name;
    public int uid = ++id;
    public Pokemon[] poke = new Pokemon[7];
    public double totalHp;
    public int count;

    public Trainer(String n) {
        name = n;
        System.out.println("Trainer ID: " + uid + ", Name: " + name + " - created");
    }

    public void catchPokemon(Pokemon p) {
        if (count < 7) {
            poke[count++] = p;
            totalHp += p.getHP();
            System.out.println(name + " caught: " + p.getName());
        }
    }

    public void viewPokeDex() {
        System.out.println(name + "'s Trainer code: T" + uid);
        for (int i = 0; i < count; i++) {
            System.out.println(poke[i].getName() + ": " + poke[i].getHP() + " points");
        }
        double avg = (count == 0) ? 0 : (totalHp / count);
        System.out.println("Average of HP: " + avg);
    }

    public static void battle(Trainer t1, Trainer t2) {
        double t1Avg = (t1.count == 0) ? 0 : (t1.totalHp / t1.count);
        double t2Avg = (t2.count == 0) ? 0 : (t2.totalHp / t2.count);

        System.out.println("Battle Info");
        System.out.println(t1.name + "'s HP average: " + t1Avg);
        System.out.println(t2.name + "'s HP average: " + t2Avg);

        if (t1Avg > t2Avg) {
            System.out.println(t1.name + " wins");
        }

        else if (t2Avg > t1Avg) {
            System.out.println(t2.name + " wins");
        }

        else {
            System.out.println("Tie!");
        }
    }

}
