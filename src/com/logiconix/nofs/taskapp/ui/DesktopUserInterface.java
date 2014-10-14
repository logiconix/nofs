package com.logiconix.nofs.taskapp.ui;

import com.logiconix.nofs.taskapp.application.Session;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

import java.io.IOException;

/**
 * Created by Michael on 10/14/2014.
 */
public class DesktopUserInterface {
    private Session m_session;
    private Scene m_applicationScene;

    public DesktopUserInterface(Session session) {
        m_session = session;
        m_applicationScene = null;
    }

    public Scene getApplicationScene() throws IOException {
        if (m_applicationScene == null)
            initializeApplicationScene();

        return m_applicationScene;
    }

    private void initializeApplicationScene() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("application.fxml"));
        m_applicationScene = new Scene(root, 800, 600, Color.BLACK);
    }
}
