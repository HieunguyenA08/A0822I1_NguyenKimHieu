package ss07_demo_drama;

public abstract class chienBinh extends ConNguoi {
private String vuKhi;

    @Override
    public void diChuyen() {
        System.out.println("Chiến binh di chuyen bằng ngựa");
    }

    public chienBinh() {
    }

    public chienBinh(String vuKhi) {
        this.vuKhi = vuKhi;
    }

    public chienBinh(String ten, int tuoi, double chieuCao, double canNang, String vuKhi) {
        super(ten, tuoi, chieuCao, canNang);
        this.vuKhi = vuKhi;
    }

    public String getVuKhi() {
        return vuKhi;
    }

    public void setVuKhi(String vuKhi) {
        this.vuKhi = vuKhi;
    }

    public void lamNhiemvu(String tenNhiemVu){
        System.out.println("Chiến binh làm nhiệm vụ " + tenNhiemVu);
    }
    public abstract void chienDau ();

    @Override
    public String toString() {
        return "chienBinh{" +
                "vuKhi='" + vuKhi + '\'' +
                '}';
    }
}
