package ss7_abstract_interface;

import java.util.Objects;


public abstract class ConNguoi {
    private String ten;
    private int tuoi;
    private float chieuCao;
    private int canNang;
    // pt trừu tượng
    public abstract void diChuyen();

    public ConNguoi() {
    }

    public ConNguoi(String ten, int tuoi, float chieuCao, int canNang) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.chieuCao = chieuCao;
        this.canNang = canNang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    @Override
    public String toString() {
        return "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", chieuCao=" + chieuCao +
                ", canNang=" + canNang +
                '}';
    }
}
