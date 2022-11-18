package ss03;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        int[] myArray = {10,4,6,7,8,6,0,0,0,0};
        int[] newArray = new int[myArray.length-1];
        int j=0;
        for (int i = 0;i < myArray.length; i++) {
            if (i!=3){
                newArray[j]=myArray[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
