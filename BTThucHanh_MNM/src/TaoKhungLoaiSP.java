public class TaoKhungLoaiSP {
    String MaLoaiSP, TenLoaiSP;
    public TaoKhungLoaiSP(String MaLoaiSP, String TenLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
        this.TenLoaiSP = TenLoaiSP;
    }

    public TaoKhungLoaiSP() {
        this.MaLoaiSP = "";
        this.TenLoaiSP = "";
    }
    public String getMaLoaiSP() {
        return MaLoaiSP;
    }
    public void setMaLoaiSP(String MaLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
    }
    public String getTenLoaiSP() {
        return TenLoaiSP;
    }
    public void setTenLoaiSP(String TenLoaiSP) {
        this.TenLoaiSP = TenLoaiSP;
    }
    @Override
    public String toString() {
        return "KhungLoaiSP: {" + "MaLoaiSP= " + MaLoaiSP + ", TenLoaiSP= " + TenLoaiSP + '}';
    }
}
