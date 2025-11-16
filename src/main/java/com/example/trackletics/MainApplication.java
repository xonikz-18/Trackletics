package com.example.trackletics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("login-view.fxml"));
        Parent root = fxmlLoader.load();


        Scene scene = new Scene(root);
        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        stage.setTitle("Trackletics");
        stage.setScene(scene);
        stage.show();
    }
}