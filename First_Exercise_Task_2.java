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
                System.out.println("Bitte gültige Operation eingeben");
                z = 404;
        }
        return z;
    }

    public static void main (String args[]) {

        double first = Double.parseDouble(args[0]);
        double second = Double.parseDouble(args[2]); 
        String operation = args[1];

        System.out.println(calculation(first, second, operation));
        }
}
