public class First_Exercise_Task_1 {


    static void isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return;     // if the modulo of any number smaller than the given number is zero, the function breaks immediately
            }
        }
        if (num > 1) {     // since modulo 1 will always be zero it's just not incorporated
        System.out.print(num + " ");
        }
    }

    public static void main (String args[]) {
        int first = Integer.parseInt(args[0]);  //reading first command line parameter and converting it to an integer
        int second = Integer.parseInt(args[1]); //same for second parameter

        System.out.println("The prime numbers between " + first + " and " + second + " are:");
        for (int x = first; x < second; x++) {  //sending every number in the given range seperately to the function to see if it's a prime
            isPrime(x);
        }
    }
}