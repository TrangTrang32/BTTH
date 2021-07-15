/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class LoaiSanPham {
    String maLoaiSanP;
    String tenloaiSanPham;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String maLoaiSanP, String tenloaiSanPham) {
        this.maLoaiSanP = maLoaiSanP;
        this.tenloaiSanPham = tenloaiSanPham;
    }

    public String getMaLoaiSanP() {
        return maLoaiSanP;
    }

    public void setMaLoaiSanP(String maLoaiSanP) {
        this.maLoaiSanP = maLoaiSanP;
    }

    public String getTenloaiSanPham() {
        return tenloaiSanPham;
    }

    public void setTenloaiSanPham(String tenloaiSanPham) {
        this.tenloaiSanPham = tenloaiSanPham;
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" + "maLoaiSanP=" + maLoaiSanP + ", tenloaiSanPham=" + tenloaiSanPham + '}';
    }
    
    
}
