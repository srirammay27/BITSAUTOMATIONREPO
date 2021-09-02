package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
//import pageObjects.Login_Page_Objects;

import pageObjects.Semester_Allotment_List_Page_Objects;

public class Semester_Allotment_List extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(Semester_Allotment_List.class);
	
	@Test(priority = 0)
	public void SemAllotMenu() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Login to Planning Role");
		extenttestCase=extentReport.createTest("Verifying Semester Allotment List Page");
		
		logger.info("Verifying Semester Allotment List Page");
        PageFactory.initElements(driver, Semester_Allotment_List_Page_Objects.class);
		
		Semester_Allotment_List_Page_Objects.SAMenu.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Landing into Semester Allotment Menu");
		 
	}
	
	@Test(priority = 1)
	public void Verifysort() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Sorting Functionality in Semester Allocation List");	

		Semester_Allotment_List_Page_Objects.ShowMore.click();
		Thread.sleep(1000);
		Semester_Allotment_List_Page_Objects.SortSName.click();
		Thread.sleep(1000);
		Semester_Allotment_List_Page_Objects.SortCampus.click();
		Thread.sleep(1000);
		Semester_Allotment_List_Page_Objects.SortTag.click();
		Thread.sleep(1000);
		Semester_Allotment_List_Page_Objects.SortCGPA.click();
		Thread.sleep(1000);
		Semester_Allotment_List_Page_Objects.SortPreferred.click();
		Thread.sleep(1000);
		Semester_Allotment_List_Page_Objects.ShowLess.click();
		Thread.sleep(2000);

	}
	
	@Test(priority = 2)
	public void VerifyInvalidSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Invalid Search in Semester Allocation List");

		Semester_Allotment_List_Page_Objects.SearchField.sendKeys(getExcelData("SAllotList", 1, 1));
		Thread.sleep(2000);

		String ListWarn =  Semester_Allotment_List_Page_Objects.ListWarn.getText();
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
		
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void VerifyValidSearchAllot() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Student Name Search in Semester Allotment List");
	
		Semester_Allotment_List_Page_Objects.SearchSelect.sendKeys(getExcelData("SAllotList", 2, 0));
		Thread.sleep(2000);

		Semester_Allotment_List_Page_Objects.SearchField.sendKeys(getExcelData("SAllotList", 2, 2));
		Thread.sleep(2000);
		
		Semester_Allotment_List_Page_Objects.SearchCampus.sendKeys(getExcelData("SAllotList", 4, 2));
		Thread.sleep(2000);
		
		Semester_Allotment_List_Page_Objects.SearchGot.sendKeys(getExcelData("SAllotList", 5, 2));
		Thread.sleep(2000);
		
		Semester_Allotment_List_Page_Objects.SearchSem.sendKeys(getExcelData("SAllotList", 6, 2));
		Thread.sleep(2000);

		String SNameResult = Semester_Allotment_List_Page_Objects.SNameResult.getText();
		System.out.println(SNameResult);
		String CampusResult = Semester_Allotment_List_Page_Objects.CampusResult.getText();
		System.out.println(CampusResult);
		String GotResult = Semester_Allotment_List_Page_Objects.GotResult.getText();
		System.out.println(GotResult);
		Thread.sleep(2000);
		
		if(SNameResult.contentEquals(getExcelData("SAllotList", 2, 2)) && CampusResult.contentEquals(getExcelData("SAllotList", 4, 2))
				&& GotResult.contentEquals(getExcelData("SAllotList", 5, 2)))
		{
			extenttestCase.log(Status.PASS, "Student Name Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Student Name Search Validation Failed");
		}
		Thread.sleep(2000);
		Semester_Allotment_List_Page_Objects.SearchField.clear();
	}
	
	@Test(priority = 4)
	public void VerifyValidSearchID() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Campus ID Search in Semester Allotment List");
		Thread.sleep(2000);

		Semester_Allotment_List_Page_Objects.SearchSelect.sendKeys(getExcelData("SAllotList", 3, 0));
		Thread.sleep(2000);

		Semester_Allotment_List_Page_Objects.SearchField.sendKeys(getExcelData("SAllotList", 3, 1));
		Thread.sleep(2000);
		
		Semester_Allotment_List_Page_Objects.SearchCampus.sendKeys(getExcelData("SAllotList", 4, 2));
		Thread.sleep(2000);
		
		Semester_Allotment_List_Page_Objects.SearchGot.sendKeys(getExcelData("SAllotList", 5, 2));
		Thread.sleep(2000);
		

		String CIDResult = Semester_Allotment_List_Page_Objects.CIDResult.getText();
		System.out.println(CIDResult);
		String CampusResult = Semester_Allotment_List_Page_Objects.CampusResult.getText();
		System.out.println(CampusResult);
		String GotResult = Semester_Allotment_List_Page_Objects.GotResult.getText();
		System.out.println(GotResult);
		Thread.sleep(2000);
		
		if(CIDResult.contentEquals(getExcelData("SAllotList", 3, 1)) && CampusResult.contentEquals(getExcelData("SAllotList", 4, 2))
				&& GotResult.contentEquals(getExcelData("SAllotList", 5, 2)))
		{
			extenttestCase.log(Status.PASS, "Campus ID Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Campus ID Search Validation Failed");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	

}
