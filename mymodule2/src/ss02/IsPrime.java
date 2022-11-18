package ss02;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập number");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(number+" Số nguyên tố đầu tiên là");
        int count =0;
        int i = 2;
        while (count<number){
            if (isPrimeNumber(i)){
                System.out.println(i + " ");
                count++;
            }
            i++;
        }
    }
    public static boolean isPrimeNumber(int n){
    if (n<2){
        return false;
    }
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
