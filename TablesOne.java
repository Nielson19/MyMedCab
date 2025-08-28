// This class is meant to create tables (User / Medicine ONLY) and insert them into the database
// JDBC used - tables will automatically be inserted in pgAdmin.
// Be sure to call database connection!

package backend;
import java.sql.*;
public class TablesOne
{
    // Users and Medicine tables
    public static void createTable()
    {
        String sql = """
            CREATE TABLE IF NOT EXISTS users (
            patient_id SERIAL PRIMARY KEY,
            first_name TEXT NOT NULL,
            last_name TEXT NOT NULL,
            dob DATE NOT NULL,
            blood_sugar NUMERIC(5, 2),
            systolic SMALLINT NOT NULL,
            diastolic SMALLINT NOT NULL,
            weight NUMERIC(5,2) NOT NULL
            );
            
            CREATE TABLE IF NOT EXISTS medicine (
            med_id SERIAL PRIMARY KEY,
            name TEXT NOT NULL,
            dosage NUMERIC(7,2) NOT NULL,
            expirationDate DATE NOT NULL,
            formula TEXT NOT NULL,
            timeline INT NOT NULL,
            period VARCHAR(20) NOT NULL CHECK (period IN('hour', 'day', 'week', 'month', 'as_needed'))
            );
            
            """;

        // Database connection
        try
        {
            Connection conn = DatabaseConnection.connection();
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Tables created successfully!");
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        // Call the createTable() method to insert the tables into pgAdmin.
        createTable();
    }
}
