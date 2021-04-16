package LinkedInJavaEssential;

import java.util.Random;

public class ExtraRandom extends Random {

    public String nextLetter() {
        int asInt = (int)'a';
        int lettersStartAt = 97;
        int randomInt = new Random().nextInt(26) + lettersStartAt;
        return "" + (char)randomInt;
    }
}
