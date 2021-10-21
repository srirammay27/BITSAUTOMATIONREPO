package testCases;
import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import CommonFunctions.CommonFunctions;
import pageObjects.Faculty_Suggest_Station_Detail_Objects;
import pageObjects.Faculty_Suggest_Station_List_Objects;
//import pageObjects.Profile_Page_Objects;

public class FacultyRole_Suggest_Station_Detail extends CommonFunctions{
	
static Logger logger = Logger.getLogger(FacultyRole_Suggest_Station_Detail.class);
	
	@Test(priority = 0)
	public void validateNavigatetoAddStation() throws InterruptedException, IOException
	{
		extenttestCase=extentReport.createTest("Verifying Suggest Station Detail Page");
		PageFactory.initElements(driver, Faculty_Suggest_Station_Detail_Objects.class);
		extenttestCase.log(Status.INFO,"Landing into Suggest Station List");
		Faculty_Suggest_Station_Detail_Objects.StationMenu.click();
		Thread.sleep(2000);		
	}

	@Test(priority = 1)
	public void AddStationScreenshotCapture() throws InterruptedException, IOException
	{
		extenttestCase.log(Status.INFO,"Landing into Suggest Station Detail");
		
		Faculty_Suggest_Station_Detail_Objects.btnAddStation.click();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("SuggestStationDetail.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("SuggestStationDetail.png");
	}
	
	@Test(priority = 2)
	public void AddValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, Faculty_Suggest_Station_Detail_Objects.class);
		extenttestCase.log(Status.INFO,"Verifying Add Station Mandatory Field Validation");
		Faculty_Suggest_Station_Detail_Objects.btnSubmit.click();
		Thread.sleep(2000);
		extenttestCase.log(Status.PASS,"Mandatory Field Validation Done Successfully");
		
