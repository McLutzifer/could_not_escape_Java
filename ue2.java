public class ue2 {

    public static int calculation(double x, double y, String op) {
        if (op == "+") {
            double z = x + y;
            return z;
        }


        /*switch (op) { 
            case 1: op == asdasdasd
        }
        */
    }

    public static void main (String args[]) {

        double first = Double.parseDouble(args[0]);
        double second = Double.parseDouble(args[2]); 
        String operation = args[1];

        calculation(first, second, operation)
        }
}
