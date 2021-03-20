/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        /*MY*/ this.numberOfEyes = 6;
        /*MY*/ increaseNumberOfDices();
        /*MY*/ this.rand = new Random();
        /*MY*/         System.out.println("DICE --> Constructor: Dice nr: " + numberOfDices
                + " created with " + numberOfEyes + " eyes.");
    }
    
    /**
     * Constructor of a dice
     * @param numOfEyes the number of sides (max eyes) the dice have.
     */
    public Dice( int numOfEyes ) {
        /*MY*/ this.numberOfEyes = numOfEyes;
        /*MY*/ // this.numberOfEyes = getNumberOfEyes();
        /*MY*/ increaseNumberOfDices();
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
        /*MY*/ numberOfDices++;
    }
    
    /**
     * Function to increase the number of actual available dices.
     */
    private static void decreaseNumberOfDices() {
        System.out.println("DICE --> Decreasing number of dices.");
        /*MY*/ numberOfDices--;
    }
    
    /** 
     * Function returning the actual number of created dices.
     * @return The actual number of dices <code>int</code>.
     */
    public static int getNumberOfDices() {
        System.out.println("DICE --> Returning number of dices.");
        /*MY*/ return numberOfDices;
    }
    
    public int getNumberOfEyes() {
        System.out.println("DICE --> Returning number of dice eyes.");
        return numberOfEyes;
    }
    
    public int throwDice() {
        System.out.println("DICE --> Throwing the dice.");
        /*MY*/ return getRandomNumberInRange(1,numberOfEyes);
    }

    public int[] throwDiceNTimes(int n) {
        System.out.println("DICE --> Throwing the dice " + n + " times");
        /*MY */ int[] rolls = new int[n];
        for(int i = 0; i < n; i++) {
            rolls[i] = throwDice();
        }
        return rolls;
    }

    public static int throwDices(Dice... dices){
        /*MY */ int sum = 0;
        /*MY*/ for(Dice dice: dices) {
            sum += dice.throwDice();
        }
        /*MY*/ return sum;
    }
    
    private int getRandomNumberInRange(int min, int max) {
        System.out.println("DICE --> Generating new random number.");
        /*MY*/ return rand.nextInt(max + 1 - min) + min;
    }
}
