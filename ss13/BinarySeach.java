package ss13;

public class BinarySeach {

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
