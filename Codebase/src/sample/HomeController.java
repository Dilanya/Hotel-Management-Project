package sample;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private Button MenuButton;
    @FXML
    private Button MenuClose;
    @FXML
    private AnchorPane MenuPane;

    public void initialize(URL url, ResourceBundle rb) {
        MenuPane.setVisible(false);
        MenuClose.setVisible(false);

    }

    public void MenuVeiw(ActionEvent event){
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

    public void MenuCloseView(ActionEvent event){

        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(MenuPane);
        slide.setToX(-400);
        slide.play();
        MenuPane.setTranslateX(0);


        MenuButton.setVisible(true);
        MenuClose.setVisible(false);

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
