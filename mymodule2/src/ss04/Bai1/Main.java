package ss04.Bai1;

import java.util.Scanner;

public class
Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter a: "); a = Double.parseDouble(sc.nextLine());
        System.out.println("Enter b: "); b = Double.parseDouble(sc.nextLine());
        System.out.println("Enter c: "); c = Double.parseDouble(sc.nextLine());
        QuadraticEquation qe = new QuadraticEquation(a, b, c);

        qe.showResult();

    }
}
