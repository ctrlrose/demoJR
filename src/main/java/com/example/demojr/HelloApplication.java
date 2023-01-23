package com.example.demojr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Text Htext = new Text();
        Htext.setText("Dateneingabe");

        Htext.setX(70);
        Htext.setY(30);

        Text lbl1= new Text("Name");
        Text lbl2= new Text("Datum");

        TextField text1= new TextField();
        TextField text2= new TextField();

        Button button= new Button("Einreichen");

        GridPane gridPane= new GridPane();

        gridPane.setMinSize(350, 150);
        gridPane.setPadding(new Insets(10, 10, 10,10));

        gridPane.setVgap(5);
        gridPane.setHgap(5);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(lbl1, 0, 0);
        gridPane.add(lbl2, 0, 1);
        gridPane.add(text1, 1, 0);
        gridPane.add(text2, 1, 1);
        gridPane.add(button, 0, 2);

        Scene scene = new Scene(gridPane);
        stage.setTitle("Aufgabe demo!");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
