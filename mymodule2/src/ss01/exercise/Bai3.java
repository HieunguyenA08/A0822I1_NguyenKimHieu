package ss01.exercise;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so tien (USD) :");
        int USD = Integer.parseInt(sc.nextLine());
        int VND = USD * 23000;
        System.out.println(VND + " VND");
    }
}
