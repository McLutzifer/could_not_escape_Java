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
    private String typeOfDrivingLicense;
    // Insert your code here!
    //public Car() { this (false, false, 42, "Test_Car");}
    
    public Car(boolean motor, boolean drivingLicense, int numberOfWheels, String type) {
        super(motor, drivingLicense, numberOfWheels);
        this.typeOfDrivingLicense = "category B";
        this.type = type;
    }


    
    // Insert your code here!
    
}
