/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Component;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rahmadika Kemala Salsabiela 
 */
public class PublikasiView extends javax.swing.JFrame {
    private PublikasiController controller;
    
    public PublikasiView() {
        initComponents();
    } 

    public void setController(PublikasiController controller) {
    this.controller = controller;
}


    
    void updateTable(List<Publikasi> publikasiList) {
        DefaultTableModel model = (DefaultTableModel) publikasiTable.getModel();
        model.setRowCount(0); // Clear existing rows
        for (Publikasi publikasi : publikasiList) {
            Object[] rowData = {
                publikasi.getJudul(),
                publikasi.getNomorKatalog(),
                publikasi.getNomorPublikasi(),
                publikasi.getIssnIsbn(),
                publikasi.getTanggalRilis(),
                publikasi.getUkuranFile(),
                publikasi.getAbstraksi(),
                publikasi.getNamaFile()
            };
            model.addRow(rowData);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        publikasiTable = new javax.swing.JTable();
        cetakTabelButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        pencarianTextField = new javax.swing.JTextField();
        cariButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        judulTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nomorKatalogTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nomorPublikasiTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        issnIsbnTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tanggalRilisDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        namaFileTextField = new javax.swing.JTextField();
        uploadfileButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ukuranFileTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        abstraksiTextArea = new javax.swing.JTextArea();
        simpanButton = new javax.swing.JButton();
        simpanEditButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        publikasiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Judul", "No Katalog", "No Publikasi", "ISSN/ISBN", "Tgl Rilis", "Ukuran File", "Abstraksi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        publikasiTable.setPreferredSize(new java.awt.Dimension(450, 400));
        jScrollPane5.setViewportView(publikasiTable);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 620, 410));

