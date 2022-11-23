package ss04.Bai1;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;
    public QuadraticEquation() {}

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public void showResult() {
        double delta = this.getDiscriminant();
        if(delta > 0) {
            double r1, r2;
            r1 = (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a);
            r2 = (-this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
            System.out.println("The equation has two roots " + r1 + " " + r2);
        }
        else if(delta == 0)
        {
            double r = -this.b / (2 * this.a);
            System.out.println("The equation has one roots " + r);
        }
        else
        {
            System.out.println("The equation has no real roots ");
        }
    }

}

