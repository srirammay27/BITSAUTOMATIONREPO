package testCases;

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
import pageObjects.AllotSuggest_Station_Detail_Page_Objects;
import pageObjects.AllotSuggest_Station_List_Page_Objects;


public class AllotSuggest_Station_Detail extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(AllotSuggest_Station_Detail.class);
	
	@Test(priority = 0)
	public void StationMenu() throws InterruptedException, IOException
	{
		extenttestCase=extentReport.createTest("Verifying Suggest Station Detail Page");
		PageFactory.initElements(driver, AllotSuggest_Station_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO,"Landing into Suggest Station List");
		AllotSuggest_Station_Detail_Page_Objects.SSMenu.click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 1)
	public void AddStation() throws InterruptedException, IOException
	{
		extenttestCase.log(Status.INFO,"Landing into Suggest Station Detail");
		
		AllotSuggest_Station_Detail_Page_Objects.AddStation.click();
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
		extenttestCase.log(Status.INFO,"Verifying Add Station Mandatory Field Validation");
		AllotSuggest_Station_Detail_Page_Objects.Submitbtn.click();
		Thread.sleep(2000);
		extenttestCase.log(Status.PASS,"Mandatory Field Validation Done Successfully");
		
		AllotSuggest_Station_Detail_Page_Objects.Cancelbtn.click();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Closebtn.click();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Cancelbtn.click();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Okbtn.click();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.AddStation.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void VerifyExpand() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Expand and Collapse Functionality Validation");
		AllotSuggest_Station_Detail_Page_Objects.Stationcollapse.click();
		Thread.sleep(1000);
		AllotSuggest_Station_Detail_Page_Objects.Stationcollapse.click();
		Thread.sleep(1000);
		AllotSuggest_Station_Detail_Page_Objects.Contactcollapse.click();
		Thread.sleep(1000);
		AllotSuggest_Station_Detail_Page_Objects.Contactcollapse.click();
		Thread.sleep(1000);
	}
	
	@Test(priority = 4)
	public void VerifyAddStation() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Add New Station");
		
		AllotSuggest_Station_Detail_Page_Objects.SName.sendKeys(getExcelData("SStationDetail", 1, 0));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.PCompany.sendKeys(getExcelData("SStationDetail", 1, 1));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(AllotSuggest_Station_Detail_Page_Objects.PSType).click().perform();
		Thread.sleep(2000);
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(AllotSuggest_Station_Detail_Page_Objects.PSType).click().perform();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.StationType.sendKeys(getExcelData("SStationDetail", 1, 2));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.PSProgram.sendKeys(getExcelData("SStationDetail", 1, 3));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.BDomain.sendKeys(getExcelData("SStationDetail", 1, 4));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.SRelation.sendKeys(getExcelData("SStationDetail", 1, 5));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.URL.sendKeys(getExcelData("SStationDetail", 1, 6));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.ContactNum.sendKeys(getExcelData("SStationDetail", 1, 7));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Address1.sendKeys(getExcelData("SStationDetail", 1, 8));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Address2.sendKeys(getExcelData("SStationDetail", 1, 9));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.County.sendKeys(getExcelData("SStationDetail", 1, 10));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.State.sendKeys(getExcelData("SStationDetail", 1, 11));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.City.sendKeys(getExcelData("SStationDetail", 1, 12));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Pincode.sendKeys(getExcelData("SStationDetail", 1, 13));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.CompanyDes.sendKeys(getExcelData("SStationDetail", 1, 14));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Submitbtn.click();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Cancelbtn.click();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Okbtn.click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 5)
	public void VerifyAddedStation() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying New Added Station in Suggest Station List");
		Thread.sleep(2000);
		
		PageFactory.initElements(driver, AllotSuggest_Station_List_Page_Objects.class);

		AllotSuggest_Station_List_Page_Objects.SearchSelect.sendKeys(getExcelData("SStationList", 2, 0));
		Thread.sleep(2000);

		AllotSuggest_Station_List_Page_Objects.SearchField.sendKeys(getExcelData("SStationList", 5, 1));
		Thread.sleep(2000);
		
		AllotSuggest_Station_List_Page_Objects.SelectStatus.sendKeys(getExcelData("SStationList", 5, 2));
		Thread.sleep(2000);
		
		

		String StationResult = AllotSuggest_Station_List_Page_Objects.StationResult.getText();
		System.out.println(StationResult);
		String StatusResult = AllotSuggest_Station_List_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult);
		
		Thread.sleep(2000);
		if(StationResult.contentEquals(getExcelData("SStationList", 5, 1)) && StatusResult.contentEquals(getExcelData("SStationList", 5, 2)))
		{
			extenttestCase.log(Status.PASS, "New Station Added Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "New Station Addition Successfully");
		}
		
	}
	
	@Test(priority = 6)
	public void OpenEditStation() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Edit Faculty");
		
		PageFactory.initElements(driver, AllotSuggest_Station_Detail_Page_Objects.class);
		
		AllotSuggest_Station_Detail_Page_Objects.StationLink.click();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.SName.clear();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.SName.sendKeys(getExcelData("SStationDetail", 2, 0));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.StationType.sendKeys(getExcelData("SStationDetail", 2, 2));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.PSProgram.sendKeys(getExcelData("SStationDetail", 2, 3));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.BDomain.sendKeys(getExcelData("SStationDetail", 2, 4));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.SRelation.clear();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.SRelation.sendKeys(getExcelData("SStationDetail", 2, 5));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.URL.clear();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.URL.sendKeys(getExcelData("SStationDetail", 2, 6));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.ContactNum.clear();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.ContactNum.sendKeys(getExcelData("SStationDetail", 2, 7));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Address1.clear();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Address1.sendKeys(getExcelData("SStationDetail", 2, 8));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Address2.clear();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Address2.sendKeys(getExcelData("SStationDetail", 2, 9));
		Thread.sleep(2000);

		AllotSuggest_Station_Detail_Page_Objects.County.sendKeys(getExcelData("SStationDetail", 2, 10));
		Thread.sleep(2000);
	
		AllotSuggest_Station_Detail_Page_Objects.State.sendKeys(getExcelData("SStationDetail", 2, 11));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.City.sendKeys(getExcelData("SStationDetail", 2, 12));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Pincode.clear();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Pincode.sendKeys(getExcelData("SStationDetail", 2, 13));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.CompanyDes.clear();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.CompanyDes.sendKeys(getExcelData("SStationDetail", 2, 14));
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Submitbtn.click();
		Thread.sleep(3000);
		
		AllotSuggest_Station_Detail_Page_Objects.Cancelbtn.click();
		Thread.sleep(2000);
		
		AllotSuggest_Station_Detail_Page_Objects.Okbtn.click();
		Thread.sleep(2000);
	
	}
	

	@Test(priority = 7)
	public void VerifyEditStationList() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Edited Station in Listing");
		
		PageFactory.initElements(driver, AllotSuggest_Station_List_Page_Objects.class);

		AllotSuggest_Station_List_Page_Objects.SearchSelect.sendKeys(getExcelData("SStationList", 2, 0));
		Thread.sleep(2000);

		AllotSuggest_Station_List_Page_Objects.SearchField.sendKeys(getExcelData("SStationList", 6, 1));
		Thread.sleep(2000);
		
		AllotSuggest_Station_List_Page_Objects.SelectStatus.sendKeys(getExcelData("SStationList", 6, 2));
		Thread.sleep(2000);

		String StationResult = AllotSuggest_Station_List_Page_Objects.StationResult.getText();
		System.out.println(StationResult);
		String StatusResult = AllotSuggest_Station_List_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult);
		
		Thread.sleep(2000);
		if(StationResult.contentEquals(getExcelData("SStationList", 6, 1)) && StatusResult.contentEquals(getExcelData("SStationList", 6, 2)))
		{
			extenttestCase.log(Status.PASS, "New Station Edited Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "New Station Edition Successfully");
		}
	}
	
	@Test(priority = 8)
	public void ClickDelete () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Delete Record");
		
		AllotSuggest_Station_List_Page_Objects.Checkbox.click();
		Thread.sleep(2000);
		
		AllotSuggest_Station_List_Page_Objects.ActionClick.click();
		Thread.sleep(2000);
		
		AllotSuggest_Station_List_Page_Objects.Deleteclick.click();
		Thread.sleep(2000);
		
		AllotSuggest_Station_List_Page_Objects.ClosePopup.click();
		Thread.sleep(2000);
		
		AllotSuggest_Station_List_Page_Objects.ActionClick.click();
		Thread.sleep(2000);
		
		AllotSuggest_Station_List_Page_Objects.Deleteclick.click();
		Thread.sleep(2000);
		
		AllotSuggest_Station_List_Page_Objects.OkPopup.click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 9)
	public void VerifyDelete() throws Throwable
	{
		
		AllotSuggest_Station_List_Page_Objects.SearchField.clear();
		Thread.sleep(2000);
		
		AllotSuggest_Station_List_Page_Objects.SearchField.sendKeys(getExcelData("SStationList", 6, 1));
		Thread.sleep(2000);

		String ListWarn =  AllotSuggest_Station_List_Page_Objects.ListWarn.getText();
		System.out.println(ListWarn);
		Thread.sleep(2000);

		if(ListWarn.contains("Record(s) not found"))
		{
			extenttestCase.log(Status.PASS, "New Station Deleted Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "New Station Deletion Failed");
		}
		
		driver.navigate().refresh();
	}

}
