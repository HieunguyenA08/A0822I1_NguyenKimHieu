package ss11;

import java.util.Scanner;
import java.util.Stack;

public class TransToBinary
{
    public static void main(String[] args) {
        Stack<Integer> number = new Stack<>();
        System.out.println("Nhập một số hệ thập phân");
        Scanner scanner = new Scanner(System.in);
        int hex = Integer.parseInt(scanner.nextLine());
        while (hex!=0){
             number.push(hex%2);
             hex /= 2;
        }
        int n = number.size();
        for (int i = 0; i < n; i++) {
            System.out.print(number.pop());
        }
    }


}
