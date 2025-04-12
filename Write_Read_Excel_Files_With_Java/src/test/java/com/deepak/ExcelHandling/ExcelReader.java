package com.deepak.ExcelHandling;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;

public class ExcelReader {

    public static void main(String[] args) {
        try {
            // Path to the Excel file
            FileInputStream fis = new FileInputStream(new File("C:\\Users\\Deepak\\Documents\\EmployeeList.xlsx"));

            // Load workbook
            Workbook workbook = WorkbookFactory.create(fis);

            // Load specific sheet
            Sheet sheet = workbook.getSheetAt(0); // or use workbook.getSheet("Sheet1");

            
            //Method 1st
            // get perticular data from sheet
            // if you are using Method 1, comment Method 2
            
            Row row = sheet.getRow(1); // 1st row (index starts at 0)
            Cell cell = row.getCell(1); // 1st column (index starts at 0)

            if (cell != null) {
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.println("Value: " + cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.println("Value: " + cell.getNumericCellValue());
                        break;
                    default:
                        System.out.println("Unsupported cell type");
                }
            } else {
                System.out.println("Cell is empty");
            }

            
            //Method 2nd
            // get all data from sheet
            // if you are using Method 2, comment Method 1
            // Loop through rows and cells
            
//            for (Row row : sheet) {
//                for (Cell cell : row) {
//                    // Read cell based on its type
//                    switch (cell.getCellType()) {
//                        case STRING:
//                            System.out.print(cell.getStringCellValue() + "\t");
//                            break;
//                        case NUMERIC:
//                            System.out.print(cell.getNumericCellValue() + "\t");
//                            break;
//                        default:
//                            System.out.print(" \t");
//                    }
//                }
//                System.out.println(); // Move to next line after each row
//            }

            workbook.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
