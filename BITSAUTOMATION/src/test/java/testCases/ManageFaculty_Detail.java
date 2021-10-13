package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import pageObjects.ManageFaculty_Detail_Page_Objects;
import pageObjects.ManageFaculty_List_Page_Objects;

public class ManageFaculty_Detail extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(ManageFaculty_Detail.class);
	
	@Test(priority = 0)
	public void ClickAddMFaculty() throws InterruptedException, IOException
	{
		extenttestCase=extentReport.createTest("Verifying Manage Faculty Detail Page");
		PageFactory.initElements(driver, ManageFaculty_List_Page_Objects.class);
		ManageFaculty_List_Page_Objects.MFMenu.click();
		Thread.sleep(2000);
		
		PageFactory.initElements(driver, ManageFaculty_Detail_Page_Objects.class);
		ManageFaculty_Detail_Page_Objects.AddFaculty.click();
		extenttestCase.log(Status.INFO,"Open Add Faculty Detail Page");
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("ManageFacultyDetail.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("ManageFacultyDetail.png");
	}
	
	@Test(priority = 1)
	public void AddMFacultyValidation() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Add Faculty Mandatory Field Validation");
		ManageFaculty_Detail_Page_Objects.SaveAddFaculty.click();
		Thread.sleep(2000);
		ManageFaculty_Detail_Page_Objects.CancelAddFaculty.click();
		Thread.sleep(2000);
		ManageFaculty_Detail_Page_Objects.ClosePopup.click();
		Thread.sleep(2000);
		ManageFaculty_Detail_Page_Objects.CancelAddFaculty.click();
		Thread.sleep(2000);
		ManageFaculty_Detail_Page_Objects.OkPopup.click();
		Thread.sleep(2000);
		extenttestCase.log(Status.PASS,"Mandatory Field Validation Done Successfully");
	}
	
	@Test(priority = 2)
	public void AddNewFaculty() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Add New Faculty");
		ManageFaculty_Detail_Page_Objects.AddFaculty.click();
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.FName.sendKeys(getExcelData("MFacultyDetail", 1, 0));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.SaveAddFaculty.click();
		Thread.sleep(1000);
		
		ManageFaculty_Detail_Page_Objects.AddPSRN.sendKeys(getExcelData("MFacultyDetail", 1, 1));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.SaveAddFaculty.click();
		Thread.sleep(1000);
		
		ManageFaculty_Detail_Page_Objects.AddGender.sendKeys(getExcelData("MFacultyDetail", 1, 2));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.SaveAddFaculty.click();
		Thread.sleep(1000);
		
		ManageFaculty_Detail_Page_Objects.AddDepart.sendKeys(getExcelData("MFacultyDetail", 1, 3));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.SaveAddFaculty.click();
		Thread.sleep(1000);
		
		ManageFaculty_Detail_Page_Objects.AddCampus.sendKeys(getExcelData("MFacultyDetail", 1, 4));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.SaveAddFaculty.click();
		Thread.sleep(1000);
		
		ManageFaculty_Detail_Page_Objects.AddPEmail.sendKeys(getExcelData("MFacultyDetail", 1, 5));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.SaveAddFaculty.click();
		Thread.sleep(1000);
		
		ManageFaculty_Detail_Page_Objects.AddOEmail.sendKeys(getExcelData("MFacultyDetail", 1, 6));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.SaveAddFaculty.click();
		Thread.sleep(1000);
		
		ManageFaculty_Detail_Page_Objects.AddMNumber.sendKeys(getExcelData("MFacultyDetail", 1, 7));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.SaveAddFaculty.click();
		Thread.sleep(1000);
		
		ManageFaculty_Detail_Page_Objects.AddLNumber.sendKeys(getExcelData("MFacultyDetail", 1, 8));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.SaveAddFaculty.click();
		Thread.sleep(1000);
		
		//ManageFaculty_Detail_Page_Objects.AddFType.sendKeys(getExcelData("MFacultyDetail", 1, 9));
		//Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.SaveAddFaculty.click();
		Thread.sleep(1000);
		
		ManageFaculty_Detail_Page_Objects.AddAddress1.sendKeys(getExcelData("MFacultyDetail", 1, 10));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddAddress2.sendKeys(getExcelData("MFacultyDetail", 1, 11));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddCountry.sendKeys(getExcelData("MFacultyDetail", 1, 12));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddState.sendKeys(getExcelData("MFacultyDetail", 1, 13));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddCity.sendKeys(getExcelData("MFacultyDetail", 1, 14));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddPIN.sendKeys(getExcelData("MFacultyDetail", 1, 15));
		Thread.sleep(2000);
		
		//ManageFaculty_Detail_Page_Objects.AddHometown.sendKeys(getExcelData("MFacultyDetail", 1, 16));
		//Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.CheckGroup.click();
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.SaveAddFaculty.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void VerifyNewFacultyList() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Add New Faculty in Listing");
		
		PageFactory.initElements(driver, ManageFaculty_List_Page_Objects.class);
		
		ManageFaculty_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MFacultyList", 2, 0));
		Thread.sleep(2000);
		
		ManageFaculty_List_Page_Objects.SearchField.clear();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchField.sendKeys(getExcelData("MFacultyDetail", 1, 0));
		Thread.sleep(2000);

		String FacultyResult = ManageFaculty_List_Page_Objects.FacultyResult.getText();
		System.out.println(FacultyResult);
		Thread.sleep(2000);
		if(FacultyResult.contentEquals(getExcelData("MFacultyDetail", 1, 0)))
		{
			extenttestCase.log(Status.PASS, "New Faculty Added Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "New Faculty Addition Failed");
		}

	}
	
	@Test(priority = 4)
	public void OpenEditFaculty() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Edit Faculty");
		
		PageFactory.initElements(driver, ManageFaculty_Detail_Page_Objects.class);
		
		ManageFaculty_Detail_Page_Objects.PSRNLink.click();
		
		//Actions act = new Actions(driver);
		//act.moveToElement(ManageFaculty_Detail_Page_Objects.PSRNLink).build().perform();
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.FName.clear();
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.FName.sendKeys(getExcelData("MFacultyDetail", 2, 0));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddDepart.sendKeys(getExcelData("MFacultyDetail", 2, 3));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddCampus.sendKeys(getExcelData("MFacultyDetail", 2, 4));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddMNumber.clear();
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddMNumber.sendKeys(getExcelData("MFacultyDetail", 2, 7));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddLNumber.clear();
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddLNumber.sendKeys(getExcelData("MFacultyDetail", 2, 8));
		Thread.sleep(2000);
		
		//ManageFaculty_Detail_Page_Objects.AddFType.sendKeys(getExcelData("MFacultyDetail", 2, 9));
		//Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddAddress1.clear();
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddAddress1.sendKeys(getExcelData("MFacultyDetail", 2, 10));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddAddress2.clear();
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddAddress2.sendKeys(getExcelData("MFacultyDetail", 2, 11));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddCountry.sendKeys(getExcelData("MFacultyDetail", 2, 12));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddState.sendKeys(getExcelData("MFacultyDetail", 2, 13));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddCity.sendKeys(getExcelData("MFacultyDetail", 2, 14));
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddPIN.clear();
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.AddPIN.sendKeys(getExcelData("MFacultyDetail", 2, 15));
		Thread.sleep(2000);
		
		//ManageFaculty_Detail_Page_Objects.AddHometown.clear();
		//Thread.sleep(2000);
		
		//ManageFaculty_Detail_Page_Objects.AddHometown.sendKeys(getExcelData("MFacultyDetail", 2, 16));
		//Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.CheckGroup.click();
		Thread.sleep(2000);
		
		ManageFaculty_Detail_Page_Objects.SaveAddFaculty.click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 5)
	public void VerifyEditFacultyList() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Edited Faculty in Listing");
		
		PageFactory.initElements(driver, ManageFaculty_List_Page_Objects.class);
		Thread.sleep(2000);
		
		ManageFaculty_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MFacultyList", 2, 0));
		Thread.sleep(2000);
		
		ManageFaculty_List_Page_Objects.SearchField.clear();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchField.sendKeys(getExcelData("MFacultyDetail", 2, 0));
		Thread.sleep(2000);

		String FacultyResult = ManageFaculty_List_Page_Objects.FacultyResult.getText();
		System.out.println(FacultyResult);
		Thread.sleep(2000);
		if(FacultyResult.contentEquals(getExcelData("MFacultyDetail", 2, 0)))
		{
			extenttestCase.log(Status.PASS, "Faculty Edited Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Faculty Edition Failed");
		}
	
		ManageFaculty_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MFacultyList", 1, 0));
		Thread.sleep(2000);
	}

}
