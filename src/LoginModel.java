/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rahmadika Kemala Salsabiela 
 */
public class LoginModel {
    
    private final Connection conn;

    public LoginModel() {
        conn = DBConnection.getConnection();
    }

    /**
     * Memverifikasi apakah username dan password sesuai dengan yang ada di database.
     *
     * @param username Username pengguna
     * @param password Password pengguna
     * @return true jika username dan password sesuai, false jika tidak
     */
    public boolean verifyLogin(String username, String password) {
        String sql = "SELECT * FROM User WHERE username = ? AND password = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            
            return rs.next(); // returns true if there is at least one record found
            
        } catch (SQLException e) {
            System.err.println("Error verifying login: " + e.getMessage());
            return false;
        }
    }
}

