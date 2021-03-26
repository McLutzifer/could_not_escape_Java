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

    @Override
    public String toString() {
        return "x: " + x + "; y : " + y;
    }
}

// Abgeleitete Klasse
class DerivedClass_1 extends BaseClss_1 {
    protected int z;

    public DerivedClass_1() {
        super();
        System.out.println("Leer Const DerivedClass_1");
    }

    public DerivedClass_1 (int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.println("2 Param Const DerivedClass");
    }
}
