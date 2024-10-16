package Ujian;

import java.util.Scanner;

public class mainUjian {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("---- Welcome ----\n -- Choose One :  \n==> 1. (Rectangle or Block)\n==> 2. Circle");
        int choose = f.nextInt();
        f.nextLine();
        if (choose == 1) {
            System.out.println("--------------------\n -- Pick once again : \n 1. Rectangle\n 2. Block");
            int choose2 = f.nextInt();
            f.nextLine();
            if (choose2 == 1) {
                System.out.println("-- Rectangle --");
                System.out.print("Name : ");
                String name = f.nextLine();
                System.out.print("Color : ");
                String color = f.nextLine();
                System.out.print("Length : ");
                int length = f.nextInt();
                f.nextLine();
                System.out.print("Width : ");
                int width = f.nextInt();
                f.nextLine();
                System.out.println("--------------------");
                Rectangle rectangle = new Rectangle(width, length, name, color);
                rectangle.print();
                int luasPersegi = length * width;
                System.out.println("Luas Persegi : " + luasPersegi + "\n---- Thank You ----");
            } else if (choose2 == 2) {
                System.out.println("-- Block --");
                System.out.print("Name : ");
                String name = f.nextLine();
                System.out.print("Color : ");
                String color = f.nextLine();
                System.out.print("Length : ");
                int length = f.nextInt();
                f.nextLine();
                System.out.print("Width : ");
                int width = f.nextInt();
                f.nextLine();
                System.out.print("Height : ");
                int height = f.nextInt();
                f.nextLine();
                Cube cube = new Cube(length, width, height, name, color);
                System.out.println("--------------------");
                cube.print();
                int luasBalok = 2 * (length * width) + 2 * (length * height) + 2 * (width * height);;
                System.out.print("Luas Permukaan Balok : " + luasBalok + "\n---- Thank You ----");
            }
        } else if (choose == 2) {
            System.out.println("-- Circle --");
            System.out.print("Name : ");
            String name = f.nextLine();
            System.out.print("Color : ");
            String color = f.nextLine();
            System.out.print("Radius : ");
            int radius = f.nextInt();
            f.nextLine();
            Circle circle = new Circle(radius, name, color);
            System.out.println("--------------------");
            circle.print();
            double luasLingkaran = 3.14 * radius * radius;
            System.out.print("Luas Lingkaran : " + luasLingkaran + "\n---- Thank You ----");
        } else {
            System.out.println("\nWrong Input\n---- Thank You ----");
        }
        f.close();
    }
}