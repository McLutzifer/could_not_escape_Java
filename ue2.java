public class ue2 {

    public static double calculation(double x, double y, String op) {
        if (op == "+") {
            
            return x + y;
        }
    }

    public static void main (String args[]) {

        double first = Double.parseDouble(args[0]);
        double second = Double.parseDouble(args[2]); 
        String operation = args[1];

        calculation(first, second, operation)
        }
}
