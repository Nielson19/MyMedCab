//This file is REQUIRED to connect to the MyMedCab database. 
//It uses the JDBC driver - DO NOT ADD PUBLIC STATIC VOID MAIN TO THIS FILE.
//Keep the file as is

package yourpackage; //Your package - if you installed your dependencies and created Java classes within the file you installed your dependencies.
import java.sql.*;
public class DatabaseConnection{
  private static final String DB_URL = "jdbc:postgresql://mymedcab.cdgo8acq0ea0.us-east-2.rds.amazonaws.com:5432/mymedcab";
  private static final String USERNAME = "your_username_here"; //i.e. (josue / cesar / niel)
  private static final String PASSWORD = "abcpostgres1234"; //password is same for everyone here

  public static Connection connection(){
    try{
      return DriverManager.getConnection("jdbc:postgresql://mymedcab.cdgo8acq0ea0.us-east-2.rds.amazonaws.com:5432/mymedcab", "your_username_here", "abcpostgres1234");
    } catch(SQLException e){
        System.out.println("Connection failure: " + e.getMessage());
        return null;
    }
  }
}
