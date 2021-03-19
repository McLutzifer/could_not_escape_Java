package TENG_2_2_Lecture;

import java.awt.*;

public class Vehicle {
    // class variables (for the class, thus equal for all instances)
    private static int numberOfInstances;
    //instance variables (separated for each instance)
    private float speed;
    private Color color;
    private String brand;

    // Construct an empty object
    public Vehicle() {
        /*
        this.speed = 0.0f;
        this.color = new Color(255,255,255);
        this.brand = new String("Nan");

        want to ommit this so following
         */
        this(0.0f, new Color(255,255,255), "Nan");
    }

    // TODO: Full constructor

    public Vehicle(float speed, Color color, String brand) {
        this.speed = speed;
        this.color = color;
        this.brand = brand;
        numberOfInstances ++;
        this.instanceID = numberOfInstances;
    }

    // Get and Set methods

    public static int getNumberOfInstances() {
        return numberOfInstances;
    }


    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setColor(int r, int g, int b) {
        this.color = new Color(r, g, b);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getSpeed() {
        return this.speed;
    }

    public Color getColor() {
        return this.color;
    }

    public String getBrand() {
        return this.brand;
    }

    /*
    @Override
    public String toString() {
        return super.toString() + "Speed: " + getSpeed() + "; Color " + getColor().toString() + "; Brand " + getBrand();
    }
*/
    @Override
    public String toString() {
        return "Class: Vehicle; " +  "Speed: " + getSpeed() + "; Color " + getColor().toString() + "; Brand " + getBrand();
    }
}
