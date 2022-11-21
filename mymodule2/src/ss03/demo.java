package ss03;
import java.util.ArrayList;
import java.util.Arrays;
public class demo {
    public static void main(String[] args) {

        ArrayList<Integer[]> table = new ArrayList<>();
        Integer[] a = {1,3,5};
        Integer[] b = {10,30,50};
        table.add(a);
        table.add(b);

        table.forEach(e -> {
            System.out.println(Arrays.toString(e));
        });


        int max = 0;
        for (int i = 0; i < table.size(); i++) {
            for (int j = 0; j < table.get(i).length; j++) {
                int t = table.get(i)[j];
                if(t > max){
                    max = t;
                }
            }
        }

        System.out.println("Max: " + max);
    }
}
