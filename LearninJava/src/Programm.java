import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

class Circle extends Shape {
    Circle (int w) {
        this.width = w;
    }
    public void area() {
        double a = (this.width * this.width * 3.141);
        System.out.println(a);
    }
}

class Square extends Shape {
    Square (int w) {
        this.width = w;
    }
    public void area() {
        double a = (this.width * this.width);
        System.out.println(a);
    }
}

public class Programm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        //Square a = new Square(x);
        Circle b = new Circle(y);
        //a.area();
        b.area();
    }
}
