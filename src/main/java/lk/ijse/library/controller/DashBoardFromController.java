package lk.ijse.library.controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.library.dto.Issuse;
import lk.ijse.library.dto.Member;
import lk.ijse.library.model.IssuseModel;
import lk.ijse.library.model.MemberModel;

import java.io.*;
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
    private TableView<Issuse> tblIssuse;

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

    @FXML
    private TableView<?> tblReturn;

    @FXML
    private TableColumn<?, ?> colReturnID;

    @FXML
    private TableColumn<?, ?> colReturnDate;

    @FXML
    private TableColumn<?, ?> colIssuseID;

    @FXML
    private TableColumn<?, ?> colBookID;

    @FXML
    private LineChart<?, ?> barChart;


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
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("first Week");
        series1.getData().add(new XYChart.Data("Day 1",3));
        series1.getData().add(new XYChart.Data("Day 2",49));
        series1.getData().add(new XYChart.Data("Day 3",25));
        series1.getData().add(new XYChart.Data("Day 4",41));
        series1.getData().add(new XYChart.Data("Day 5",77));
//        series1.getData().add(new XYChart.Data("Day 6",75));
//        series1.getData().add(new XYChart.Data("Day 7",7));


        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Second week");
        series2.getData().add(new XYChart.Data("Day 1",5));
        series2.getData().add(new XYChart.Data("Day 2",19));
        series2.getData().add(new XYChart.Data("Day 3",16));
        series2.getData().add(new XYChart.Data("Day 4",45));
        series2.getData().add(new XYChart.Data("Day 5",80));
//        series2.getData().add(new XYChart.Data("Day 6",50));
//        series2.getData().add(new XYChart.Data("Day 7",90));

        XYChart.Series series3 = new XYChart.Series();
        series3.setName("3rd week");
        series3.getData().add(new XYChart.Data("Day 1",0));
        series3.getData().add(new XYChart.Data("Day 2",45));
        series3.getData().add(new XYChart.Data("Day 3",35));
        series3.getData().add(new XYChart.Data("Day 4",28));
        series3.getData().add(new XYChart.Data("Day 5",90));

        XYChart.Series series4 = new XYChart.Series();
        series3.setName("4th week");
        series4.getData().add(new XYChart.Data("Day 1",1));
        series4.getData().add(new XYChart.Data("Day 2",34));
        series4.getData().add(new XYChart.Data("Day 3",26));
        series4.getData().add(new XYChart.Data("Day 4",76));
        series4.getData().add(new XYChart.Data("Day 5",90));

        barChart.getData().addAll(series1,series2,series3,series4);

        //-------------------------------------Issuse Tble------------------------------------------------

        tblIssuse.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("issusId"));
        tblIssuse.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("bookId"));
        tblIssuse.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("issusDate"));
        tblIssuse.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("memberId"));
        tblIssuse.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        tblIssuse.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("issuseQty"));

        ArrayList<Issuse> issuses1;
        try {
            issuses1 = IssuseModel.loadAllIssuse();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        tblIssuse.setItems(FXCollections.observableArrayList(issuses1));
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
        lblTopic.setText("Issuse From");
    }

    public void GoReturn(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/ReturnFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("Return From");
    }

    public void goAutor(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/AutorAddFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("Autor From");
    }

    public void GoPublishers(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/PublisherAddFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("Publisher From");
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

    public void GetReport(ActionEvent actionEvent) throws FileNotFoundException {
        InputStream input=new FileInputStream(new File("src/main/resources/Report/Wood.jrxml"));
        //JRXmlLoader.load(input);
    }

    public void getEmail(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/EmailFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("Send Email");
    }

    public void GoDonetions(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/DonetionFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("Send Email");
    }

    public void GoExibitions(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/ExibitionsFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("Send Email");
    }

    public void GoMemberView(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/MemberTableFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("Member Table View");
    }

    public void GoAutorViwe(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/AutorTableFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("Book Table View");
    }

    public void GoSupplierView(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/SupplierTableFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("Book Table View");
    }

    public void GoPublisherView(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/publisherTableFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("Book Table View");
    }

    public void ShowAllFines(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/FineMoneyTableFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("Book Table View");
    }

    public void GoBookView(ActionEvent actionEvent) throws IOException {
        Node node;
        node = FXMLLoader.load(getClass().getResource("/view/BookTableFrom.fxml"));
        MainPane.getChildren().setAll(node);
        lblTopic.setText("Book Table View");
    }
}



