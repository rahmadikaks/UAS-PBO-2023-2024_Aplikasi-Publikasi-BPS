/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rahmadika Kemala Salsabiela 
 */
    
public class DBConnection {
    private static final String url = "jdbc:sqlite:D:/4/PBO/UAS/Aplikasi Publikasi BPS/src/Publikasiku.db";

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.err.println("Failed to load SQLite JDBC driver.");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static List<Publikasi> getDataFromPublikasiView(Date startDate, Date endDate) {
    List<Publikasi> publikasiList = new ArrayList<>();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    String startDateStr = dateFormat.format(startDate);
    String endDateStr = dateFormat.format(endDate);

    String query = "SELECT judul, nomorKatalog, nomorPublikasi, issnIsbn, tanggalRilis, ukuranFile, abstraksi, namaFile" +
                   " FROM Publikasi " +
                   " WHERE tanggalRilis BETWEEN '" + startDateStr + "' AND '" + endDateStr + "'";

    try (Connection conn = getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        while (rs.next()) {
            Publikasi publikasi = new Publikasi();
            publikasi.setJudul(rs.getString("judul"));
            publikasi.setNomorKatalog(rs.getString("nomorKatalog"));
            publikasi.setNomorPublikasi(rs.getString("nomorPublikasi"));
            publikasi.setIssnIsbn(rs.getString("issnIsbn"));
            publikasi.setTanggalRilis(rs.getString("tanggalRilis"));
            publikasi.setUkuranFile(rs.getString("ukuranFile"));
            publikasi.setAbstraksi(rs.getString("abstraksi"));
            publikasi.setNamaFile(rs.getString("namaFile"));
            publikasiList.add(publikasi);
        }
    } catch (SQLException e) {
        e.printStackTrace(); 
    }
    return publikasiList;
}


    /**
     * Method to test the connection.
     */
    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            if (conn != null) {
                System.out.println("Connected to SQLite database.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}