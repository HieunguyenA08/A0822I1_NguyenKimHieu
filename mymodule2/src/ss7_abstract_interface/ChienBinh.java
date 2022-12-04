package ss7_abstract_interface;

public abstract class ChienBinh extends ConNguoi {
    private String vuKhi;

    public ChienBinh() {
    }

    public ChienBinh(String ten, int tuoi, float chieuCao, int canNang, String vuKhi) {
        super(ten, tuoi, chieuCao, canNang);
        this.vuKhi = vuKhi;
    }

    // phương thức riêng
    public void lamNhiemVu(String tenNhiemVu){
        System.out.println("Đi làm nhiệm vụ: "+ tenNhiemVu);
    }
  // có thể triên hoặc không triển khai
    @Override
    public void diChuyen() {
        System.out.println("Di chuyển bằng ngựa");
    }
//    // định nghĩa thêm method abstract
    public abstract void chienDau();



    @Override
    public String toString() {
        return   super.toString()+
                "vuKhi='" + vuKhi + '\'' +
                '}';
    }
}
