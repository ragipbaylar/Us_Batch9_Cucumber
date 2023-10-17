package Utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.sql.*;

public class DBUtilities {
    Connection connection;
    protected Statement statement;

    @BeforeTest
    public void DBConnection() {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (Exception ex) {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
    }

    @AfterTest
    public void DBConnectionClose() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}
