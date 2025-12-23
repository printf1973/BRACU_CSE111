public class AnimalTester1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5, "Brown", "Bulldog");
        Cat cat = new Cat("Kitty", 3, "White", "Persian");
        System.out.println("1.========");
        System.out.println(dog.dogInfo());
        System.out.println("2.========");
        System.out.println(cat.catInfo());
        System.out.println("3.========");
        dog.makeSound();
        System.out.println("4.========");
        cat.makeSound();
    }
}
