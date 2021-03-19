package TENG_2_2_Lecture;

import java.awt.*;

public class Vehicle {
    private float speed;
    private Color color;
    private String brand;

    // Construct an empty object
    public Vehicle() {
        this.speed = 0.0f;
        this.color = new Color(255,255,255);
        this.brand = new String("Nan");
    }

    // TODO: Full constructor

    // Get and Set methods

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

    @Override
    public String toString() {
        return null;
    }

}
