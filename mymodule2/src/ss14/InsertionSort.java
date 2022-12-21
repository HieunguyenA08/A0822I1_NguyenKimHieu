package ss14;

public class InsertionSort {
    public static void main(String[] args) {
        int [] list = {4,7,2,9,7,4,2};
        System.out.println("Mảng đã sắp xếp là ");
InsertionSort.InsertionSortMethod(list);
    }
    public static void InsertionSortMethod (int[] arr){
        int x;
        int pos ;
        for (int i = 0; i < arr.length; i++) {
            x= arr[i];
            pos = i;
            while (pos>0 && x<arr[pos-1 ]){
                arr[pos]=arr[pos-1];
                pos--;
            }
            arr[pos]=x;
            for (int gt : arr) {
                System.out.println(gt + "\t");
            }
            System.out.println();
        }
    }



}
