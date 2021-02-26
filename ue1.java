public class ue1 {


    static void isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return;
            }
        }
        if (num > 1) {
        System.out.print(num + " ");
        }
    }

    public static void main (String args[]) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);

        System.out.println("The prime numbers between " + first + " and " + second + " are:");
        for (int x = first; x < second; x++) {
            isPrime(x);
        }
    }
}