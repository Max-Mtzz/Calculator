package com.jmc.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {
    @FXML
    private Label error_lbl;

    @FXML
    protected void sum(ActionEvent event) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Suma.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.setTitle("Suma");
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
            error_lbl.setText("Error.");
        }
    }

    @FXML
    protected void rest(ActionEvent event) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Resta.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.setTitle("Resta");
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
            error_lbl.setText("Error.");
        }
    }

    @FXML
    protected void mult(ActionEvent event) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Multiplicacion.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.setTitle("Multiplicacion");
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
            error_lbl.setText("Error.");
        }
    }

    @FXML
    protected void div(ActionEvent event) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Division.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.setTitle("Division");
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
            error_lbl.setText("Error.");
        }
    }

}