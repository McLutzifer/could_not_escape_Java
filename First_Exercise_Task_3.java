/*
Lukas Schumi  //  se201028
Exercise 1  //  Task 3
*/

import java.util.Scanner;       // import java.util.Scanner to use Scanner class

public class First_Exercise_Task_3 {


    public static void main (String args[]) {

        System.out.println("-------------\n--- Insert two numbers to get the sum ---\n--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Please insert first integer number >>  ");
        int z1 = sc.nextInt();      //specifying that an int should be read by the scanner
        System.out.print("Please insert second integer number >>  ");
        int z2 = sc.nextInt();

        System.out.print("Sum: " + z1 + " + " + z2 + " = " );
        System.out.println(z1 + z2);

        sc.close();   // close Scanner class so no resources are leaking
        }
}