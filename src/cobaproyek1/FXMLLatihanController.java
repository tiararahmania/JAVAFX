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
 * @author Umi Tiara
 */
public class FXMLLatihanController {

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
    void Proses(ActionEvent event) {
        String NAMA = nama.getText();
        String ABSEN = absen.getText();
        String ALAMAT = alamat.getText();
        String TELEPON = telepon.getText();
        
        hasil.setText("Nama Anda : "+NAMA+"\n"+"Absen Anda : "+ABSEN+"\n"+"Alamat Anda : "+ALAMAT+"\n"+"Telepon Anda : "+"\n");
    }
}
