package ss13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list ={2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("Enter the number wanna find");
        int key = Integer.parseInt(scanner.nextLine());
        BinarySeach binarySeach = new BinarySeach();
        System.out.println(binarySeach.binarySearch(list,key));
    }

}
