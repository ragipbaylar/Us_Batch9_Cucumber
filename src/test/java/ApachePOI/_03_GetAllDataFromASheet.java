package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _03_GetAllDataFromASheet {
    public static void main(String[] args) throws IOException {
//        String[][] zoo = {
//                {"Lion","4","Africa","Meat"},
//                {"Tiger", "2"},
//                {"Elephant", "5","India"},
//                {"Shark", "3"}
//        };
//
//        for (int i = 0; i < zoo.length; i++) {
//            for (int j = 0; j < zoo[i].length; j++) {
//                System.out.println(zoo[i][j]);
//            }
//        }

        String path = "src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path); // a road from file to us(one way road)

        Workbook workbook = WorkbookFactory.create(fileInputStream); // open the file

        Sheet sheet = workbook.getSheet("Sheet1"); // open the sheet in the fie

//        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) { // sheet.getPhysicalNumberOfRows() returns number of rows in a sheet
//            Row row = sheet.getRow(i);
//            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) { // row.getPhysicalNumberOfCells() returns number of cells in a row
//                Cell cell = row.getCell(j);
//                System.out.print(cell+" ");
//            }
//            System.out.println();
//        }


        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                System.out.print(sheet.getRow(i).getCell(j)+" ");
            }
            System.out.println();
        }
    }
}