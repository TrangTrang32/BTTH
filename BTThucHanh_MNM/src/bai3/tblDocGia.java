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
public class tblDocGia {
    String sothe;
    String hoTen;
    String DVCT;

    public tblDocGia() {
    }

    public tblDocGia(String sothe, String hoTen, String DVCT) {
        this.sothe = sothe;
        this.hoTen = hoTen;
        this.DVCT = DVCT;
    }

    public String getSothe() {
        return sothe;
    }

    public void setSothe(String sothe) {
        this.sothe = sothe;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDVCT() {
        return DVCT;
    }

    public void setDVCT(String DVCT) {
        this.DVCT = DVCT;
    }
    
}
