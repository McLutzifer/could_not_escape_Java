package TENG_3_Derived_Classs;

public class Auslager {
    String[] car = {"a", "b", "c"};
        System.out.println(car[0]);

        System.out.println(Arrays.cars[0]);

        System.out.println(Arrays.cars.length);

        for (String auto : Arrays.cars) {
        System.out.println(auto);
    }

        System.out.println(Overloading.plus(4, 3));
        System.out.println(Overloading.plus(3.6, 7.9));
        System.out.println(Overloading.plus("Hello", "World"));

    NotStatic testObject = new NotStatic();
    String x = testObject.fruit[0];
    //String x = NotStatic.fruit[0];
        System.out.println(x);

    Constructors versuch = new Constructors();
        System.out.println(versuch.x);
    Constructors versuch2 = new Constructors(7,8,9);
        System.out.println(versuch2.x);
    Constructors versuch3 = new Constructors(8, 9);
        System.out.println(versuch3.x);
}
