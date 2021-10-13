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
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import pageObjects.Student_Data_List_Page_Objects;
import pageObjects.Student_Profile_Detail_Page_Objects;

public class AdminRole_Student_Profile_Detail extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(AdminRole_Student_Profile_Detail.class);
	
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
	public void NavigateToProfile() throws Throwable
	{
		PageFactory.initElements(driver, Student_Data_List_Page_Objects.class);
		Student_Data_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MSData", 1, 0));
		Thread.sleep(2000);

		Student_Data_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MSData", 2, 0));
		Thread.sleep(2000);

		Student_Data_List_Page_Objects.SearchField.sendKeys(getExcelData("MSData", 2, 2));
		Thread.sleep(2000);	
		
		Student_Data_List_Page_Objects.GridRow1.click();
		Thread.sleep(2000);	
	}
	
	@Test(priority = 1)
	public void VerifyUploadPic() throws InterruptedException, AWTException
	{
		extenttestCase.log(Status.INFO,"Verifying Upload Profile Pic Functionality");
		
		Student_Profile_Detail_Page_Objects.CancelClick.click();
		Thread.sleep(2000);
		Student_Profile_Detail_Page_Objects.CloseCancel.click();
		Thread.sleep(2000);
		Student_Profile_Detail_Page_Objects.CancelClick.click();
		Thread.sleep(2000);
		Student_Profile_Detail_Page_Objects.OkCancel.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.ProfileMenu.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.UploadPhoto.click();
		Thread.sleep(2000);
		
		String file = "E:\\FacultyRecord\\ProfilePic.jpg";
		StringSelection selection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		extenttestCase.log(Status.PASS,"Profile Image Uploaded Successfully");
		
		Student_Profile_Detail_Page_Objects.Submitbtn.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void VerifyPersonalInfo() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Personal Info");
		
		Student_Profile_Detail_Page_Objects.PInfoMenu.click();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("PersonalInfo.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("PersonalInfo.png");
		
		Student_Profile_Detail_Page_Objects.CancelPInfo.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.ClosePInfo.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.CancelPInfo.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.OkPInfo.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.PInfoMenu.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.MNumber.clear();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.MNumber.sendKeys(getExcelData("PersonalInfo", 2, 3));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.AMNumber.clear();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.AMNumber.sendKeys(getExcelData("PersonalInfo", 2, 4));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.PEmailID.clear();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.PEmailID.sendKeys(getExcelData("PersonalInfo", 2, 5));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.AadharNum.clear();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.AadharNum.sendKeys(getExcelData("PersonalInfo", 2, 6));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.PAN.clear();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.PAN.sendKeys(getExcelData("PersonalInfo", 2, 7));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.COrigin.sendKeys(getExcelData("PersonalInfo", 2, 8));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.ParentName.clear();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.ParentName.sendKeys(getExcelData("PersonalInfo", 2, 9));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.PMNumber.clear();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.PMNumber.sendKeys(getExcelData("PersonalInfo", 2, 10));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.Address1.clear();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.Address1.sendKeys(getExcelData("PersonalInfo",6, 0));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.Address2.clear();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.Address2.sendKeys(getExcelData("PersonalInfo",6, 1));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.County.sendKeys(getExcelData("PersonalInfo",6, 2));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.State.sendKeys(getExcelData("PersonalInfo",6, 3));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.City.click();
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		Student_Profile_Detail_Page_Objects.PIN.clear();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.PIN.sendKeys(getExcelData("PersonalInfo",6, 5));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.SubmitPInfo.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS,"Personal Info Updated Successfully");
		
		Student_Profile_Detail_Page_Objects.ProfileMenu.click();
		Thread.sleep(2000);
	}
	
	//@Test(priority = 3)
	public void ViewBioData() throws InterruptedException, IOException
	{
		extenttestCase.log(Status.INFO,"Verifying Close Bio-Data in Profile");
		
		Student_Profile_Detail_Page_Objects.BioDataMenu.click();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("BioData.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("BioData.png");
		
		Student_Profile_Detail_Page_Objects.CancelBioData.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.ClosePopup.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.CancelBioData.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.OkPopup.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.BioDataMenu.click();
		Thread.sleep(2000);
		
	}
	
	//@Test(priority = 4)
	public void AddAcademic() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Add Academic in Profile's Bio-Data ");
		
		Student_Profile_Detail_Page_Objects.AddAcabtn.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.SubmitAcad.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS,"Mandatory Validation Done in Add Academic Successfully");
		
		Student_Profile_Detail_Page_Objects.CloseAcad.click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Student_Profile_Detail_Page_Objects.AddAcabtn.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.Academic.sendKeys(getExcelData("AddAcademic", 1, 0));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.SName.sendKeys(getExcelData("AddAcademic", 1, 1));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.BName.sendKeys(getExcelData("AddAcademic", 1, 2));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.YOP.sendKeys(getExcelData("AddAcademic", 1, 3));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.Grade.sendKeys(getExcelData("AddAcademic", 1, 4));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.Branch.sendKeys(getExcelData("AddAcademic", 1, 5));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.SubmitAcad.click();
		Thread.sleep(4000);
		
		Student_Profile_Detail_Page_Objects.CloseAcad.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS,"New Academic Added Successfully");
		
	}
	
	//@Test(priority = 5)
	public void DeleteAcademic() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Delete Academic in Profile's Bio-Data ");
		
		Student_Profile_Detail_Page_Objects.DeleteAcademic.click();
		Thread.sleep(2000);
		
		String ListWarn = Student_Profile_Detail_Page_Objects.ListWarn.getText();
		System.out.println(ListWarn);
		Thread.sleep(2000);
		
		if(ListWarn.contains("Record(s) not found"))
		{
			extenttestCase.log(Status.PASS,"Added Academic Deleted Successfully");
		}
		
		else
			
		{
			extenttestCase.log(Status.FAIL,"Academic Deletion Failed");
		}
		
		driver.navigate().refresh();
	}
	
	//@Test(priority = 6)
	public void AgainAcademic() throws Throwable
	{
            
		extenttestCase.log(Status.INFO,"Verifying Add Academic in Profile's Bio-Data ");
		
		Student_Profile_Detail_Page_Objects.AddAcabtn.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.Academic.sendKeys(getExcelData("AddAcademic", 1, 0));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.SName.sendKeys(getExcelData("AddAcademic", 1, 1));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.BName.sendKeys(getExcelData("AddAcademic", 1, 2));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.YOP.sendKeys(getExcelData("AddAcademic", 1, 3));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.Grade.sendKeys(getExcelData("AddAcademic", 1, 4));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.Branch.sendKeys(getExcelData("AddAcademic", 1, 5));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.SubmitAcad.click();
		Thread.sleep(4000);
		
		Student_Profile_Detail_Page_Objects.CloseAcad.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS,"New Academic Added Successfully");
		
		
	}
	
	//@Test(priority = 7)
	public void MandatoryCheck() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Close Bio-Data in Profile");
		
		Student_Profile_Detail_Page_Objects.Objective.clear();
		Thread.sleep(2000);
	
		Student_Profile_Detail_Page_Objects.PBodies.clear();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.COCA.clear();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.Pcomplete.clear();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.ECOCA.clear();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.SoftSkills.clear();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.SubmitBD.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS,"Mandatory Validation Done in Bio Data Successfully");
		
	}
	
	//@Test(priority = 8)
	public void AddBioData() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Add Bio-Data in Profile");
		
		Student_Profile_Detail_Page_Objects.Objective.sendKeys(getExcelData("AddAcademic", 4, 0));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.PBodies.sendKeys(getExcelData("AddAcademic", 4, 1));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.COCA.sendKeys(getExcelData("AddAcademic", 4, 2));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.Pcomplete.sendKeys(getExcelData("AddAcademic", 4, 3));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.ECOCA.sendKeys(getExcelData("AddAcademic", 4, 4));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.SoftSkills.sendKeys(getExcelData("AddAcademic", 4, 5));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.SubmitBD.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS,"Bio-Data Added Successfully in Profile");
		
	}
	
	//@Test(priority = 9)
	public void SortVCList() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Sort Functionality in Profile View Course");
		
		Student_Profile_Detail_Page_Objects.ProfileMenu.click(); Thread.sleep(2000);
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.VCMenu.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.SortSem.click();
		Thread.sleep(1000);
		
		Student_Profile_Detail_Page_Objects.SortID.click();
		Thread.sleep(1000);
		
		Student_Profile_Detail_Page_Objects.SortSubject.click();
		Thread.sleep(1000);
		
		Student_Profile_Detail_Page_Objects.SortCatalog.click();
		Thread.sleep(1000);
		
		Student_Profile_Detail_Page_Objects.SortDes.click();
		Thread.sleep(1000);
		
		Student_Profile_Detail_Page_Objects.SortGrade.click();
		Thread.sleep(1000);
		
	}
	
	//@Test(priority = 10)
	public void VCInvalidCheck() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Invalid Search Validation in List Grid");
		
		Student_Profile_Detail_Page_Objects.SearchField.sendKeys(getExcelData("ViewCourse", 1, 1));
		Thread.sleep(2000);
		
		String VCListWarn = Student_Profile_Detail_Page_Objects.VCListWarn.getText();
		Thread.sleep(2000);
		
		if(VCListWarn.contains("Record(s) not found"))
		{
			extenttestCase.log(Status.PASS,"Invalid Search Validation Done Successfully in List Grid");
		}
		
		else
		{
			extenttestCase.log(Status.INFO,"Invalid Search Validation Failed in List Grid");
		}
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
	
	//@Test(priority = 11)
	public void VerifyDesSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Description Search in View Course");
		
		Student_Profile_Detail_Page_Objects.SearchSelect.sendKeys(getExcelData("ViewCourse", 2, 0));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.SearchField.sendKeys(getExcelData("ViewCourse", 2, 1));
		Thread.sleep(2000);
		
		String DesResult = Student_Profile_Detail_Page_Objects.DesResult.getText();
		Thread.sleep(2000);
		
		if(DesResult.contentEquals(getExcelData("ViewCourse", 2, 1)))
		{
			extenttestCase.log(Status.PASS,"Description Search Validation Done Successfully in List Grid");
		}
		
		else
		{
			extenttestCase.log(Status.INFO,"Description Search Validation Failed in List Grid");
		}
		
	}
	
	//@Test(priority = 12)
	public void VerifySubjectSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Subject Search in View Course");
		
		Student_Profile_Detail_Page_Objects.SearchSelect.sendKeys(getExcelData("ViewCourse", 3, 0));
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.SearchField.sendKeys(getExcelData("ViewCourse", 3, 1));
		Thread.sleep(2000);
		
		String SubjectResult = Student_Profile_Detail_Page_Objects.SubjectResult.getText();
		Thread.sleep(2000);
		
		if(SubjectResult.contentEquals(getExcelData("ViewCourse", 3, 1)))
		{
			extenttestCase.log(Status.PASS,"Subject Search Validation Done Successfully in List Grid");
		}
		
		else
		{
			extenttestCase.log(Status.INFO,"Subject Search Validation Failed in List Grid");
		}
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
	
	
	//@Test(priority = 13)
	public void VerifyResume() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Resume in Profile");
		
		Student_Profile_Detail_Page_Objects.ProfileMenu.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.PreviewResume.click();
		Thread.sleep(2000);
		
		Student_Profile_Detail_Page_Objects.DownloadResume.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS,"Profile Downloaded Successfully");
		
		Student_Profile_Detail_Page_Objects.ProfileMenu.click();
		Thread.sleep(2000);
	}
		

}
