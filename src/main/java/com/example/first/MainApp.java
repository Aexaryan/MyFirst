package com.example.first;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple JavaFX Application");
        Label label = new Label("Hello, JavaFX!");

        Button button = new Button("Click me!");
        button.setOnAction(e -> label.setText("Hello, JavaFX!"));

        StackPane layout = new StackPane();
        layout.getChildren().addAll(label, button);

        Scene scene = new Scene(layout, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}