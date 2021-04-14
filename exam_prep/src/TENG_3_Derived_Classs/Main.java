package TENG_3_Derived_Classs;

//import static TENG_3_Derived_Classs.Overloading.plus;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
        System.out.println(x);


    } // end main
} // end class Main
