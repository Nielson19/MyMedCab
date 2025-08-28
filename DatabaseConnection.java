// This file is required to connect to the database. Simply replace my name with your name.
// Users - josue (me), cesar, niel (all lowercase!)
// Password - abcdepostgres12345
// IMPORTANT - DO NOT ADD: PUBLIC STATIC VOID MAIN(STRING[]ARGS){}

package backend;
import java.sql.*;
public class DatabaseConnection {
    private static final String DB_URL = "jdbc:postgresql://mymedcab-database.cncwwsga49b6.us-east-2.rds.amazonaws.com:5433/mymedcab";
    private static final String DB_USER = "josue";
    private static final String DB_PASS = "abcdepostgres12345";

    public static Connection connection(){
        try{
            return DriverManager.getConnection("jdbc:postgresql://mymedcab-database.cncwwsga49b6.us-east-2.rds.amazonaws.com:5433/mymedcab", "josue", "abcdepostgres12345");
        } catch(SQLException e){
            System.out.println("Connection failure: " + e.getMessage());
            return null;
        }
    }
}
