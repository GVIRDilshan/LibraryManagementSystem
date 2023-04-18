package lk.ijse.library.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import lk.ijse.library.dto.Issuse;
import lk.ijse.library.dto.Return;
import lk.ijse.library.model.IssuseModel;
import lk.ijse.library.model.ReturnModel;


import java.sql.SQLException;
import java.time.LocalDate;

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

        String IssuseId = txtIssuseID.getText();
        String ReturnId = txtReturnID.getText();
        String ReturnDate = String.valueOf(LocalDate.now());
        String BookId = lblBookID.getText();
        String IssuseDate = lblIssuseDate.getText();
        String BookQty = lblQty.getText();


        Return return1 = new Return();
        return1.setIssuseId(IssuseId);
        return1.setReturnId(ReturnId);
        return1.setReturnDate(ReturnDate);
        return1.setBookId(BookId);
        return1.setIssuseDate(IssuseDate);

        boolean b1 = ReturnModel.ReturnSet(return1,BookQty,BookId,IssuseId);
        System.out.println(return1.getIssuseId()+" "+return1.getReturnId()+" "+return1.getBookId()+" " +
                " "+return1.getReturnDate()+" "+return1.getIssuseDate());

    }
}
