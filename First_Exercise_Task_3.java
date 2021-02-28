import java.util.Scanner;

public class First_Exercise_Task_3 {


    public static void main (String args[]) {

<<<<<<< HEAD

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte nummer eingeben:");
        int z1 = sc.nextInt();
        System.out.println("Bitte nummer eingeben:");
        int z2 = sc.nextInt();

        System.out.println("Summe ist:");
=======
        System.out.println("-------------\n--- Insert two numbers to get the sum ---\n--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Please insert first integer number >>  ");
        int z1 = sc.nextInt();
        System.out.print("Please insert second integer number >>  ");
        int z2 = sc.nextInt();

        System.out.print("Sum: " + z1 + " + " + z2 + " = " );
>>>>>>> 822c3e856e5785f0cb9b199d7714925fdd485fc0
        System.out.println(z1 + z2);
        }
}