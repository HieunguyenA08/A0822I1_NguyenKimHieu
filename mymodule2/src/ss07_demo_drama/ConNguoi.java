package ss07_demo_drama;

public abstract class ConNguoi {
    private String ten ;
    private int tuoi;
    private double chieuCao;
    private double canNang;

    public ConNguoi() {
    }

    public ConNguoi(String ten, int tuoi, double chieuCao, double canNang) {
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

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }
    public abstract void diChuyen ();

    @Override
    public String toString() {
        return "ConNguoi{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", chieuCao=" + chieuCao +
                ", canNang=" + canNang +
                '}';
    }
}
