package com.example.demojr;

import com.almasb.fxgl.input.Input;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    private Input name;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hello!");
    }
}