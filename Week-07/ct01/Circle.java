public class Circle extends Shape {
    public int radius;

    public void area() {
        System.out.printf("Area of %s Circle: %.2f%n", color, radius * radius * Math.PI);
    }
}
