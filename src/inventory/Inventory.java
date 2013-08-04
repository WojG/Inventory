/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.*;

/**
 *
 * @author WojG
 */
public class Inventory
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try
        {
            FileInputStream input = new FileInputStream(new File("2010 System.xls"));

            //Get the workbook instance for XLS file 
            HSSFWorkbook my_xls_workbook = new HSSFWorkbook(input);

            //Get first sheet from the workbook
            HSSFSheet my_worksheet = my_xls_workbook.getSheetAt(2);

            //Iterate through each rows from first sheet
            Iterator<Row> rowIterator = my_worksheet.iterator();
            /*   FileWriter my_csv = new FileWriter("convertedCSVFile.csv");
             CSVWriter my_csv_output = new CSVWriter(my_csv);*/
            ArrayList<String> header = new ArrayList();
            ArrayList<String> inv = new ArrayList();
            int i = 0;
            while (rowIterator.hasNext())
            {
                Row row = rowIterator.next();

                //For each row, iterate through each columns
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext())
                {
                    //Fetch CELL
                    Cell cell = cellIterator.next();

                    if (row.getRowNum() == 0)
                    {
                        if (cell.getCellType() == Cell.CELL_TYPE_STRING)
                        {
                            header.add(cell.getStringCellValue());
                        }                        
                    }
                    
                    else 
                    {
                        switch (cell.getCellType())
                        {
                            case Cell.CELL_TYPE_STRING:
                                inv.add(cell.getStringCellValue());
                                break;
                            case Cell.CELL_TYPE_NUMERIC:
                               // inv.add(cell.getNumericCellValue());
                                break;                            
                        }
                    }
                    System.out.println(header.get(i) + " -> " + header.size());
                    i++;
                }

            }
            //      my_csv_output.close(); //close the CSV file
            //we created our file..!!
            //   FileOutputStream out = new FileOutputStream(new File("test.xls"));
            //   my_xls_workbook.write(out);
            input.close(); //close xls 

        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex)
        {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
