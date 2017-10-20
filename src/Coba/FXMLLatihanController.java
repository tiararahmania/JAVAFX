/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coba;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Umi Tiara
 */
public class FXMLLatihanController implements Initializable {

    @FXML
    private TextField nama;
    @FXML
    private TextField alamat;
    @FXML
    private TextField absen;
    @FXML
    private TextField telepon;
    @FXML
    private Button proses;
    @FXML
    private TextArea hasil;
    
    @FXML
    private Button hapus;

     
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
     void Proses(ActionEvent event) {
        String NAMA = nama.getText();
        String ABSEN = absen.getText();
        String ALAMAT = alamat.getText();
        String TELEPON = telepon.getText();
        
        hasil.setText("Nama Anda : "+NAMA+"\n"+"Absen Anda : "+ABSEN+"\n"+"Alamat Anda : "+ALAMAT+"\n"+"Telepon Anda : "+TELEPON+"\n");
    }
    @FXML
     void Hapus(ActionEvent event) {
        hasil.setText("");
        nama.setText("");
        absen.setText("");
        alamat.setText("");
        telepon.setText("");
    }
    }
    

