package com.jmc.calculator;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Suma {

    @FXML
    private Label resultado_lbl;

    @FXML
    private TextField numero1_fld;

    @FXML
    private TextField numero2_fld;

    @FXML
    protected void sumar() {
        String text_fld1 = numero1_fld.getText().trim();
        String text_fld2 = numero2_fld.getText().trim();

        if (text_fld1.isEmpty() || text_fld2.isEmpty()) {
            resultado_lbl.setText("Por favor, ingresa ambos numeros.");
            return;
        }

        try {
            double num1 = Double.parseDouble(text_fld1);
            double num2 = Double.parseDouble(text_fld2);

            double resultado = num1 + num2;
            resultado_lbl.setText(String.valueOf(resultado));

        } catch (NumberFormatException e) {
            resultado_lbl.setText("Entrada invalida. Solo numeros.");
        }
    }

    public void regresar_suma(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.setTitle("CALCULADORAAAAA!");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            resultado_lbl.setText("Error al cargar la vista de la calculadora.");
        }
    }

}
