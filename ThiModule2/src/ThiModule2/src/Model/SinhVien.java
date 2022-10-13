package Model;

public class SinhVien {
    private String mSV;
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    private double dTB;

    public SinhVien(String mSV, String hoTen, int tuoi, String gioiTinh, String diaChi, double dTB) {
        this.mSV = mSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.dTB = dTB;
    }

    public SinhVien() {
    }

    public String getmSV() {
        return mSV;
    }

    public void setmSV(String mSV) {
        this.mSV = mSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getdTB() {
        return dTB;
    }

    public void setdTB(float dTB) {
        this.dTB = dTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "mSV='" + mSV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", dTB=" + dTB +
                '}';
    }
}
