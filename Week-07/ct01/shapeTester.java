public class shapeTester {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.name = "Mobius Strip";
        s.color = "Blue";
        s.displayInfo();
        System.out.println("1=======================");
        Circle c = new Circle();
        System.out.println("2=======================");
        c.name = "Circle";
        c.color = "Red";
        c.radius = 5;
        c.displayInfo();
        System.out.println("3=======================");
        c.area();
    }
}
