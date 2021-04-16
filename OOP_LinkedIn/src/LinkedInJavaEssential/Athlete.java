package LinkedInJavaEssential;

public class Athlete {

    private String name;
    private int speed;

    public Athlete(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Athlete " + name + " is running at " + speed + " miles per hour.";
    }
}
