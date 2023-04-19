/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
public class LoginController {

    @FXML
    private Button btn_login;

    @FXML
    private Label login_lab;

    @FXML
    private TextField pass_txtF;

    @FXML
    private Label password_lab;

    @FXML
    private Label test_masseg_lab;

    @FXML
    private Label user_lab;

    @FXML
    private TextField user_txtF;

    @FXML
    void btn_login(ActionEvent event) throws IOException {
        if (user_txtF.getText().equals("hamza")
                && pass_txtF.getText().equals("10203040")) {
            test_masseg_lab.setText("Valid User");

          FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/SystemPage.fxml"));
        Parent root = loader.load();
        Stage primaryStage = new Stage();
         
        Scene scene = new Scene(root);

         
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Page");

        
        primaryStage.show();

        } else {
            test_masseg_lab.setText("Invalid Data");
        }
    }

}
