package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _01_ApachePOIIntro {
    // What is Apache POI?
    // A Java library. We use it to get data from an excel file and
    // to write data to an excel file
    // We must create a FileInputStream to read data and FileOutputStream to write a data to the file
    public static void main(String[] args) throws IOException {
//        String[][] zoo = {
//                {"Lion","4"},
//                {"Tiger", "2"},
//                {"Elephant", "5"},
//                {"Shark", "3"}};
//        System.out.println(zoo[3][0]);

        String path = "src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path); // a road from file to us(one way road)

        Workbook workbook = WorkbookFactory.create(fileInputStream); // open the file

        Sheet sheet = workbook.getSheet("Sheet1"); // open the sheet in the fie
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println("cell = " + cell);

        Cell cell1 = row.getCell(1);
        System.out.println("cell1 = " + cell1);

        Row row1 = sheet.getRow(1);
        Cell cell2 = row1.getCell(2);
        System.out.println("cell2 = " + cell2);
    }
}
