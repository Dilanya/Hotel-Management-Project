package sample;


import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;

    public class ContactUsController implements Initializable {
        @FXML
        private Button MenuButton;
        @FXML
        private Button MenuClose;
        @FXML
        private AnchorPane MenuPane;
        @FXML
        private Button reset;
        @FXML
        private TextField Field1;
        @FXML
        private TextField Field2;
        @FXML
        private TextField Field3;
        @FXML
        private TextField Field4;
        @FXML
        private TextArea Field5;
        @FXML
        private Label L1;
        @FXML
        private Label L2;
        @FXML
        private Label L3;
        @FXML
        private Label L4;


        public void initialize(URL url, ResourceBundle rb) {
            MenuPane.setVisible(false);
            MenuClose.setVisible(false);
            L1.setVisible(false);
            L2.setVisible(false);
            L3.setVisible(false);
            L4.setVisible(false);


        }

        public void MenuVeiw(ActionEvent event) {
            MenuPane.setVisible(true);
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(MenuPane);
            slide.setToX(0);
            slide.play();
            MenuPane.setTranslateX(-400);


            MenuButton.setVisible(false);
            MenuClose.setVisible(true);

        }

        public void MenuCloseView(ActionEvent event) {

            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(MenuPane);
            slide.setToX(-400);
            slide.play();
            MenuPane.setTranslateX(0);


            MenuButton.setVisible(true);
            MenuClose.setVisible(false);

        }

        public void Reset(javafx.event.ActionEvent event) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Reset");
            alert.setHeaderText("Are you sure? Do you want to reset? ");


            if (alert.showAndWait().isPresent()) {

                Field1.clear();
                Field2.clear();
                Field3.clear();
                Field4.clear();
                Field5.clear();

                L1.setVisible(false);
                L2.setVisible(false);
                L3.setVisible(false);
                L4.setVisible(false);
            }
        }

        public void Submit(ActionEvent event) {


            if (Field1.getText().isEmpty())
                L1.setVisible(true);
            if (Field2.getText().isEmpty())
                L2.setVisible(true);
            if (Field3.getText().isEmpty())
                L3.setVisible(true);
            if (Field4.getText().isEmpty())
                L4.setVisible(true);
            else {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Message Successfully delivered ");
                alert.show();

                DatabaseConnection connect = new DatabaseConnection();
                Connection connectDB = connect.getConnection();

                String CustomerName = Field1.getText();
                String email = Field2.getText();
                String TelNo = Field3.getText();
                String Subject_line = Field4.getText();
                String message = Field5.getText();

                String insertFields = "INSERT INTO queries(CustomerName, email, TelNo, Subject_line, message) values('";
                String insertValues = CustomerName + "','" + email + "','" + TelNo + "','" + Subject_line + "','" + message + "')";
                String insertToQueries = insertFields + insertValues;

                try {
                    Statement statement = connectDB.createStatement();
                    statement.executeUpdate(insertToQueries);

                } catch (Exception e) {
                    e.printStackTrace();
                    e.getCause();
                }
                Field1.clear();
                Field2.clear();
                Field3.clear();
                Field4.clear();
                Field5.clear();

                L1.setVisible(false);
                L2.setVisible(false);
                L3.setVisible(false);
                L4.setVisible(false);
            }


        }
        public void HomePaneView(ActionEvent event) throws IOException{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeController.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle(" Hotel Phoenix Home");
            stage.setScene(scene);
            stage.show();

        }
        public void AccPaneView(ActionEvent event) throws IOException {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Accomodation.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle(" Hotel Phoenix Accommodation");
            stage.setScene(scene);
            stage.show();

        }
        public void DinningsPaneView(ActionEvent event) throws IOException{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Dinings.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle(" Hotel Phoenix Dining");
            stage.setScene(scene);
            stage.show();

        }
        public void EventPaneView(ActionEvent event) throws IOException{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Events.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle(" Hotel Phoenix Events");
            stage.setScene(scene);
            stage.show();

        }
        public void ContactPaneView(ActionEvent event)throws IOException{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ContactUs.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle(" Hotel Phoenix Contacts");
            stage.setScene(scene);
            stage.show();

        }
        public void BookingPaneView(ActionEvent event)throws IOException{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Booking.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle(" Hotel Phoenix Bookings");
            stage.setScene(scene);
            stage.show();

        }
    }




