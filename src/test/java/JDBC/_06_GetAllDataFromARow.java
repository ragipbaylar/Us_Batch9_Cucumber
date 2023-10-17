package JDBC;

import Utilities.DBUtilities;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _06_GetAllDataFromARow extends DBUtilities {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData(); // Give all information about the table(column names, column types, number of columns...)

        int columnCount = rsmd.getColumnCount(); // Gives number of columns of the result of the query
        rs.next();

        for (int i = 1; i <= columnCount; i++) {
            String value = rs.getString(i);
            System.out.println("value = " + value);

            String columnName = rsmd.getColumnName(i); // Gives the title of the column
            System.out.println("columnName = " + columnName);
            
            String columnType = rsmd.getColumnTypeName(i); // gives the type of the column
            System.out.println("columnType = " + columnType);
        }
    }
}
