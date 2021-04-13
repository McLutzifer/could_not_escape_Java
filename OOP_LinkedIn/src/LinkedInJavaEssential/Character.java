package LinkedInJavaEssential;

import com.sun.jdi.event.StepEvent;

public class Character {

    private String name;
    private String species;

    public Character(String nom, String spec) {
        this.name = nom;
        this.species = spec;
    }

    public static void main(String[] args) {
        Character bilbo = new Character("Bilbo", "Hobbit");

        System.out.println(bilbo.name);
    }
}
