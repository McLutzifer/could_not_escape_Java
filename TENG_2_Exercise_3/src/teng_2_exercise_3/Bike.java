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


public class Bike extends Vehicle {

    private String type;
    private boolean drivingLicense = false;
    private int numberOfWheels = 2;
    private boolean motor = false;

    public Bike(String type) {
        this.type = type;
    }

    public Bike(boolean motor, boolean drivingLicense, int numberOfWheels, String type) {
        super(motor, drivingLicense, numberOfWheels);
        this.type = type;
    }

    @Override
    public String toString() {
        return "This is a vehicle of " + this.getClass() + ", having "
                + numberOfWheels + " wheels" +
                " and has " + (motor ? "a motor" : "no motor") +
                " needing a " + (drivingLicense ? "driving license" : "no driving license")
                + " and it's a(n) " + type;
    }
}

    

