package LinkedInJavaEssential;

import java.util.Random;

public class Randomness {

    public static void main(String[] args) {
       ExtraRandom random = new ExtraRandom();
//        System.out.println((random.nextInt()));
//        System.out.println(random.nextBoolean());
//        System.out.println(random.nextDouble());

        System.out.println(random.nextLetter());

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextLetter());
        }

    }
}
