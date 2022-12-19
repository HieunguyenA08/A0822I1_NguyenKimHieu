package ss11;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai2_demso {
    public static void main(String[] args) {
//        Map<String, Integer> result = new HashMap<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập một chuỗi ");
//        String s1 = scanner.nextLine();
//        String[] tmp = s1.split("");
//
//        for (int i = 0; i < tmp.length; i++) {
//            int count = 1;
//
//            if(result.containsKey(tmp[i])){
//                result.put(tmp[i], result.get(tmp[i]) + 1);
//            }
//            else {
//                result.put(tmp[i], count);
//            }
//
//        }
//
//
//        for (Map.Entry<String, Integer> e: result.entrySet()){
//            System.out.println(e.getKey() + ":" + e.getValue());
//        }
        Map<String, Integer> result = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập một chuỗi");
        String s1 = scanner.nextLine();
        String [] tmp = s1.split("");

        for (int i = 0; i < tmp.length ; i++) {
            int count =1;
            if(result.containsKey(tmp[i])){
                result.put(tmp[i],result.get(tmp[i])+1);
            }else {
                result.put(tmp[i],count);
            }
        }

        for (Map.Entry<String,Integer> e : result.entrySet()){
            System.out.println(e.getKey() + ": " + e.getValue());
        }

    }


}
