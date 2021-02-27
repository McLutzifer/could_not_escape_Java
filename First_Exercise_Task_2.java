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
                z = 404;
        }
        return z;
    }

    public static void main (String args[]) {

        int len = args.length;
        if (len != 3) {
            System.out.println("Please insert two integers and an operation");
        }

        double first = Double.parseDouble(args[0]);
        double second = Double.parseDouble(args[2]); 
        String operation = args[1];

        System.out.println(calculation(first, second, operation));
        }
}
