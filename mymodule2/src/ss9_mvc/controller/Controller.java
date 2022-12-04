package ss9_mvc.controller;

import ss9_mvc.service.IStudentService;
import ss9_mvc.service.impl.StudentService;

import java.util.Scanner;

public class Controller {
    private IStudentService studentService = new StudentService();
    public  void displayMenu(){
        boolean flag =true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1. Display" +
                    "\n 2. Add" +
                    "\n 3. Delete" +
                    "\n 4. Edit" +
                    "\n 5. Search" +
                    "\n 6. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    // code display
                    System.out.println("chức năng hiện thị");
                    studentService.display();
                    break;
                case 2:
                    // code thêm mới
                    studentService.add();
                    break;
                case 3:
                    // code xóa
                    System.out.println("chức năng xóa");
                    studentService.delete();
                    break;
                case 4:
                    // code sửa
                    System.out.println("chức năng sửa");
                    studentService.update();
                    break;
                case 5:
                    // code tìm kiếm
                    System.out.println("chức năng tìm kiếm");
                    break;
                default:
                    flag=false;
            }
        }while (flag);
    }
}
