package sample;


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

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class BookingController implements Initializable {

    @FXML
    private TextField NameField;
    @FXML
    private TextField TelNoField;
    @FXML
    private TextField EmailField;
    @FXML
    private MenuButton AccMenu;
    @FXML
    private MenuItem Acc1;
    @FXML
    private MenuItem Acc2;
    @FXML
    private MenuItem Acc3;
    @FXML
    private MenuButton AdultsMenu;
    @FXML
    private MenuItem Adults1;
    @FXML
    private MenuItem Adults2;
    @FXML
    private MenuItem Adults3;
    @FXML
    private MenuItem Adults4;
    @FXML
    private MenuButton ChildMenu;
    @FXML
    private MenuItem Child1;
    @FXML
    private MenuItem Child2;
    @FXML
    private MenuItem Child3;
    @FXML
    private MenuItem Child4;
    @FXML
    private MenuButton RoomsMenu;
    @FXML
    private MenuItem Room1;
    @FXML
    private MenuItem Room2;
    @FXML
    private MenuItem Room3;
    @FXML
    private MenuButton DaysMenu;
    @FXML
    private MenuItem Day1;
    @FXML
    private MenuItem Day2;
    @FXML
    private MenuItem Day3;
    @FXML
    private DatePicker CheckIn;
    @FXML
    private DatePicker CheckOut;
    @FXML
    private Label Balance;
    @FXML
    private AnchorPane BalancePane;
    @FXML
    private Label nameL;
    @FXML
    private Label telNoL;
    @FXML
    private Label emailL;
    @FXML
    private Label idL;
    @FXML
    private Label accL;
    @FXML
    private Label adultsL;
    @FXML
    private Label childrenL;
    @FXML
    private Label daysL;
    @FXML
    private Label roomsL;
    @FXML
    private Label checkInL;
    @FXML
    private Label checkOutL;
    @FXML
    private TextField Id;



    int accType = 0;
    int adultType = 0;
    int childrenType = 0;
    int daysType = 0;
    int roomsType = 0 ;


    public void initialize(URL url, ResourceBundle rb) {
        BalancePane.setVisible(false);
        Balance.setVisible(false);
        idL.setVisible(false);
        nameL.setVisible(false);
        telNoL.setVisible(false);
        emailL.setVisible(false);
        accL.setVisible(false);
        adultsL.setVisible(false);
        childrenL.setVisible(false);
        daysL.setVisible(false);
        roomsL.setVisible(false);
        checkInL.setVisible(false);
        checkOutL.setVisible(false);
    }

    public void Acc1Select(ActionEvent event) {
        AccMenu.setText(" ACCOMMODATION TYPE : SUPERIOR ROOM");
        accType = 1 ;}

    public void Acc2Select(ActionEvent event) {
            AccMenu.setText(" ACCOMMODATION TYPE : DELUXE ROOM");
            accType = 2;}

    public void Acc3Select(ActionEvent event) {
            AccMenu.setText(" ACCOMMODATION TYPE : LUXURY ROOM");
            accType = 3;}

    public void Adult1Select(ActionEvent event) {
        AdultsMenu.setText(" NO.OF ADULTS : 1");
        adultType = 1;}

    public void Adult2Select(ActionEvent event) {
        AdultsMenu.setText(" NO.OF ADULTS : 2");
        adultType = 2;}

    public void Adult3Select(ActionEvent event) {
        AdultsMenu.setText(" NO.OF ADULTS : 3");
        adultType = 3;}

    public void Adult4Select(ActionEvent event) {
        AdultsMenu.setText(" NO.OF ADULTS : 4");
        adultType = 4;}

    public void Child1Select(ActionEvent event) {
        ChildMenu.setText(" NO.OF CHILDREN : 1");
        childrenType = 1;}

    public void Child2Select(ActionEvent event) {
        ChildMenu.setText(" NO.OF CHILDREN : 2");
        childrenType = 2;}

    public void Child3Select(ActionEvent event) {
        ChildMenu.setText(" NO.OF CHILDREN : 3");
        childrenType = 3;}

    public void Child4Select(ActionEvent event) {
        ChildMenu.setText(" NO.OF CHILDREN : 4");
        childrenType = 4;}

    public void Day1Select(ActionEvent event) {
        DaysMenu.setText(" NO.OF DAYS : 1 TO 5");
        daysType =1;}

    public void Day2Select(ActionEvent event) {
        DaysMenu.setText(" NO.OF DAYS : 1 TO 10");
        daysType =2;}

    public void Day3Select(ActionEvent event) {
        DaysMenu.setText(" NO.OF DAYS : 1 TO 30 ");
        daysType =3;}

    public void Room1Select(ActionEvent event) {
        RoomsMenu.setText(" NO.OF ROOMS : 1");
        roomsType = 1;}

    public void Room2Select(ActionEvent event) {
        RoomsMenu.setText(" NO.OF ROOMS : 2");
        roomsType = 2;}

    public void Room3Select(ActionEvent event) {
        RoomsMenu.setText(" NO.OF ROOMS : 3");
        roomsType = 3;}

    public void balance(ActionEvent event) {



        int balance1 = 0;
        int balance2 = 0 ;
        int balance3 = 0;
        int balance4 = 0 ;
        int totalBalance = 0;


        if (accType == 1 && daysType == 1)
            balance1 = 10000;
        if (accType == 2 && daysType == 1)
            balance1 = 20000;
        if (accType == 3 && daysType == 1)
            balance1 = 30000;


        if (accType == 1 && daysType == 2)
            balance1 = 20000 ;
        if (accType == 2 && daysType == 2)
            balance1 = 40000 - ((40000/100)*10);
        if (accType == 3 && daysType == 2)
            balance1 = 60000 - ((60000/100)*10);


        if (accType == 1 && daysType == 3)
            balance1 = 30000 ;
        if (accType == 2 && daysType == 3)
            balance1 = 60000 - ((60000/100)*20);
        if (accType == 3 && daysType == 3)
            balance1 = 90000 - ((90000/100)*20);


        if (roomsType == 1)
            balance2 = balance1;
        if (roomsType == 2)
            balance2 = balance1*2;
        if (roomsType == 3)
            balance2 = balance1*3;


        if (adultType == 1)
            balance3 = balance2 + 5000;
        if (adultType == 2)
            balance3 = balance2 + (5000 *2);
        if (adultType == 3)
            balance3 = balance2 + (5000 *3);
        if (adultType == 4)
            balance3 = balance2 + (5000 *4);


        if (childrenType ==1)
            balance4 =  2500;
        if (childrenType == 2)
            balance4 =  (2500 *2);
        if (childrenType == 3)
            balance4 =  (2500 *3);
        if (childrenType == 4)
            balance4 =  (2500 *4);

        totalBalance = balance3 + balance4;
        BalancePane.setVisible(true);
        Balance.setVisible(true);
        Balance.setText(" YOUR TOTAL BALANCE IS :  " + totalBalance + ".00  LKR");
        idL.setVisible(false);
        nameL.setVisible(false);
        telNoL.setVisible(false);
        emailL.setVisible(false);
        accL.setVisible(false);
        adultsL.setVisible(false);
        childrenL.setVisible(false);
        daysL.setVisible(false);
        roomsL.setVisible(false);
        checkInL.setVisible(false);
        checkOutL.setVisible(false);

    }
    public void Book(ActionEvent event) {

        if (NameField.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Name can't be empty");
            alert.setHeaderText(" please enter your Name !  ");
            alert.show();
        }

        if (TelNoField.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Contact number can't be empty");
            alert.setHeaderText(" please enter your Contact number !  ");
            alert.show();
        }

        if (EmailField.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Email can't be empty");
            alert.setHeaderText(" please enter your Email !  ");
            alert.show();
        }

        else {


        DatabaseConnection connect = new DatabaseConnection();
        Connection connectDB = connect.getConnection();

        String Name = NameField.getText();
        String TelNo = TelNoField.getText();
        String email = EmailField.getText();
        LocalDate checkin = CheckIn.getValue();
        LocalDate checkout = CheckOut.getValue();
        String Accommodation = "";
        if (accType == 1)
            Accommodation = ("Superior Room");
        if (accType ==2)
            Accommodation = (" Deluxe  Room");
        if (accType == 3)
            Accommodation = ("Luxury Room");

        String insertFields = "insert into reservation(Customer_name , Tel_NO ,Email,Acc_type,No_Of_Adults, No_of_children, Days, Rooms, Check_In, Cehck_out) values ('";

        String insertValues = Name + "','" + TelNo + "','" + email + "','" + Accommodation + "','" + adultType + "','" + childrenType + "','" + daysType + "','" +roomsType+ "','" +checkin+ "','" +checkout + "')" ;
        String insertToQueries = insertFields + insertValues;

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertToQueries);

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Your Reservation Successfully Stored ");
        alert.show();


        DatabaseConnection connect1 = new DatabaseConnection();
        Connection connectDB1 = connect1.getConnection();

         String view1 = "SELECT Reserv_ID FROM reservation WHERE  Customer_name like '" + Name + "'";
            try {
                Statement statement1 = connectDB1.createStatement();
                ResultSet  resultSet1 = statement1.executeQuery(view1) ;
                while (resultSet1.next()){
                    Alert showID = new Alert(Alert.AlertType.INFORMATION);
                    showID.setTitle("   Attention !" );
                    showID.setHeaderText("  Your reservation ID is   "+ resultSet1.getString(1) +"   Keep Your Reservation ID safe...");
                    showID.show();



                }
            } catch (Exception e) {
                e.printStackTrace();
                e.getCause();
            }
        NameField.clear();
        EmailField.clear();
        TelNoField.clear();

        }
    }

    public void Cancel(ActionEvent event){

        if (Id.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ID can't be empty");
            alert.setHeaderText(" please enter your Reservation ID below !  ");
            alert.show();
        }
        else {

                String ID = Id.getText();
                DatabaseConnection connect = new DatabaseConnection();
                Connection connectDB = connect.getConnection();

                String CheckID = "SELECT count(1) FROM reservation WHERE Reserv_ID = " + ID;


                try {
                    Statement statement = connectDB.createStatement();
                    ResultSet  resultSet = statement.executeQuery(CheckID) ;

                    while (resultSet.next()){
                        if (resultSet.getInt(1)== 1) {
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Are you sure ?");
                            alert.setHeaderText(" Do you want to delete your reservation  !  ");


                            if (alert.showAndWait().isPresent()) {
                                DatabaseConnection connect1 = new DatabaseConnection();
                                Connection connectDB1 = connect1.getConnection();

                                String Delete = "DELETE FROM reservation WHERE Reserv_ID =" + ID;

                                try {
                                    Statement statement1 = connectDB1.createStatement();
                                    statement1.executeUpdate(Delete);

                                } catch (Exception e) {
                                    e.printStackTrace();
                                    e.getCause();
                                }
                                Id.clear();

                            }
                        }
                        else{
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setHeaderText(" Invalid Reservation ID  !  ");
                            alert.show();
                            Id.clear();
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    e.getCause();
                }

        }
    }
    public void View(ActionEvent event){

        Balance.setVisible(false);
        nameL.setText("Name  : ");
        idL.setText("Reservation ID  :  ");
        telNoL.setText("Tel.No :  ");
        emailL.setText("Email  :  ");
        accL.setText("Accommodation Type :  ");
        adultsL.setText("No.Of Adults");
        childrenL.setText("No.Of Children :  ");
        daysL.setText("No.Of Days :  ");
        roomsL.setText("No.Of Rooms :  ");
        checkInL.setText("Check-In : ");
        checkOutL.setText("Check-Out :  ");

        if (Id.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ID can't be empty");
            alert.setHeaderText(" please enter your Reservation ID below !  ");
            alert.show();
        }
        else {

            String ID = Id.getText();

            DatabaseConnection connect = new DatabaseConnection();
            Connection connectDB = connect.getConnection();

            String CheckID = "SELECT count(1) FROM reservation WHERE Reserv_ID = " + ID;


            try {
                Statement statement = connectDB.createStatement();
                ResultSet  resultSet = statement.executeQuery(CheckID) ;

                while (resultSet.next()) {
                    if (resultSet.getInt(1) == 1) {

                        BalancePane.setVisible(true);
                        idL.setVisible(true);
                        nameL.setVisible(true);
                        telNoL.setVisible(true);
                        emailL.setVisible(true);
                        accL.setVisible(true);
                        adultsL.setVisible(true);
                        childrenL.setVisible(true);
                        daysL.setVisible(true);
                        roomsL.setVisible(true);
                        checkInL.setVisible(true);
                        checkOutL.setVisible(true);
                        Id.clear();

                        idL.setText(idL.getText() + ID);

                        DatabaseConnection connect1 = new DatabaseConnection();
                        Connection connectDB1 = connect1.getConnection();
                        String view1 = "SELECT * from reservation WHERE Reserv_ID = " + ID;
                        try {
                            Statement statement1 = connectDB1.createStatement();
                            ResultSet  resultSet1 = statement1.executeQuery(view1) ;
                            while (resultSet1.next()){
                                nameL.setText(nameL.getText() + resultSet1.getString(2));
                                telNoL.setText(telNoL.getText() + resultSet1.getString(3));
                                emailL.setText(emailL.getText() + resultSet1.getString(4));
                                accL.setText(accL.getText() + resultSet1.getString(5));
                                adultsL.setText(adultsL.getText() + resultSet1.getString(6));
                                childrenL.setText(childrenL.getText() + resultSet1.getString(7));
                                daysL.setText(daysL.getText() + resultSet1.getString(8));
                                roomsL.setText(roomsL.getText() + resultSet1.getString(9));
                                checkInL.setText(checkInL.getText() + resultSet1.getString(10));
                                checkOutL.setText(checkOutL.getText() + resultSet1.getString(11));


                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            e.getCause();
                        }




                    } else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setHeaderText(" Invalid Reservation ID  !  ");
                        alert.show();
                        Id.clear();
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
                e.getCause();
            }

        }

    }
    public void CLEAR(ActionEvent event){
        BalancePane.setVisible(false);
        nameL.setText("Name  : ");
        idL.setText("Reservation ID  :  ");
        telNoL.setText("Tel.No :  ");
        emailL.setText("Email  :  ");
        accL.setText("Accommodation Type :  ");
        adultsL.setText("No.Of Adults");
        childrenL.setText("No.Of Children :  ");
        daysL.setText("No.Of Days :  ");
        roomsL.setText("No.Of Rooms :  ");
        checkInL.setText("Check-In : ");
        checkOutL.setText("Check-Out :  ");
    }
    public void ContactPaneView(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ContactUs.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle(" Hotel Phoenix Contacts");
        stage.setScene(scene);
        stage.show();

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





}



