package lk.ijse.library.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ReturnFromController {
    @FXML
    private AnchorPane root;

    @FXML
    private JFXTextField txtIssuseID;

    @FXML
    private JFXTextField txtReturnID;

    @FXML
    private Label lblIssueID;

    @FXML
    private Label lblBookID;

    @FXML
    private Label lblMemberID;

    @FXML
    private Label lblIssuseDate;

    @FXML
    private Label lblDueDate;

    @FXML
    private Label lblQty;


    public void GoIssuse(ActionEvent actionEvent) {

    }

    public void GoReturn(ActionEvent actionEvent) {

    }
}
