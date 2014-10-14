package com.logiconix.nofs.taskapp;

import com.logiconix.nofs.taskapp.application.Session;
import com.logiconix.nofs.taskapp.ui.DesktopUserInterface;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by Michael on 10/7/2014.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Session session = new Session();
        DesktopUserInterface ui = new DesktopUserInterface(session);

        Scene scene = ui.getApplicationScene();

        primaryStage.setTitle(Session.APPLICATION_TITLE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
