package com.jbunce.holamundofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    private TextField numero1;
    private TextField numero2;

    private Label result;

    @FXML
    protected void onHelloButtonClick() {
        result.setText("Resultado: " + (Integer.parseInt(numero1.getText()) + Integer.parseInt(numero2.getText())));
    }
}