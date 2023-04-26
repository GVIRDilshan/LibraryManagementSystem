//package lk.ijse.library.controller;
//
//import com.jfoenix.controls.JFXButton;
//import com.jfoenix.controls.JFXTextField;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Button;
//import javafx.scene.control.ButtonType;
//import lk.ijse.library.dto.User;
//import lk.ijse.library.model.UserModel;
//import lk.ijse.library.util.Alerts;
//
//import java.sql.SQLException;
//
//public class LoginFrom2Controller {
//
//    @FXML
//    private JFXTextField userNameTxt;
//
//    @FXML
//    private JFXTextField passwordTxt;
//
//    @FXML
//    private JFXTextField confirmPasswordTxt;
//
//    @FXML
//    private JFXButton saveBtn;
//
//    @FXML
//    void saveBtnOnAction(ActionEvent event) {
//        /*if (!passwordTxt.getText().equals(confirmPasswordTxt)){
//            new Alert(Alert.AlertType.ERROR ,
//                    "Pasword Confirm error" ,
//                    ButtonType.OK
//            );
//            return;
//        }
//
//        try {
//            boolean isUpdated = UserModel.updateUser(new User(
//                        userNameTxt.getText() ,
//                        passwordTxt.getText()
//                    )
//            );
//
//            if (isUpdated){
//
//
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }*/
//    }
//
//}
