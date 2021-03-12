public class Animal {

    protected int legs;

    public void eat() {
        System.out.println("Animals eat");
    }
    public static String iAmDog() {
        return "I am a dog";
    }
    public static void doStuff() {
        int a = 5;
        for (int i = 0; i < 7; i++) {
            System.out.println(i);
        }
    }
    public void makeSound() {
        System.out.println("Grr...");
    }

}  // end class Animal

class Dog extends Animal {
    Dog() {
        legs = 4;
    }
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}