package ss11;

import java.util.Scanner;
import java.util.Stack;

public class Bai1 {
    public static void main(String[] args) {
        Stack<Integer> num1 = new Stack<>();
        num1.push(1);
        num1.push(2);
        num1.push(3);
        num1.push(4);
        num1.push(5);
        System.out.println(num1);
        int s = num1.size();
        Stack<Integer> num2 = new Stack<>();
        for (int i = 0; i < s; i++) {
            num2.push(num1.pop());
        }
        System.out.println("mảng đảo ngược là ");
        System.out.print(num2);


        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ");
        String mWord = scanner.nextLine();

        for (int i = 0; i < mWord.length(); i++) {
           wStack.push(String.valueOf(mWord.charAt(i)));
        }
        for (int i = 0; i < mWord.length(); i++) {
            System.out.print(wStack.pop());
        }


    }


}
