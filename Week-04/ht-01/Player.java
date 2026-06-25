public class Player {
    public String name;
    public int hp;
    public int count;
    public String[] villain = new String[5];

    public Player(String s) {
        this(s, 100);
    }
    
    public Player(String s, int n) {
        name = s;
        hp = n;
        System.out.println(name + " joined the game");
        System.out.println("HP: " + n);
    }

    public void viewInfo() {
        System.out.println("Player Name: " + name);
        System.out.println("Current HP: " + hp);
        if (count != 0) {
            System.out.println("Defeated:");
            for (int i = 0; i < count; i++) {
                System.out.print(villain[i] + ", ");
            }
            System.out.println();
        }
    }

    public void defeatVillain(String s, int n) {
        if (hp < n || count >= 5) {
            System.out.println("failed to defeat " + s);
        }
        else {
            System.out.println("defeated " + s);
            hp += n;
            villain[count++] = s;
        }
    }

    public void defeatVillain(char boost, String s, int n) {
        hp *= boost - '0';
        System.out.println("HP with " + boost + "x boost: " + hp);
        defeatVillain(s, n);
    }

    public void defeatVillain(Player p) {
        String s = p.name;
        int n = p.hp;
        defeatVillain(s, n);
    }

}
