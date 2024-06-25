/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.itextpdf.io.IOException;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Rahmadika Kemala Salsabiela 
 */

public class PublikasiController {
    private final PublikasiModel model;
    private final PublikasiView view;

    public PublikasiController(PublikasiModel model, PublikasiView view) {
        this.model = model;
        this.view = view;
        view.setController(this); // Set controller for the view
        refreshTable(); // Refresh table when controller is initialized
    }


    public void addPublikasi(Publikasi publikasi) {
        model.addPublikasi(publikasi);
        refreshTable();
    }

    public void editPublikasi(Publikasi publikasi) {
        model.editPublikasi(publikasi);
        refreshTable();
    }

    public void deletePublikasi(String nomorPublikasi) {
        model.deletePublikasi(nomorPublikasi);
        refreshTable();
    }

    public void searchPublikasi(String keyword) {
        List<Publikasi> publikasiList = model.searchPublikasi(keyword);
        view.updateTable(publikasiList);
    }

    public void getAllPublikasi() {
        List<Publikasi> publikasiList = model.getAllPublikasi();
        view.updateTable(publikasiList);
    }
    
    public void updatePublikasi(Publikasi publikasi, String nomorPublikasi) {
    model.updatePublikasi(publikasi, nomorPublikasi);
    refreshTable();
    }

    private void refreshTable() {
        getAllPublikasi(); // Refresh table by getting all data from model
    }

    public Publikasi getPublikasiByNomor(String nomorPublikasi) {
    return model.getPublikasiByNomor(nomorPublikasi);
}

  
}