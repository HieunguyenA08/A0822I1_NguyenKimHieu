package ss03;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuMang {
    public static void main(String[] args) {
        int[] myArray = {10,4,6,7,8,0,0,0,0,23};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một phân tử muốn thêm ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào vị trí cần chèn trong mảng ");
        int index = Integer.parseInt(scanner.nextLine());

        int[] newArray = Arrays.copyOf(myArray, myArray.length+1);


        for (int i = myArray.length; i > index; i--) {
            if(i != index){
                newArray[i] = myArray[i-1];
            }
        }
        newArray[index] = number;
        System.out.println(Arrays.toString(newArray));
    }
}
