package JDBC;

import org.testng.annotations.Test;

import java.sql.*;

public class _02_IntroToJDBC {
    @Test
    public void test1() throws SQLException {

        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        // url contains name of the technology we use to connect with database(jdbc), type of the database(mysql), address of the server
        // of the database(//db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com), port number(3306) and name of the database

        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        Connection connection = DriverManager.getConnection(url, username, password); // Creates a connection with the databse

        Statement statement = connection.createStatement(); // Creates a statement to execute our queries
        ResultSet rs = statement.executeQuery("select * from actor");    // Executes the query and gets the results from the database
        // and stores the results in a ResultSet Object

        // When we first get the results cursor is on the titles row. To get the results from the first row we need to move the cursor to the first row
        rs.next();  // moves the cursor to the next row
        // After rs.next we are on the first row

        String firstName = rs.getString(2); // Gets the values from the second cell of the first row
        System.out.println("firstName = " + firstName);

        String last_name = rs.getString("last_name"); // Gets the value from the last_name column of the first row
        System.out.println("last_name = " + last_name);

        connection.close(); // For security always close the connection
    }
}
