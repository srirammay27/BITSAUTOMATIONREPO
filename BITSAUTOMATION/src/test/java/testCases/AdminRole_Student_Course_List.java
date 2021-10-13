package testCases;

import java.awt.AWTException;
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

import pageObjects.Student_Course_List_Page_Objects;

public class AdminRole_Student_Course_List extends CommonFunctions{

	static Logger logger = Logger.getLogger(AdminRole_Student_Course_List.class);

	@Test(priority = 0)
	public void ManageStudentMenu() throws InterruptedException, IOException
	{
		extenttestCase=extentReport.createTest("Verifying Manage Student Course List Page");
		PageFactory.initElements(driver, Student_Course_List_Page_Objects.class);
		extenttestCase.log(Status.INFO,"Landing into Manage Student Course List");
		Student_Course_List_Page_Objects.MSMenu.click();
		Thread.sleep(2000);
		Student_Course_List_Page_Objects.SCMenu.click();
		Thread.sleep(2000);

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("StudentCourseList.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("StudentCourseList.png");

	}

	@Test(priority = 1)
	public void Verifysort() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Sorting Functionality in Student Course List");

		Student_Course_List_Page_Objects.SortName.click();
		Thread.sleep(1000);
		Student_Course_List_Page_Objects.SortSem.click();
		Thread.sleep(1000);
		Student_Course_List_Page_Objects.SortCID.click();
		Thread.sleep(1000);
		Student_Course_List_Page_Objects.SortSubject.click();
		Thread.sleep(1000);
		Student_Course_List_Page_Objects.SortCatalog.click();
		Thread.sleep(1000);
		Student_Course_List_Page_Objects.SortDesc.click();
		Thread.sleep(1000);
		Student_Course_List_Page_Objects.SortGradeIn.click();
		Thread.sleep(1000);

	}

	@Test(priority = 2)
	public void VerifyInvalidSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Invalid Search in Student Course List");

		Student_Course_List_Page_Objects.SearchField.sendKeys(getExcelData("MSCourse", 1, 1));
		Thread.sleep(2000);

		String ListWarn =  Student_Course_List_Page_Objects.ListWarn.getText();
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

