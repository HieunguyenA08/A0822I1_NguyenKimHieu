package ss03;

import java.util.Scanner;

public class MinMangHaiChieu {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            // nhập số hàng số cột
            System.out.println("Nhập số hàng");
            int row = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số cột");
            int col = Integer.parseInt(scanner.nextLine());
            // khai báo mảng
            int[][] a = new int[row][col];
            //nhập liệu
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.println("a["+i+"]["+j+"]");
                    a[i][j]= Integer.parseInt(scanner.nextLine());
                }
            }

            //in mảng vừa nhập
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.println(a[i][j]);
                }
                System.out.println();
            }
            //tìm max và in ra kết quả
            int min = a[0][0];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (min>a[i][j]){
                        min = a[i][j];
                    }
                }
            }
            System.out.println("số nhỏ nhất trong mảng là " + min);
        }
    }

