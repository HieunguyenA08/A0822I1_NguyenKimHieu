package ss06.Bai1;

import java.awt.geom.Area;

public class Circle {
    private double radius ;
    private String color ;
    public Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double Area (){
          double area = Math.PI*radius*radius;
    return area;
    }

    public String toString (){
       return "Dien tich hinh tron la "+ Area();
    }

}
