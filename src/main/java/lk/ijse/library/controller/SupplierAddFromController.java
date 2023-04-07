package lk.ijse.library.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.library.dto.Supplier;
import lk.ijse.library.model.SupplierModel;

import java.io.IOException;

public class SupplierAddFromController {
    @FXML
    private AnchorPane root;

    @FXML
    private JFXTextField txtSupllierID;

    @FXML
    private JFXTextField txtSupplierName;

    @FXML
    private JFXTextField txtContact;

    @FXML
    private JFXTextField txtBookID;

    @FXML
    private JFXTextField txtSupplierAddress;

    @FXML
    private JFXTextField txtSearchID;

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

    public void OnAdd(ActionEvent actionEvent) {
        String SupplierID = txtSupllierID.getText();
        String SupplierName = txtSupplierName.getText();
        String SupplierAddress = txtSupplierAddress.getText();
        String SupplierContact = txtContact.getText();
        String BookID = txtBookID.getText();

        Supplier supplier = new Supplier();

        supplier.setSupplierID(SupplierID);
        supplier.setSupplierName(SupplierName);
        supplier.setSupplierAddress(SupplierAddress);
        supplier.setSupplierContact(SupplierContact);
        supplier.setBookID(BookID);

        boolean S1 = SupplierModel.SupplierAdd(supplier);

    }

    public void OnUpdate(ActionEvent actionEvent) {

    }

    public void OnDelete(ActionEvent actionEvent) {

    }

    public void OnSearch(ActionEvent actionEvent) {

    }
}