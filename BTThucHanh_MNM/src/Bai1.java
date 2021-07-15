import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Bai1 {
    private final String DB_Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String DB_Url= "jdbc:sqlserver://localhost:1433;databaseName=BT1_Module4";
    private final String DB_User="sa";
    private final String DB_Pass="thutrang32";
    protected Connection cnn=null;
    protected ResultSet rs=null;
    
    public Bai1(){
        try {
            Class.forName(DB_Driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }    
    public Connection openConnection(){
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
    public static void main(String[] args) {
        new Bai1();
    }
}
