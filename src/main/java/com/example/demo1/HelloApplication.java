package com.example.demo1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        GridPane mainPane = new GridPane();
        BorderPane MainG = new BorderPane();



        TextArea chatText = new TextArea();
        chatText.setPrefHeight(730);
        chatText.setPrefWidth(590);
        TextArea sendText = new TextArea();
        sendText.setPrefHeight(10);
        sendText.setPrefWidth(500);

        mainPane.add(chatText, 0, 0 );
        mainPane.add(sendText, 0, 1);

        Button send = new Button("Send");
        Button ring = new Button("Ring");

        Label iplbl = new Label("IP address: ");
        TextField iptxt = new TextField("127.0.0.1");
        Label portlbl = new Label("Port: ");
        TextField porttxt = new TextField("1234");




        ObservableList<String> options =
                FXCollections.observableArrayList(
                        "Select who you are!",
                        "Server",
                        "Client"
                );
        final ComboBox comboBox = new ComboBox(options);
        comboBox.getSelectionModel().selectFirst();


        VBox vbox = new VBox(8);
        vbox.getChildren().addAll(chatText, sendText, send, ring, comboBox, iplbl, iptxt, portlbl, porttxt);
        Scene scene = new Scene(vbox, 600 , 800);
        stage.setTitle("Chat App!");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}