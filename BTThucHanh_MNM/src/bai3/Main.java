/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
  static Scanner sn =new Scanner(System.in);
    static void themSach(){
         System.out.println("nhap so sach");
         int n=Integer.parseInt(sn.nextLine());
      
      
      for(int i=0;i<n;i++){
          System.out.println("nhap ma sach");
          String mas=sn.nextLine();
          System.out.println("nhap  tu sach");
          String tus=sn.nextLine();
          System.out.println("nhap so trang ");
          String sot=sn.nextLine();
          
          System.out.println("nhap ma tg");
          String matg=sn.nextLine();
          System.out.println("nhap nam xb");
         int namxb=Integer.parseInt(sn.nextLine());
          System.out.println("nhap tu khoa");
          String tuk=sn.nextLine();
          System.out.println("nhap nxb");
          String nxb=sn.nextLine();
          TblSach t=new TblSach(mas, tus, sot, matg, namxb, tuk, nxb);
          if(DAO.addTblSach(t)){
              System.out.println("them thanh cong");
          }
      }
    }
    public static void main(String[] args) {
        themSach();
    }
}
