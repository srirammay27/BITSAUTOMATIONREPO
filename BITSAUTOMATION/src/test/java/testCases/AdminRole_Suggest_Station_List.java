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

import pageObjects.Suggest_Station_List_Page_Objects;

public class AdminRole_Suggest_Station_List extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(AdminRole_Suggest_Station_List.class);
	
	@Test(priority = 0)
	public void StationMenu() throws InterruptedException, IOException
	{
		extenttestCase=extentReport.createTest("Verifying Station Menu");
		PageFactory.initElements(driver, Suggest_Station_List_Page_Objects.class);
		extenttestCase.log(Status.INFO,"Landing into Suggest Station List");
		Suggest_Station_List_Page_Objects.SSMenu.click();
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

		Suggest_Station_List_Page_Objects.SortSName.click();
		Thread.sleep(1000);
		Suggest_Station_List_Page_Objects.SortCity.click();
		Thread.sleep(1000);
		Suggest_Station_List_Page_Objects.SortBD.click();
		Thread.sleep(1000);
		Suggest_Station_List_Page_Objects.SortPC.click();
		Thread.sleep(1000);
		Suggest_Station_List_Page_Objects.SortPSType.click();
		Thread.sleep(1000);
	}
	
	@Test(priority = 2)
	public void VerifyInvalidSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Invalid Search in Suggest Station List");

		Suggest_Station_List_Page_Objects.SearchField.sendKeys(getExcelData("SStationList", 1, 1));
		Thread.sleep(2000);

		String ListWarn =  Suggest_Station_List_Page_Objects.ListWarn.getText();
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

		Suggest_Station_List_Page_Objects.SearchField.clear();
	}
	
	@Test(priority = 3)
	public void VerifyValidSearchStation() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Station Name Search in Suggest Station List");
		Thread.sleep(2000);

		Suggest_Station_List_Page_Objects.SearchSelect.sendKeys(getExcelData("SStationList", 2, 0));
		Thread.sleep(2000);

		Suggest_Station_List_Page_Objects.SearchField.sendKeys(getExcelData("SStationList", 2, 1));
		Thread.sleep(2000);
		
		Suggest_Station_List_Page_Objects.SelectStatus.sendKeys(getExcelData("SStationList", 2, 2));
		Thread.sleep(2000);
		
		Suggest_Station_List_Page_Objects.SearchPSType.sendKeys(getExcelData("SStationList", 2, 3));
		Thread.sleep(2000);

		String StationResult = Suggest_Station_List_Page_Objects.StationResult.getText();
		System.out.println(StationResult);
		String StatusResult = Suggest_Station_List_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult);
		String PSTypeResult = Suggest_Station_List_Page_Objects.PSTypeResult.getText();
		System.out.println(PSTypeResult);
		Thread.sleep(2000);
		if(StationResult.contentEquals(getExcelData("SStationList", 2, 1)) && StatusResult.contentEquals(getExcelData("SStationList", 2, 2))
				&& PSTypeResult.contentEquals(getExcelData("SStationList", 2, 3)))
		{
			extenttestCase.log(Status.PASS, "Station Name Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Station Name Search Validation Failed");
		}
		Thread.sleep(2000);
		Suggest_Station_List_Page_Objects.SearchField.clear();
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
	@Test(priority = 4)
	public void VerifyBusinessDomain() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Business Domain Search in Suggest Station List");
		Thread.sleep(2000);
		Suggest_Station_List_Page_Objects.SearchSelect.sendKeys(getExcelData("SStationList", 3, 0));
		Thread.sleep(2000);

		Suggest_Station_List_Page_Objects.SearchField.sendKeys(getExcelData("SStationList", 3, 1));
		Thread.sleep(2000);

		Suggest_Station_List_Page_Objects.SelectStatus.sendKeys(getExcelData("SStationList", 3, 2));
		Thread.sleep(2000);
		
		Suggest_Station_List_Page_Objects.SearchPSType.sendKeys(getExcelData("SStationList", 3, 4));
		Thread.sleep(2000);
		
		Suggest_Station_List_Page_Objects.SearchPSType.sendKeys(getExcelData("SStationList", 3, 3));
		Thread.sleep(2000);

		String BDomainResult = Suggest_Station_List_Page_Objects.BDomainResult.getText();
		System.out.println(BDomainResult);
		String StatusResult = Suggest_Station_List_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult);
		String PSTypeResult = Suggest_Station_List_Page_Objects.PSTypeResult.getText();
		System.out.println(PSTypeResult);
		Thread.sleep(2000);
		
		if(BDomainResult.contentEquals(getExcelData("SStationList", 3, 1)) && StatusResult.contentEquals(getExcelData("SStationList", 3, 2))
				&& PSTypeResult.contentEquals(getExcelData("SStationList", 3, 3)))
		{
			extenttestCase.log(Status.PASS, "Business Domain Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Business Domain Search Validation Failed");
		}
		Thread.sleep(2000);
		Suggest_Station_List_Page_Objects.SearchField.clear();
	}
	
	@Test(priority = 5)
	public void VerifyParentCompany() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Parent Company Search in Suggest Station List");
		Thread.sleep(2000);
		Suggest_Station_List_Page_Objects.SearchSelect.sendKeys(getExcelData("SStationList", 4, 0));
		Thread.sleep(2000);

		Suggest_Station_List_Page_Objects.SearchField.sendKeys(getExcelData("SStationList", 4, 1));
		Thread.sleep(2000);
		
		Suggest_Station_List_Page_Objects.SelectStatus.sendKeys(getExcelData("SStationList", 4, 2));
		Thread.sleep(2000);
		
		Suggest_Station_List_Page_Objects.SearchPSType.sendKeys(getExcelData("SStationList", 4, 4));
		Thread.sleep(2000);
		
		Suggest_Station_List_Page_Objects.SearchPSType.sendKeys(getExcelData("SStationList", 4, 3));
		Thread.sleep(2000);

		String PCompanyResult = Suggest_Station_List_Page_Objects.PCompanyResult.getText();
		System.out.println(PCompanyResult);
		String StatusResult = Suggest_Station_List_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult);
		String PSTypeResult = Suggest_Station_List_Page_Objects.PSTypeResult.getText();
		System.out.println(PSTypeResult);
		Thread.sleep(2000);
		
		if(PCompanyResult.contentEquals(getExcelData("SStationList", 4, 1)) && StatusResult.contentEquals(getExcelData("SStationList", 4, 2))
				&& PSTypeResult.contentEquals(getExcelData("SStationList", 4, 3)))
		{
			extenttestCase.log(Status.PASS, "Parent Company Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Parent Company Search Validation Failed");
		}
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	@Test(priority = 6)
	public void VerifyStatus() throws Throwable
	{
		String StatusResult ="";
		extenttestCase.log(Status.INFO,"Verifying status drop down");
		Thread.sleep(2000);
		
		Suggest_Station_List_Page_Objects.SelectStatus.sendKeys(getExcelData("SStationList",19, 0));
		Thread.sleep(3000);
		
		StatusResult = Suggest_Station_List_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult + getExcelData("SStationList",19, 0));
		
		if(StatusResult.contentEquals(getExcelData("SStationList", 19, 0)))
		{
			extenttestCase.log(Status.PASS, "Status (Pending) Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Status Validation Failed");
		}		
		Thread.sleep(3000);
		
		Suggest_Station_List_Page_Objects.SelectStatus.sendKeys(getExcelData("SStationList", 20, 0));
		Thread.sleep(3000);
			
		StatusResult = Suggest_Station_List_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult + getExcelData("SStationList",20, 0));
		
		if(StatusResult.contentEquals(getExcelData("SStationList", 20, 0)))
		{
			extenttestCase.log(Status.PASS, "Status (In Process) Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Status Validation Failed");
		}
		Thread.sleep(3000);
		
		Suggest_Station_List_Page_Objects.SelectStatus.sendKeys(getExcelData("SStationList", 21, 0));
		Thread.sleep(3000);
		
		StatusResult = Suggest_Station_List_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult + getExcelData("SStationList",21, 0));
		
		if(StatusResult.contentEquals(getExcelData("SStationList", 21, 0)))
		{
			extenttestCase.log(Status.PASS, "Status (Not Considered) Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Status Validation Failed");
		}
		Thread.sleep(3000);
		
		Suggest_Station_List_Page_Objects.SelectStatus.sendKeys(getExcelData("SStationList", 22, 0));
		Thread.sleep(3000);
		
		StatusResult = Suggest_Station_List_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult + getExcelData("SStationList",22, 0));
		
		
		if(StatusResult.contentEquals(getExcelData("SStationList", 22, 0)))
		{
			extenttestCase.log(Status.PASS, "Status (Consent Received) Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Status Validation Failed");
		}
		Thread.sleep(3000);
		
		Suggest_Station_List_Page_Objects.SelectStatus.sendKeys(getExcelData("SStationList", 23, 0));
		Thread.sleep(3000);
		
		StatusResult = Suggest_Station_List_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult + getExcelData("SStationList",23, 0));
		
		if(StatusResult.contentEquals(getExcelData("SStationList", 23, 0)))
		{
			extenttestCase.log(Status.PASS, "Status (Verified) Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Status Validation Failed");
		}
		Thread.sleep(3000);
		
		driver.navigate().refresh();
	}
	@Test(priority = 7)
	public void VerifyPSType() throws Throwable
	{
		String StatusResult ="";
		extenttestCase.log(Status.INFO,"Verifying PS Type drop down");
		Thread.sleep(2000);
		
		Suggest_Station_List_Page_Objects.SearchPSType.sendKeys(getExcelData("SStationList",19, 1));
		Thread.sleep(3000);
		
		StatusResult = Suggest_Station_List_Page_Objects.PSTypeResult.getText();
		System.out.println(StatusResult + getExcelData("SStationList",19, 1));
		
		if(StatusResult.contentEquals(getExcelData("SStationList", 19, 1)))
		{
			extenttestCase.log(Status.PASS, "PS Type (PS I) Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "PS Type Validation Failed");
		}		
		Thread.sleep(3000);
		
		Suggest_Station_List_Page_Objects.SearchPSType.sendKeys(getExcelData("SStationList", 20, 1));
		Thread.sleep(3000);
			
		StatusResult = Suggest_Station_List_Page_Objects.PSTypeResult.getText();
		System.out.println(StatusResult + getExcelData("SStationList",20, 1));
		
		if(StatusResult.contentEquals(getExcelData("SStationList", 20, 1)))
		{
			extenttestCase.log(Status.PASS, "PS Type (PS II) Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "PS Type Validation Failed");
		}
		Thread.sleep(3000);
	}	
}
