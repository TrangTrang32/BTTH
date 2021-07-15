/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class tblSachMuon {
    String sothe;
    String maCaBiet;
    Date  ngaymuon;
    Date  ngayphaitra;
    Date  ngaytra;

    public tblSachMuon() {
    }

    public tblSachMuon(String sothe, String maCaBiet, Date ngaymuon, Date ngayphaitra, Date ngaytra) {
        this.sothe = sothe;
        this.maCaBiet = maCaBiet;
        this.ngaymuon = ngaymuon;
        this.ngayphaitra = ngayphaitra;
        this.ngaytra = ngaytra;
    }

    public String getSothe() {
        return sothe;
    }

    public void setSothe(String sothe) {
        this.sothe = sothe;
    }

    public String getMaCaBiet() {
        return maCaBiet;
    }

    public void setMaCaBiet(String maCaBiet) {
        this.maCaBiet = maCaBiet;
    }

    public Date getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(Date ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public Date getNgayphaitra() {
        return ngayphaitra;
    }

    public void setNgayphaitra(Date ngayphaitra) {
        this.ngayphaitra = ngayphaitra;
    }

    public Date getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(Date ngaytra) {
        this.ngaytra = ngaytra;
    }
    
}
