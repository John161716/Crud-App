import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thresha
 */
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/rental_management?zeroDateTimeBehavior=CONVERT_TO_NULL";
     private static final String USER = "admin";
      private static final String PASSWORD = "Akosithresha16";
      
      public static Connection getConnection(){
          Connection connection = null;
          try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              connection = DriverManager.getConnection(URL, USER, PASSWORD);
              System.out.println("Connection successful!");
          }catch (SQLException e) {
               System.out.println("Error connecting to the database: " + e.getMessage());
          }catch (ClassNotFoundException e){
              System.out.println("MySQL JDBC Driver not found:" + e.getMessage());
          }
      return connection; 
      }
     public static void closeConnection(Connection connection) {
         if (connection != null){
         try {
             connection.close();
             System.out.println("Connection closed.");
            }catch (SQLException e) {
                System.out.println("Error closing the connection:" + e.getMessage());
         }
     }
     } 
    
    
}
