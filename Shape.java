package Ujian;
public class Shape {
    private String name;
    private String Color;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    // Constructor
    public Shape() {
        this.name = "null";
        this.Color = "null";
    }
    
    // Parameter
    public Shape(String name, String Color) {
        this.name = name;
        this.Color = Color;
    }

    // Override
    public void print() {
        System.out.println("Name : " + this.name);
        System.out.println("Color : " + this.Color);
    }
    
}
