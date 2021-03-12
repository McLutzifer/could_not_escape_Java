import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        int studentAge = 15;
        double studentGPA = 3.45;
        String studentFirstName = "Kayla";
        String studentLastName = "Hammon";
        //boolean hasPerfectAttendance = true;

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstName.charAt(0));
        System.out.println(studentLastName.charAt(0));

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);

        // **** input
        System.out.println("Whatdo you want to update it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);

        */

        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);
    } // end main
}
