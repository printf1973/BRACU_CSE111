public class Cow extends Animal {
    public String name;

    public Cow() {
        super();
        System.out.println("The cow says hello!");
    }

    public String getName() {
        return name;
    }

    public void details() {
        super.details();
    }

    public void updateSound(String s) {
        super.sound = s;
    }
}
