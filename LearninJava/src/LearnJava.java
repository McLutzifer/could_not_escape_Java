public class LearnJava {

    public static void main(String[] args) {
        /*
        int a = 5;
        char b = 'b';
        long c = 400;
        double d = 3.2;

        String name = "Susan";

        System.out.println(name.toUpperCase());
         */

        //addExclamationPoint("hot dogs");
        String exclaim = addExclamationPoint("hot dogs");
        System.out.println(exclaim);


    }  // end main

    public static String addExclamationPoint(String s) {
        //System.out.println(s + "!");
        return s + "!";
    }

} // end class LearnJava
