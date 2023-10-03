package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExcelUtilities {
    public static List<List<String>> getDataFromExcel(String path, String sheetName, int columnCount) {
        List<List<String>> returnList = new ArrayList<>(); // represents our sheet
        Sheet sheet = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            List<String> innerList = new ArrayList<>(); // represents our rows
            for (int j = 0; j < columnCount; j++) {
                innerList.add(sheet.getRow(i).getCell(j).toString());
            }
            returnList.add(innerList);
        }
        return returnList;
    }

    public static void writeInExcel(String path, Scenario scenario, LocalDateTime startTime, LocalDateTime endTime, Duration duration) {
        File file = new File(path);

        if (file.exists()) {
            Workbook workbook = null;
            Sheet sheet = null;
            try {
                FileInputStream fileInputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(fileInputStream);
                sheet = workbook.getSheet("CampusTestResults");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            int rowCount = sheet.getPhysicalNumberOfRows();

            Row row = sheet.createRow(rowCount);

            row.createCell(0).setCellValue(scenario.getId());
            row.createCell(1).setCellValue(scenario.getName());
            row.createCell(2).setCellValue(scenario.getStatus().toString());
            row.createCell(3).setCellValue(startTime.toString());
            row.createCell(4).setCellValue(endTime.toString());
            row.createCell(5).setCellValue(duration.toString());

            try {
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                workbook.write(fileOutputStream);
                workbook.close();
                fileOutputStream.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        } else {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("CampusTestResults");
            Row row = sheet.createRow(0);
            row.createCell(0).setCellValue(scenario.getId());
            row.createCell(1).setCellValue(scenario.getName());
            row.createCell(2).setCellValue(scenario.getStatus().toString());
            row.createCell(3).setCellValue(startTime.toString());
            row.createCell(4).setCellValue(endTime.toString());
            row.createCell(5).setCellValue(duration.toString());

            try {
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                workbook.write(fileOutputStream);
                workbook.close();
                fileOutputStream.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }


//    public static void main(String[] args) {
//        List<List<Integer>> list = new ArrayList<>();
//        //        {
//        //            {},
//        //            {},
//        //            {},
//        //            {},
//        //            {}
//        //
//        //        }
//
//
//        for (int i = 0; i < 5; i++) {
//            List<Integer> innerList = new ArrayList<>();
//            for (int j = 0; j < 6; j++) {
//                int randomNumber = (int) (Math.random()*100);
//               innerList.add(randomNumber);
//            }
//            list.add(innerList);
//        }
//
//
////        list.get(0).get(1);
////        int[][] array = new int[5][6];
//        // [0][0][0][0][0][0]
//        // [0][0][0][0][0][0]
//        // [0][0][0][0][0][0]
//        // [0][0][0][0][0][7]
//        // [0][0][0][0][0][0]
//
////        array[3][5]=7;
////        System.out.println(array[2][3]);
//        // fill the list with random numbers (5 rows and 6 numbers in each row)
//        // print the list
//        // array[0][0] = 5;
//
//
////        for (int i = 0; i < 5; i++) {
////            for (int j = 0; j < 6; j++) {
////                int randomNumber = (int)(Math.random()*100);
////                array[i][j] = randomNumber;
////            }
////        }
////        for (int i = 0; i < 5; i++) {
////            for (int j=0; j< 6; j++) {
////                System.out.println(array[i][j]);
////            }
////        }
//    }
}
