package lk.ijse.library.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import lk.ijse.library.dto.Issuse;
import lk.ijse.library.model.IssuseModel;

import java.sql.SQLException;

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


    public void GoIssuse(ActionEvent actionEvent) throws SQLException {

        String IssueseID = txtIssuseID.getText();

        Issuse issuse  = IssuseModel.IssuseSearch(IssueseID);

        lblIssueID.setText(issuse.getIssusId());
        lblBookID.setText(issuse.getBookId());
        lblDueDate.setText(issuse.getDueDate());
        lblIssuseDate.setText(issuse.getIssusDate());
        lblQty.setText(issuse.getIssuseQty());
        lblMemberID.setText(issuse.getMemberId());

    }

    public void GoReturn(ActionEvent actionEvent) throws SQLException {




    }
}
