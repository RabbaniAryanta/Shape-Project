package Ujian;
public class Rectangle extends Shape {
    private int length;
    private int width;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Constructor
    public Rectangle() {
        this.length = 0;
        this.width = 0;
        super.setColor("null");
        super.setName("null");
    }

    // Parameter 
    public Rectangle(int length, int width, String name, String color) {
        super(name, color);
        this.length = length;
        this.width = width;
        super.setColor(color);
        super.setName(name);
        

    }

    // Override
    public void print() {
        super.print();
        System.out.println("length : " + this.length);
        System.out.println("width : " + this.width);
    }

}
