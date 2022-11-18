package ss03;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] myArray1 = {1,2,3};
        int[] myArray2 = {4,5,6};
        int[] myArray3 = Arrays.copyOf(myArray1,myArray1.length+myArray2.length);
        for (int i =0 ;i < myArray2.length; i++) {
            myArray3[myArray2.length+i]=myArray2[i];
        }
        System.out.println(Arrays.toString(myArray3));
    }
}
