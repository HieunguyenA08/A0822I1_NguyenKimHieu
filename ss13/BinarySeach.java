package ss13;

import java.util.Arrays;

public class BinarySeach {
    public static void main(String[] args) {

        BinarySeach binarySeach = new BinarySeach();
        int [] arr = {1,7,3,9,3,5,8};
        int temp =arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySeach.binarySearch(arr,5));
    }

    public int binarySearch(int[] list, int key){
        int high = list.length-1;
        int low  = 0;
        while (high>=low){
            int mid = (low+high)/2;
            if (key < list[mid] ){
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            }else{
                low = mid + 1;
            }

        }

        return -1;
    }
}
