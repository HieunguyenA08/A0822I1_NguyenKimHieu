package ss7_abstract_interface;

import java.util.Objects;

public class Vua extends ConNguoi {
    boolean minhQuan;
  // triển khai method abstract của ConNGuoi
    @Override
    public void diChuyen() {
        System.out.println("Vua di chuyển bằng kiệu");
    }

    public Vua() {

    }
    // method riêng của vua
    public void raLenh(String tenLenh){
        System.out.println("Vua ra lệnh: " +tenLenh);
    }

    @Override
    public String toString() {
        return "Vua{" +
                super.toString()+
                "minhQuan=" + minhQuan +
                '}';
    }

}
