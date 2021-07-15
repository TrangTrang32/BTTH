import java.util.ArrayList;
import java.util.Scanner;
public class Main {
   static Scanner sn=new Scanner(System.in);
   static ArrayList<SanPham> sp=Bai1.layData_BangSanPham();
   static ArrayList<LoaiSanPham> lsp=Bai1.layData_BangLoaiSP();
      
    static String laytenLoaiSP(String maloaisp){
        int n=lsp.size();
        int index=-1;
       for(int i=0;i<n;i++){
            if(maloaisp.equals(lsp.get(i).maLoaiSanP)){
                index=i;
                
            }
                 
       }
        // tra ve ten sp
        if(index<0){
            System.out.println("loi");
        }
  
        return lsp.get(index).getTenloaiSanPham();
    }
  static void yA(){
      // hien thi masp,ten sp loai Sp
      int n=sp.size();
      sp.get(0).tieude();
      for(int i=0;i< n;i++){
        
          sp.get(i).hienthiTenVaMa();
          String tenlspString=laytenLoaiSP(sp.get(i).getMaLoaiSanP());
          System.out.printf("%20s",tenlspString);
          System.out.println("\n");
      }
              
      // hien thi du lieu
      
  }
  static void yB(){
      // them 1 loai sp vao trong csdl
      System.out.println("nhap so loai sp muon them");
         int n=Integer.parseInt(sn.nextLine());
      
      
      for(int i=0;i<n;i++){
          System.out.println("nhap ma loai sp");
          String maLsp=sn.nextLine();
          System.out.println("nhap ten loai sp");
          String tenLsp=sn.nextLine();
          LoaiSanPham loaiSanPham=new LoaiSanPham(maLsp, tenLsp);
          if(Bai1.addLoaiSP(loaiSanPham)){
              System.out.println("them thanh cong");
          }
      }
  }
    public static void main(String[] args) {
         yA();
         yB();
         
    }
}
