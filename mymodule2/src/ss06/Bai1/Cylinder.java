package ss06.Bai1;

public class Cylinder extends Circle {
    private double height ;
    public Cylinder(double radius, String color,double height) {
        super(radius, color);
        this.height=height;
    }
    public double getVolume (){
        return Area()*height;

    }
     public String toString (){
        return "Dien tich hinh tru " + getVolume();
     }

}
