/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaproyek1;

import java.net.URL;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javax.swing.JOptionPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.DatePicker;
import javafx.scene.paint.Color;

/**
 *
 * @author ARIFIN
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button Button2;
    
    @FXML
    private Button button;
    
    @FXML
    private Label judul;

    @FXML
    private Label lnama;

    @FXML
    private TextField editnama;
    
    @FXML
    private Label lalamat;

    @FXML
    private TextField editalamat;

    @FXML
    private Label Lberat;

    @FXML
    private TextField editberat;

    @FXML
    private Label LTelepon;

    @FXML
    private TextField edittelepon;
    
     @FXML
    private Label LPaket;

    @FXML
    private RadioButton rdCK;

    @FXML
    private RadioButton rdCKS;

    @FXML
    private RadioButton rdS;
    
    @FXML
    private TextArea textKonfirmasi;
    
    @FXML
    private Button ButtonHapus;
    @FXML
    private Label Ltanggal;

    @FXML
    private DatePicker tanggalambil;
    
    @FXML
    private Label Lkg;
    @FXML
    private TextField edittanggal;
   


    @FXML
    void Klikkedua(ActionEvent event) {
        String paket;
        int harga = 0;
        
        
        
        if(editnama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Nama");
        }else if(editalamat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Alamat");
        }else if(editberat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Berat laundry");
        }else if(edittelepon.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Nomor Telepon");
        }else if (edittanggal.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Tanggal ambil");
        }
        if(rdCK.isSelected())
        paket = "Cuci Kering";
        else if (rdCKS.isSelected())
        paket = "Cuci Kering Setrika";
        else if (rdS.isSelected())
        paket = "Setrika";
        else
        paket = "";
        
        if(!(rdCK.isSelected() || rdCKS.isSelected() || rdS.isSelected() )){
            JOptionPane.showMessageDialog(null, "Harap pilih paket layanan");
        }else{
        String nama = editnama.getText();
        String alamat = editalamat.getText();
        String berat = editberat.getText() + " kg";
        String tanggal = edittanggal.getText();
        
        int hitung = Integer.parseInt(editberat.getText());
        
        if (rdCK.isSelected())
        harga = hitung*5000;
        if (rdCKS.isSelected())
        harga = hitung*8000;
        if (rdS.isSelected())
        harga = hitung*4000;
        String nohp = edittelepon.getText();
        
            textKonfirmasi.setText("Nama : " +nama+"\n"+"Alamat : " +alamat+"\n"+"Berat Laundry : " +berat+"\n"+"Nomor Telepon : "+ 
                nohp+"\n"+"Pilihan Paket : " +paket+"\n"+"Tanggal Pengambilan : "+tanggal+"\n"+"Pembayaran yang harus dibayar : Rp. " +harga);              
        }        
        

    }
    
    @FXML
    void hapusIsian(ActionEvent event) {
        
        editnama.setText("");
        editalamat.setText("");
        editberat.setText("");
        edittelepon.setText("");
        rdCK.setSelected(false);
        rdCKS.setSelected(false);
        rdS.setSelected(false); 
        edittanggal.setText("");
        textKonfirmasi.setText("");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
