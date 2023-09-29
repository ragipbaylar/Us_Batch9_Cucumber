package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _02_GetAllDataFromOneRow {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path); // a road from file to us(one way road)

        Workbook workbook = WorkbookFactory.create(fileInputStream); // open the file

        Sheet sheet = workbook.getSheet("Sheet1"); // open the sheet in the fie

        Row row = sheet.getRow(1);
        for (int i = 0; i < 4; i++) {
            Cell cell = row.getCell(i);
            System.out.println("cell = " + cell);
        }
    }
}
