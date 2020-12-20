package welcometomydesktop;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getKoneksi(){
        if (koneksi == null){
            try {
                String url = "jdbc:mysql://localhost:3306/welcometomydesktop";
                String user = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);
            } catch (SQLException e) {
                System.out.println("Koneksi ke database gagal!" + e.getMessage());
            }
        }
        return koneksi;
    } 
}
