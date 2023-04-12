package lk.ijse.library.controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.library.dto.Issuse;
import lk.ijse.library.dto.Member;
import lk.ijse.library.model.MemberModel;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static com.sun.javafx.scene.control.skin.Utils.getResource;

public class DashBoardFromController implements Initializable {

    @FXML
    private AnchorPane root;

    @FXML
    private AnchorPane MainPane;

    @FXML
    private AnchorPane dashBoardPane;
    @FXML
    private Label lblTopic;

    @FXML
    private TableView<?> tblIssuse;

    @FXML
    private TableColumn<?, ?> coliid;

    @FXML
    private TableColumn<?, ?> colBookId;

    @FXML
    private TableColumn<?, ?> colIssuseDate;

    @FXML
    private TableColumn<?, ?> colMemberID;

    @FXML
    private TableColumn<?, ?> colDueDate;

    @FXML
    private TableColumn<?, ?> colIssuseQty;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tblIssuse.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>(" iid"));
        tblIssuse.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("book_Id"));
        tblIssuse.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("issus_date"));
        tblIssuse.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("member_Id"));
        tblIssuse.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        tblIssuse.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("issuse_Qty"));

        ArrayList<Issuse> issuses;
        //  try {
        //   issuses = MemberModel.loadAllMember();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        tblIssuse.setItems(FXCollections.observableArrayList(members));
    }


    public void GoMember(javafx.event.ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/MemberManageFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("MemberFrom");
    }

    public void GoBook(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/BookManageFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("BookFrom");
    }

    public void GoIssuse(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/IssuseFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("IssuseFrom");
    }

    public void GoReturn(ActionEvent actionEvent) {

    }

    public void goAutor(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/AutorAddFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("AutorFrom");
    }

    public void GoPublishers(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/PublisherAddFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("PublisherFrom");
    }

    public void GoSuppliers(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/SupplierAddFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("Supplier From");

    }

    public void GoDashBoard(ActionEvent actionEvent) throws IOException {
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

    public void GetReport(ActionEvent actionEvent) {

    }

    public void getEmail(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/EmailFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("Send Email");
    }
}



