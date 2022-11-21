package ss03;

import java.util.Arrays;
import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String sentence = "Codegym";
       System.out.println("Nhập kí tự muốn tìm kiếm");
       char letter = scanner.nextLine().charAt(0);
       int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i)==letter){
                count++;
            }
        }
        System.out.println("Kí tự " + letter + " Xuất hiện " + count + " lần");
    }
}
