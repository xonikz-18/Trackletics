package com.example.trackletics;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LoseBellyFatController {

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
    private Button dayOneBellyBtn;

    @FXML
    private void handleDayOneBellyClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("lose-belly-fat-day1-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayOneBellyBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayTwoBellyBtn;

    @FXML
    private void handleDayTwoBellyClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("lose-belly-fat-day2-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayTwoBellyBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayThreeBellyBtn;

    @FXML
    private void handleDayThreeBellyClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("lose-belly-fat-day3-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayThreeBellyBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayFourBellyBtn;

    @FXML
    private void handleDayFourBellyClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("lose-belly-fat-day4-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayFourBellyBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayFiveBellyBtn;

    @FXML
    private void handleDayFiveBellyClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("lose-belly-fat-day5-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayFiveBellyBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button daySevenBellyBtn;

    @FXML
    private void handleDaySevenBellyClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("lose-belly-fat-day7-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) daySevenBellyBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayEightBellyBtn;

    @FXML
    private void handleDayEightBellyClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("lose-belly-fat-day8-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayEightBellyBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayNineBellyBtn;

    @FXML
    private void handleDayNineBellyClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("lose-belly-fat-day9-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayNineBellyBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayTenBellyBtn;

    @FXML
    private void handleDayTenBellyClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("lose-belly-fat-day10-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayTenBellyBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button dayElevenBellyBtn;

    @FXML
    private void handleDayElevenBellyClick () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("lose-belly-fat-day11-view.fxml"));
        Scene scene = new Scene(loader.load());

        String styleCss = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        Stage stage = (Stage) dayElevenBellyBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
