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
public class Motorbike extends Vehicle {

    //vehicles.add( new Bike("KTM") );
    //vehicles.add( new Bike(false, false, 2, "Bianchi") );
    //vehicles.add( new Motorbike("Ducati") );
    //vehicles.add( new Motorbike(true, true, 2, "Honda") );


    private String type;
    private boolean drivingLicense = true;
    private int numberOfWheels = 2;
    private boolean motor = true;
    private String typeOfDrivingLicense;



    public Motorbike(String type) {
        this.type = type;
        this.typeOfDrivingLicense = "category B";
    }



    public Motorbike(boolean motor, boolean drivingLicense, int numberOfWheels, String type) {
        super(motor, drivingLicense, numberOfWheels);
        this.typeOfDrivingLicense = "category B";
        this.type = type;
    }





    // Insert your code here!

    @Override
    public String toString() {
        return "This is a vehicle of " + this.getClass() + ", having "
                + numberOfWheels + " wheels" +
                " and has " + (motor ? "a motor" : "no motor") +
                " needing a " + (drivingLicense ? "driving license" : "no driving license")
                + " of the " + typeOfDrivingLicense
                + " and it's a(n) " + type;
    }
    
}
