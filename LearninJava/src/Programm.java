import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

class Circle extends Shape {
    void area(int w) {
        System.out.println(w*w*3.141);
    }
}

public class Programm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}
