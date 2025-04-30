//This class is meant to create tables (User / Medicine ONLY) and insert them into the database
//JDBC used - tables will automatically be inserted in your schemas. 
//Be sure to call the schemas - example: schema.tablename
package org.example; //this is the default package once dependencies have been installed
import java.sql.*;
public class Insert{
  public static void createTable(){
    //Creates tables using JDBC driver
    String sql = """
        CREATE TABLE IF NOT EXISTS users.users(
                patient_id SERIAL PRIMARY KEY,
                first_name TEXT NOT NULL,
                last_name TEXT NOT NULL,
                dob DATE NOT NULL,
                blood_sugar DECIMAL(5,2),
                blood_pressure VARCHAR(10),
                weight DECIMAL(5,2)
                );
                
                CREATE TABLE IF NOT EXISTS medicine.medicine(
                med_id SERIAL PRIMARY KEY,
                name TEXT NOT NULL,
                dosage DECIMAL(5,2),
                expirationDate VARCHAR(10),
                formula TEXT NOT NULL,
                timeline TEXT NOT NULL
                );

                """;
//Once you've created the tables, call the Database Connection.
//This inserts your table in your schemas.
//Connection: 
  try{
            Connection conn = DatabaseConnection.connection();
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Tables created successfully!");
        } catch(SQLException e){
            e.printStackTrace();
        }
        }
        public static void main(String[]args){
        createTable();
        }
    }
