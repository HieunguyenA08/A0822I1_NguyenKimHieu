package ss12;

import java.util.*;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    private List<Product> myproduct = new ArrayList<>();

    ProductManager() {
        myproduct.add(new Product(01, "Táo", 120));
        myproduct.add(new Product(02, "Nho", 280));
        myproduct.add(new Product(03, "Lê", 90));
    }

    public void display() {
        for (int i = 0; i < myproduct.size(); i++) {
            System.out.println(myproduct.get(i));
        }

    }

    public void add() {

        System.out.println("Mời nhập id sàn phẩm mới");
        int newid = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập tên sàn phẩm mới");
        String newname = scanner.nextLine();
        System.out.println("Mời nhập giá sàn phẩm mới");
        int newprice = Integer.parseInt(scanner.nextLine());
        Product product = new Product(newid, newname, newprice);
        myproduct.add(product);
        display();

    }

    public void delete(int id) {
        for (int i = 0; i < myproduct.size(); i++) {
            if (id == myproduct.get(i).getId()) {
                myproduct.remove(i);
            }
        }
    }

    public void edit() {

        System.out.println("Mời nhập id sản phẩm cần sửa");
        int editPro = Integer.parseInt(scanner.nextLine());
        System.out.println("tên sửa thành :");
        String editname = scanner.nextLine();
        System.out.println("giá sửa thành :");
        int editprice = Integer.parseInt(scanner.nextLine());
        Product product = new Product(editPro, editname, editprice);
        for (int i = 0; i < myproduct.size(); i++) {
            if (myproduct.get(i).getId() == editPro) {
                myproduct.set(i, product);
                break;
            }
        }


    }

    public void findProduct() {
        System.out.println("Enter the Product Name to search :");
        String findname = scanner.nextLine();
        for (int i = 0; i < myproduct.size(); i++) {
            if (findname.equals(myproduct.get(i).getName())) {
                System.out.println(myproduct.get(i));
            }
        }
    }


    public void sortByPrice() {
        Collections.sort(myproduct, new Comparator<>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }


    }

