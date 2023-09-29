package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _04_GetASpecificData {
    /**
     * Write the code that gives specific data the user wants
     * E.g. When user types username print the username from the excel file
     */

    public static void main(String[] args) throws IOException {
        System.out.println("What do you want to search for?");
        Scanner scanner = new Scanner(System.in);
        String userResponse = scanner.nextLine();
        System.out.println(getSpecificData(userResponse));
    }

    public static String getSpecificData(String userResponse) throws IOException {
        StringBuilder returnValue = new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream("src/test/java/ApachePOI/Resources/LoginData.xlsx");
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        Sheet sheet = workbook.getSheet("Login");
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(userResponse)) {
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    returnValue.append(sheet.getRow(i).getCell(j)).append(" ");
                }
                break;
            }
        }
        return returnValue.toString();
    }
}


//String returnvalue = null;
//returnValue = 123 Main;
//returnValue = 123 Main 21A London
//returnValue = 123 Main 21A London Reading