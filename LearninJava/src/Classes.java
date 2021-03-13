package LearninJava.src;

class A {
    public A() {
        System.out.println("New A");
    }
}

class B extends A {
    public B() {
        System.out.println("New B");
    }
}


public class Classes {
    public static void main(String[] args) {
        // how create instances? Constructor!
        B obj = new B();
    } // end main
} // end cass Classes


/*
* Output:
* New A
* New B*
* */