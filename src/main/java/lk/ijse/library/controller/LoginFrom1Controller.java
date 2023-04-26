//package lk.ijse.library.controller;
//
//import com.jfoenix.controls.JFXButton;
//import com.jfoenix.controls.JFXTextField;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//
//public class LoginFrom1Controller {
//
//    @FXML
//    private JFXTextField otpTxt;
//
//    @FXML
//    private JFXButton recoverBtn;
//
//    @FXML
//    void recoverBtnOnAction(ActionEvent event) throws IOException {
//        if (LoginFromController.otpNumber == Integer.valueOf(otpTxt.getText())){
//            Parent view = FXMLLoader.load(this.getClass().getResource("/view/loginFrom2.fxml"));
//            Stage primaryStage = (Stage) LoginFromController.rootCopy.getScene().getWindow();
//            Scene scene = new Scene(view);
//            primaryStage.setScene(scene);
//            primaryStage.centerOnScreen();
//
//        }
//
//    }
//
//}