        cetakTabelButton.setText("Cetak Tabel");
        cetakTabelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakTabelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cetakTabelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 600, 130, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Judul Publikasi:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 110, -1));

        pencarianTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencarianTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(pencarianTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 390, -1));

        cariButton.setText("Cari");
        cariButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cariButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pendataan Publikasi BPS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 440, 51));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Judul:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 90, -1));
        getContentPane().add(judulTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 350, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nomor Katalog:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 110, -1));
        getContentPane().add(nomorKatalogTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 350, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nomor Publikasi:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        getContentPane().add(nomorPublikasiTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 350, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ISSN/ISBN:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, -1));
        getContentPane().add(issnIsbnTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 350, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tanggal Rilis:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 90, -1));
        getContentPane().add(tanggalRilisDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 350, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("File (.pdf):");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));
        getContentPane().add(namaFileTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 250, 20));

        uploadfileButton.setText("Upload File");
        uploadfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadfileButtonActionPerformed(evt);
            }
        });
        getContentPane().add(uploadfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ukuran File:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 90, -1));
        getContentPane().add(ukuranFileTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 83, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MB");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Abstraksi:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 90, -1));

        abstraksiTextArea.setColumns(20);
        abstraksiTextArea.setRows(5);
        jScrollPane4.setViewportView(abstraksiTextArea);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 350, -1));

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(simpanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, -1, -1));

        simpanEditButton.setText("Simpan Edit");
        simpanEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanEditButtonActionPerformed(evt);
            }
        });
        getContentPane().add(simpanEditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, -1, -1));

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, -1));

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });
        getContentPane().add(hapusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publikasi3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        String nomorPublikasi = JOptionPane.showInputDialog("Masukkan Nomor Publikasi yang ingin dihapus:");
        if (nomorPublikasi != null && !nomorPublikasi.isEmpty()) {
            //Memanggil method di controller untuk menghapus publikasi berdasarkan nomor publikasi
            controller.deletePublikasi(nomorPublikasi);
            JOptionPane.showMessageDialog(this, "Publikasi dengan Nomor Publikasi " + nomorPublikasi + " berhasil dihapus.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //jika tidak memasukkan nomor publikasi, muncul pesan error
            JOptionPane.showMessageDialog(this, "Masukkan Nomor Publikasi yang valid.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void simpanEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanEditButtonActionPerformed
        String judul = judulTextField.getText();
        String nomorKatalog = nomorKatalogTextField.getText();
        String nomorPublikasi = nomorPublikasiTextField.getText();
        String issnIsbn = issnIsbnTextField.getText();

        //Mendapatkan tanggal rilis melalui JDateChooser
        Date tanggalRilisDate = tanggalRilisDateChooser.getDate();
        String tanggalRilis = null;
        if (tanggalRilisDate != null) {
            tanggalRilis = new SimpleDateFormat("dd-MM-yyyy").format(tanggalRilisDate);
        }

        String ukuranFile = ukuranFileTextField.getText();
        String abstraksi = abstraksiTextArea.getText();
        String namaFile = namaFileTextField.getText();

        //Create updated publication 
        Publikasi publikasi = new Publikasi(judul, nomorKatalog, nomorPublikasi, issnIsbn, tanggalRilis, ukuranFile, abstraksi, namaFile);

        //Update publikasi untuk edit
        controller.updatePublikasi(publikasi, nomorPublikasi); // Memanggil metode update dengan nomorPublikasi yang sama

        //Mengosongkan form
        clearFields();

        //Menampilkan pesan data berhasil diedit.
        JOptionPane.showMessageDialog(this, "Data publikasi berhasil diperbarui.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_simpanEditButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        String nomorPublikasi = JOptionPane.showInputDialog("Masukkan Nomor Publikasi yang ingin diedit:");

        if (nomorPublikasi != null && !nomorPublikasi.isEmpty()) {
            Publikasi publikasi = controller.getPublikasiByNomor(nomorPublikasi);
            if (publikasi != null) {
                judulTextField.setText(publikasi.getJudul());
                nomorKatalogTextField.setText(publikasi.getNomorKatalog());
                nomorPublikasiTextField.setText(publikasi.getNomorPublikasi());
                issnIsbnTextField.setText(publikasi.getIssnIsbn());

                // Set tanggal rilis jika tanggal rilis tidak null
                if (publikasi.getTanggalRilis() != null) {
                    try {
                        Date tanggalRilisDate = new SimpleDateFormat("dd-MM-yyyy").parse(publikasi.getTanggalRilis());
                        tanggalRilisDateChooser.setDate(tanggalRilisDate);
                    } catch (ParseException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    tanggalRilisDateChooser.setDate(null); // Clear date chooser jika tanggalRilis is null
                }
                ukuranFileTextField.setText(publikasi.getUkuranFile());
                abstraksiTextArea.setText(publikasi.getAbstraksi());
                namaFileTextField.setText(publikasi.getNamaFile());
            } else {
                JOptionPane.showMessageDialog(null, "Publikasi tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void cariButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariButtonActionPerformed
        String keyword = pencarianTextField.getText();
        controller.searchPublikasi(keyword);
    }//GEN-LAST:event_cariButtonActionPerformed

    private void cetakTabelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakTabelButtonActionPerformed
        new CetakFrame().setVisible(true);
    }//GEN-LAST:event_cetakTabelButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        String judul = judulTextField.getText();
        String nomorKatalog = nomorKatalogTextField.getText();
        String nomorPublikasi = nomorPublikasiTextField.getText();
        String issnIsbn = issnIsbnTextField.getText();
        Date tanggalRilisDate = tanggalRilisDateChooser.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String tanggalRilis = sdf.format(tanggalRilisDate);
        String ukuranFile = ukuranFileTextField.getText();
        String abstraksi = abstraksiTextArea.getText();
        String namaFile = namaFileTextField.getText();

        Publikasi publikasi = new Publikasi(judul, nomorKatalog, nomorPublikasi, issnIsbn, tanggalRilis, ukuranFile, abstraksi, namaFile);
        controller.addPublikasi(publikasi);

        clearFields();
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void uploadfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadfileButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("PDF Files", "pdf"));
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        String fileName = selectedFile.getName();
        long fileSizeInBytes = selectedFile.length();
        double fileSizeInMB = fileSizeInBytes / (1024.0 * 1024.0);

        namaFileTextField.setText(fileName);
        ukuranFileTextField.setText(String.format("%.2f", fileSizeInMB));

        //Direktori penyimpanan file publikasi
        String destinationDir = "D:\\4\\PBO\\UAS\\File Publikasi";
        Path destinationPath = Paths.get(destinationDir, fileName);

        try {
            File dir = new File(destinationDir);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            Files.copy(selectedFile.toPath(), destinationPath, StandardCopyOption.REPLACE_EXISTING);
            JOptionPane.showMessageDialog(this, "File berhasil diupload ke " + destinationDir);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal mengupload file: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "No file selected");
    }
    }//GEN-LAST:event_uploadfileButtonActionPerformed

    private void pencarianTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencarianTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pencarianTextFieldActionPerformed

     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        PublikasiModel model = new PublikasiModel();
        PublikasiView view = new PublikasiView();
        PublikasiController controller = new PublikasiController(model, view);

        view.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea abstraksiTextArea;
    private javax.swing.JButton cariButton;
    private javax.swing.JButton cetakTabelButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JTextField issnIsbnTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField judulTextField;
    private javax.swing.JTextField namaFileTextField;
    private javax.swing.JTextField nomorKatalogTextField;
    private javax.swing.JTextField nomorPublikasiTextField;
    private javax.swing.JTextField pencarianTextField;
    private javax.swing.JTable publikasiTable;
    private javax.swing.JButton simpanButton;
    private javax.swing.JButton simpanEditButton;
    private com.toedter.calendar.JDateChooser tanggalRilisDateChooser;
    private javax.swing.JTextField ukuranFileTextField;
    private javax.swing.JButton uploadfileButton;
    // End of variables declaration//GEN-END:variables
    
    private void clearFields() {
    judulTextField.setText("");
    nomorKatalogTextField.setText("");
    nomorPublikasiTextField.setText("");
    issnIsbnTextField.setText("");
    tanggalRilisDateChooser.setDate(null);
    ukuranFileTextField.setText("");
    abstraksiTextArea.setText("");
    namaFileTextField.setText("");
}

}
