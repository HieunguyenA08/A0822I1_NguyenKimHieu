package ss7_abstract_interface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        dietRong();
        thiSacDep();

    }

    public static void dietRong() {
       // khởi tạo vua
         Vua vua =new Vua();
         ChienBinhDepTrai chienBinhDepTrai = new ChienBinhDepTrai();
         ChienBinhThongThai chienBinhThongThai = new ChienBinhThongThai();
         ChienBinhAnhDung chienBinhAnhDung = new ChienBinhAnhDung();
         vua.raLenh("Chiến binh đẹp trai đi diện rồng");
         chienBinhDepTrai.lamNhiemVu("Diệt rồng");
         chienBinhDepTrai.chienDau();
//        // thất bại trở về
          vua.raLenh("Mi đi chơi với công chúa");
          vua.raLenh("CB thông thai đi diệt rồng");
          chienBinhThongThai.lamNhiemVu("diệt rông");
          chienBinhThongThai.hoMuaGoiGio();
          chienBinhThongThai.chienDau();
//        // vẫn thất bại
//        // vua ra lệnh cho chiến binh anh dung
           vua.raLenh("chiến binh anh dung đi diệt rồng");
           chienBinhAnhDung.lamNhiemVu("diệt rồng");
           chienBinhAnhDung.luyenCong();
           chienBinhAnhDung.chienDau();
//        // diệt được rồng
          vua.raLenh("Cho cưới công chúa");

    }


    public static void thiSacDep(){
//        // danh sách thi sắc đẹp
        ChienBinhDepTrai[] chienBinhDepTrais = new ChienBinhDepTrai[5];
        chienBinhDepTrais[0] =new ChienBinhDepTrai("Luận",18,1.8f,70,"Son",6);
        chienBinhDepTrais[1] =new ChienBinhDepTrai("Minh Huy",25,1.8f,70,"Son",8);
        chienBinhDepTrais[2] =new ChienBinhDepTrai("Bảo Nhân",18,1.8f,70,"Son",9);
        chienBinhDepTrais[3] =new ChienBinhDepTrai("Phú Quý",18,1.8f,70,"Son",8);
        chienBinhDepTrais[4] =new ChienBinhDepTrai("Hoài Nam",18,1.8f,70,"Son",6);
        //danh sách
        System.out.println("danh sách -----------------------------------");
        for (ChienBinhDepTrai c: chienBinhDepTrais) {
            System.out.println(c);
        }
        // sắp xếp
       Arrays.sort(chienBinhDepTrais);
//         kết quả
        System.out.println("Kết quả-------------------------------------");
        for (ChienBinhDepTrai c: chienBinhDepTrais) {
            System.out.println(c);
        }

    }
}
