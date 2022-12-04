package baikiemtra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập y");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập xSpeed");
        int xSpeed = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ySpeed");
        int ySpeed = Integer.parseInt(scanner.nextLine());

        MovablePoint movablePoint = new MovablePoint();
        movablePoint.moveDown();
        System.out.println();




    }
}
