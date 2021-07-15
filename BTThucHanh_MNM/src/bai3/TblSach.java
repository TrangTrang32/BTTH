/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author Administrator
 */
public class TblSach {
    String maSach;
    String tuSach;
    String sotrang;
    String maTg;
    int namXB;
    String tuKhoa;
    String NXB;

    public TblSach() {
    }

    public TblSach(String maSach, String tuSach, String sotrang, String maTg, int namXB, String tuKhoa, String NXB) {
        this.maSach = maSach;
        this.tuSach = tuSach;
        this.sotrang = sotrang;
        this.maTg = maTg;
        this.namXB=namXB;
        this.tuKhoa = tuKhoa;
        this.NXB = NXB;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTuSach() {
        return tuSach;
    }

    public void setTuSach(String tuSach) {
        this.tuSach = tuSach;
    }

    public String getSotrang() {
        return sotrang;
    }

    public void setSotrang(String sotrang) {
        this.sotrang = sotrang;
    }

    public String getMaTg() {
        return maTg;
    }

    public void setMaTg(String maTg) {
        this.maTg = maTg;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public String getTuKhoa() {
        return tuKhoa;
    }

    public void setTuKhoa(String tuKhoa) {
        this.tuKhoa = tuKhoa;
    }
    
}
