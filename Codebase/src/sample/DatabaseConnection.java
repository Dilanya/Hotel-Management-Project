package sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

     public Connection databaseLink;

     public Connection getConnection(){
         String databaseName  = "customerqueries_db";
         String databaseUSer = "root";
         String databasePassword = "12345678";
         String url = "jdbc:mysql://localhost/" + databaseName;

         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             databaseLink = DriverManager.getConnection(url,databaseUSer,databasePassword);

         }catch (Exception e){
             e.printStackTrace();
             e.getCause();
         }
         return databaseLink;
     }


}
