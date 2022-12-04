package ss06.Bai2;

public class Point2D {
    private double x ;
    private double y ;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double [] getXY(double x, double y){
        return new double []{ this.x,  this.y};
    }

    @Override
    public String toString() {
        return this.x + " , " + this.y;
    }
}
