package com.example.trackletics;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class BuildMuscleStrengthController {

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
    private Button dayOneMuscleBtn;

    @FXML
    private void handleDayOneMuscleClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("build-muscle-strength-day1-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayOneMuscleBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayTwoMuscleBtn;

    @FXML
    private void handleDayTwoMuscleClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("build-muscle-strength-day2-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayTwoMuscleBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayThreeMuscleBtn;

    @FXML
    private void handleDayThreeMuscleClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("build-muscle-strength-day3-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayThreeMuscleBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayOneMuscleBtn;

    @FXML
    private void handleDayOneMuscleClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("build-muscle-strength-day1-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayOneMuscleBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayOneMuscleBtn;

    @FXML
    private void handleDayOneMuscleClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("build-muscle-strength-day1-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayOneMuscleBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayTwoMuscleBtn;

    @FXML
    private void handleDayOneMuscleClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("build-muscle-strength-day2-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayTwoMuscleBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayThreeMuscleBtn;

    @FXML
    private void handleDayOneMuscleClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("build-muscle-strength-day3-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayThreeMuscleBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayFiveMuscleBtn;

    @FXML
    private void handleDayOneMuscleClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("build-muscle-strength-day5-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayFiveMuscleBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayOneMuscleBtn;

    @FXML
    private void handleDayOneMuscleClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("build-muscle-strength-day1-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayOneMuscleBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayOneMuscleBtn;

    @FXML
    private void handleDayOneMuscleClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("build-muscle-strength-day1-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayOneMuscleBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
