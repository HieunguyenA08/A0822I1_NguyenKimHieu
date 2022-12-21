package ss11;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        ArrayDeque<Character> queue = new ArrayDeque<>();
        System.out.println("Nhập chuỗi");
        Scanner scanner = new Scanner(System.in);
        String chuoi = scanner.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            stack.push(chuoi.charAt(i));
            queue.add(chuoi.charAt(i));
        }
        for (int i = 0; i < stack.size(); i++) {
            if (stack.pop()==queue.pop()){
                System.out.println("Chuỗi trên là chuỗi Palindrome");
                break;
            }else
                System.out.println("Chuỗi trên không phải là chuỗi Palindrome");
            break;
        }
    }
}
