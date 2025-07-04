package com.jmc.calculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXML;

public class Division {
@FXML
private Label lblResultado;
@FXML
private TextField txt1;
@FXML
    private TextField txt2;

protected void Division(){

    Double num1 = Double.parseDouble(txt1.getText());
    Double num2 = Double.parseDouble(txt2.getText());
    Double resultado = num1/num2;
    lblResultado.setText("EL resultado es: " + resultado);
    }
    public void Regresar(ActionEvent event) {
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
            lblResultado.setText("Error al cargar la vista de la calculadora.");
        }
    }
}
