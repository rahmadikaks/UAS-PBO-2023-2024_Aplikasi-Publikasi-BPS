/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Rahmadika Kemala Salsabiela 
 */
public class PublikasiModel {
    public void addPublikasi(Publikasi publikasi) {
        String sql = "INSERT INTO publikasi (judul, nomorKatalog, nomorPublikasi, issnIsbn, tanggalRilis, ukuranFile, abstraksi, namaFile) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, publikasi.getJudul());
            pstmt.setString(2, publikasi.getNomorKatalog());
            pstmt.setString(3, publikasi.getNomorPublikasi());
            pstmt.setString(4, publikasi.getIssnIsbn());
            pstmt.setString(5, publikasi.getTanggalRilis());
            pstmt.setString(6, publikasi.getUkuranFile());
            pstmt.setString(7, publikasi.getAbstraksi());
            pstmt.setString(8, publikasi.getNamaFile());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editPublikasi(Publikasi publikasi) {
        String sql = "UPDATE publikasi SET judul = ?, nomorKatalog = ?, nomorPublikasi = ?, issnIsbn = ?, tanggalRilis = ?, ukuranFile = ?, abstraksi = ?, namaFile = ? WHERE nomorPublikasi = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, publikasi.getJudul());
        pstmt.setString(2, publikasi.getNomorKatalog());
        pstmt.setString(3, publikasi.getIssnIsbn());
        pstmt.setString(4, publikasi.getTanggalRilis());
        pstmt.setString(5, publikasi.getUkuranFile());
        pstmt.setString(6, publikasi.getAbstraksi());
        pstmt.setString(7, publikasi.getNamaFile());
        pstmt.setString(8, publikasi.getNomorPublikasi());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePublikasi(String nomorPublikasi) {
        String sql = "DELETE FROM publikasi WHERE nomorPublikasi = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nomorPublikasi);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Publikasi> searchPublikasi(String keyword) {
        List<Publikasi> publikasiList = new ArrayList<>();
        String sql = "SELECT * FROM publikasi WHERE judul LIKE ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + keyword + "%");
            ResultSet rs = pstmt.executeQuery();
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

   public List<Publikasi> getAllPublikasi() {
    List<Publikasi> publikasiList = new ArrayList<>();
    String sql = "SELECT * FROM publikasi";
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery()) {
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
    public void updatePublikasi(Publikasi publikasi, String nomorPublikasi) {
    String sql = "UPDATE publikasi SET judul = ?, nomorKatalog = ?, issnIsbn = ?, tanggalRilis = ?, ukuranFile = ?, abstraksi = ?, namaFile = ? WHERE nomorPublikasi = ?";
    try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, publikasi.getJudul());
        pstmt.setString(2, publikasi.getNomorKatalog());
        pstmt.setString(3, publikasi.getIssnIsbn());
        pstmt.setString(4, publikasi.getTanggalRilis());
        pstmt.setString(5, publikasi.getUkuranFile());
        pstmt.setString(6, publikasi.getAbstraksi());
        pstmt.setString(7, publikasi.getNamaFile());
        pstmt.setString(8, nomorPublikasi);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    
    public Publikasi getPublikasiByNomor(String nomorPublikasi) {
    Publikasi publikasi = null;
    String sql = "SELECT * FROM publikasi WHERE nomorPublikasi = ?";
    try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, nomorPublikasi);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            publikasi = new Publikasi();
            publikasi.setJudul(rs.getString("judul"));
            publikasi.setNomorKatalog(rs.getString("nomorKatalog"));
            publikasi.setNomorPublikasi(rs.getString("nomorPublikasi"));
            publikasi.setIssnIsbn(rs.getString("issnIsbn"));
            publikasi.setTanggalRilis(rs.getString("tanggalRilis"));
            publikasi.setUkuranFile(rs.getString("ukuranFile"));
            publikasi.setAbstraksi(rs.getString("abstraksi"));
            publikasi.setNamaFile(rs.getString("namaFile"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return publikasi;
}

}