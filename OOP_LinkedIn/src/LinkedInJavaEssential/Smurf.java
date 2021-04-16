package LinkedInJavaEssential;

public class Smurf {

    private String name;

    public static Smurf createSmurf(String name) {
        System.out.println("Creating " + name + " Smurf!");
        return new Smurf(name);
    }

    private  Smurf(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("My name is " + name + " Smurf.");
    }


}
