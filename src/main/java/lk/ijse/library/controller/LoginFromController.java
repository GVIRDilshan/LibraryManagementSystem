package lk.ijse.library.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.library.util.Alerts;

import java.io.IOException;

public class LoginFromController {

    @FXML
    private AnchorPane root;

    @FXML
    private JFXTextField txtUserName;

    @FXML
    private JFXTextField txtPassword;

    public void goLogin(ActionEvent actionEvent) {
        String userName = txtUserName.getText();
        String password = txtPassword.getText();

        if (userName.equals("Admin") && password.equals("Admin")){
            try {
                Parent view = FXMLLoader.load(this.getClass().getResource("/view/DashBoardFrom.fxml"));
                Stage primaryStage = (Stage) root.getScene().getWindow();
                Scene scene = new Scene(view);
                primaryStage.setScene(scene);
                primaryStage.centerOnScreen();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Alerts alerts = new Alerts();
            alerts.notification("Sucses login........", "Login");

        }else{
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Login Fail");
            a.showAndWait();
            txtUserName.clear();
            txtPassword.clear();
        }
    }
}
