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
public class Vehicle {
    
    private boolean motor;
    private boolean drivingLicense;
    private int numberOfWheels;
    
    public Vehicle() {
        this(false, false, 0);
    }
    
    public Vehicle(boolean motor, boolean drivingLicense, int numberOfWheels) {
        this.motor = motor;
        this.drivingLicense = drivingLicense;
        this.numberOfWheels = numberOfWheels;
    }
    
    public boolean hasMotor() {
        return motor;
    }
    
    public boolean needsDrivingLicense() {
        return drivingLicense;
    }
    
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    
    public void setMotor(boolean motor) {
        this.motor = motor;
    }
    
    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
    
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    
    @Override
    public String toString() {
        return "This is a vehicle of " + this.getClass() + ", having " 
                + numberOfWheels + " wheels" + 
                " and has " + ( motor ? "a motor" : "no motor") +
                " needing a " + (drivingLicense ? "driving license" : "no driving license");
    }
}
