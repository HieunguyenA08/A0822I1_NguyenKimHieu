package ss19;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String regexClass = "^\\d{2}\\-\\d{10}$";
        System.out.print("Nhập sđt : ");
        String  NumberPhone = scanner.nextLine();
        System.out.println(NumberPhone.matches(regexClass));
    }
}
