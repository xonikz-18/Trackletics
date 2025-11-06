package com.example.trackletics;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    public void initialize() {
        // Any setup code
    }

    @FXML
    protected void onSignInClicked() {
        String email = emailField.getText();
        String password = passwordField.getText();
        System.out.println("Email: " + email + ", Password: " + password);
    }
}
