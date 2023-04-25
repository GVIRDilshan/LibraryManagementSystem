package lk.ijse.library.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import lk.ijse.library.dto.Donetion;
import lk.ijse.library.model.DonetionModel;

import java.sql.SQLException;

public class DonetionFromController {
    @FXML
    private AnchorPane root;

    @FXML
    private JFXTextField txtDonetionID;

    @FXML
    private JFXTextField txtAmmount;

    @FXML
    private JFXTextArea txtReview;

    @FXML
    private JFXTextField txtDonetBy;

    @FXML
    private JFXComboBox<?> cmbExibitionID;

    public void btnOnAdd(ActionEvent actionEvent) throws SQLException {
        String donetionID = txtDonetionID.getText();
        String ammount = txtAmmount.getText();
        String review = txtReview.getText();
        String donetBy = txtDonetBy.getText();
        String exibitionID = String.valueOf(cmbExibitionID.getValue());

        Donetion donetion = new Donetion();
        donetion.setDonetionId(donetionID);
        donetion.setDonetionName(donetBy);
        donetion.setAmmount(Integer.parseInt(ammount));
        donetion.setReview(review);
        donetion.setExibitionId(exibitionID);

        boolean d1 = DonetionModel.DonetionAdd(donetion);
    }

    public void onSelectCmbExibitonID(ActionEvent actionEvent) {

    }
}
