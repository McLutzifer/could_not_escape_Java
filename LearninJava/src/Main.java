import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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

    }
}
