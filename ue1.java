public class ue1 {
    
    public static void main (String args[]) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);

        for (int x = first; x < second; x++) {
            for (int y = 2; y < x; y++) {
                if (x % y == 0) {
                    break;
                }
                System.out.println(x);
            }
        }
    }
}