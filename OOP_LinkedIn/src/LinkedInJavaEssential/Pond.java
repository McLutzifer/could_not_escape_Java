package LinkedInJavaEssential;

public class Pond {
    public static void main(String[] args) {
        System.out.println("TEST for POND");

        Duck mobyDuck = new Duck("Moby", 90/3, "celery");
        Duck wolfgangDuck = new Duck("Wolfgang", 60/3, "cheesburgers");

        mobyDuck.waddle();

        wolfgangDuck.waddle();
        wolfgangDuck.waddle();
        wolfgangDuck.waddle();
        wolfgangDuck.waddle();

        System.out.println(wolfgangDuck);



    }
}
