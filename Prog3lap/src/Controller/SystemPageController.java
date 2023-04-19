/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hamza qannita
 */
public class SystemPageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label Info_lab;

    @FXML
    private Button btn_convert;

    @FXML
    private Button btn_logout;

    @FXML
    private Label nis_lab;

    @FXML
    private TextField nis_txtfiled;

    @FXML
    private Label to_lab;

    @FXML
    private Label error;

    @FXML
    private Label usd_lab;

    @FXML
    private TextField usd_txtfiled;

    @FXML
    void btn_converts(ActionEvent event) {
        String usd = usd_txtfiled.getText();
        String nis = nis_txtfiled.getText();
        if (!usd.isEmpty()) {
            double dollar = Double.parseDouble(usd);
            double Nis = dollar * 3.50;
            nis_txtfiled.setText(String.valueOf(Nis));
        } else if (!nis.isEmpty()) {
            usd_txtfiled.setText("");
            double Nis = Double.parseDouble(nis);
            double dollar = Nis / 3.50;
            usd_txtfiled.setText(String.valueOf(dollar));
        } else {
            error.setText("Write at least one coin ?? USD or NIS");
        }
    }

    @FXML
    void btn_logout(ActionEvent event
    ) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/login.fxml"));
        Parent root = loader.load();
        Stage primaryStage = new Stage();

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Page");

        primaryStage.show();

    }

    @FXML
    void nis_txtfiled(ActionEvent event
    ) {

    }

    @FXML
    void usd_txtfiled(ActionEvent event
    ) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources
    ) {
    }

}
