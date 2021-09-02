package testCases;

import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import pageObjects.StudentRoleSem_Allot_List_Page_Objects;

public class StudentRoleSem_Allot_List extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(StudentRoleSem_Allot_List.class);
	
	@Test(priority = 0)
	public void SemAllotMenu() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Semester Allotment List Page");
		PageFactory.initElements(driver, StudentRoleSem_Allot_List_Page_Objects.class);
		extenttestCase.log(Status.INFO,"Landing into Semester Allotment List");
		
		StudentRoleSem_Allot_List_Page_Objects.SemAllotMenu.click();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("SemesterAllotmentList.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("SemesterAllotmentList.png");
		
	}
	
	@Test(priority = 1)
	public void clickEditGrievance() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Navigating to Edit Grievance");
		
		StudentRoleSem_Allot_List_Page_Objects.EditG.click();
		Thread.sleep(2000);
		
		StudentRoleSem_Allot_List_Page_Objects.CancelG.click();
		Thread.sleep(2000);
		
		StudentRoleSem_Allot_List_Page_Objects.CloseG.click();
		Thread.sleep(2000);
		
		StudentRoleSem_Allot_List_Page_Objects.CancelG.click();
		Thread.sleep(2000);
		
		StudentRoleSem_Allot_List_Page_Objects.OkG.click();
		Thread.sleep(2000);
		
		StudentRoleSem_Allot_List_Page_Objects.EditG.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void UpdateGrievance() throws InterruptedException, AWTException
	{
		extenttestCase.log(Status.INFO,"Updating Grievance");
		
		StudentRoleSem_Allot_List_Page_Objects.Q1No.click();
		Thread.sleep(2000);
		
		StudentRoleSem_Allot_List_Page_Objects.Q2No.click();
		Thread.sleep(2000);
		
		Select sel = new Select(StudentRoleSem_Allot_List_Page_Objects.PreferDiscipline);
		Thread.sleep(2000);
		
		sel.selectByIndex(1);
		Thread.sleep(2000);
		
		StudentRoleSem_Allot_List_Page_Objects.SemIIcheck.click();
		Thread.sleep(2000);
		
		 StudentRoleSem_Allot_List_Page_Objects.Submit.click(); 
		 Thread.sleep(2000);
		  
		 StudentRoleSem_Allot_List_Page_Objects.CloseSubmit.click();
		 Thread.sleep(2000);
		 
		 StudentRoleSem_Allot_List_Page_Objects.Submit.click(); 
		 Thread.sleep(2000);
		  
		 StudentRoleSem_Allot_List_Page_Objects.OkSubmit.click(); 
		 Thread.sleep(2000);
		 
		
		extenttestCase.log(Status.PASS,"Grievance Updated Successfully");
	}
	
}
