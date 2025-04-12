package com.deepak.ExcelHandling;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriter {

    public static void main(String[] args) {
        // Create a new workbook
        Workbook workbook = new XSSFWorkbook();

        // Create a sheet
        Sheet sheet = workbook.createSheet("Sheet1");

        // Create rows and cells
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("State");
        headerRow.createCell(2).setCellValue("Capital");
        headerRow.createCell(4).setCellValue("CM");
        headerRow.createCell(7).setCellValue("Deepak");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(1).setCellValue("MH");
        dataRow1.createCell(3).setCellValue("Mumbai");
        dataRow1.createCell(5).setCellValue("DF");
        
        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("MP");
        dataRow2.createCell(4).setCellValue("Bhopal");
        dataRow2.createCell(6).setCellValue("-");
        
        Row dataRow3 = sheet.createRow(3);
        dataRow3.createCell(2).setCellValue("dj");
        
        // Resize columns to fit content
        sheet.autoSizeColumn(0);
        sheet.autoSizeColumn(1);

        // Write the output to a file
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Deepak\\Documents\\EmployeeList.xlsx")) {
            workbook.write(fos);
            workbook.close();
            System.out.println("Excel file written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
