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
public class tblTacGia {
   String matg;
   String tenTg;
   String Dc;

    public tblTacGia() {
    }

    public tblTacGia(String matg, String tenTg, String Dc) {
        this.matg = matg;
        this.tenTg = tenTg;
        this.Dc = Dc;
    }

    public String getMatg() {
        return matg;
    }

    public void setMatg(String matg) {
        this.matg = matg;
    }

    public String getTenTg() {
        return tenTg;
    }

    public void setTenTg(String tenTg) {
        this.tenTg = tenTg;
    }

    public String getDc() {
        return Dc;
    }

    public void setDc(String Dc) {
        this.Dc = Dc;
    }
   
   
}
