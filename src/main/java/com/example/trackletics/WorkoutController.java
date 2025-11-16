package com.example.trackletics;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class WorkoutController {

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

    @FXML
    private Button bellyWorkoutBtn;

    @FXML
    private void handleBellyWorkoutClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("lose-belly-fat-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) bellyWorkoutBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button buttWorkoutBtn;

    @FXML
    private void handleButtWorkoutClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("butt-lift-tone-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) buttWorkoutBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button weightWorkoutBtn;

    @FXML
    private void handleWeightWorkoutClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("lose-weight-keep-fit-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) weightWorkoutBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button muscleWorkoutBtn;

    @FXML
    private void handleMuscleWorkoutClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("build-muscle-strength-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) muscleWorkoutBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}

