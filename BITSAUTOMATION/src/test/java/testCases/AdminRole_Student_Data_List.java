package testCases;

//import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
//import pageObjects.ManageFaculty_List_Page_Objects;
//import pageObjects.Student_Course_List_Page_Objects;
import pageObjects.Student_Data_List_Page_Objects;

public class AdminRole_Student_Data_List extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(AdminRole_Student_Data_List.class);
	
	@Test(priority = 0)
	public void StudentDataMenu() throws InterruptedException, IOException
	{
		extenttestCase=extentReport.createTest("Verifying Manage Student Data List Page");
		PageFactory.initElements(driver, Student_Data_List_Page_Objects.class);
		extenttestCase.log(Status.INFO,"Landing into Manage Student Data List");
		Student_Data_List_Page_Objects.MSMenu.click();
		Thread.sleep(2000);
		Student_Data_List_Page_Objects.SDMenu.click();
		Thread.sleep(2000);

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("StudentDataList.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("StudentDataList.png");

	}
	
	@Test(priority = 1)
	public void Verifysort() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Sorting Functionality in Student Data List");

		Student_Data_List_Page_Objects.SortName.click();
		Thread.sleep(1000);
		Student_Data_List_Page_Objects.SortCGPA.click();
		Thread.sleep(1000);
		Student_Data_List_Page_Objects.SortCampus.click();
		Thread.sleep(1000);

	}
	
	@Test(priority = 2)
	public void VerifyInvalidSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Invalid Search in Student Data List");

		Student_Data_List_Page_Objects.SearchField.sendKeys(getExcelData("MSData", 1, 1));
		Thread.sleep(2000);

		String ListWarn =  Student_Data_List_Page_Objects.ListWarn.getText();
		System.out.println(ListWarn);
		Thread.sleep(2000);

		if(ListWarn.contains("Record(s) not found"))
		{
			extenttestCase.log(Status.PASS, "Invalid Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Invalid Search Validation Failed");
		}

		Student_Data_List_Page_Objects.SearchField.clear();
	}

	@Test(priority = 3)
	public void VerifyValidSearchStudent() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Faculty Name Search in Student Data List");
		Thread.sleep(2000);

		Student_Data_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MSData", 1, 0));
		Thread.sleep(2000);

		Student_Data_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MSData", 2, 0));
		Thread.sleep(2000);

		Student_Data_List_Page_Objects.SearchField.sendKeys(getExcelData("MSData", 2, 1));
		Thread.sleep(2000);

		String StudentResult = Student_Data_List_Page_Objects.StudentResult.getText();
		System.out.println(StudentResult);
		Thread.sleep(2000);
		if(StudentResult.contentEquals(getExcelData("MSData", 2, 1)))
		{
			extenttestCase.log(Status.PASS, "Student Name Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Student Name Search Validation Failed");
		}
		Thread.sleep(2000);
		Student_Data_List_Page_Objects.SearchField.clear();
	}
	
	@Test(priority = 4)
	public void VerifyCampusID() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Campus ID Search in Student Course List");
		Thread.sleep(2000);
		Student_Data_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MSData", 3, 0));
		Thread.sleep(2000);

		Student_Data_List_Page_Objects.SearchField.sendKeys(getExcelData("MSData", 3, 1));
		Thread.sleep(2000);

		String CampusIDResult = Student_Data_List_Page_Objects.CampusIDResult.getText();
		System.out.println(CampusIDResult);
		Thread.sleep(2000);
		if(CampusIDResult.contentEquals(getExcelData("MSData", 3, 1)))
		{
			extenttestCase.log(Status.PASS, "Campus ID Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Campus ID Search Validation Failed");
		}
		Thread.sleep(2000);
		Student_Data_List_Page_Objects.SearchField.clear();
	}
	
	@Test(priority = 5)
	public void VerifyCampusName() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Campus Name Search in Student Course List");
		Thread.sleep(2000);
		Student_Data_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MSData", 4, 0));
		Thread.sleep(2000);

		Student_Data_List_Page_Objects.SearchField.sendKeys(getExcelData("MSData", 4, 1));
		Thread.sleep(2000);

		String CampusNameResult = Student_Data_List_Page_Objects.CampusNameResult.getText();
		System.out.println(CampusNameResult);
		Thread.sleep(2000);
		if(CampusNameResult.contentEquals(getExcelData("MSData", 4, 1)))
		{
			extenttestCase.log(Status.PASS, "Campus Name Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Campus Name Search Validation Failed");
		}

		Student_Data_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MSData", 1, 0));
		Thread.sleep(2000);
	}
	
	  @Test(priority = 6) 
	  public void UploadValidation() throws InterruptedException 
	  {
	  extenttestCase.log(Status.INFO,"Upload Student Data Record Validation");
	  Thread.sleep(2000);
	  
	  Student_Data_List_Page_Objects.UploadClick.click(); 
	  Thread.sleep(2000);
	  
	  Student_Data_List_Page_Objects.CancelUpload.click(); 
	  Thread.sleep(2000);
	  
	  Student_Data_List_Page_Objects.UploadClick.click(); 
	  Thread.sleep(2000);
	  
	  Student_Data_List_Page_Objects.UploadFile.click(); 
	  Thread.sleep(2000);
	  
	  String UploadTypeWarn = Student_Data_List_Page_Objects.UploadTypeWarn.getText();
	  System.out.println(UploadTypeWarn); 
	  
	  String UploadBatchWarn = Student_Data_List_Page_Objects.UploadBatchWarn.getText();
	  System.out.println(UploadBatchWarn); 
	  
	  String UploadWarn = Student_Data_List_Page_Objects.UploadWarn.getText();
	  System.out.println(UploadWarn); 
	  Thread.sleep(2000);
	  
	  if(UploadTypeWarn.contains("PS Type is required") && UploadBatchWarn.contains("Batch is required")
			  && UploadWarn.contains("Please select excel file")) 
	  {
	  extenttestCase.log(Status.PASS, "Upload File Validation Done Successfully");
	  } 
	  else 
	  { 
		  extenttestCase.log(Status.INFO, "Upload File Validation Failed"); }
	  }
	  
	  @Test(priority = 7)
	  public void UploadValidStudent() throws Throwable {
	  extenttestCase.log(Status.INFO,"Verifying Valid Student Record Upload");
	  Student_Data_List_Page_Objects.SelectPSType.sendKeys(getExcelData("MSData", 6, 0));
	  
	  Thread.sleep(2000);
	  
	  Student_Data_List_Page_Objects.SelectPSBatch.sendKeys(getExcelData("MSData", 7, 0));
	  Thread.sleep(2000);
	  
	  Actions act = new Actions(driver);
	  act.moveToElement(Student_Data_List_Page_Objects.ChooseFile).click().
	  perform(); Thread.sleep(2000);
	  
	  String file = "E:\\FacultyRecord\\ValidStudent.xlsx"; 
	  StringSelection
	  selection = new StringSelection(file);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,
	  null);
	  
	  Robot robot = new Robot(); 
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_V); 
	  robot.keyRelease(KeyEvent.VK_V);
	  robot.keyRelease(KeyEvent.VK_CONTROL); 
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  
	  Thread.sleep(2000); 
	  Student_Data_List_Page_Objects.UploadFile.click();
	  Thread.sleep(15000);
	  
	  Student_Data_List_Page_Objects.Refresh.click(); Thread.sleep(2000);
	  Thread.sleep(2000);
	  
	  Student_Data_List_Page_Objects.Refresh.click(); Thread.sleep(2000);
	  Thread.sleep(2000);
	  
	  Student_Data_List_Page_Objects.Refresh.click(); Thread.sleep(2000);
	  Thread.sleep(2000);
	  
	  Student_Data_List_Page_Objects.Refresh.click(); Thread.sleep(2000);
	  Thread.sleep(2000);
	  
	  driver.navigate().refresh(); Thread.sleep(2000);
	  
	  Student_Data_List_Page_Objects.CancelUpload.click(); Thread.sleep(3000);
	  
	  driver.navigate().refresh(); Thread.sleep(2000);
	  
	  }
	  
	 @Test(priority = 8) 
	  public void VerifyUploadedrecord() throws Throwable 
	  {
		  extenttestCase.log(Status.INFO,"Verifying Uploaded Student in List Grid");
		  
		  Student_Data_List_Page_Objects.SearchSelect.sendKeys(getExcelData(
		  "MSData", 1, 0)); Thread.sleep(2000);
		  
		  Student_Data_List_Page_Objects.SearchSelect.sendKeys(getExcelData(
		  "MSData", 2, 0)); Thread.sleep(2000);
		  
		  Student_Data_List_Page_Objects.SearchField.sendKeys(getExcelData(
		  "MSData", 5, 1)); Thread.sleep(2000);
		  
		  Student_Data_List_Page_Objects.PSType.sendKeys(getExcelData(
	      "MSData", 6, 0)); Thread.sleep(2000);
				  
		  Student_Data_List_Page_Objects.PSBatch.sendKeys(getExcelData(
		  "MSData", 7, 0)); Thread.sleep(2000);
		  
		  
		  String StudentResult = Student_Data_List_Page_Objects.StudentResult.getText();
		  System.out.println(StudentResult); 
		  Thread.sleep(2000);
		  if(StudentResult.contentEquals(getExcelData("MSData", 5, 1))) 
		  {
		  extenttestCase.log(Status.PASS, "Student Record Uploaded Successfully"); 
		  }
		  else 
		  { 
			  extenttestCase.log(Status.INFO, "Student Record Upload Failed"); 
			  } 
		  }
		  
	  @Test(priority = 9)
		public void ClickInactive() throws Throwable
		{
			extenttestCase.log(Status.INFO,"Verifying Inactive Record");
			
			Student_Data_List_Page_Objects.MSMenu.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.SDMenu.click();
			Thread.sleep(2000); 
			
			Student_Data_List_Page_Objects.SearchField.clear();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.SearchField.sendKeys(getExcelData("MSData", 5, 1));
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.Checkbox.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.ActionClick.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.Inactiveclick.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.ClosePopup.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.ActionClick.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.Inactiveclick.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.OkPopup.click();
			Thread.sleep(2000);	
		}
	  
	  @Test(priority = 10)
		public void VerifyInactive() throws Throwable
		{
		 
		  	Student_Data_List_Page_Objects.MSMenu.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.SDMenu.click();
			Thread.sleep(2000); 
			
		    Student_Data_List_Page_Objects.SearchField.clear();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.SearchField.sendKeys(getExcelData("MSData", 5, 1));
			Thread.sleep(2000);

			String StatusLabel = Student_Data_List_Page_Objects.StatusLabel.getText();
			System.out.println(StatusLabel);
			Thread.sleep(2000);
			if(StatusLabel.contentEquals("InActive"))
			{
				extenttestCase.log(Status.PASS, "Student Inactivated Successfully");
			}
			else
			{
				extenttestCase.log(Status.FAIL, "Student Inactivation Failed");
			}
		}
	  
	  @Test(priority = 11)
		public void ClickActive() throws Throwable
		{
			extenttestCase.log(Status.INFO,"Verifying Active Record");
			
			Student_Data_List_Page_Objects.MSMenu.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.SDMenu.click();
			Thread.sleep(2000); 
			
		    Student_Data_List_Page_Objects.SearchField.clear();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.SearchField.sendKeys(getExcelData("MSData", 5, 1));
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.Checkbox.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.ActionClick.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.Activeclick.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.ClosePopup.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.ActionClick.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.Activeclick.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.OkPopup.click();
			Thread.sleep(2000);	
		}

	  @Test(priority = 12)
		public void VerifyActive() throws Throwable
		{
			
			Student_Data_List_Page_Objects.MSMenu.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.SDMenu.click();
			Thread.sleep(2000); 
			
		    Student_Data_List_Page_Objects.SearchField.clear();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.SearchField.sendKeys(getExcelData("MSData", 5, 1));
			Thread.sleep(2000);

			String StatusLabel = Student_Data_List_Page_Objects.StatusLabel.getText();
			System.out.println(StatusLabel);
			Thread.sleep(2000);
			if(StatusLabel.contentEquals("Active"))
			{
				extenttestCase.log(Status.PASS, "Student Activated Successfully");
			}
			else
			{
				extenttestCase.log(Status.FAIL, "Student Activation Failed");
			}
		}
	  
	  @Test(priority = 13)
		public void ClickDelete () throws Throwable
		{
			extenttestCase.log(Status.INFO,"Verifying Delete Record");
			
			Student_Data_List_Page_Objects.MSMenu.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.SDMenu.click();
			Thread.sleep(2000); 
			
		    Student_Data_List_Page_Objects.SearchField.clear();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.SearchField.sendKeys(getExcelData("MSData", 5, 1));
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.Checkbox.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.ActionClick.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.Deleteclick.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.ClosePopup.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.ActionClick.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.Deleteclick.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.OkPopup.click();
			Thread.sleep(2000);
		}
	  
	  @Test(priority = 14)
		public void VerifyDelete() throws Throwable
		{
			
			Student_Data_List_Page_Objects.MSMenu.click();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.SDMenu.click();
			Thread.sleep(2000); 
			
		    Student_Data_List_Page_Objects.SearchField.clear();
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.SearchField.sendKeys(getExcelData("MSData", 5, 1));
			Thread.sleep(2000);

			String ListWarn =  Student_Data_List_Page_Objects.ListWarn.getText();
			System.out.println(ListWarn);
			Thread.sleep(2000);

			if(ListWarn.contains("Record(s) not found"))
			{
				extenttestCase.log(Status.PASS, "Student Deleted Successfully");
			}
			else
			{
				extenttestCase.log(Status.FAIL, "Student Deletion Failed");
			}
			
			Student_Data_List_Page_Objects.SearchField.clear();
			Thread.sleep(2000);
		}
	  
	  @Test(priority = 15)
		public void VerifyExport() throws Throwable
		{
			extenttestCase.log(Status.INFO,"Verifying Export Faculty");
			
			Student_Data_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MSData", 1, 0));
			Thread.sleep(2000);
			
			Student_Data_List_Page_Objects.ExportClick.click();
			Thread.sleep(2000);
			
			extenttestCase.log(Status.PASS, "Student Data Exported Successfully");
		}
}
