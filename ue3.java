import java.util.Scanner;

public class ue3 {


    public static void main (String args[]) {

        System.out.println("-------------\n--- Insert two numbers to get the sum ---\n--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Please insert first integer number >>  ");
        int z1 = sc.nextInt();
        System.out.print("Please insert second integer number >>  ");
        int z2 = sc.nextInt();

        System.out.print("Sum: " + z1 + " + " + z2 + " = " );
        System.out.println(z1 + z2);
        }
}