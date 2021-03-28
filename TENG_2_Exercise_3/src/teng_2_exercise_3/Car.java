/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teng_2_exercise_3;

/**
 *
 * @author lbwagnerm
 */
public class Car extends Vehicle {

    private String type;
    private boolean drivingLicense;
    // Insert your code here!
    //public Car() { this (false, false, 42, "Test_Car");}
    private String numberOfWheels;
    private boolean motor;
    private String typeOfDrivingLicense;

    public Car(boolean motor, boolean drivingLicense, int numberOfWheels, String type) {
        super(motor, drivingLicense, numberOfWheels);
        this.typeOfDrivingLicense = "category B";
        this.type = type;
    }


    public Car(String type) {
        this.type = type;
    }

    // Insert your code here!

    @Override
    public String toString() {
        return "This is a vehicle of " + this.getClass() + ", having "
                + numberOfWheels + " wheels" +
                " and has " + (motor ? "a motor" : "no motor") +
                " needing a " + (drivingLicense ? "driving license" : "no driving license")
                + " and is a " + type;
    }

}
