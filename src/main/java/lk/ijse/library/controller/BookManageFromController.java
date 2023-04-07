package lk.ijse.library.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.library.dto.Autor;
import lk.ijse.library.dto.Book;
import lk.ijse.library.model.AutorModel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BookManageFromController implements Initializable {

    @FXML
    private AnchorPane root;

    @FXML
    private JFXTextField txtBookID;

    @FXML
    private JFXTextField txtBookName;

    @FXML
    private JFXTextField txtBookQty;

    @FXML
    private JFXComboBox<?> cmbPulisherID;

    @FXML
    private JFXComboBox<?> cmbSupplierId;

    @FXML
    private JFXComboBox<?> cmbAutorId;

    @FXML
    void OnAdd(ActionEvent event) {
        String BookID = txtBookID.getText();
        String BookName = txtBookName.getText();
        int Qty = Integer.parseInt(txtBookQty.getText());

        Book book = new Book();

        book.setId(BookID);
        book.setName(BookName);
        book.setQty(Qty);
        book.setAuthor(String.valueOf(cmbAutorId.getValue()));

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

    @FXML
    void OnSelectPulisherID(ActionEvent event) {

    }

    @FXML
    void OnSelectSuplierId(ActionEvent event) {

    }

    @FXML
    void onSelectAutorId(ActionEvent event) {
       // Autor autor = AutorModel.
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AutorModel.loadAllAutorIds();
    }

    public void OnUpdate(ActionEvent actionEvent) {

    }

    public void OnDelete(ActionEvent actionEvent) {

    }

    public void OnSearch(ActionEvent actionEvent) {

    }
}
