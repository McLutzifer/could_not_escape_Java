public class Triangle {

    double base, height, sideLenOne, sideLenTwo, sideLenThree;

    public Triangle(double base, double height, double sideLenOne,
                    double sideLenTwo, double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    } // end constructor Triangle

    public double findArea() {
        return (this.base *this.height) / 2;
    } // end findArea
} // end class triangle
