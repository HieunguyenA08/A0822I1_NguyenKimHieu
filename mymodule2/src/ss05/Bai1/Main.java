package ss05.Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính ");
        double r = Double.parseDouble(sc.nextLine());
        TestCircle Circle = new TestCircle(r,"red");
        Circle.showResult();
    }
}
