package com.example.trackletics;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class HomeDashboardController {

    @FXML
    private Button homeNavBtn;

    @FXML
    private void handleHomeNavClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("home-dashboard-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) homeNavBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button nutritionNavBtn;

    @FXML
    private void handleNutritionNavClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("nutrition-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) nutritionNavBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button workoutNavBtn;

    @FXML
    private void handleWorkoutNavClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("workout-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) workoutNavBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button sleepnhydrationNavBtn;

    @FXML
    private void handleSleepnhydrationNavClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sleepnhydration-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) sleepnhydrationNavBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

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

    @FXML
    private Button settingsNavBtn;

    @FXML
    private void handleSettingsNavClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("settings-profile-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) settingsNavBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
