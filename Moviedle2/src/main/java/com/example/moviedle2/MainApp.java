package com.example.moviedle2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 560);
        stage.setTitle("Moviedle");

        stage.setScene(scene);
        stage.show();
    }
    protected static void losePopUp(Stage stage){
        Button btn = new Button();
        Label lbl = new Label();
        BorderPane root = new BorderPane();

        lbl.setMinWidth(80);
        lbl.setMinHeight(30);
        lbl.setText("Game Over");
        lbl.setTextFill(Color.rgb(150,1,1));
        lbl.setTextAlignment(TextAlignment.CENTER);
        lbl.setFont(Font.font(20));

        btn.setMinWidth(60);
        btn.setMinHeight(30);
        btn.setText("Restart");
        btn.setTextAlignment(TextAlignment.CENTER);
        btn.setFont(Font.font(16));

        BorderPane.setAlignment(lbl, Pos.TOP_CENTER);
        BorderPane.setAlignment(btn, Pos.CENTER);

        VBox vbox = new VBox(100);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(lbl, btn);
        root.setCenter(vbox);

        Scene scene = new Scene(root, 300,200);
        stage.setScene(scene);
        stage.setTitle("Game Over");
        stage.showAndWait();
    }

    protected static void winPopUp(Stage stage){
        Button btn = new Button();
        Label lbl = new Label();
        BorderPane root = new BorderPane();

        lbl.setMinWidth(80);
        lbl.setMinHeight(30);
        lbl.setText("You WON");
        lbl.setTextFill(Color.rgb(1,150,1));
        lbl.setTextAlignment(TextAlignment.CENTER);
        lbl.setFont(Font.font(20));

        btn.setMinWidth(60);
        btn.setMinHeight(30);
        btn.setText("Restart");
        btn.setTextAlignment(TextAlignment.CENTER);
        btn.setFont(Font.font(16));

        BorderPane.setAlignment(lbl, Pos.TOP_CENTER);
        BorderPane.setAlignment(btn, Pos.CENTER);

        VBox vbox = new VBox(100);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(lbl, btn);
        root.setCenter(vbox);

        Scene scene = new Scene(root, 300,200);
        stage.setScene(scene);
        stage.setTitle("You WON");
        stage.showAndWait();
    }

    public static void main(String[] args) {
        launch();
    }
}
