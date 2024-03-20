package com.jbunce.holamundofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML private Label welcomeText;
    @FXML private TextField numero1;
    @FXML private TextField numero2;
    @FXML private Label result;

    @FXML
    protected void onHelloButtonClick() {
        result.setText("Resultado: " + (Integer.parseInt(numero1.getText()) + Integer.parseInt(numero2.getText())));
    }
}