import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Bai1 {
  static  private final String DB_Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
  static  private final String DB_Url= "jdbc:sqlserver://localhost:1433;databaseName=BT1_Module4";
  static  private final String DB_User="sa";
  static  private final String DB_Pass="thutrang32";
  static  protected Connection cnn=null;
  static  protected ResultSet rs=null;


    
    public Bai1(){
        
        try {
            Class.forName(DB_Driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }    
    public static Connection openConnection(){
        try {
            cnn=DriverManager.getConnection(DB_Url,DB_User,DB_Pass);
           
        } catch (SQLException ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnn;  
    }    
    public void closeConnection(){
        try {
            if(rs !=null){
            rs.close();
            }
            if(cnn!= null)
            {
                cnn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public static ArrayList<SanPham> layData_BangSanPham() {
        Connection connection = Bai1.openConnection();
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        String sql="select * from SanPham";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham temp = new SanPham(rs.getString("MaSP"),
                        rs.getString("TenSP"), rs.getString("NhaSanXuat"),rs.getString("MaLoaiSP"));
              //  System.out.println(temp);
                danhSachSanPham.add(temp);
            }
        } catch (SQLException ex) {
            System.out.println("Loi lay du lieu " + ex.toString());
            return null;
        }
        return danhSachSanPham;
    }
      

       public static ArrayList<LoaiSanPham> layData_BangLoaiSP(){
        Connection connection = Bai1.openConnection();
        ArrayList<LoaiSanPham> danhSachLoaiSanPham = new ArrayList<>();
        String sql="select * from LoaiSanPham";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiSanPham temp = new LoaiSanPham(rs.getString("MaLoaiSP"),
                        rs.getString("TenLoaiSP"));
                //System.out.println(temp);
                danhSachLoaiSanPham.add(temp);
            }
        } catch (SQLException ex) {
            System.out.println("Loi lay du lieu " + ex.toString());
            return null;
        }
        return danhSachLoaiSanPham;
    }
       
        public static boolean addLoaiSP(LoaiSanPham Lsp){
        Connection connection = Bai1.openConnection();
        String sql = "INSERT INTO LoaiSanPham(MaLoaiSP, TenLoaiSP)"
                + "VALUES(?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, Lsp.getMaLoaiSanP());
            ps.setString(2, Lsp.getTenloaiSanPham());
       
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
  
}

