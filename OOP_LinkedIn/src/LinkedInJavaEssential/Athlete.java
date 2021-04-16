package LinkedInJavaEssential;

public class Athlete {

    private String name;
    private int speed;
    private String marathonLocation;

    public Athlete(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void setMarathonLocation(String marathonLocation) {
        this.marathonLocation = marathonLocation;
    }

    @Override
    public String toString() {
        return "Athlete " + name + " is running at " + speed +
                " miles per hour at " + marathonLocation;
    }
}
