/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class SanPham {
    String MaSP;
    String TenSP;
    String nhaSanXuat;
    String maLoaiSanP;

    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, String nhaSanXuat, String maLoaiSanP) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.nhaSanXuat = nhaSanXuat;
        this.maLoaiSanP = maLoaiSanP;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getMaLoaiSanP() {
        return maLoaiSanP;
    }

    public void setMaLoaiSanP(String maLoaiSanP) {
        this.maLoaiSanP = maLoaiSanP;
    }

    @Override
    public String toString() {
        return "SanPham{" + "MaSP=" + MaSP + ", TenSP=" + TenSP + ", nhaSanXuat=" + nhaSanXuat + ", maLoaiSanP=" + maLoaiSanP + '}';
    }
    void tieude(){
    System.out.printf("%20s%20s%20s","MaSP","TenSP","\tTenLoaiSP  \n");
    }
        void hienthiTenVaMa(){
        System.out.printf("%20s%20s",MaSP,TenSP);
    }
    
}
