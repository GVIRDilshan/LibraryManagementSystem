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
import java.sql.SQLException;

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

    public void OnAdd(ActionEvent actionEvent) throws SQLException {
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
        String SupplierID      =  txtSupllierID.getText();
        String SupplierName    =  txtSupplierName.getText();
        String SupplierContact =  txtContact.getText();
        String SupplierAddress =  txtSupplierAddress.getText();
        String BookID          =  txtBookID.getText();

        Supplier supplier = new Supplier();
        supplier.setSupplierID(SupplierID);
        supplier.setSupplierName(SupplierName);
        supplier.setSupplierContact(SupplierContact);
        supplier.setSupplierAddress(SupplierAddress);
        supplier.setBookID(BookID);


    }

    public void OnDelete(ActionEvent actionEvent) {

    }

    public void OnSearch(ActionEvent actionEvent) throws SQLException {

        String SupplierID = txtSearchID.getText();

        Supplier S1 = SupplierModel.searchFrom(SupplierID);

        txtSupllierID.setText(S1.getSupplierID());
        txtSupplierName.setText(S1.getSupplierName());
        txtContact.setText(S1.getSupplierContact());
        txtSupplierAddress.setText(S1.getSupplierAddress());
        txtBookID.setText(S1.getBookID());
    }
}