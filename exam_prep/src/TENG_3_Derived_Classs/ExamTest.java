package TENG_3_Derived_Classs;

import java.util.Random;

public class ExamTest {
    public int getRandomIntFromRange (int min, int max) {
        return new Random().nextInt(max - min + 1);
    }

    public static void main(String[] args) {
        for ( int i = 0; i< 1000; i++) {
            System.out.println("The random number is " + new ExamTest().getRandomIntFromRange(1, 10));
        }
    }
}
