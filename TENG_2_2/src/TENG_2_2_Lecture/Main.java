package TENG_2_2_Lecture;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("My first class test!");

        Vehicle v1 = new Vehicle();
        System.out.println("Speed of vehicle: " + v1.getSpeed());
        v1.setSpeed(10.0f);
        System.out.println("Speed of vehicle: " + v1.getSpeed());
    }
}
