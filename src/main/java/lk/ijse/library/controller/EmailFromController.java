package lk.ijse.library.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import lk.ijse.library.dto.Member;
import lk.ijse.library.model.MemberModel;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class EmailFromController implements Initializable {
    @FXML
    private AnchorPane root;

    @FXML
    private JFXTextArea txtWriteEmail;

    @FXML
    private JFXComboBox<?> cmdSelectEmail;

    public void OnSelectEmail(ActionEvent actionEvent) throws SQLException {
        Member member = MemberModel.searchFrom((String) cmdSelectEmail.getValue());

    }

    public void OnSend(ActionEvent actionEvent) {

    }
    public void loadAllEmail() throws SQLException {
        ArrayList<String> EmailIds = MemberModel.loadAllMemberEmails();

        ObservableList mails = FXCollections.observableArrayList();

        for (String id : EmailIds){
            mails.add(id);
        }
        cmdSelectEmail.setItems(mails);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            loadAllEmail();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
