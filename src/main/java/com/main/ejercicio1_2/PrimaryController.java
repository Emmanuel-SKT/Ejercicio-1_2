package com.main.ejercicio1_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private TextField txtDinero;
    @FXML
    private Button btnLimpiar;
    @FXML
    private Button btnDesglosar;
    @FXML
    private TextArea txtNombres;
    @FXML
    private TextArea txtCantidades;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void btnDesglosarOnAction(ActionEvent event) {
        int cantidad = Integer.parseInt(txtDinero.getText());
        int aux = cantidad;
        
        int b500 = aux / 500;
        aux = aux % 500;
        
        int b200 = aux / 200;
        aux = aux % 200;
        
        int b100 = aux / 100;
        aux = aux % 100;
        
        int b50 = aux / 50;
        aux = aux % 50;
        
        int b20 = aux / 20;
        aux = aux % 20;
        
        int m10 = aux / 10;
        aux = aux % 10;
        
        int m5 = aux / 5;
        aux = aux % 5;
        
        int m2 = aux / 2;
        aux = aux % 2;
        
        int m1 = aux;
        
        String nombres = "Billetes de $500\n"
                       + "Billetes de $200\n"
                       + "Billetes de $100\n"
                       + "Billetes de $50\n"
                       + "Billetes de $20\n"
                       + "Monedas de $10\n"
                       + "Monedas de $5\n"
                       + "Monedas de $2\n"
                       + "Monedas de $1";
                       
        String valores = b500 + "\n"
                       + b200 + "\n"
                       + b100 + "\n"
                       + b50 + "\n"
                       + b20 + "\n"
                       + m10 + "\n"
                       + m5 + "\n"
                       + m2 + "\n"
                       + m1;
                       
        txtNombres.setText(nombres);
        txtCantidades.setText(valores);
    }

    @FXML
    private void btnLimpiarOnAction(ActionEvent event) {
        txtDinero.setText("");
        txtNombres.setText("");
        txtCantidades.setText("");
    }
}