public class Shape {
    public String name;
    public double area;

    public void setParameters(String name, double radius) {
        this.name = name;
        this.area = 3.1416 * radius * radius;
    }

    public void setParameters(String name, double height, double width) {
        this.name = name;
        if (this.name.equalsIgnoreCase("triangle")) {
           this.area = 0.5 * height * width;
        }
        else if (this.name.equalsIgnoreCase("rectangle")) {
           this.area = height * width;
        }
    }

    public String details() {
        return "Shape name: " + this.name + "\nArea: " + this.area;
    }

}
