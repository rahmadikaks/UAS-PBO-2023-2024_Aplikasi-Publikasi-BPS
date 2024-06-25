/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import com.itextpdf.io.IOException;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.events.Event;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.layout.element.Image;
import java.awt.Component;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import com.itextpdf.layout.property.UnitValue;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Rahmadika Kemala Salsabiela 
 */
public class CetakFrame extends javax.swing.JFrame {
    private PublikasiController publikasiController;

    public CetakFrame() {
        
        initComponents();
    }

    
    public void setController(PublikasiController controller) {
    this.publikasiController = controller;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cetakLabel = new javax.swing.JLabel();
        cetakPDFButton = new javax.swing.JButton();
        cetakCSVButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tanggalRilisStartDateChooser = new com.toedter.calendar.JDateChooser();
        tanggalRilisEndDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namaFileTextField = new javax.swing.JTextField();
        openFolderButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cetakLabel.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        cetakLabel.setForeground(new java.awt.Color(255, 255, 255));
        cetakLabel.setText("Cetak Tabel Publikasi BPS");
        getContentPane().add(cetakLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 630, 100));

        cetakPDFButton.setBackground(new java.awt.Color(131, 174, 209));
        cetakPDFButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cetakPDFButton.setForeground(new java.awt.Color(255, 255, 255));
        cetakPDFButton.setText("Cetak sebagai PDF");
        cetakPDFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakPDFButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cetakPDFButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 200, 40));

        cetakCSVButton.setBackground(new java.awt.Color(131, 174, 209));
        cetakCSVButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cetakCSVButton.setForeground(new java.awt.Color(255, 255, 255));
        cetakCSVButton.setText("Cetak sebagai CSV");
        cetakCSVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakCSVButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cetakCSVButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 200, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tanggal Publikasi");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 160, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("s.d.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 37, -1));
        getContentPane().add(tanggalRilisStartDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 160, 30));
        getContentPane().add(tanggalRilisEndDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 150, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pilih File Ekspor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tempat Simpan File");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 190, -1));
        getContentPane().add(namaFileTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 340, 30));

        openFolderButton.setBackground(new java.awt.Color(131, 174, 209));
        openFolderButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        openFolderButton.setForeground(new java.awt.Color(255, 255, 255));
        openFolderButton.setText("Open Folder");
        openFolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFolderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(openFolderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 130, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("© Rahmadika Kemala Salsabiela (222212828) ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cetak.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void cetakPDFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakPDFButtonActionPerformed
    Date startDate = tanggalRilisStartDateChooser.getDate();
    Date endDate = tanggalRilisEndDateChooser.getDate();
    String savePath = namaFileTextField.getText();

    if (startDate == null || endDate == null || savePath.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Harap lengkapi semua informasi yang diperlukan.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    String startDateStr = dateFormat.format(startDate);
    String endDateStr = dateFormat.format(endDate);
    String fileName = "Publikasi_" + startDateStr + "_to_" + endDateStr;

    try {
        cetakKePDF(fileName, savePath, startDate, endDate);
        JOptionPane.showMessageDialog(this, "PDF berhasil dibuat!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat membuat PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_cetakPDFButtonActionPerformed

    private void cetakCSVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakCSVButtonActionPerformed
          Date startDate = tanggalRilisStartDateChooser.getDate();
    Date endDate = tanggalRilisEndDateChooser.getDate();
    String savePath = namaFileTextField.getText();

    if (startDate == null || endDate == null || savePath.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Harap lengkapi semua informasi yang diperlukan.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    String startDateStr = dateFormat.format(startDate);
    String endDateStr = dateFormat.format(endDate);
    String fileName = "Publikasi_" + startDateStr + "_to_" + endDateStr;

    try {
        cetakKeCSV(fileName, savePath, startDate, endDate);
        JOptionPane.showMessageDialog(this, "CSV berhasil dibuat!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat membuat CSV: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_cetakCSVButtonActionPerformed

    private void openFolderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFolderButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();
            namaFileTextField.setText(selectedFolder.getAbsolutePath());
        }
    }//GEN-LAST:event_openFolderButtonActionPerformed

    private void cetakKePDF(String fileName, String savePath, Date startDate, Date endDate) throws 
            FileNotFoundException, MalformedURLException {
        String filePath = savePath + File.separator + fileName + ".pdf";
        List<Publikasi> publikasiList = DBConnection.getDataFromPublikasiView(startDate, endDate);
        try {
            PdfWriter writer = new PdfWriter(filePath);
            PdfDocument pdf = new PdfDocument(writer);
            pdf.setDefaultPageSize(new PageSize(PageSize.A4).rotate()); 
            Document document = new Document(pdf);
            
            // Load background image
            String backgroundImagePath = "background.png";
            File backgroundImageFile = new File(backgroundImagePath);
            if (!backgroundImageFile.exists()) {
                System.err.println("File gambar tidak ditemukan: " + backgroundImagePath);
                return;
            }
            Image backgroundImage = new Image(ImageDataFactory.create(backgroundImagePath));
            
            //menambahkan gambar background ke setiap halaman
            pdf.addEventHandler(PdfDocumentEvent.START_PAGE, new PdfBackground(backgroundImagePath));
            
            document.add(new Paragraph("Tabel Publikasi BPS "));
            document.add(new Paragraph(" "));
            

            Table table = new Table(UnitValue.createPercentArray(new float[]{2, 2, 2, 2, 2, 2, 2, 2, 2}));
            table.setWidth(UnitValue.createPercentValue(100));

        // Add headers for each column with background color and border
        String[] headers = {"Judul", "Nomor Katalog", "Nomor Publikasi", "ISSN/ISBN", "Tanggal Rilis", 
            "Ukuran File", "Abstraksi", "Nama File", ""};
        for (String header : headers) {
            DeviceRgb lightBlue = new DeviceRgb(173, 216, 230);
            Cell cell = new Cell().add(new Paragraph(header).setBold().setTextAlignment(TextAlignment.CENTER))
                                      .setBackgroundColor(lightBlue)
                                      .setBorder(new SolidBorder(1));
                table.addHeaderCell(cell);
        }
        
            //add rows data
            for (Publikasi publikasi : publikasiList) {
                table.addCell(createCell(publikasi.getJudul()));
                table.addCell(createCell(publikasi.getNomorKatalog()));
                table.addCell(createCell(publikasi.getNomorPublikasi()));
                table.addCell(createCell(publikasi.getIssnIsbn()));
                table.addCell(createCell(publikasi.getTanggalRilis()));
                table.addCell(createCell(publikasi.getUkuranFile()));
                table.addCell(createCell(publikasi.getAbstraksi()));
                table.addCell(createCell(publikasi.getNamaFile()));
                table.addCell(createCell(" ")); // For extra space
            }
            //add tabel ke dokumen
            document.add(table);
            //menambahkan footer
        document.add(new Paragraph(" "));
        document.add(new Paragraph("Generated by Aplikasi Publikasi BPS").setTextAlignment(TextAlignment.RIGHT).setItalic());
        document.add(new Paragraph("© Rahmadika Kemala Salsabiela (222212828) ").setTextAlignment(TextAlignment.RIGHT).setItalic());
            document.close();
            System.out.println("File PDF berhasil dibuat di: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private class PdfBackground implements IEventHandler {
        private String imagePath;

        public PdfBackground(String imagePath) {
            this.imagePath = imagePath;
        }


        public void handleEvent(Event event) {
            PdfDocumentEvent docEvent = (PdfDocumentEvent) event;
            PdfDocument pdfDoc = docEvent.getDocument();
            PdfPage page = docEvent.getPage();
            PdfCanvas canvas = new PdfCanvas(page.newContentStreamBefore(), page.getResources(), pdfDoc);
            try {
                canvas.addImage(ImageDataFactory.create(imagePath),
                        0, 0, PageSize.A4.getHeight(), false);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (MalformedURLException ex) {
                Logger.getLogger(CetakFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private Cell createCell(String content) {
        return new Cell().add(new Paragraph(content)).setTextAlignment(TextAlignment.CENTER).setVerticalAlignment(VerticalAlignment.MIDDLE);
    }

    private void cetakKeCSV(String fileName, String savePath, Date startDate, Date endDate) throws java.io.IOException {
    String filePath = savePath + File.separator + fileName + ".csv";

    List<Publikasi> publikasiList = DBConnection.getDataFromPublikasiView(startDate, endDate);

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        // Menulis header CSV
        writer.write("Judul,Nomor Katalog,Nomor Publikasi,ISSN/ISBN,Tanggal Rilis,Ukuran File,Abstraksi,Nama File");
        writer.newLine();

        // Menulis data publikasi ke CSV
        for (Publikasi publikasi : publikasiList) {
                writer.write(escapeCSV(publikasi.getJudul()) + ",");
                writer.write(escapeCSV(publikasi.getNomorKatalog()) + ",");
                writer.write(escapeCSV(publikasi.getNomorPublikasi()) + ",");
                writer.write(escapeCSV(publikasi.getIssnIsbn()) + ",");
                writer.write(escapeCSV(publikasi.getTanggalRilis().toString()) + ",");
                writer.write(escapeCSV(publikasi.getUkuranFile()) + ",");
                writer.write(escapeCSV(publikasi.getAbstraksi()) + ",");
                writer.write(escapeCSV(publikasi.getNamaFile()));
                writer.newLine();
        }

        System.out.println("File CSV berhasil dibuat di: " + filePath);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
    private String escapeCSV(String value) {
        String escapedValue = value;
        if (value.contains(",") || value.contains("\"") || value.contains("\n")) {
            escapedValue = "\"" + value.replace("\"", "\"\"") + "\"";
        }
        return escapedValue;
    }

        
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CetakFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cetakCSVButton;
    private javax.swing.JLabel cetakLabel;
    private javax.swing.JButton cetakPDFButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField namaFileTextField;
    private javax.swing.JButton openFolderButton;
    private com.toedter.calendar.JDateChooser tanggalRilisEndDateChooser;
    private com.toedter.calendar.JDateChooser tanggalRilisStartDateChooser;
    // End of variables declaration//GEN-END:variables
}