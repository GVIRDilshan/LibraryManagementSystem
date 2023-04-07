package lk.ijse.library.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class IssuseFromController {
    @FXML
    private AnchorPane root;

    @FXML
    private JFXComboBox<?> cmbBookID;

    @FXML
    private JFXComboBox<?> cmbMemberID;

    @FXML
    private Label lblBookName;

    @FXML
    private Label lblLocalDate;

    @FXML
    private Label lblMemberName;

    @FXML
    private Label lblQty;

    @FXML
    private Label lblContact;

    @FXML
    private JFXTextField txtIssuseID;

    @FXML
    private JFXTextField txtQty;

    @FXML
    void OnBack(ActionEvent event) {
        try {
            Parent view = FXMLLoader.load(this.getClass().getResource("/view/DashBoardFrom.fxml"));
            Stage primaryStage = (Stage) root.getScene().getWindow();
            Scene scene = new Scene(view);
            primaryStage.setScene(scene);
            primaryStage.centerOnScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void OnIssuse(ActionEvent event) {

    }

    @FXML
    void OnSelectBookID(ActionEvent event) {

    }

    @FXML
    void OnSelectMemberID(ActionEvent event) {

    }
}
