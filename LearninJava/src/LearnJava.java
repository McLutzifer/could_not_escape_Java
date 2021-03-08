import java.awt.*;
import java.util.ArrayList;

public class LearnJava {

    public static void main(String[] args) {
        /*
        int a = 5;
        char b = 'b';
        long c = 400;
        double d = 3.2;
        String name = "Susan";
        System.out.println(name.toUpperCase());
         */

        //addExclamationPoint("hot dogs");
        //String exclaim = addExclamationPoint("hot dogs");
        //System.out.println(exclaim);

        Animal a = new Animal();
        String dog = a.iAmDog();
        System.out.println(dog);

        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(3);

        Animal stuff = new Animal();
        stuff.doStuff();

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println("y is " + y);

        //reference
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        //     STRINGS

        // oroginally : String message = new String("Hello World");
        String message = "Hello World" + "!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("e"));


    }  // end main

    /*
    public static String addExclamationPoint(String s) {
        //System.out.println(s + "!");
        return s + "!";
    }

     */

} // end class LearnJava
