package ss01.exercise;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so ");
        int number = Integer.parseInt(sc.nextLine());

        if (number>0 && number<10){
            switch (number){
                case 1:{
                    System.out.println("one");
                    break;
                }
                case 2:{
                    System.out.println("two");
                    break;
                }
                case 3:{
                    System.out.println("three");
                    break;
                }
                case 4:{
                    System.out.println("four");
                    break;
                }
                case 5:{
                    System.out.println("five");
                    break;
                }
                case 6:{
                    System.out.println("six");
                    break;
                }
                case 7:{
                    System.out.println("seven");
                    break;
                }
                case 8:{
                    System.out.println("eight");
                    break;
                }
                case 9:{
                    System.out.println("nine");
                    break;
                }
            }
     }else if (number < 20 && number> 13){
            switch (number){

                case 4:{
                    System.out.println("four");
                    break;
                }
                case 5:{
                    System.out.println("five");
                    break;
                }
                case 6:{
                    System.out.println("six");
                    break;
                }
                case 7:{
                    System.out.println("seven");
                    break;
                }
                case 8:{
                    System.out.println("eight");
                    break;
                }
                case 9:{
                    System.out.println("nine");
                    break;
                }
            }
        }
    }
}
