public class Cat extends Animal {
    public String breed;

    public Cat(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    public String catInfo() {
        return super.info() + "Breed: " + breed;
    }

    public void makeSound() {
        System.out.printf("%s color %s is meowing%n", super.color, super.name);
    }
}
