package ss02;

import java.util.Scanner;

public class DaySoNguyenTo {
    public static boolean isPrimeNumber (int n){
        if (n<2){
            return false;
        }
        for (int i = 2; i < n ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int i = 2;
        while (i<100){
            if (isPrimeNumber(i)){
                System.out.println(i+" ");
            }
            i++;
        }
    }
}
