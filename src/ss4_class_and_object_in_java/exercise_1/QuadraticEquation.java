package ss4_class_and_object_in_java.exercise_1;

public class QuadraticEquation {
    public int enterNumber;
    double A;
    double B;
    double C;

    public QuadraticEquation(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public int getEnterNumber() {
        return enterNumber;
    }

    public void setEnterNumber(int enterNumber) {
        this.enterNumber = enterNumber;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }

    public double getDiscriminant() {
        return (this.B * this.B) - (4 * this.A * this.C);
    }

    public double getRoot1() {
        double root1 = 0;
        if (getDiscriminant() >= 0) {
            root1 = (-this.B + Math.sqrt((this.B * this.B) - (4 * this.A * this.C))) / (2 * this.A);
        }
        return root1;
    }

    public double getRoot2() {
        double root2 = 0;
        if (getDiscriminant() >= 0) {
            root2 = (-this.B - Math.sqrt((this.B * this.B) - (4 * this.A * this.C))) / (2 * this.A);
        }
        return root2;
    }
}
