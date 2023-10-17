package JDBC;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.*;

public class _03_BeforeAfter {

    Connection connection;
    Statement statement;

    @BeforeMethod
    public void DBConnection() throws SQLException {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        connection = DriverManager.getConnection(url, username, password);

        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    }


    @AfterMethod
    public void DBConnectionClose() throws SQLException {
        connection.close();
    }


    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        rs.next(); // We are on the first row
        String language = rs.getString("name");
        System.out.println("language = " + language);

        rs.next(); // We are on the second row
        String language1 = rs.getString("name");
        System.out.println("language1 = " + language1);
    }

    @Test
    public void test2() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");
        rs.next(); // We are on the first row
        String language = rs.getString("name");
        System.out.println("language = " + language);

        rs.next(); // We are on the second row
        String language1 = rs.getString("name");
        System.out.println("language1 = " + language1);

        rs.previous(); // moves one step backwards to the first row
        String language2 = rs.getString("name");
        System.out.println("language2 = " + language2);
    }
}
