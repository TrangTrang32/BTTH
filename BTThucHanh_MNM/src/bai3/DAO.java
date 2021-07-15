package bai3;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DAO {
  static  private final String DB_Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
  static  private final String DB_Url= "jdbc:sqlserver://localhost:1433;databaseName=QLSach";
  static  private final String DB_User="sa";
  static  private final String DB_Pass="thutrang32";
  static  protected Connection cnn=null;
  static  protected ResultSet rs=null;


    
    public DAO(){
        
        try {
            Class.forName(DB_Driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }    
    public static Connection openConnection(){
        try {
            cnn=DriverManager.getConnection(DB_Url,DB_User,DB_Pass);
           
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

      


       
        public static boolean addTblSach(TblSach Lsp){
        Connection connection = DAO.openConnection();
        String sql = "INSERT INTO TblSach(MaSach, TuSach, SoTrang, MaTG, NamXB, TuKhoa, NXB)"
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, Lsp.getMaSach());
            ps.setString(2, Lsp.getTuSach());
            ps.setString(3, Lsp.getSotrang());
            ps.setString(4, Lsp.getMaTg());
            ps.setInt(5, Lsp.getNamXB());
            ps.setString(6, Lsp.getTuKhoa());
            ps.setString(7, Lsp.getNXB());
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
  
}

