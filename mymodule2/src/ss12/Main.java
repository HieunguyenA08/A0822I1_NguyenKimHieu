package ss12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager1 = new ProductManager();
       do {

           System.out.println("---------------------------");
        System.out.println("1.Thêm sản phẩm\n" +
                "2.Sửa thông tin sản phẩm theo id\n" +
                "3.Xoá sản phẩm theo id\n" +
                "4.Hiển thị danh sách sản phẩm\n" +
                "5.Tìm kiếm sản phẩm theo tên\n" +
                "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
        System.out.println("Nhập lựa chọn");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1: productManager1.display();
                productManager1.add();
            break;
            case 2: productManager1.display();
                productManager1.edit();
                productManager1.display();
            break;
            case 3: productManager1.display();
                System.out.println("Nhập id muốn xóa");
                int removePro = Integer.parseInt(scanner.nextLine());
                productManager1.delete(removePro);
                productManager1.display();
                break;
            case 4:   productManager1.display();

            break;
            case 5:
//                   productManager1.findProduct();
                productManager1.findProductID();
                break;
            case 6:
                productManager1.sortByPrice();
                productManager1.display();
        }

//       productManager1.display();
//
//        System.out.println("Mời nhập id sản phẩm muốn xóa");
//        int removePro = Integer.parseInt(scanner.nextLine());
//        productManager1.delete(removePro);
//        productManager1.display();
//

    }while (true);
    }



}
