package lk.ijse.library.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.library.dto.Autor;
import lk.ijse.library.model.AutorModel;

import java.io.IOException;

public class AutorAddFromController {
    @FXML
    private AnchorPane root;

    @FXML
    private JFXTextField txtAutorID;

    @FXML
    private JFXTextField txtAutorName;

    @FXML
    private JFXTextField txtBookID;

    @FXML
    private JFXTextField txtBookName;

    @FXML
    private JFXTextField txtEnterAutorID;


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
        String AutorID = txtAutorID.getText();
        String AutorName = txtAutorName.getText();
        String BookName = txtBookName.getText();
        String BookID = txtBookID.getText();

        Autor autor = new Autor();

        autor.setAutorID(AutorID);
        autor.setAutorName(AutorName);
        autor.setBookName(BookName);
        autor.setBookID(BookID);

        boolean b1 = AutorModel.AutorAdd(autor);

    }
}
