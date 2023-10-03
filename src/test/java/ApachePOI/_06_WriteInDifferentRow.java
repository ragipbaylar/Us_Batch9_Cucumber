package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInDifferentRow {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/Resources/WriteIntoExistingExcelFile.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path); // a road from file to us(one way road)
        Workbook workbook = WorkbookFactory.create(fileInputStream); // open the file

        Sheet sheet = workbook.getSheet("Sheet1"); // Getting the sheet

        int rowCount = sheet.getPhysicalNumberOfRows(); // We got the number of rows to determine the index of the next row

        Row row = sheet.createRow(rowCount); // Created the next row
        Cell cell = row.createCell(0); // Created a cell
        cell.setCellValue("Hello World!"); // typed this value in the cell

        for (int i = 1; i <10 ; i++) {
            row.createCell(i).setCellValue("Hello World "+i);
        }

        // All changes we have made so far are in the memory not in the file
        // We need to send them to the file

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();
    }
}
