package ss07_demo_drama;

public class Vua extends ConNguoi {

    @Override
    public void diChuyen() {
        System.out.println("Vua di chuyển bằng kiệu");
    }
    private boolean minhQuan ;

    public Vua(boolean minhQuan) {
        this.minhQuan = minhQuan;
    }

    public Vua() {
    }

    public Vua(String ten, int tuoi, double chieuCao, double canNang, boolean minhQuan) {
        super(ten, tuoi, chieuCao, canNang);
        this.minhQuan = minhQuan;
    }

    public boolean isMinhQuan() {
        return minhQuan;
    }

    public void setMinhQuan(boolean minhQuan) {
        this.minhQuan = minhQuan;
    }
    public void raLenh (String tenLenh){
        System.out.println("Vua ra lệnh" + tenLenh);
    }

    @Override
    public String toString() {
        return "Vua{" +
                "minhQuan=" + minhQuan +
                '}';
    }
}
