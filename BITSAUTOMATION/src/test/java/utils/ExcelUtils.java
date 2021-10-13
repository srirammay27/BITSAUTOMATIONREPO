package utils;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtils {
	
	static String ProjectPath;
	static XSSFWorkbook  workbook;
	static XSSFSheet sheet;
	public static String username;

	 public static String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable{
		 FileInputStream fis = new FileInputStream("C:\\Users\\rajeev_m\\git\\repository\\BITSAUTOMATION\\excel\\TestData.xlsx");
		      Workbook wb = WorkbookFactory.create(fis);
		      Sheet sh = wb.getSheet(sheetName);
		      Row row = sh.getRow(rowNum);
		      String data = row.getCell(colNum).getStringCellValue();
		      wb.close();
		 return data;
	 }
		 public static int getExcelData1(String sheetName, int rowNum, int colNum) throws Throwable{
			 FileInputStream fis = new FileInputStream("C:\\Users\\rajeev_m\\git\\repository\\BITSAUTOMATION\\excel\\TestData.xlsx");
			      Workbook wb = WorkbookFactory.create(fis);
			      Sheet sh = wb.getSheet(sheetName);
			      Row row = sh.getRow(rowNum);
			      int data1 = (int) row.getCell(colNum).getNumericCellValue();
			      wb.close();
			 return data1;
			 }
			  
			  public static int getCellCount(String sheetName) throws Throwable {
			    FileInputStream fis = new FileInputStream("C:\\Users\\rajeev_m\\git\\repository\\BITSAUTOMATION\\excel\\TestData.xlsx");
			 Workbook wb = WorkbookFactory.create(fis);
			 Sheet sh = wb.getSheet(sheetName);
			 Row row = sh.getRow(0);
			 int cell = row.getLastCellNum();
			 return cell;
			 }

			 public static int getExcelRandomRowNum(String sheetName) throws Throwable{
			 FileInputStream fis = new FileInputStream("C:\\Users\\rajeev_m\\git\\repository\\BITSAUTOMATION\\excel\\TestData.xlsx");
			      Workbook wb = WorkbookFactory.create(fis);
			      Sheet sh = wb.getSheet(sheetName);
			      Random rand = new Random();
			      int rowNum = rand.nextInt(sh.getLastRowNum());
			      return rowNum;
			 }
			 public static void setExcelData(String sheetName, int rowNum, int colNum,String data) throws Throwable{
			 FileInputStream fis = new FileInputStream("C:\\Users\\rajeev_m\\git\\repository\\BITSAUTOMATION\\excel\\TestData.xlsx");
			      Workbook wb = WorkbookFactory.create(fis);
			      Sheet sh = wb.getSheet(sheetName);
			      Row row = sh.getRow(rowNum);
			      Cell cel = row.createCell(colNum);
			      cel.setCellValue(data);
			      FileOutputStream fos = new FileOutputStream("C:\\Users\\rajeev_m\\git\\repository\\BITSAUTOMATION\\excel\\TestData_Out.xlsx");
			 wb.write(fos);
			 wb.close();
			 }
			 public static int getRowCount(String sheetName) throws Throwable {
			 FileInputStream fis = new FileInputStream("C:\\Users\\rajeev_m\\git\\repository\\BITSAUTOMATION\\excel\\TestData.xlsx");
			      Workbook wb = WorkbookFactory.create(fis);
			      int rowIndex = wb.getSheet(sheetName).getLastRowNum();
			      return rowIndex;
			 }

			 public static void setExcelDataInteg(String sheetName, int rowNum, int colNum,int data) throws Throwable{
			 FileInputStream fis = new FileInputStream("C:\\Users\\rajeev_m\\git\\repository\\BITSAUTOMATION\\excel\\TestData.xlsx");
			      Workbook wb = WorkbookFactory.create(fis);
			      Sheet sh = wb.getSheet(sheetName);
			      Row row = sh.getRow(rowNum);
			      Cell cel = row.createCell(colNum);
			      cel.setCellValue(data);
			      FileOutputStream fos = new FileOutputStream("C:\\Users\\rajeev_m\\git\\repository\\BITSAUTOMATION\\excel\\TestData_Out.xlsx");
			 wb.write(fos);
			 wb.close();
	 }
			 public String getUserName() throws IOException  {
					FileInputStream fs = new FileInputStream("C:\\Users\\rajeev_m\\git\\repository\\BITSAUTOMATION\\excel\\TestData.xlsx");
					workbook=new XSSFWorkbook(fs);
					XSSFSheet sheet = workbook.getSheetAt(0);
					Row row = sheet.getRow(1);
					Cell cell = row.getCell(0);
					/*System.out.println("first"+cell);
					Row row1 = sheet.getRow(1);
					Cell cell1 = row1.getCell(1);
					System.out.println("second"+cell1);
					Row row2 = sheet.getRow(1);
					Cell cell2 = row2.getCell(1);
					System.out.println(cell2);
					Row row3 = sheet.getRow(1);
					Cell cell3 = row3.getCell(1);
					System.out.println(cell3);*/
					username =cell.toString();
					return username;
				}
			 
/*//////////////////////////////Excel Code /////////////////////////////////////
				
public static String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable{
FileInputStream fis = new FileInputStream("C:\\Users\\rajeev_m\\eclipse-workspace\\BITSAUTOMATION\\excel\\TestData.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet(sheetName);
Row row = sh.getRow(rowNum);
String data = row.getCell(colNum).getStringCellValue();
wb.close();
return data;
}

public static int getExcelData1(String sheetName, int rowNum, int colNum) throws Throwable{
FileInputStream fis = new FileInputStream("C:\\Users\\rajeev_m\\eclipse-workspace\\BITSAUTOMATION\\excel\\TestData.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet(sheetName);
Row row = sh.getRow(rowNum);
int data1 = (int) row.getCell(colNum).getNumericCellValue();
wb.close();
return data1;
}

public static int getCellCount(String sheetName) throws Throwable {
FileInputStream fis = new FileInputStream("C:\\Users\\rajeev_m\\eclipse-workspace\\BITSAUTOMATION\\excel\\TestData.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet(sheetName);
Row row = sh.getRow(0);
int cell = row.getLastCellNum();
return cell;
}

public static int getExcelRandomRowNum(String sheetName) throws Throwable{
FileInputStream fis = new FileInputStream("C:\\Users\\rajeev_m\\eclipse-workspace\\BITSAUTOMATION\\excel\\TestData.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet(sheetName);
Random rand = new Random();
int rowNum = rand.nextInt(sh.getLastRowNum());
return rowNum;
}
public static void setExcelData(String sheetName, int rowNum, int colNum,String data) throws Throwable{
FileInputStream fis = new FileInputStream("C:\\Users\\rajeev_m\\eclipse-workspace\\BITSAUTOMATION\\excel\\TestData.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet(sheetName);
Row row = sh.getRow(rowNum);
Cell cel = row.createCell(colNum);
cel.setCellValue(data);
FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\rajeev_m\\\\eclipse-workspace\\\\BITSAUTOMATION\\\\excel\\\\TestData.xlsx");
wb.write(fos);
wb.close();
}

public static int getRowCount(String sheetName) throws Throwable {
FileInputStream fis = new FileInputStream("C:\\Users\\rajeev_m\\eclipse-workspace\\BITSAUTOMATION\\excel\\TestData.xlsx");
Workbook wb = WorkbookFactory.create(fis);
int rowIndex = wb.getSheet(sheetName).getLastRowNum();
return rowIndex;
}

public static void setExcelDataInteg(String sheetName, int rowNum, int colNum,int data) throws Throwable{
FileInputStream fis = new FileInputStream("C:\\Users\\rajeev_m\\eclipse-workspace\\BITSAUTOMATION\\excel\\TestData.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet(sheetName);
Row row = sh.getRow(rowNum);
Cell cel = row.createCell(colNum);
cel.setCellValue(data);
FileOutputStream fos = new FileOutputStream("C:\\Users\\rajeev_m\\eclipse-workspace\\BITSAUTOMATION\\excel\\TestData.xlsx");
wb.write(fos);
wb.close();

}*/

}
