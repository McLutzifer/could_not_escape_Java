import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Create a random number for the user to guess
        int theNumber = (int)(Math.random() * 100 + 1);
        System.out.println( theNumber );
        int guess = 0;
        System.out.println("Guess a umber between 1 and 100");
        guess = scan.nextInt();
    }
}
