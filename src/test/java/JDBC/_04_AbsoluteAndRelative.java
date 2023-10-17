package JDBC;

import Utilities.DBUtilities;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_AbsoluteAndRelative extends DBUtilities {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from film");
        rs.absolute(20); // takes us to the 20th row right away

        String title = rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(913); // takes us to the 913th row
        String title1 = rs.getString("title");
        System.out.println("title1 = " + title1);

        rs.absolute(3);
        String title2 = rs.getString("title");
        System.out.println("title2 = " + title2);

        rs.relative(5); // takes us 5 rows forward from the current row which is 8th row in this case
        String title3 = rs.getString("title");
        System.out.println("title3 = " + title3);

        rs.relative(23); // takes us 23 rows forward from the current row which is 31st row in this case
        String title4 = rs.getString("title");
        System.out.println("title4 = " + title4);

        rs.relative(-20); // takes us 20 rows backwards from the current row which is 11th row in this case
        String title5 = rs.getString("title");
        System.out.println("title5 = " + title5);
    }
}
