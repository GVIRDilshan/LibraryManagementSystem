package lk.ijse.library.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void GoMember(javafx.event.ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/MemberManageFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("MemberFrom");
//        try {
//            Parent view = FXMLLoader.load(this.getClass().getResource("/view/MemberManageFrom.fxml"));
//            Stage primaryStage = (Stage) root.getScene().getWindow();
//            Scene scene = new Scene(view);
//            primaryStage.setScene(scene);
//            primaryStage.centerOnScreen();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public void GoBook(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/BookManageFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("BookFrom");
//        try {
//            Parent view = FXMLLoader.load(this.getClass().getResource("/view/BookManageFrom.fxml"));
//            Stage primaryStage = (Stage) root.getScene().getWindow();
//            Scene scene = new Scene(view);
//            primaryStage.setScene(scene);
//            primaryStage.centerOnScreen();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public void GoIssuse(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/IssuseFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("IssuseFrom");
//        try {
//            Parent view = FXMLLoader.load(this.getClass().getResource("/view/IssuseFrom.fxml"));
//            Stage primaryStage = (Stage) root.getScene().getWindow();
//            Scene scene = new Scene(view);
//            primaryStage.setScene(scene);
//            primaryStage.centerOnScreen();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public void GoReturn(ActionEvent actionEvent) {

    }

    public void goAutor(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/AutorAddFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("AutorFrom");
//        try {
//            Parent view = FXMLLoader.load(this.getClass().getResource("/view/AutorAddFrom.fxml"));
//            Stage primaryStage = (Stage) root.getScene().getWindow();
//            Scene scene = new Scene(view);
//            primaryStage.setScene(scene);
//            primaryStage.centerOnScreen();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public void GoPublishers(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/PublisherAddFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("PublisherFrom");
//        try {
//            Parent view = FXMLLoader.load(this.getClass().getResource("/view/PublisherAddFrom.fxml"));
//            Stage primaryStage = (Stage) root.getScene().getWindow();
//            Scene scene = new Scene(view);
//            primaryStage.setScene(scene);
//            primaryStage.centerOnScreen();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public void GoSuppliers(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/SupplierAddFrom.fxml"));
        MainPane.getChildren().setAll(node);
//        try {
//            Parent view = FXMLLoader.load(this.getClass().getResource("/view/SupplierAddFrom.fxml"));
//            Stage primaryStage = (Stage) root.getScene().getWindow();
//            Scene scene = new Scene(view);
//            primaryStage.setScene(scene);
//            primaryStage.centerOnScreen();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
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
}



