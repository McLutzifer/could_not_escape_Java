package LinkedInJavaEssential;

public class Athlete {

    private String name;
    private int speed;
    private static String marathonLocation;
    private int bibNumber;
    private static int runnersInRace;

    public Athlete(String name, int speed) {
        this.name = name;
        this.speed = speed;
        runnersInRace++;
        this.bibNumber = runnersInRace;
    }

    public void setMarathonLocation(String marathonLocation) {
        this.marathonLocation = marathonLocation;
    }

    @Override
    public String toString() {
        return "Athlete Nr " + bibNumber + ", " + name + " is running at " + speed +
                " miles per hour at " + marathonLocation;
    }
}
