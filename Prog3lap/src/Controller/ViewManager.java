/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author hamza qannita
 */
public class ViewManager {

    private static ViewManager instance;
    private static final String LOGIN_PAGE_FXML = "/view/LoginPage.fxml";
    private static final String SYSTEM_PAGE_FXML = "/view/SystemPage.fxml";

    private Stage primaryStage;

    public ViewManager(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public static ViewManager getInstance() {
        if (instance == null) {

        }
        return instance;
    }

    public void showLoginPage() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(LOGIN_PAGE_FXML));
            Scene scene = new Scene(loader.load());
            primaryStage.setScene(scene);
            primaryStage.setTitle("Login Page...");
            primaryStage.initStyle(StageStyle.DECORATED);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showSystemPage() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(SYSTEM_PAGE_FXML));
            Scene scene = new Scene(loader.load());
            primaryStage.setScene(scene);
            primaryStage.setTitle("Currency Conversion System...");
            primaryStage.initStyle(StageStyle.DECORATED);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
