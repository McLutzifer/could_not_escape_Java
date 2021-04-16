package TENG_3_Derived_Classs;

public class ExamTestGetter {

    int a = 0;
    int b = 0;

    public ExamTestGetter() {
        this(4, 5);
    }

    public ExamTestGetter(int a, int b) {
        this.a = a;
        this.b = (b*a) % 3;
    }

    public int getB() {
        return this.b;
    }

    public int foo(int values, int ... x) {
        System.out.println("Teste");
        return 1;

    public static void main(String[] args) {
        ExamTestGetter tg = new ExamTestGetter();
        System.out.println("B is" + tg.getB());


        }
    }
}
