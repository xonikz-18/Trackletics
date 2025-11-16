package com.example.trackletics;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class HomeDashboardController {

    @FXML
    private Button quickSleepBtn;

    @FXML
    private void handleQuickSleepClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sleepnhydration-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) quickSleepBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button quickMealBtn;

    @FXML
    private void handleQuickMealClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("log-meal-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) quickMealBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button quickWorkoutBtn;

    @FXML
    private void handleQuickWorkoutClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("workout-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) quickWorkoutBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