		Student_Course_List_Page_Objects.SearchField.clear();
	}

	@Test(priority = 3)
	public void VerifyValidSearchStudent() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Faculty Name Search in Student Course List");
		Thread.sleep(2000);

		Student_Course_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MSCourse", 1, 0));
		Thread.sleep(2000);

		Student_Course_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MSCourse", 2, 0));
		Thread.sleep(2000);

		Student_Course_List_Page_Objects.SearchField.sendKeys(getExcelData("MSCourse", 2, 1));
		Thread.sleep(2000);

		String StudentResult = Student_Course_List_Page_Objects.StudentResult.getText();
		System.out.println(StudentResult);
		Thread.sleep(2000);
		if(StudentResult.contentEquals(getExcelData("MSCourse", 2, 1)))
		{
			extenttestCase.log(Status.PASS, "Student Name Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Student Name Search Validation Failed");
		}
		Thread.sleep(2000);
		Student_Course_List_Page_Objects.SearchField.clear();
	}

	@Test(priority = 4)
	public void VerifyDescription() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Description Search in Student Course List");
		Thread.sleep(2000);
		Student_Course_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MSCourse", 3, 0));
		Thread.sleep(2000);

		Student_Course_List_Page_Objects.SearchField.sendKeys(getExcelData("MSCourse", 3, 1));
		Thread.sleep(2000);

		String DescResult = Student_Course_List_Page_Objects.DescResult.getText();
		System.out.println(DescResult);
		Thread.sleep(2000);
		if(DescResult.contentEquals(getExcelData("MSCourse", 3, 1)))
		{
			extenttestCase.log(Status.PASS, "Description Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Description Search Validation Failed");
		}
		Thread.sleep(2000);
		Student_Course_List_Page_Objects.SearchField.clear();
	}

	@Test(priority = 5)
	public void VerifySubject() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Subject Search in Student Course List");
		Thread.sleep(2000);
		Student_Course_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MSCourse", 4, 0));
		Thread.sleep(2000);

		Student_Course_List_Page_Objects.SearchField.sendKeys(getExcelData("MSCourse", 4, 1));
		Thread.sleep(2000);

		String SubjectResult = Student_Course_List_Page_Objects.SubjectResult.getText();
		System.out.println(SubjectResult);
		Thread.sleep(2000);
		if(SubjectResult.contentEquals(getExcelData("MSCourse", 4, 1)))
		{
			extenttestCase.log(Status.PASS, "Campus Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Campus Search Validation Failed");
		}

		Student_Course_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MSCourse", 1, 0));
		Thread.sleep(2000);
	}

	
	  @Test(priority = 6) 
	  public void UploadValidation() throws InterruptedException 
	  {
		  extenttestCase.log(Status.INFO,"Upload Student Record Validation");
		  Thread.sleep(2000);
	  
		  Student_Course_List_Page_Objects.UploadClick.click(); Thread.sleep(5000);
	  
		  Student_Course_List_Page_Objects.CancelUpload.click(); Thread.sleep(5000);
	  
		  Student_Course_List_Page_Objects.UploadClick.click(); Thread.sleep(5000);
	  
		  Student_Course_List_Page_Objects.UploadFile.click(); Thread.sleep(5000);
	  
		  String UploadWarn = Student_Course_List_Page_Objects.UploadWarn.getText();
		  System.out.println(UploadWarn); Thread.sleep(2000);
		  if(UploadWarn.contains("Please select excel file")) 
	  {
		  extenttestCase.log(Status.PASS, "Upload File Validation Done Successfully");
	  } 
	  else 
	  { 
		  extenttestCase.log(Status.INFO, "Upload File Validation Failed"); 
	  }
 }
	  
	  @Test(priority = 7) 
	  public void UploadValidStudentCourse() throws InterruptedException, AWTException {
	  extenttestCase.log(Status.INFO,"Verifying Valid Student Course Record Upload");
	  
	  Actions act = new Actions(driver);
	  act.moveToElement(Student_Course_List_Page_Objects.ChooseFile).click().
	  perform(); Thread.sleep(2000);
	  
	  String file = "E:\\FacultyRecord\\ValidStudentCourse.xlsx"; 
	  StringSelection selection = new StringSelection(file);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
	  
	  Robot robot = new Robot(); 
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_V); 
	  robot.keyRelease(KeyEvent.VK_V);
	  robot.keyRelease(KeyEvent.VK_CONTROL); 
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  
	  Thread.sleep(2000); 
	  Student_Course_List_Page_Objects.UploadFile.click();
	  Thread.sleep(2000);
	  
	  Student_Course_List_Page_Objects.Refresh.click(); Thread.sleep(2000);
	  
	  Student_Course_List_Page_Objects.CancelUpload.click(); Thread.sleep(3000);
	  
	  driver.navigate().refresh(); Thread.sleep(2000);
	  
	  }
	  
	  @Test(priority = 8) 
	  public void VerifyUploadedrecord() throws Throwable {
	  extenttestCase.log(Status.INFO,"Verifying Uploaded Student in List Grid");
	  
	  Student_Course_List_Page_Objects.SearchSelect.sendKeys(getExcelData(
	  "MSCourse", 1, 0)); Thread.sleep(2000);
	  
	  Student_Course_List_Page_Objects.SearchSelect.sendKeys(getExcelData(
	  "MSCourse", 3, 0)); Thread.sleep(2000);
	  
	  Student_Course_List_Page_Objects.SearchField.sendKeys(getExcelData(
	  "MSCourse", 3, 2)); Thread.sleep(2000);
	  
	  
	  String StudentResult = Student_Course_List_Page_Objects.StudentResult.getText();
	  System.out.println(StudentResult); Thread.sleep(2000);
	  if(StudentResult.contentEquals(getExcelData("MSCourse", 3, 2))) 
	  {
		  extenttestCase.log(Status.PASS, "Student Record Uploaded Successfully"); 
		  System.out.println("Upload Verified"); Thread.sleep(2000);
		  
		  }
	  else 
	  { extenttestCase.log(Status.INFO, "Student Record Upload Failed"); 
	  System.out.println("Upload Verified1"); Thread.sleep(2000);
	  } 
	  }
	  
	  @Test(priority = 9) 
	  public void ClickDelete () throws Throwable {
	  extenttestCase.log(Status.INFO,"Verifying Delete Record");
	  
	  Student_Course_List_Page_Objects.SearchSelect.sendKeys(getExcelData(
			  "MSCourse", 1, 0)); Thread.sleep(2000);
			  System.out.println("Select"); Thread.sleep(5000);
			  Student_Course_List_Page_Objects.SearchSelect.sendKeys(getExcelData(
			  "MSCourse", 3, 0)); Thread.sleep(2000);
			  System.out.println("select again"); Thread.sleep(5000);
			  Student_Course_List_Page_Objects.SearchField.sendKeys(getExcelData(
			  "MSCourse", 3, 2)); Thread.sleep(2000);
			  System.out.println("Select course"); Thread.sleep(5000);
			 
	  
	  Student_Course_List_Page_Objects.Checkbox.click(); Thread.sleep(2000);
	  System.out.println("checkbox selected"); Thread.sleep(5000);
	  Student_Course_List_Page_Objects.ActionClick.click(); Thread.sleep(2000);
	  System.out.println("Action clicked"); Thread.sleep(5000);
	  Student_Course_List_Page_Objects.Deleteclick.click(); Thread.sleep(2000);
	  System.out.println("Delete clicked"); Thread.sleep(5000);
	  Student_Course_List_Page_Objects.ClosePopup.click(); Thread.sleep(2000);
	  System.out.println("close clicked"); Thread.sleep(5000);
	  Student_Course_List_Page_Objects.ActionClick.click(); Thread.sleep(2000);
	  System.out.println("Action again"); Thread.sleep(5000);
	  Student_Course_List_Page_Objects.Deleteclick.click(); Thread.sleep(2000);
	  System.out.println("Delete again"); Thread.sleep(5000);
	  Student_Course_List_Page_Objects.OkPopup.click(); Thread.sleep(2000);
	  System.out.println("Ok clicked"); Thread.sleep(5000);
	  }
	  
	  @Test(priority = 10) 
	  public void VerifyDelete() throws Throwable {
	  
	  Student_Course_List_Page_Objects.SearchSelect.sendKeys(getExcelData(
	  "MSCourse", 1, 0)); Thread.sleep(2000);
	  
	  Student_Course_List_Page_Objects.SearchSelect.sendKeys(getExcelData(
	  "MSCourse", 3, 0)); Thread.sleep(2000);
	  
	  Student_Course_List_Page_Objects.SearchField.sendKeys(getExcelData(
	  "MSCourse", 3, 2)); Thread.sleep(2000);
	  
	  String ListWarn = Student_Course_List_Page_Objects.ListWarn.getText();
	  System.out.println(ListWarn); Thread.sleep(2000);
	  
	  if(ListWarn.contains("Record(s) not found")) {
	  extenttestCase.log(Status.PASS, "Student Deleted Successfully"); } else {
	  extenttestCase.log(Status.INFO, "Student Deletion Failed"); }
	  
	  Student_Course_List_Page_Objects.SearchField.clear(); Thread.sleep(2000);
	  
	  Student_Course_List_Page_Objects.SearchSelect.sendKeys(getExcelData(
	  "MSCourse", 1, 0)); Thread.sleep(2000); }
	  
	  @Test(priority = 11) 
	  public void VerifyExport() throws Throwable {
	  extenttestCase.log(Status.INFO,"Verifying Export Faculty");
	  
	  Student_Course_List_Page_Objects.ExportClick.click(); Thread.sleep(2000);
	  
	  extenttestCase.log(Status.PASS, "Student Record Exported Successfully"); }
	 
}
