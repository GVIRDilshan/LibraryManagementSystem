package lk.ijse.library.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.library.dto.Publisher;
import lk.ijse.library.model.PublisherModel;

import java.io.IOException;
import java.time.LocalDate;


public class PublisherAddFromController {
    @FXML
    private AnchorPane root;

    @FXML
    private JFXTextField txtPublisherID;

    @FXML
    private JFXTextField txtPublisherName;

    @FXML
    private JFXTextField txtBookID;

    @FXML
    private JFXTextField txtEnterPbID;


    public void OnBack(ActionEvent actionEvent) {
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

    public void OnDelete(ActionEvent actionEvent) {

    }

    public void OnSearch(ActionEvent actionEvent) {

    }

    public void OnUpdate(ActionEvent actionEvent) {

    }

    public void OnAdd(ActionEvent actionEvent) {
        String PublisherID = txtPublisherID.getText();
        String PublisherName = txtPublisherName.getText();
        String BookID = txtBookID.getText();

        Publisher publisher = new Publisher();

        publisher.setPublisherID(PublisherID);
        publisher.setPublisherName(PublisherName);
        publisher.setPublishDate(String.valueOf(LocalDate.now()));
        publisher.setBookID(BookID);

        boolean P1 = PublisherModel.PublisherAdd(publisher);
    }
}
