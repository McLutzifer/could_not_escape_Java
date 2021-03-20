package teng_2_exercise_2;

import java.util.Random;

/**
 *
 * @author lbwagnerm
 */
public class Dice {
    private static int numberOfDices = 0;
    private int numberOfEyes = 0;
    Random rand;
    
    public Dice() {
        this.numberOfEyes = 6;
        increaseNumberOfDices();
        this.rand = new Random();
        System.out.println("DICE --> Constructor: Dice nr: " + numberOfDices
                + " created with " + numberOfEyes + " eyes.");
    }
    
    /**
     * Constructor of a dice
     * @param numOfEyes the number of sides (max eyes) the dice have.
     */
    public Dice( int numOfEyes ) {
        this.numberOfEyes = numOfEyes;
        increaseNumberOfDices();
        this.rand = new Random();
        System.out.println("DICE --> Constructor: Dice nr: " + numberOfDices 
                + " created with " + numberOfEyes + " eyes.");
    }
    
    @Override // DO NOT TOUCH THIS :-)
    protected void finalize() {
        System.out.println("DICE --> Destructor: Dice nr: " + numberOfDices 
                + " destroyed.");
        decreaseNumberOfDices();
    }
    
    /**
     * Function to increase the number of actual available dices.
     */
    private static void increaseNumberOfDices() {
        System.out.println("DICE --> Increasing number of dices.");
        numberOfDices++;
    }
    
    /**
     * Function to increase the number of actual available dices.
     */
    private static void decreaseNumberOfDices() {
        System.out.println("DICE --> Decreasing number of dices.");
        numberOfDices--;
    }
    
    /** 
     * Function returning the actual number of created dices.
     * @return The actual number of dices <code>int</code>.
     */
    public static int getNumberOfDices() {
        System.out.println("DICE --> Returning number of dices.");
        return numberOfDices;
    }
    
    public int getNumberOfEyes() {
        System.out.println("DICE --> Returning number of dice eyes.");
        return numberOfEyes;
    }
    
    public int throwDice() {
        System.out.println("DICE --> Throwing the dice.");
        return getRandomNumberInRange(1,numberOfEyes);
    }

    public int[] throwDiceNTimes(int n) {
        System.out.println("DICE --> Throwing the dice " + n + " times");
        int[] rolls = new int[n];
        for(int i = 0; i < n; i++) {
            rolls[i] = throwDice();
        }
        return rolls;
    }

    public static int throwDices(Dice... dices){
        int sum = 0;
        for(Dice dice: dices) {
            sum += dice.throwDice();
        }
        return sum;
    }
    
    private int getRandomNumberInRange(int min, int max) {
        System.out.println("DICE --> Generating new random number.");
        return rand.nextInt(max + 1 - min) + min;
    }
}
