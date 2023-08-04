package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main4 extends Application {


    @Override
    public void start(Stage stage)  {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("HomeController.fxml"));


            Image icon = new Image("sample/images/OIP.png");
            stage.getIcons().add(icon);
            stage.setTitle(" Hotel Phoenix");
            stage.setWidth(1200);
            stage.setHeight(700);
            stage.setResizable(false);

            Scene scene = new Scene(root);


            stage.setScene(scene);
            stage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}