		Faculty_Suggest_Station_Detail_Objects.btnCancel.click();
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.btnClose.click();
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.btnCancel.click();
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.btnOkay.click();
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.btnAddStation.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void VerifyExpandCollapseSections() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Expand and Collapse Functionality Validation");
		Faculty_Suggest_Station_Detail_Objects.collapseStation.click();
		Thread.sleep(1000);
		Faculty_Suggest_Station_Detail_Objects.collapseStation.click();
		Thread.sleep(1000);
		Faculty_Suggest_Station_Detail_Objects.collapseContact.click();
		Thread.sleep(1000);
		Faculty_Suggest_Station_Detail_Objects.collapseContact.click();
		Thread.sleep(1000);
	}
	
	@Test(priority = 4)
	public void VerifyAddNewStation() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Add New Station");
		
		Faculty_Suggest_Station_Detail_Objects.SName.sendKeys(getExcelData("SStationDetail", 3, 0));
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.PCompany.sendKeys(getExcelData("SStationDetail", 3, 1));
		Thread.sleep(2000);
	
		Actions act = new Actions(driver);
		act.moveToElement(Faculty_Suggest_Station_Detail_Objects.PSType).click().perform();
		Thread.sleep(2000);
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(Faculty_Suggest_Station_Detail_Objects.PSType).click().perform();
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.StationType.sendKeys(getExcelData("SStationDetail", 3, 2));
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.PSProgram.sendKeys(String.valueOf(getExcelData1("SStationDetail", 3, 3)));
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.BDomain.sendKeys(getExcelData("SStationDetail", 3, 4));
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.SRelation.sendKeys(getExcelData("SStationDetail", 3, 5));
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.URL.sendKeys(getExcelData("SStationDetail", 3, 6));
		Thread.sleep(2000);
		
		//System.out.println(String.valueOf(getExcelData("SStationDetail", 1, 8)));
		
		Faculty_Suggest_Station_Detail_Objects.ContactNum.sendKeys(String.valueOf(getExcelData("SStationDetail", 3, 7)));
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.Address1.sendKeys(getExcelData("SStationDetail", 3, 8));
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.Address2.sendKeys(getExcelData("SStationDetail", 3, 9));
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.Country.sendKeys(getExcelData("SStationDetail", 5, 10));
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.Country.sendKeys(getExcelData("SStationDetail", 3, 10));
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.State.sendKeys(getExcelData("SStationDetail", 3, 11));
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.City.sendKeys(getExcelData("SStationDetail", 3, 12));
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.Pincode.sendKeys(String.valueOf(getExcelData("SStationDetail", 3, 13)));
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.Writeup.sendKeys(getExcelData("SStationDetail", 3, 14));
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_Detail_Objects.btnSubmit.click();
		Thread.sleep(3500);
		
		String rostorMsg=Faculty_Suggest_Station_Detail_Objects.toaster.getText().toString().trim();
		
		if (rostorMsg.toString().trim().contains("Record Saved Successfully"))
		{
			extenttestCase.log(Status.PASS, "New Station saved successfully");
		}
		else if(rostorMsg.toString().trim().contains("Record already exists with the same station name"))
		{
			extenttestCase.log(Status.FAIL, "Record already exists with the same station name");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Update not successful");
		}
		
		Faculty_Suggest_Station_Detail_Objects.StationMenu.click();
		Thread.sleep(2000);
		//Faculty_Suggest_Station_Detail_Objects.btnCancel.click();
		//Thread.sleep(2000);
		
		//Faculty_Suggest_Station_Detail_Objects.btnOkay.click();
		//Thread.sleep(2000);		
	}
	
	@Test(priority = 5)
	public void VerifyAddedStation() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying New Added Station in Suggest Station List");
		Thread.sleep(2000);
		
		PageFactory.initElements(driver, Faculty_Suggest_Station_List_Objects.class);

		Faculty_Suggest_Station_List_Objects.drpSearchCriteria.click();
		Thread.sleep(5000);
		
		Faculty_Suggest_Station_List_Objects.drpSearchCriteria.sendKeys(getExcelData("SStationDetail", 0, 0));
		Thread.sleep(2000);

		Faculty_Suggest_Station_List_Objects.searchBox.sendKeys(getExcelData("SStationDetail", 3, 0));
		Thread.sleep(2000);
		
		Faculty_Suggest_Station_List_Objects.drpStatus.sendKeys(getExcelData("SStationDetail", 3, 16));
		Thread.sleep(2000);
		
		//Suggest_Station_List_Page_Objects.SearchPSType.sendKeys(getExcelData("SStationList", 5, 4));
		//Thread.sleep(2000);
		
		//Suggest_Station_List_Page_Objects.SearchPSType.sendKeys(getExcelData("SStationList", 5, 3));
		//Thread.sleep(2000);

		String StationResult = Faculty_Suggest_Station_List_Objects.grdColStation.getText();
		System.out.println(StationResult);
		String StatusResult = Faculty_Suggest_Station_List_Objects.grdColStatus.getText();
		System.out.println(StatusResult);
		//String PSTypeResult = Suggest_Station_List_Page_Objects.PSTypeResult.getText();
		//System.out.println(PSTypeResult);
		Thread.sleep(2000);
		if(StationResult.contentEquals(getExcelData("SStationDetail",3,0)) && StatusResult.contentEquals(getExcelData("SStationDetail",3,16)))
		{
			extenttestCase.log(Status.PASS, "New Station Added Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "New Station Addition not Successful");
		}		
	}
	
	@Test(priority = 6)
		public void VerifyEditExistingStation() throws Throwable
		{
			extenttestCase.log(Status.INFO,"Verifying Edit Existing Station");
			
			Faculty_Suggest_Station_List_Objects.grdColStation.click();			
			Thread.sleep(2000);			
			
			Faculty_Suggest_Station_Detail_Objects.StationType.sendKeys(getExcelData("SStationDetail", 4, 2));
			Thread.sleep(2000);
			
			Faculty_Suggest_Station_Detail_Objects.PSProgram.sendKeys(String.valueOf(getExcelData1("SStationDetail", 4, 3)));
			Thread.sleep(2000);
			
			Faculty_Suggest_Station_Detail_Objects.BDomain.sendKeys(getExcelData("SStationDetail", 4, 4));
			Thread.sleep(2000);
			
			Faculty_Suggest_Station_Detail_Objects.SRelation.clear();
			Thread.sleep(2000);
			Faculty_Suggest_Station_Detail_Objects.SRelation.sendKeys(getExcelData("SStationDetail", 4, 5));
			Thread.sleep(2000);
			
			Faculty_Suggest_Station_Detail_Objects.URL.clear();
			Thread.sleep(2000);
			Faculty_Suggest_Station_Detail_Objects.URL.sendKeys(getExcelData("SStationDetail", 4, 6));
			Thread.sleep(2000);
			
			//System.out.println(String.valueOf(getExcelData("SStationDetail", 1, 8)));
			
			Faculty_Suggest_Station_Detail_Objects.ContactNum.clear();
			Thread.sleep(2000);
			Faculty_Suggest_Station_Detail_Objects.ContactNum.sendKeys(String.valueOf(getExcelData("SStationDetail", 4, 7)));
			Thread.sleep(2000);
			
			Faculty_Suggest_Station_Detail_Objects.Address1.clear();
			Thread.sleep(2000);
			Faculty_Suggest_Station_Detail_Objects.Address1.sendKeys(getExcelData("SStationDetail", 4, 8));
			Thread.sleep(2000);
			
			Faculty_Suggest_Station_Detail_Objects.Address2.clear();
			Thread.sleep(2000);
			Faculty_Suggest_Station_Detail_Objects.Address2.sendKeys(getExcelData("SStationDetail", 4, 9));
			Thread.sleep(2000);
			
			Faculty_Suggest_Station_Detail_Objects.Country.sendKeys(getExcelData("SStationDetail", 5, 10));
			Thread.sleep(2000);
			
			Faculty_Suggest_Station_Detail_Objects.Country.sendKeys(getExcelData("SStationDetail", 4, 10));
			Thread.sleep(2000);
			
			Faculty_Suggest_Station_Detail_Objects.State.sendKeys(getExcelData("SStationDetail", 4, 11));
			Thread.sleep(2000);			
			
			Faculty_Suggest_Station_Detail_Objects.City.sendKeys(getExcelData("SStationDetail", 4, 12));
			Thread.sleep(2000);
			
			Faculty_Suggest_Station_Detail_Objects.Pincode.clear();
			Thread.sleep(2000);
			Faculty_Suggest_Station_Detail_Objects.Pincode.sendKeys(String.valueOf(getExcelData("SStationDetail", 4, 13)));
			Thread.sleep(2000);
			
			Faculty_Suggest_Station_Detail_Objects.Writeup.clear();
			Thread.sleep(2000);
			Faculty_Suggest_Station_Detail_Objects.Writeup.sendKeys(getExcelData("SStationDetail", 4, 14));
			Thread.sleep(5000);
			
			Faculty_Suggest_Station_Detail_Objects.btnSubmit.click();
			Thread.sleep(3500);
			
			System.out.println(Faculty_Suggest_Station_Detail_Objects.toaster.getText().toString().trim());
			String rostorMsg=Faculty_Suggest_Station_Detail_Objects.toaster.getText().toString().trim();
			
			if (rostorMsg.toString().trim().contains("Record Updated Successfully"))
			{
				extenttestCase.log(Status.PASS, "Station Updated Successfully");
			}
			else if (rostorMsg.toString().trim().contains("You are not allowed to change this status type"))
			{
				extenttestCase.log(Status.INFO, "User cannot update the record");
			}
			else
			{
				extenttestCase.log(Status.PASS, "Station Update not successful");
			}
			//Faculty_Suggest_Station_Detail_Objects.StationMenu.click();
			//Thread.sleep(2000);
			//Faculty_Suggest_Station_Detail_Objects.btnCancel.click();
			//Thread.sleep(2000);
			
			//Faculty_Suggest_Station_Detail_Objects.btnOkay.click();
			//Thread.sleep(2000);		
		}
}
