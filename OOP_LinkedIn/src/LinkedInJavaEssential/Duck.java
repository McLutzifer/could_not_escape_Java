package LinkedInJavaEssential;

public class Duck {

    // member variables: data
    private String name;
    private int lifeExpectancy;
    private String favoriteFood;

    public Duck(String name, int lifeExpectancy, String favoriteFood) {
        this.name = name;
        this.lifeExpectancy = lifeExpectancy;
        this.favoriteFood = favoriteFood;
    }

    // methods: functionality
    void waddle() {
        System.out.println("waddle waddle");
    }

    void quack() {
        System.out.println("quack quack");
    }
}
