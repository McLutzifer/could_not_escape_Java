public class First_Exercise_Task_2 {

    public static double calculation(double x, double y, String op) {
        double z;
        switch (op) { 
            case "+": 
                z =  x + y;
                break;
            case "-":
                z = x - y;
                break;
            case "x":
                z = x * y;
                break;
            case "/":
                z = x / y;
                break;
            default:
                System.out.println("Please insert valid operation (+, -, x, /)");
                z = 404;        //since function has to return an int value, as a little gag the classic 404 error will be displayed
        }
        return z;
    }

    public static void main (String args[]) {

        int len = args.length;
        if (len != 3) {    // check if 3 commandline arguments are provided, if not the main function just finishes 
            System.out.println("Please insert two integers and an operation");
            return;
        }

        double first = Double.parseDouble(args[0]);  //parse first and third parameter from a String to a double
        double second = Double.parseDouble(args[2]); 
        String operation = args[1];

        System.out.println(calculation(first, second, operation));
        }
}
