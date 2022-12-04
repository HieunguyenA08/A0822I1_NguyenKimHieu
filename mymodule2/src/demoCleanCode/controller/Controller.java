package demoCleanCode.controller;

import demoCleanCode.service.IStudentservice;
import demoCleanCode.service.imple.StudentSevice;
import ss9_mvc.service.impl.StudentService;

import java.util.Scanner;

public class Controller {
    IStudentservice studentservice = (IStudentservice) new StudentSevice();
    Scanner scanner = new Scanner(System.in);

    public void display() {
        boolean flag = true;
        do {
            System.out.println("Cac chuc nang cua he thong " +
                    "\n1 . Display" +
                    "\n2 . Add" +
                    "\n3 . Delete" +
                    "\n4 . Edit" +
                    "\n5 . Search" +
                    "\n6 . Exit");

            System.out.println("Chon chuc nang  ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Chuc nang display");
                    studentservice.display();
                    break;

                case 2:
                    System.out.println("Chuc nang them moi");
                    studentservice.display();
                    break;

                case 3:
                    System.out.println("Chuc nang xoa");
                    studentservice.display();
                    break;

                case 4:
                    System.out.println("Chuc nang sua");
                    studentservice.display();
                    break;

                case 5:
                    System.out.println("Chuc nang tim kiem");
                    studentservice.display();
                    break;
                default:
                    flag = false;
            }

        } while (flag);
    }
}
