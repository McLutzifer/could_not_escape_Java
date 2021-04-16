package LinkedInJavaEssential;

import java.util.Random;

public class Randomness {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println((random.nextInt()));
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
    }
}
