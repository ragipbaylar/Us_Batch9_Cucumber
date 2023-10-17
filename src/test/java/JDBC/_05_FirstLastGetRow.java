package JDBC;

import Utilities.DBUtilities;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_FirstLastGetRow extends DBUtilities {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select city_id, city, country_id from city");

        rs.last(); // jumps to the last row of the table
        String cityName = rs.getString("city");
        System.out.println("cityName = " + cityName);

        int cityId = rs.getInt("city_id"); // You can use any data type to get a value as long as the data fits that data type
        System.out.println("cityId = " + cityId);

        String cityIdSTR = rs.getString("city_id"); // You can use any data type to get a value as long as the data fits that data type
        System.out.println("cityIdSTR = " + cityIdSTR);

        rs.absolute(257);
        int currentRowNumber = rs.getRow(); // Gives the number of the current row, not id of the row.
                                            // Id doesn't give the number of the row. Because some rows might have been deleted.
        System.out.println("currentRowNumber = " + currentRowNumber);

        rs.first(); // Jumps to the first row right away
        int rowNumber = rs.getRow();
        System.out.println("rowNumber = " + rowNumber);
    }
}
