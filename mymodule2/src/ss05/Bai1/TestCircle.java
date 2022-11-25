package ss05.Bai1;

public class TestCircle {
    private double radius = 1.0;
    private String color = "red";

    public TestCircle() {
    }

    public TestCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea (){
        return 3.14*this.radius*this.radius;
    }
    public void showResult (){
        System.out.println("Diện tích là ");
        System.out.println(getArea());
    }
}
