package testCases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import pageObjects.StudentSem_Allot_List_Page_Objects;

public class StudentSem_Allot_List extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(StudentSem_Allot_List.class);
	
	@Test(priority = 0)
	public void SSemAllotMenu() throws InterruptedException, IOException
	{
		extenttestCase=extentReport.createTest("Verifying Student Semester Allotment List Page");
		PageFactory.initElements(driver, StudentSem_Allot_List_Page_Objects.class);
		extenttestCase.log(Status.INFO,"Landing into Student Semester Allotment List");
		StudentSem_Allot_List_Page_Objects.SAMenu.click();
		Thread.sleep(2000);
		StudentSem_Allot_List_Page_Objects.SSAMenu.click();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("StudentSemAllotList.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("StudentSemAllotList.png");
	}
	
	@Test(priority = 1)
	public void Verifysort() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Sorting Functionality in Manage Faculty List");

		StudentSem_Allot_List_Page_Objects.SortSName.click();
		Thread.sleep(1000);
		StudentSem_Allot_List_Page_Objects.SortCampus.click();
		Thread.sleep(1000);
		StudentSem_Allot_List_Page_Objects.SortTag.click();
		Thread.sleep(1000);
		StudentSem_Allot_List_Page_Objects.SortCGPA.click();
		Thread.sleep(1000);
		StudentSem_Allot_List_Page_Objects.SortPrefer.click();
		Thread.sleep(1000);
		
	}
	
	@Test(priority = 2)
	public void VerifyInvalidSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Invalid Search in Manage Faculty List");

		StudentSem_Allot_List_Page_Objects.SearchField.sendKeys(getExcelData("SSAllot", 1, 1));
		Thread.sleep(2000);

		String ListWarn =  StudentSem_Allot_List_Page_Objects.ListWarn.getText();
		System.out.println(ListWarn);
		Thread.sleep(2000);

		if(ListWarn.contains("Record(s) not found"))
		{
			extenttestCase.log(Status.PASS, "Invalid Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Invalid Search Validation Failed");
		}
		
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	
	@Test(priority = 3)
	public void VerifyValidSearchStudent() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Student Name Search in Semester Allotment List");
		Thread.sleep(2000);

		StudentSem_Allot_List_Page_Objects.SearchSelect.sendKeys(getExcelData("SSAllot", 2, 0));
		Thread.sleep(2000);

		StudentSem_Allot_List_Page_Objects.SearchField.sendKeys(getExcelData("SSAllot", 2, 1));
		Thread.sleep(2000);
		
		StudentSem_Allot_List_Page_Objects.SearchCampus.sendKeys(getExcelData("SSAllot", 2, 2));
		Thread.sleep(2000);
		
		StudentSem_Allot_List_Page_Objects.SearchGot.sendKeys(getExcelData("SSAllot", 2, 3));
		Thread.sleep(2000);
		
		StudentSem_Allot_List_Page_Objects.SearchSem.sendKeys(getExcelData("SSAllot", 2, 4));
		Thread.sleep(2000);

		String StudentResult = StudentSem_Allot_List_Page_Objects.StudentResult.getText();
		System.out.println(StudentResult);

		String CampusResult = StudentSem_Allot_List_Page_Objects.CampusResult.getText();
		System.out.println(CampusResult);

		String GotResult = StudentSem_Allot_List_Page_Objects.GotResult.getText();
		System.out.println(GotResult);
		
		String SemResult = StudentSem_Allot_List_Page_Objects.SemResult.getText();
		System.out.println(SemResult);
		
		Thread.sleep(2000);
		if(StudentResult.contentEquals(getExcelData("SSAllot", 2, 1)) && CampusResult.contentEquals(getExcelData("SSAllot", 2, 2)) 
			&& GotResult.contentEquals(getExcelData("SSAllot", 2, 3)) && SemResult.contentEquals(getExcelData("SSAllot", 2, 4)))
		{
			extenttestCase.log(Status.PASS, "Student Name Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Student Name Search Validation Failed");
		}
	
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

	@Test(priority = 4)
	public void VerifyValidSearchCampusID() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Campus ID Search in Semester Allotment List");
		Thread.sleep(2000);

		StudentSem_Allot_List_Page_Objects.SearchSelect.sendKeys(getExcelData("SSAllot", 3, 0));
		Thread.sleep(2000);

		StudentSem_Allot_List_Page_Objects.SearchField.sendKeys(getExcelData("SSAllot", 3, 1));
		Thread.sleep(2000);
		
		StudentSem_Allot_List_Page_Objects.SearchCampus.sendKeys(getExcelData("SSAllot", 3, 2));
		Thread.sleep(2000);
		
		StudentSem_Allot_List_Page_Objects.SearchGot.sendKeys(getExcelData("SSAllot", 3, 3));
		Thread.sleep(2000);
		
		StudentSem_Allot_List_Page_Objects.SearchSem.sendKeys(getExcelData("SSAllot", 3, 4));
		Thread.sleep(2000);

		String CIDResult = StudentSem_Allot_List_Page_Objects.CIDResult.getText();
		System.out.println(CIDResult);

		String CampusResult = StudentSem_Allot_List_Page_Objects.CampusResult.getText();
		System.out.println(CampusResult);

		String GotResult = StudentSem_Allot_List_Page_Objects.GotResult.getText();
		System.out.println(GotResult);

		String SemResult = StudentSem_Allot_List_Page_Objects.SemResult.getText();
		System.out.println(SemResult);
		
		Thread.sleep(2000);
		if(CIDResult.contentEquals(getExcelData("SSAllot", 3, 1)) && CampusResult.contentEquals(getExcelData("SSAllot", 3, 2)) 
			&& GotResult.contentEquals(getExcelData("SSAllot", 3, 3)) && SemResult.contentEquals(getExcelData("SSAllot", 3, 4)))
		{
			extenttestCase.log(Status.PASS, "Campus ID Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Campus ID Search Validation Failed");
		}
	
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	
	@Test(priority = 5)
	public void checkSemI() throws Throwable
	{
		StudentSem_Allot_List_Page_Objects.SearchSem.sendKeys(getExcelData("SSAllot", 4, 4));
		Thread.sleep(3000);
		
		List<WebElement> row = StudentSem_Allot_List_Page_Objects.row;
		int rowsize = row.size();
		System.out.println("Number of Rows is "+rowsize);
		int actualrow = rowsize-1;
		System.out.println("Number of actual Rows is "+actualrow);
		
		List<WebElement> col = StudentSem_Allot_List_Page_Objects.col;
		System.out.println("Number of Columns is "+col.size());
		Thread.sleep(2000);
		
		String ListResult = StudentSem_Allot_List_Page_Objects.ListResult.getText();
		String exact = ListResult.substring(11);
		int ExactValue = Integer.parseInt(exact);
		System.out.println(ExactValue);
		
		try {
			
			Assert.assertEquals(actualrow, ExactValue);
			extenttestCase.log(Status.PASS, "Record List Count Matched with Search Criteria for First Semester");
			
		} catch (Exception e) {
			extenttestCase.log(Status.FAIL, "Record List Count Mismatched with Search Criteria for First Semester");
		}
	}
	
	@Test(priority = 6)
	public void checkSemII() throws Throwable
	{
		StudentSem_Allot_List_Page_Objects.SearchSem.sendKeys(getExcelData("SSAllot", 5, 4));
		Thread.sleep(3000);
		
		List<WebElement> row = StudentSem_Allot_List_Page_Objects.row;
		int rowsize = row.size();
		System.out.println("Number of Rows is "+rowsize);
		int actualrow = rowsize-1;
		System.out.println("Number of actual Rows is "+actualrow);
		
		List<WebElement> col = StudentSem_Allot_List_Page_Objects.col;
		System.out.println("Number of Columns is "+col.size());
		Thread.sleep(2000);
		
		String ListResult = StudentSem_Allot_List_Page_Objects.ListResult.getText();
		String exact = ListResult.substring(11);
		int ExactValue = Integer.parseInt(exact);
		System.out.println(ExactValue);
		
		try {
			
			Assert.assertEquals(actualrow, ExactValue);
			extenttestCase.log(Status.PASS, "Record List Count Matched with Search Criteria for Second Semester");
			
		} catch (Exception e) {
			extenttestCase.log(Status.FAIL, "Record List Count Mismatched with Search Criteria for Second Semester");
		}
	}

	@Test(priority = 7)
	public void checkbothSem() throws Throwable
	{
		StudentSem_Allot_List_Page_Objects.SearchSem.sendKeys(getExcelData("SSAllot", 6, 4));
		Thread.sleep(3000);
		
		List<WebElement> row = StudentSem_Allot_List_Page_Objects.row;
		int rowsize = row.size();
		System.out.println("Number of Rows is "+rowsize);
		int actualrow = rowsize-1;
		System.out.println("Number of actual Rows is "+actualrow);
		
		List<WebElement> col = StudentSem_Allot_List_Page_Objects.col;
		System.out.println("Number of Columns is "+col.size());
		Thread.sleep(2000);
		
		String ListResult = StudentSem_Allot_List_Page_Objects.ListResult.getText();
		String exact = ListResult.substring(11);
		int ExactValue = Integer.parseInt(exact);
		System.out.println(ExactValue);
		
		try {
			
			Assert.assertEquals(actualrow, ExactValue);
			extenttestCase.log(Status.PASS, "Record List Count Matched with Search Criteria for Both Semester");
			
		} catch (Exception e) {
			extenttestCase.log(Status.FAIL, "Record List Count Mismatched with Search Criteria for Both Semester");
		}
		
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	@Test(priority = 8)
	public void CheckUpdate() throws Throwable
	{
		StudentSem_Allot_List_Page_Objects.SearchField.sendKeys(getExcelData("SSAllot", 4, 1));
		Thread.sleep(2000);
		
		StudentSem_Allot_List_Page_Objects.TickSemI.click();
		Thread.sleep(2000);
		
		StudentSem_Allot_List_Page_Objects.ClickUpdate.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Student Semester Allotment Updated Successfully");
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		StudentSem_Allot_List_Page_Objects.ClickPublish.click();
		Thread.sleep(2000);
		
		StudentSem_Allot_List_Page_Objects.ClosePublish.click();
		Thread.sleep(2000);
		
		StudentSem_Allot_List_Page_Objects.ClickPublish.click();
		Thread.sleep(2000);
		
		StudentSem_Allot_List_Page_Objects.OkPublish.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Student Semester Allotment Published Successfully");
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}
	


}
