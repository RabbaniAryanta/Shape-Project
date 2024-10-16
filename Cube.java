package Ujian;
public class Cube extends Rectangle {
    private int height;

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //Constructor
    public Cube() {
        this.height = 0;
        super.setLength(0);
        super.setWidth(0);
        super.setColor("null");
        super.setName("null");
    }

    // Parameter
    public Cube(int length, int width, int height, String name, String color) {
        super(length, width, name, color);
        this.height = height;
        super.setLength(length);
        super.setWidth(width);
        super.setColor(color);
        super.setName(name);
    }

    // Override
    public void print() {
        super.print();
        System.out.println("height : " + this.height);
    }
}
    
