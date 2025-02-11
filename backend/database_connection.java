package backend;//This file will connect to the MMC DB

import java.sql.*;
  public class Main{
    public static void main(String[]args){
      String DB_URL = "jdbc:postgresql://localhost:5432/MyMedCab";
      String USER = "postgres";
      String PASSWORD = "your_password_here";

      try(Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)){
          if(connection != null){
              System.out.println("Connection successful.");
          }
          else{
            System.out.println("Failed to connect.");
          }
      } catch(SQLException e){
          e.printStackTrace();
      }
    }
  }
