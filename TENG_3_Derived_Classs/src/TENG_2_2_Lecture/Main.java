package TENG_2_2_Lecture;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}



class BaseClss_1 {
    protected int x, y;

    public BaseClss_1() {
        System.out.println("Leer Const BaseClass_1");
    }

    public BaseClss_1 (int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("2 Param Const BaseClass_1");
    }
}