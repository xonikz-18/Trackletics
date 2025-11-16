package com.example.trackletics;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.security.PrivateKey;

public class LoginController {

    @FXML
    private Button signinBtn;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleSignInClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("home-dashboard-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) signinBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onSignInClicked() {
        String email = emailField.getText();
        String password = passwordField.getText();
        System.out.println("Email: " + email + ", Password: " + password);
    }
}