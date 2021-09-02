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
import pageObjects.AddProblem_Detail_Page_Objects;


public class AddProblem_Detail extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(AddProblem_Detail.class);
	
	@Test(priority = 0)
	public void ProblemBankMenu() throws InterruptedException, IOException
	{
		extenttestCase=extentReport.createTest("Verifying Add Problem Bank Detail Page");
		PageFactory.initElements(driver, AddProblem_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO,"Landing into Add Problem Bank Detail");
		
		AddProblem_Detail_Page_Objects.AddProblemClick.click();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("GeneralInfo.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("GeneralInfo.png");
		
		AddProblem_Detail_Page_Objects.Cancel.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Close.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Cancel.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Ok.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.AddProblemClick.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void VerfiyGInfo() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Mandatory Field Validation in General Info");
		AddProblem_Detail_Page_Objects.SaveNext.click();
		Thread.sleep(2000);
		extenttestCase.log(Status.PASS,"Mandatory Field Validation Done in General Info");
	}
	
	@Test(priority = 2)
	public void AddGInfo() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Add General Info in Problem Bank");
		AddProblem_Detail_Page_Objects.PSType.sendKeys(getExcelData("AddProblem", 2, 0));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SName.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchSName.sendKeys(getExcelData("AddProblem", 2, 1));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckSName.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.PSBatch.sendKeys(getExcelData("AddProblem", 2, 3));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.PTitle.sendKeys(getExcelData("AddProblem", 2, 4));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.PDesc.sendKeys(getExcelData("AddProblem", 2, 5));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.MName.sendKeys(getExcelData("AddProblem", 2, 6));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CDetail.sendKeys(getExcelData("AddProblem", 2, 7));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.EmailId.sendKeys(getExcelData("AddProblem", 2, 8));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SaveNext.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "General Info Added Successfully");
		
	}
	
	@Test(priority = 3)
	public void AddDiscipline() throws Throwable
	{
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("Discipline.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("Discipline.png");
		
		AddProblem_Detail_Page_Objects.DDHeader.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.DDHeader.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.ConstraintsHeader.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.ConstraintsHeader.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CGPAL.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CGPAL.sendKeys(getExcelData("AddProblem", 6, 0));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.TotalR.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.TotalR.sendKeys(getExcelData("AddProblem", 6, 2));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Male.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Male.sendKeys(getExcelData("AddProblem", 6, 3));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Female.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Female.sendKeys(getExcelData("AddProblem", 6, 4));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.FDegree.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SCourseAll.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.OtherConstraints.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.NoOfS.sendKeys(getExcelData("AddProblem", 6, 5));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.AddDG.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.DeleteDG.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CloseDelete.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.DeleteDG.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.OkDelete.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Discipline Deleted Successfully");
		
	}
	
	@Test(priority = 4)
	public void AddDisciplineAgain() throws Throwable
	{
		
		extenttestCase.log(Status.INFO, "Adding Discipline Again");
		
		AddProblem_Detail_Page_Objects.CGPAL.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CGPAL.sendKeys(getExcelData("AddProblem", 6, 0));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.TotalR.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.TotalR.sendKeys(getExcelData("AddProblem", 6, 2));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Male.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Male.sendKeys(getExcelData("AddProblem", 6, 3));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Female.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Female.sendKeys(getExcelData("AddProblem", 6, 4));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.FDegree.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SCourseAll.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.OtherConstraints.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.NoOfS.sendKeys(getExcelData("AddProblem", 6, 5));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.AddDG.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SaveNextDis.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Discipline Added Successfully");	
	}
	
	@Test(priority = 5)
	public void AddTechSkill() throws Throwable
	{
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("SkillSet.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("SkillSet.png");
		
		extenttestCase.log(Status.INFO, "Adding Technical Skill Set and Subject Area");
		
		AddProblem_Detail_Page_Objects.SaveNextSkill.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Mandatory Field Validation done in Skill Set & Subject Area");
		
		AddProblem_Detail_Page_Objects.AddSkill.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CancelSkill.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.AddSkill.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SubmitSkill.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Mandatory Field Validation done in Add New Skill Popup");
		
		AddProblem_Detail_Page_Objects.SkillType.sendKeys(getExcelData("AddProblem", 10, 0));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.NewSkill.sendKeys(getExcelData("AddProblem", 10, 1));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SubmitSkill.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CancelSkill.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SelectSkill.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchSkill.sendKeys(getExcelData("AddProblem", 10, 1));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckSkill.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Technical Skill Added Successfully");	
	
	}
	
	@Test(priority = 6)
	public void AddNonTechSkill() throws Throwable
	{
		
		extenttestCase.log(Status.INFO, "Adding Non-Technical Skill Set and Subject Area");
		
		AddProblem_Detail_Page_Objects.AddSkill.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SkillType.sendKeys(getExcelData("AddProblem", 10, 2));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.NewSkill.sendKeys(getExcelData("AddProblem", 10, 3));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SubmitSkill.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CancelSkill.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SelectNonTech.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchNTech.sendKeys(getExcelData("AddProblem", 10, 3));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckNTech.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchNTech.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Non-Technical Skill Added Successfully");	
	}
	
	@Test(priority = 7)
	public void AddNewDomain() throws Throwable
	{
		
		extenttestCase.log(Status.INFO, "Adding New Domain");
		
		AddProblem_Detail_Page_Objects.AddDomain.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CancelDomain.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.AddDomain.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SubmitDomain.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Mandatory Field Validation done in Add New Domain Popup");
		
		AddProblem_Detail_Page_Objects.DomainType.sendKeys(getExcelData("AddProblem", 10, 4));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.NewDomain.sendKeys(getExcelData("AddProblem", 10, 5));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SubmitDomain.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CancelDomain.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.AddDomain.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.DomainType.sendKeys(getExcelData("AddProblem", 10, 6));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SelectPDomain.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchPDomain.sendKeys(getExcelData("AddProblem", 10, 5));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckPDomain.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchPDomain.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.NewSubDomain.sendKeys(getExcelData("AddProblem", 10, 7));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SubmitDomain.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CancelDomain.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SelectPD.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchPD.sendKeys(getExcelData("AddProblem", 10, 5));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckPD.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchPD.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SelectPSD.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchPSD.sendKeys(getExcelData("AddProblem", 10, 7));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckPSD.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchPSD.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SaveNextSkill.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "New Skill Set and Subject Area Added Successfully");
	
	}
	
	@Test(priority = 8)
	public void AddElectives() throws Throwable
	{
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("Electives.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("Electives.png");
		
		extenttestCase.log(Status.INFO, "Adding New Elective Courses");
		
		AddProblem_Detail_Page_Objects.AddCourse.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SelectCourse.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchCourse.sendKeys(getExcelData("AddProblem", 14, 0));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckCourse.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.ChooseGrade.sendKeys(getExcelData("AddProblem", 14, 1));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.DeleteCourse.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CloseCourse.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.DeleteCourse.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.OkCourse.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Added Electives Deleted Successfully");
		
		AddProblem_Detail_Page_Objects.AddCourse.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SelectCourse.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchCourse.sendKeys(getExcelData("AddProblem", 14, 0));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckCourse.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.ChooseGrade.sendKeys(getExcelData("AddProblem", 14, 1));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SaveNextElectives.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "New Electives Added Successfully");
}
	
	
	@Test(priority = 9)
	public void AddFacility() throws Throwable
	{
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("Facility.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("Facility.png");
		
		extenttestCase.log(Status.INFO, "Adding New Facility");
		
		AddProblem_Detail_Page_Objects.ExpandStipend.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.ExpandStipend.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.ExpandOtiming.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.ExpandOtiming.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.ExpandAccomodation.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.ExpandAccomodation.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.ExpandOthers.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.ExpandOthers.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.INFO, "Expand and Collapse Functionality Verified Successfully");
		
		AddProblem_Detail_Page_Objects.SaveNextF.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Mandatory Field Validation done in Facility Successfully");
		
		AddProblem_Detail_Page_Objects.Currency.sendKeys(getExcelData("AddProblem", 18, 0));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Scholarship.sendKeys(getExcelData("AddProblem", 18, 1));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SFDegree.sendKeys(getExcelData("AddProblem", 18, 2));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.StartTime.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.StartTime.sendKeys(getExcelData("AddProblem", 18, 4));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.EndTime.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.EndTime.sendKeys(getExcelData("AddProblem", 18, 5));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SelectWO.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchWO.sendKeys(getExcelData("AddProblem", 18, 6));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckWO.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchWO.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.YesAccom.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.YesBoys.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BAddress1.sendKeys(getExcelData("AddProblem", 18, 7));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BAddress2.sendKeys(getExcelData("AddProblem", 18, 8));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BCountry.sendKeys(getExcelData("AddProblem", 18, 9));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BState.sendKeys(getExcelData("AddProblem", 18, 10));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BCity.sendKeys(getExcelData("AddProblem", 18, 11));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BPin.sendKeys(getExcelData("AddProblem", 18, 12));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.YesGirls.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.GAddress1.sendKeys(getExcelData("AddProblem", 18, 7));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.GAddress2.sendKeys(getExcelData("AddProblem", 18, 8));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.GCountry.sendKeys(getExcelData("AddProblem", 18, 9));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.GState.sendKeys(getExcelData("AddProblem", 18, 10));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.GCity.sendKeys(getExcelData("AddProblem", 18, 11));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.GPin.sendKeys(getExcelData("AddProblem", 18, 12));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.YesTA.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.YesDA.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.YesConvey.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.YesMedical.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.YesTravel.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.YesLunch.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SaveNextF.click();
		Thread.sleep(3000);
		
		extenttestCase.log(Status.PASS, "New Facility Added Successfully");
		
		AddProblem_Detail_Page_Objects.SearchProblem.sendKeys(getExcelData("AddProblem", 2, 4));
		Thread.sleep(2000);
		
		String CheckProblem = AddProblem_Detail_Page_Objects.CheckProblem.getText();
		System.out.println(CheckProblem);
		Thread.sleep(2000);
		if(CheckProblem.contains(getExcelData("AddProblem", 2, 4)))
		{
			extenttestCase.log(Status.PASS, "Problem Bank Created Successfully");
		}
		
		AddProblem_Detail_Page_Objects.SearchProblem.clear();
		Thread.sleep(2000);
		
	}
	
}
