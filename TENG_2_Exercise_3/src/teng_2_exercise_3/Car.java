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
    private int numberOfWheels = 4;
    private boolean motor = true;
    private String typeOfDrivingLicense;

    public Car(boolean motor, boolean drivingLicense, int numberOfWheels, String type) {
        super(motor, drivingLicense, numberOfWheels);
        this.typeOfDrivingLicense = "category B";
        this.type = type;
    }


    public Car(String type) {
        this.type = type;
        this.typeOfDrivingLicense = "category B";
    }

    // Insert your code here!

    @Override
    public String toString() {
        return "This is a vehicle of " + this.getClass() + ", having "
                + numberOfWheels + " wheels" +
                " and has " + (motor ? "a motor" : "no motor") +
                " needing a " + (drivingLicense ? "driving license" : "no driving license")
                + " needing a driving license of the " + typeOfDrivingLicense
                + " and it's a(n) " + type;
    }

}
