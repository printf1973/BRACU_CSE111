public class Butterfly extends Caterpillar {
    public Butterfly(String food, int age) {
        super(food, age);
    }

    @Override
    public void transform() {
        System.out.println("Caterpillar transforms into Butterfly");
    }

    @Override
    public void eat(int amount) {
        energy += 5 * (amount - 1);
        System.out.println("Butterfly lost energy while flying and absorbed nectar");
    }

    @Override
    public void showDetails() {
        System.out.println("Food: " + food);
        System.out.println("Age: " + age);
        System.out.println("Energy: " + energy + " joules");
    }
}
