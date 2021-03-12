import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

class Square extends Shape {
    Square (int w) {
        this.width = w;
    }
    public void area() {
        System.out.println(this.width * this.width);
    }
}

class Circle extends Shape {
    Circle (int w) {
        this.width = w;
    }
    public void area() {
        System.out.println(Math.PI * this.width * this.width );
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
