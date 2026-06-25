public class Shape2D {
    public String name;
    public double area; 

    public Shape2D() {
        System.out.println("A Square has been created with length: 5");
        this.name = "Square";
        this.area = 25.0;
    }

    public Shape2D(int height, int width) {
        this.area = height*width;
        if (height == width) {
            System.out.println("A Square has been created with length: " + height + " and breadth: " + width);
            this.name = "Square";
        }
        else {
            System.out.println("A Rectangle has been created with length: " + height + " and breadth: " + width);
            this.name = "Rectangle";
        }
    }

    public Shape2D(int height, int base, String shape) {
        if (shape.equalsIgnoreCase("triangle")) {
            System.out.println("A Triangle has been created with height: " + height + " and base: " + base);
            this.name = shape;
            this.area = 0.5 * height * base;
        }

        else if (shape.equalsIgnoreCase("rectangle")) {
            System.out.println("A Rectangle has been created with length: " + height + " and breadth: " + base);
            this.name = shape;
            this.area = height * base;
        }
    }

    public Shape2D(int a, int b, int c) {
        System.out.printf("A Triangle has been created with the following sides: %d, %d, %d%n", a, b, c);
        double s = (a+b+c)/2.0;
        this.name = "Triangle";
        this.area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public void area() {
        this.area = Math.floor(this.area*100)/100.0;
        System.out.printf("The area of the %s is: %.2f%n", name, area);
    }
}
