package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception{
       String jdbcUrl="jdbc:mysql://localhost:3306/mydb";
       String userName="root";
       String password="badari";
       String sqlQuery="select * from emp";
       String filePath="C:\\Users\\kplha\\OneDrive\\Desktop\\java programs\\Data.xlsx";
       try
           (Connection connection= DriverManager.getConnection(jdbcUrl,userName,password);
           Statement st= connection.createStatement();
           ResultSet rs=st.executeQuery(sqlQuery);){

           Workbook workbook=new XSSFWorkbook();
           Sheet sheet= workbook.createSheet("Data");
           Row headerRow = sheet.createRow(0);
           ResultSetMetaData metaData = rs.getMetaData();
           int columnCount = metaData.getColumnCount();
           for (int i = 1; i <= columnCount; i++) {
               Cell cell = headerRow.createCell(i - 1);
               cell.setCellValue(metaData.getColumnName(i));
           }

           // Populate data rows
           int rowNum = 1;
           while (rs.next()) {
               Row row = sheet.createRow(rowNum++);
               for (int i = 1; i <= columnCount; i++) {
                   Cell cell = row.createCell(i - 1);
                   cell.setCellValue(rs.getString(i));
               }
           }

           // Write the workbook to a file
           FileOutputStream outputStream = new FileOutputStream(filePath);
           workbook.write(outputStream);
           workbook.close();
           outputStream.close();

           System.out.println("Excel file created successfully.");

       } catch (SQLException | IOException e) {
           e.printStackTrace();
       }

       }
     }

