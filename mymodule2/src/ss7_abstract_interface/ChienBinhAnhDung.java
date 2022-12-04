package ss7_abstract_interface;

public class ChienBinhAnhDung extends ChienBinh implements ILuyenTap{
    private int sucManh;
    public ChienBinhAnhDung() {
    }

    public ChienBinhAnhDung(String ten, int tuoi, float chieuCao, int canNang, String vuKhi, int sucManh) {
        super(ten, tuoi, chieuCao, canNang, vuKhi);
        this.sucManh = sucManh;
    }

    @Override
    public void chienDau() {
        System.out.println("chiến đấu bằng võ công và phép thuật");
    }

    @Override
    public String toString() {
        return "ChienBinhAnhDung{" +super.toString()+
                "sucManh=" + sucManh +
                '}';
    }

    @Override
    public void luyenCong() {
        System.out.println("Đi lên tầng 7 luyện công");
    }

    @Override
    public void hoMuaGoiGio() {
        System.out.println("lên cầu thuận phước ho mưa gọi gió");
    }
}
