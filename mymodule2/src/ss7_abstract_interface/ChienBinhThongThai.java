package ss7_abstract_interface;

public class ChienBinhThongThai extends ChienBinh implements IPhepThuat {
    private int chiSoThongMinh;

    public ChienBinhThongThai(){

    }
    public ChienBinhThongThai(String ten, int tuoi, float chieuCao, int canNang, String vuKhi, int chiSoThongMinh) {
        super(ten, tuoi, chieuCao, canNang, vuKhi);
        this.chiSoThongMinh = chiSoThongMinh;
    }

    @Override
    public void chienDau() {
        System.out.println("Chiến đầu bằng phép thuật");
    }

    @Override
    public String toString() {
        return "ChienBinhThongThai{" +
                super.toString()+
                "chiSoThongMinh=" + chiSoThongMinh +
                '}';
    }

    @Override
    public void hoMuaGoiGio() {
        System.out.println("Đi lên núi tu luyên hô mưa gọi gió");
    }
}
