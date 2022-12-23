package ss15;

import java.util.Scanner;

public class IllegalTriangleException {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        do {
            flag=false;
            System.out.println("nhập ba cạnh lần lượt");
            int a,b,c;
            try{
                System.out.println("Nhập a");
                a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập b");
                b = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập c");
                c = Integer.parseInt(scanner.nextLine());
                checkTriangle(a,b,c);

            } catch (IllegalTriangleException illegalTriangleException ) {
                System.out.println(illegalTriangleException.getMessage());
                System.out.println("Nhập lại");
                flag = true;
            } catch (NumberFormatException e) {
                flag = true;
                e.printStackTrace();
                System.out.println("Đang nhập chữ¯");
            }
        }while (flag);

    }

    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a > b + c || b > a + c || c > a + b && a > 0 && b > 0 && c > 0) {
            throw new IllegalTriangleException("Tam giác k hợp lệ");
        } else {
            throw new IllegalTriangleException("Tam giac hop le");
        }
    }
}