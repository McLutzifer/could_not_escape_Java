import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class LearnJava {

    public static void main(String[] args) {

        int five = 5;
        char b = 'b';
        long c = 400;
        double d = 3.2;
        String name = "Susan";
        System.out.println(name.toUpperCase());


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
/*
        //     STRINGS

        // oroginally : String message = new String("Hello World");
        String message = "  Hello World" + "!!  ";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("e"));
        System.out.println(message.replace("!", "*"));
        // does not modify original String
        System.out.println(message);
        System.out.println(message.trim());
        String mosh = "Hello \"Mosh\"";
        System.out.println(mosh);
        String windows = "c:\\Windows\\...";
        System.out.println(windows);
  */
        // ARRAYS
        /*
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {2, 3, 5, 1, 4};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));


        int[][] matrix = new int[2][3];
        matrix[0][0] = 1;
        System.out.println(Arrays.deepToString(matrix));

        int[][] matrix2 = { {1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(matrix2));

        */

        // CONSTANT
        final float PI = 3.14F;

        // ARITHMETIC
        System.out.println((double)10/3);

    }  // end main

    /*
    public static String addExclamationPoint(String s) {
        //System.out.println(s + "!");
        return s + "!";
    }

     */

} // end class LearnJava
