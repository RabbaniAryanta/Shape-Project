package Ujian;
public class Circle extends Shape {
    private int radius;

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Constructor
    public Circle() {
        this.radius = 0;
        super.setColor("null");
        super.setName("null");
    }

    // Parameter
    public Circle(int radius, String name, String color) {
        super(name, color);
        this.radius = radius;
        super.setColor(color);
        super.setName(name);
    }

    // Override
    public void print() {
        super.print();
        System.out.println("Radius : " + this.radius);
    }
    
    
}
