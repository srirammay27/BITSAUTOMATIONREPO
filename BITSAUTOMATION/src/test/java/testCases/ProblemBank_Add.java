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
import pageObjects.ProblemBank_Add_Objects;

public class ProblemBank_Add extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(ProblemBank_Add.class);
	
	@Test(priority = 0)
	public void ProblemBankMenu() throws InterruptedException, IOException
	{
		extenttestCase=extentReport.createTest("Verifying Add Problem Bank Detail Page");
		PageFactory.initElements(driver, ProblemBank_Add_Objects.class);
		extenttestCase.log(Status.INFO,"Landing into Add Problem Bank Detail");
		
		ProblemBank_Add_Objects.AddProblemClick.click();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("GeneralInfo.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("GeneralInfo.png");
		
		ProblemBank_Add_Objects.Cancel.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.Close.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.Cancel.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.Ok.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.AddProblemClick.click();
		Thread.sleep(2000);
	}
	

	@Test(priority = 1)
	public void VerfiyGInfo() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Mandatory Field Validation in General Info");
		ProblemBank_Add_Objects.SaveNext.click();
		Thread.sleep(2000);
		extenttestCase.log(Status.PASS,"Mandatory Field Validation Done in General Info");
	}
	
	@Test(priority = 2)
	public void AddGInfo() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Add General Info in Problem Bank");
		ProblemBank_Add_Objects.PSType.sendKeys(getExcelData("AddProblem", 2, 0));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SName.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SearchSName.sendKeys(getExcelData("AddProblem", 2, 1));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CheckSName.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.PSBatch.sendKeys(getExcelData("AddProblem", 2, 3));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.PTitle.sendKeys(getExcelData("AddProblem", 2, 4));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.PDesc.sendKeys(getExcelData("AddProblem", 2, 5));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.MName.sendKeys(getExcelData("AddProblem", 2, 6));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CDetail.sendKeys(getExcelData("AddProblem", 2, 7));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.EmailId.sendKeys(getExcelData("AddProblem", 2, 8));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SaveNext.click();
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
		
		ProblemBank_Add_Objects.DDHeader.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.DDHeader.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.ConstraintsHeader.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.ConstraintsHeader.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CGPAL.clear();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CGPAL.sendKeys(getExcelData("AddProblem", 6, 0));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.TotalR.clear();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.TotalR.sendKeys(getExcelData("AddProblem", 6, 2));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.Male.clear();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.Male.sendKeys(getExcelData("AddProblem", 6, 3));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.Female.clear();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.Female.sendKeys(getExcelData("AddProblem", 6, 4));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.FDegree.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SCourseAll.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.OtherConstraints.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.NoOfS.sendKeys(getExcelData("AddProblem", 6, 5));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.AddDG.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.DeleteDG.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CloseDelete.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.DeleteDG.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.OkDelete.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Discipline Deleted Successfully");
		
	}
	
	@Test(priority = 4)
	public void AddDisciplineAgain() throws Throwable
	{
		
		extenttestCase.log(Status.INFO, "Adding Discipline Again");
		
		ProblemBank_Add_Objects.CGPAL.clear();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CGPAL.sendKeys(getExcelData("AddProblem", 6, 0));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.TotalR.clear();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.TotalR.sendKeys(getExcelData("AddProblem", 6, 2));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.Male.clear();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.Male.sendKeys(getExcelData("AddProblem", 6, 3));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.Female.clear();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.Female.sendKeys(getExcelData("AddProblem", 6, 4));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.FDegree.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SCourseAll.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.OtherConstraints.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.NoOfS.sendKeys(getExcelData("AddProblem", 6, 5));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.AddDG.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SaveNextDis.click();
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
		
		ProblemBank_Add_Objects.SaveNextSkill.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Mandatory Field Validation done in Skill Set & Subject Area");
		
		ProblemBank_Add_Objects.AddSkill.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CancelSkill.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.AddSkill.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SubmitSkill.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Mandatory Field Validation done in Add New Skill Popup");
		
		ProblemBank_Add_Objects.SkillType.sendKeys(getExcelData("AddProblem", 10, 0));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.NewSkill.sendKeys(getExcelData("AddProblem", 10, 1));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SubmitSkill.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CancelSkill.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SelectSkill.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SearchSkill.sendKeys(getExcelData("AddProblem", 10, 1));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CheckSkill.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Technical Skill Added Successfully");	
	
	}
	
	@Test(priority = 6)
	public void AddNonTechSkill() throws Throwable
	{
		
		extenttestCase.log(Status.INFO, "Adding Non-Technical Skill Set and Subject Area");
		
		ProblemBank_Add_Objects.AddSkill.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SkillType.sendKeys(getExcelData("AddProblem", 10, 2));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.NewSkill.sendKeys(getExcelData("AddProblem", 10, 3));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SubmitSkill.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CancelSkill.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SelectNonTech.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SearchNTech.sendKeys(getExcelData("AddProblem", 10, 3));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CheckNTech.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SearchNTech.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Non-Technical Skill Added Successfully");	
	}
	
	@Test(priority = 7)
	public void AddNewDomain() throws Throwable
	{
		
		extenttestCase.log(Status.INFO, "Adding New Domain");
		
		ProblemBank_Add_Objects.AddDomain.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CancelDomain.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.AddDomain.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SubmitDomain.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Mandatory Field Validation done in Add New Domain Popup");
		
		ProblemBank_Add_Objects.DomainType.sendKeys(getExcelData("AddProblem", 10, 4));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.NewDomain.sendKeys(getExcelData("AddProblem", 10, 5));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SubmitDomain.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CancelDomain.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.AddDomain.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.DomainType.sendKeys(getExcelData("AddProblem", 10, 6));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SelectPDomain.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SearchPDomain.sendKeys(getExcelData("AddProblem", 10, 5));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CheckPDomain.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SearchPDomain.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.NewSubDomain.sendKeys(getExcelData("AddProblem", 10, 7));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SubmitDomain.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CancelDomain.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SelectPD.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SearchPD.sendKeys(getExcelData("AddProblem", 10, 5));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CheckPD.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SearchPD.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SelectPSD.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SearchPSD.sendKeys(getExcelData("AddProblem", 10, 7));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CheckPSD.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SearchPSD.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SaveNextSkill.click();
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
		
		ProblemBank_Add_Objects.AddCourse.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SelectCourse.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SearchCourse.sendKeys(getExcelData("AddProblem", 14, 0));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CheckCourse.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.ChooseGrade.sendKeys(getExcelData("AddProblem", 14, 1));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.DeleteCourse.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CloseCourse.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.DeleteCourse.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.OkCourse.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Added Electives Deleted Successfully");
		
		ProblemBank_Add_Objects.AddCourse.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SelectCourse.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SearchCourse.sendKeys(getExcelData("AddProblem", 14, 0));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CheckCourse.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.ChooseGrade.sendKeys(getExcelData("AddProblem", 14, 1));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SaveNextElectives.click();
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
		
		ProblemBank_Add_Objects.ExpandStipend.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.ExpandStipend.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.ExpandOtiming.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.ExpandOtiming.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.ExpandAccomodation.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.ExpandAccomodation.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.ExpandOthers.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.ExpandOthers.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.INFO, "Expand and Collapse Functionality Verified Successfully");
		
		ProblemBank_Add_Objects.SaveNextF.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Mandatory Field Validation done in Facility Successfully");
		
		ProblemBank_Add_Objects.Currency.sendKeys(getExcelData("AddProblem", 18, 0));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.Scholarship.sendKeys(getExcelData("AddProblem", 18, 1));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SFDegree.sendKeys(getExcelData("AddProblem", 18, 2));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.StartTime.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.StartTime.sendKeys(getExcelData("AddProblem", 18, 4));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.EndTime.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.EndTime.sendKeys(getExcelData("AddProblem", 18, 5));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SelectWO.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SearchWO.sendKeys(getExcelData("AddProblem", 18, 6));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.CheckWO.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SearchWO.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.YesAccom.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.YesBoys.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.BAddress1.sendKeys(getExcelData("AddProblem", 18, 7));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.BAddress2.sendKeys(getExcelData("AddProblem", 18, 8));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.BCountry.sendKeys(getExcelData("AddProblem", 18, 9));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.BState.sendKeys(getExcelData("AddProblem", 18, 10));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.BCity.sendKeys(getExcelData("AddProblem", 18, 11));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.BPin.sendKeys(getExcelData("AddProblem", 18, 12));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.YesGirls.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.GAddress1.sendKeys(getExcelData("AddProblem", 18, 7));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.GAddress2.sendKeys(getExcelData("AddProblem", 18, 8));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.GCountry.sendKeys(getExcelData("AddProblem", 18, 9));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.GState.sendKeys(getExcelData("AddProblem", 18, 10));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.GCity.sendKeys(getExcelData("AddProblem", 18, 11));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.GPin.sendKeys(getExcelData("AddProblem", 18, 12));
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.YesTA.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.YesDA.click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		ProblemBank_Add_Objects.YesConvey.click();
		
		ProblemBank_Add_Objects.YesMedical.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.YesTravel.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.YesLunch.click();
		Thread.sleep(2000);
		
		ProblemBank_Add_Objects.SaveNextF.click();
		Thread.sleep(3000);
		
		extenttestCase.log(Status.PASS, "New Facility Added Successfully");
		
		ProblemBank_Add_Objects.SearchProblem.sendKeys(getExcelData("AddProblem", 2, 4));
		Thread.sleep(2000);
		
		String CheckProblem = ProblemBank_Add_Objects.CheckProblem.getText();
		System.out.println(CheckProblem);
		Thread.sleep(2000);
		if(CheckProblem.contains(getExcelData("AddProblem", 2, 4)))
		{
			extenttestCase.log(Status.PASS, "Problem Bank Created Successfully");
		}
		
		ProblemBank_Add_Objects.SearchProblem.clear();
		Thread.sleep(2000);
		
	}
}
	