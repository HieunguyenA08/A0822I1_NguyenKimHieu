package ss19;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String regexClass = "^[ACP]\\d{4}[GHIKLM]$";
        System.out.print("Nhập Tên Lớp : ");
        String  myClass = scanner.nextLine();
        System.out.println(myClass.matches(regexClass));
    }


}
