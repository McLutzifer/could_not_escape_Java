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
        // write some code
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
        // write some code
        /*MY*/ this.numberOfEyes = numOfEyes;
        /*MY*/ // this.numberOfEyes = getNumberOfEyes();
        /*MY*/ increaseNumberOfDices();
        this.rand = new Random();
        System.out.println("DICE --> Constructor: Dice nr: " + numberOfDices 
                + " created with " + numberOfEyes + " eyes.");
        /*MY increaseNumberOfDices(); */
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
        // write some code
        /*MY*/ numberOfDices++;
    }
    
    /**
     * Function to increase the number of actual available dices.
     */
    private static void decreaseNumberOfDices() {
        System.out.println("DICE --> Decreasing number of dices.");
        // write some code
        /*MY*/ numberOfDices--;
    }
    
    /** 
     * Function returning the actual number of created dices.
     * @return The actual number of dices <code>int</code>.
     */
    public static int getNumberOfDices() {
        System.out.println("DICE --> Returning number of dices.");
        //return 0; // write some code --> you need to find the correct return value
        /*MY*/ return numberOfDices;
    }
    
    public int getNumberOfEyes() {
        System.out.println("DICE --> Returning number of dice eyes.");
        return 0; // write some code --> you need to find the correct return value
    }
    
    public int throwDice() {
        System.out.println("DICE --> Throwing the dice.");
        /*MY*/ return getRandomNumberInRange(1,12);
        //return 0; // write some code --> you need to find the correct return value
    }

    // ORIGINAL
    public int[] throwDiceNTimes(int n) {
        System.out.println("DICE --> Throwing the dice " + n + " times");
        // write some code
        //MY //


        return new int[1]; // write some code --> you need to find the correct return value
    }


    /*
    /////////////// MY
    public void throwDiceNTimes(int n) {
        System.out.println("DICE --> Throwing the dice " + n + " times");
        // write some code
        //MY //
        for (int i = 0; i < n; i ++) {
            throwDice();
        }
    }
     */


    public static int throwDices(Dice... dices){

        // write some code
        return 0; // write some code --> you need to find the correct return value
    }
    
    private int getRandomNumberInRange(int min, int max) {
        // write some code
        System.out.println("DICE --> Generating new random number.");
        //return rand.nextInt(0); // write some code --> you need to find the correct return value
        return rand.nextInt(12);
    }
}
