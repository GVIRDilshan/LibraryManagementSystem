package lk.ijse.library.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.library.dto.Member;
import lk.ijse.library.model.MemberModel;
import lk.ijse.library.util.Alerts;

import java.io.IOException;
import java.sql.SQLException;

public class MemberManageFromController {
    @FXML
    private AnchorPane root;

    @FXML
    private JFXTextField txtMemberId;

    @FXML
    private JFXTextField txtMemberName;

    @FXML
    private JFXTextField txtMemberAddress;

    @FXML
    private JFXTextField txtMemberContact;

    @FXML
    private JFXTextField txtMemberAge;

    @FXML
    private JFXTextField txtMemberEmail;

    @FXML
    private JFXTextField txtMemberGender;

    @FXML
    private JFXTextField txtMemberIdSearch;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl3;

    @FXML
    private Label lbl4;

    @FXML
    private Label lbl5;

    @FXML
    private Label lbl6;

    @FXML
    private Label lbl7;

    @FXML
    void OnAdd(ActionEvent event) throws SQLException {
        String memberId = txtMemberId.getText();
        String memberName = txtMemberName.getText();
        String memberAddress = txtMemberAddress.getText();
        int memberAge = Integer.parseInt(txtMemberAge.getText());
        String memberContact = txtMemberContact.getText();
        String memberEmail = txtMemberEmail.getText();
        String memberGender = txtMemberGender.getText();

        Member memberss = new Member();

        memberss.setId(memberId);
        memberss.setName(memberName);
        memberss.setAddress(memberAddress);
        memberss.setAge(memberAge);
        memberss.setContact(memberContact);
        memberss.setEmail(memberEmail);
        memberss.setGender(memberGender);

        boolean member1 = MemberModel.memberAdd(memberss);

        if(member1) {
//            Alerts alerts = new Alerts();
//            alerts.notification("Member Delete Sucses....!", "Memebr Delete");
            clear();
        }

    }

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

    public void OnSearch(ActionEvent actionEvent) throws SQLException {
        String SearchID = txtMemberIdSearch.getText();

        Member m1 = MemberModel.searchFrom(SearchID);

        txtMemberId.setText(m1.getId());
        txtMemberName.setText(m1.getName());
        txtMemberAddress.setText(m1.getAddress());
        txtMemberAge.setText(String.valueOf(m1.getAge()));
        txtMemberEmail.setText(m1.getEmail());
        txtMemberContact.setText(m1.getContact());
        txtMemberGender.setText(m1.getGender());
        
    }

    public void OnUpdate(ActionEvent actionEvent) throws SQLException {
        String memberId = txtMemberId.getText();
        String memberName = txtMemberName.getText();
        String memberAddress = txtMemberAddress.getText();
        String memberContact = txtMemberContact.getText();
        int memberAge = Integer.parseInt(txtMemberAge.getText());
        String memberEmail = txtMemberEmail.getText();
        String memberGender = txtMemberGender.getText();

        Member member = new Member();
        member.setId(memberId);
        member.setName(memberName);
        member.setAddress(memberAddress);
        member.setContact(memberContact);
        member.setAge(memberAge);
        member.setEmail(memberEmail);
        member.setGender(memberGender);

        boolean m2 = MemberModel.updateMember(member);

        if(m2) {
//            Alerts alerts = new Alerts();
//            alerts.notification("Member Delete Sucses....!", "Memebr Delete");
            clear();
        }
    }

    public void OnDelete(ActionEvent actionEvent) throws SQLException {

        String memberID = txtMemberId.getText();

        boolean d1 = MemberModel.deleteFrom(memberID);

        if(d1) {
//            Alerts alerts = new Alerts();
//            alerts.notification("Member Delete Sucses....!", "Memebr Delete");
            clear();
        }

    }
    public void clear(){
        txtMemberId.setText("");
        txtMemberName.setText("");
        txtMemberAddress.setText("");
        txtMemberContact.setText("");
        txtMemberAge.setText("");
        txtMemberEmail.setText("");
        txtMemberGender.setText("");
    }
}
