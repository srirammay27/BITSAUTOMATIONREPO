package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;

import pageObjects.StudentSuggest_Station_List_Page_Objects;

public class StudentSuggest_Station_List extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(StudentSuggest_Station_List.class);
	
	@Test(priority = 0)
	public void StationMenu() throws InterruptedException, IOException
	{
		extenttestCase=extentReport.createTest("Verifying Suggest Station List Page");
		PageFactory.initElements(driver, StudentSuggest_Station_List_Page_Objects.class);
		extenttestCase.log(Status.INFO,"Landing into Suggest Station List");
		StudentSuggest_Station_List_Page_Objects.SSMenu.click();
		Thread.sleep(2000);
		

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("SuggestStationList.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("SuggestStationList.png");

	}
	
	@Test(priority = 1)
	public void Verifysort() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Sorting Functionality in Suggest Station List");

		StudentSuggest_Station_List_Page_Objects.SortSName.click();
		Thread.sleep(1000);
		StudentSuggest_Station_List_Page_Objects.SortCity.click();
		Thread.sleep(1000);
		StudentSuggest_Station_List_Page_Objects.SortBD.click();
		Thread.sleep(1000);
		StudentSuggest_Station_List_Page_Objects.SortPC.click();
		Thread.sleep(1000);
		StudentSuggest_Station_List_Page_Objects.SortPSType.click();
		Thread.sleep(1000);
	}
	
	@Test(priority = 2)
	public void VerifyInvalidSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Invalid Search in Suggest Station List");

		StudentSuggest_Station_List_Page_Objects.SearchField.sendKeys(getExcelData("SStationList", 10, 1));
		Thread.sleep(2000);

		String ListWarn =  StudentSuggest_Station_List_Page_Objects.ListWarn.getText();
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

		StudentSuggest_Station_List_Page_Objects.SearchField.clear();
	}
	
	@Test(priority = 3)
	public void VerifyValidSearchStation() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Station Name Search in Suggest Station List");
		Thread.sleep(2000);

		StudentSuggest_Station_List_Page_Objects.SearchSelect.sendKeys(getExcelData("SStationList", 11, 0));
		Thread.sleep(2000);

		StudentSuggest_Station_List_Page_Objects.SearchField.sendKeys(getExcelData("SStationList", 11, 1));
		Thread.sleep(2000);
		
		StudentSuggest_Station_List_Page_Objects.SelectStatus.sendKeys(getExcelData("SStationList", 11, 2));
		Thread.sleep(2000);

		String StationResult = StudentSuggest_Station_List_Page_Objects.StationResult.getText();
		System.out.println(StationResult);
		String StatusResult = StudentSuggest_Station_List_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult);
		Thread.sleep(2000);
		if(StationResult.contentEquals(getExcelData("SStationList", 11, 1)) && StatusResult.contentEquals(getExcelData("SStationList", 11, 2)))
		{
			extenttestCase.log(Status.PASS, "Station Name Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Station Name Search Validation Failed");
		}
		Thread.sleep(2000);
		StudentSuggest_Station_List_Page_Objects.SearchField.clear();
	}
	
	@Test(priority = 4)
	public void VerifyBDomain() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Business Domain Search in Suggest Station List");
		Thread.sleep(2000);
		StudentSuggest_Station_List_Page_Objects.SearchSelect.sendKeys(getExcelData("SStationList", 12, 0));
		Thread.sleep(2000);

		StudentSuggest_Station_List_Page_Objects.SearchField.sendKeys(getExcelData("SStationList", 12, 1));
		Thread.sleep(2000);

		StudentSuggest_Station_List_Page_Objects.SelectStatus.sendKeys(getExcelData("SStationList", 12, 2));
		Thread.sleep(2000);

		String BDomainResult = StudentSuggest_Station_List_Page_Objects.BDomainResult.getText();
		System.out.println(BDomainResult);
		String StatusResult = StudentSuggest_Station_List_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult);
		
		Thread.sleep(2000);
		
		if(BDomainResult.contentEquals(getExcelData("SStationList", 12, 1)) && StatusResult.contentEquals(getExcelData("SStationList", 12, 2)))
		{
			extenttestCase.log(Status.PASS, "Business Domain Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Business Domain Search Validation Failed");
		}
		Thread.sleep(2000);
		StudentSuggest_Station_List_Page_Objects.SearchField.clear();
	}
	
	@Test(priority = 5)
	public void VerifyParentCompany() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Parent Company Search in Suggest Station List");
		Thread.sleep(2000);
		StudentSuggest_Station_List_Page_Objects.SearchSelect.sendKeys(getExcelData("SStationList", 13, 0));
		Thread.sleep(2000);

		StudentSuggest_Station_List_Page_Objects.SearchField.sendKeys(getExcelData("SStationList", 13, 1));
		Thread.sleep(2000);
		
		StudentSuggest_Station_List_Page_Objects.SelectStatus.sendKeys(getExcelData("SStationList", 13, 2));
		Thread.sleep(2000);
		
		String PCompanyResult = StudentSuggest_Station_List_Page_Objects.PCompanyResult.getText();
		System.out.println(PCompanyResult);
		String StatusResult = StudentSuggest_Station_List_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult);
		Thread.sleep(2000);
		
		if(PCompanyResult.contentEquals(getExcelData("SStationList", 13, 1)) && StatusResult.contentEquals(getExcelData("SStationList", 13, 2)))
		{
			extenttestCase.log(Status.PASS, "Parent Company Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Parent Company Search Validation Failed");
		}
		
		Thread.sleep(2000);
		driver.navigate().refresh();

	}


}
