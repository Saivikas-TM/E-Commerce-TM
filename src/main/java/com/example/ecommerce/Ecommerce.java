package com.example.ecommerce;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Ecommerce extends Application {
/*This is the auto generated code and app class is the entry point of the java fx app*/
    UserInterface userInterface=new UserInterface();
    @Override
    public void start(Stage stage) throws IOException {
        //launch() internally calls the start() and start() will genetarte and gui.
        Scene scene = new Scene(userInterface.creatContent());
        stage.setTitle("ECommerce");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
        //it will start the main method & it is called from main method it will internally call the start().
    }
}