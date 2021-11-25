package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import pageObjects.FacultyAllot_GroupLeader_Allotment_Objects;


public class FacultyRole_GroupLeader_Allotment_Details extends CommonFunctions {

	
	
	static Logger logger = Logger.getLogger(FacultyRole_GroupLeader_Allotment_Details.class);
 
	//function to select Batch
	public void Selectdrpdwn(WebElement Bat,String sheetname, int row, int col) {
	
		Select Batch = new Select(Bat);
		String BatchYr = null; 
		try {
			BatchYr = getExcelData(sheetname, row, col);
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		Batch.selectByVisibleText(BatchYr);				
		extenttestCase.log(Status.INFO,"Selected the Batch name");
			
	}
//Function to get Selected Group Leader Name from Grid	
	public void GroupLeadervaluefromGrid(List<WebElement> GridRow) {

	List<WebElement> ln=GridRow;
	System.out.println(ln.size());
	for(WebElement a:ln)
		{
	//get the option from the dropdown
		try{
			Select sl=new Select(a);
			WebElement ge=sl.getFirstSelectedOption();
			String newg =ge.getText();
			System.out.println(newg);
			}
			catch(Exception e){
			System.out.println("no options are selected");	
			}
			
	}
	
	}
	
	
	@Test(priority = 0)
	public void VerifyGroupLeaderAllotPage() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Verifying Faculty Group Leader Allotment Page");
		PageFactory.initElements(driver, FacultyAllot_GroupLeader_Allotment_Objects.class);
		
		FacultyAllot_GroupLeader_Allotment_Objects.FacultyAllotment.click();
		extenttestCase.log(Status.INFO,"Clicked on Faculty Allotment in Menu");
		
		FacultyAllot_GroupLeader_Allotment_Objects.GroupLeaderAllot_Listval.click();
		extenttestCase.log(Status.INFO,"Clicked on Group Leader Allotment in Faculty Allotment List");
		//FacultyAllot_GroupLeader_Allotment_Objects.StationOrFacultyAllot_Listval.click();//element to chech fail 

		String GrpLeadpage=FacultyAllot_GroupLeader_Allotment_Objects.GrpLeadPage.getText();
		
		if(GrpLeadpage.contains("Group Leader Allotment")) { 
			
			extenttestCase.log(Status.PASS, "User successfully navigated to Group Leader Allotment Page");
		}
		
		else
		{
			extenttestCase.log(Status.FAIL, "User is not navigated to Group Leader Allotment page");
		}
	}
	
	@Test(priority=1)
	public void Verify_PS_I_RecordFetch_InGroupLeaderAllotments() throws Throwable {
		
		
		extenttestCase=extentReport.createTest("Verify PS I Records are fetch in Group Leader Allotment");
		extenttestCase.log(Status.INFO,"Checking for Record available in Group Leader Allotment");
		
		WebDriverWait wait= new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(FacultyAllot_GroupLeader_Allotment_Objects.StationName_ip));
		FacultyAllot_GroupLeader_Allotment_Objects.StationName_ip.sendKeys(getExcelData("FacultyGroupLeaderData", 1, 1));
		FacultyAllot_GroupLeader_Allotment_Objects.StationName_ip.sendKeys(Keys.ENTER);
		extenttestCase.log(Status.INFO,"Entered the Station Name");
		
		
		FacultyAllot_GroupLeader_Allotment_Objects.CityName_ip.sendKeys(getExcelData("FacultyGroupLeaderData", 2, 1));
		FacultyAllot_GroupLeader_Allotment_Objects.CityName_ip.sendKeys(Keys.ENTER);
		extenttestCase.log(Status.INFO,"Entered the City Name");
		
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.BatchYear, "FacultyGroupLeaderData" , 4, 1);
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.PStypeSelect, "FacultyGroupLeaderData" , 7, 1);
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.AllotPS1, "FacultyGroupLeaderData" , 12, 1);
		
		extenttestCase.log(Status.INFO,"Checking for Record available in Group Leader Allotment");
		String Records=FacultyAllot_GroupLeader_Allotment_Objects.RecordsInGrid.getText();
		//String RecordNotFound=FacultyAllot_GroupLeader_Allotment_Objects.re
		
		if(Records.contains("Records:")) { 
			
			extenttestCase.log(Status.PASS, "Records are found for allotment/update allotment");
		}
		
		else if (Records.contains("Record(s) not found")) {
			extenttestCase.log(Status.INFO, "Records are not found for the selected filter");
			extenttestCase.log(Status.INFO, "Change the filter values to fetch the records");
		}

	}		
	
	
	@Test(enabled = false)
		public void Verify_PS_II_RecordFetch_InGroupLeaderAllotments() throws Throwable {
		
		
		extenttestCase=extentReport.createTest("Verify PS II records are fetched in Group Leader Allotment Page");
		PageFactory.initElements(driver, FacultyAllot_GroupLeader_Allotment_Objects.class);		
		FacultyAllot_GroupLeader_Allotment_Objects.StationName_ip.clear();
		FacultyAllot_GroupLeader_Allotment_Objects.StationName_ip.sendKeys(getExcelData("FacultyGroupLeaderData", 1, 2));
		FacultyAllot_GroupLeader_Allotment_Objects.StationName_ip.sendKeys(Keys.ENTER);
		extenttestCase.log(Status.INFO,"Entered the Station Name");
		FacultyAllot_GroupLeader_Allotment_Objects.CityName_ip.sendKeys(getExcelData("FacultyGroupLeaderData", 2, 2));
		FacultyAllot_GroupLeader_Allotment_Objects.CityName_ip.sendKeys(Keys.ENTER);
		extenttestCase.log(Status.INFO,"Entered the City Name");
		
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.BatchYear, "FacultyGroupLeaderData" , 4, 2);
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.PStypeSelect, "FacultyGroupLeaderData" , 8, 2);
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.Semester, "FacultyGroupLeaderData" , 9, 2);
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.AllotPS2, "FacultyGroupLeaderData" , 12, 1);
		extenttestCase.log(Status.INFO,"Checking for Record available in Group Leader Allotment");
		String Records=FacultyAllot_GroupLeader_Allotment_Objects.RecordsInGrid.getText();
		//String RecordNotFound=FacultyAllot_GroupLeader_Allotment_Objects.re
		
		if(Records.contains("Records:")) { 
			
			extenttestCase.log(Status.PASS, "Records are found for allotment/update allotment");
		}
		
		else if (Records.contains("Record(s) not found")) {
			extenttestCase.log(Status.INFO, "Records are not found for the selected filter");
			extenttestCase.log(Status.INFO, "Change the filter values to fetch the records");
		}
	}
	
	@Test(enabled = false)//"Verify_PS_II_RecordFetch_InGroupLeaderAllotments")
		public void VerifySemesterFieldforPSII_Type() throws Throwable {
			
			extenttestCase=extentReport.createTest("Verifying Semester field is present for PS II Type");
			
			if (FacultyAllot_GroupLeader_Allotment_Objects.Semester.isDisplayed()) {
				extenttestCase.log(Status.PASS, "Semester Field is present for PS II type");			
			}
			
			else {
				extenttestCase.log(Status.INFO, "User has not selected PSII");			
				
			}
		}
	
	
	@Test(priority=2)
	public void Allot_GroupLeader_forPS_I_Type_Record_InGroupLeaderAllotments() throws Throwable 
	{
		
		extenttestCase=extentReport.createTest("Allot GroupLeader for PS I Type Record In GroupLeader Allotment");
		PageFactory.initElements(driver, FacultyAllot_GroupLeader_Allotment_Objects.class);		
		extenttestCase.log(Status.INFO,"Station value before Group Leader Allotment");
		GroupLeadervaluefromGrid(FacultyAllot_GroupLeader_Allotment_Objects.GroupLead_drpdwn_Grid);
		FacultyAllot_GroupLeader_Allotment_Objects.AllotGroupLeader_btn.click();
		//String toast=FacultyAllot_GroupLeader_Allotment_Objects.Toaster.getText();
		//System.out.println(toast);
		FacultyAllot_GroupLeader_Allotment_Objects.Publish_btn.click();
		FacultyAllot_GroupLeader_Allotment_Objects.Okay_alertbtn.click();
		
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.BatchYear, "FacultyGroupLeaderData" , 4, 1);
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.PStypeSelect, "FacultyGroupLeaderData" , 7, 1);
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.AllotPS1, "FacultyGroupLeaderData" , 12, 1);
		GroupLeadervaluefromGrid(FacultyAllot_GroupLeader_Allotment_Objects.GroupLead_drpdwn_Grid);
		extenttestCase.log(Status.INFO,"Station value after Group Leader Allotment");

	}

	@Test(enabled=false)
	public void Updating_GroupLeader_InGroupLeaderAllotments() throws Throwable 
	{
		
		extenttestCase=extentReport.createTest("Verify PS II records are fetched in Group Leader Allotment Page");
		PageFactory.initElements(driver, FacultyAllot_GroupLeader_Allotment_Objects.class);		
		
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.BatchYear, "FacultyGroupLeaderData" , 4, 1);
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.PStypeSelect, "FacultyGroupLeaderData" , 7, 1);
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.AllotPS1, "FacultyGroupLeaderData" , 12, 1);
		GroupLeadervaluefromGrid(FacultyAllot_GroupLeader_Allotment_Objects.GroupLead_drpdwn_Grid);
		
		String GrpLeaddata=getExcelData("FacultyGroupLeaderData", 15, 1);
		FacultyAllot_GroupLeader_Allotment_Objects.AllotGroupLeader_btn.click();
		//String toast=FacultyAllot_GroupLeader_Allotment_Objects.Toaster.getText();
		//System.out.println(toast);
		FacultyAllot_GroupLeader_Allotment_Objects.Publish_btn.click();
		FacultyAllot_GroupLeader_Allotment_Objects.Okay_alertbtn.click();
		
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.BatchYear, "FacultyGroupLeaderData" , 4, 1);
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.PStypeSelect, "FacultyGroupLeaderData" , 7, 1);
		Selectdrpdwn(FacultyAllot_GroupLeader_Allotment_Objects.AllotPS1, "FacultyGroupLeaderData" , 12, 1);
		GroupLeadervaluefromGrid(FacultyAllot_GroupLeader_Allotment_Objects.GroupLead_drpdwn_Grid);
		extenttestCase.log(Status.INFO,"Station value after Group Leader Allotment");
		
		
		extenttestCase.log(Status.INFO,"Station value after Group Leader Allotment");
		
		FacultyAllot_GroupLeader_Allotment_Objects.AllotGroupLeader_btn.click();
		
		FacultyAllot_GroupLeader_Allotment_Objects.Publish_btn.click();
		FacultyAllot_GroupLeader_Allotment_Objects.Okay_alertbtn.click();
		

	}


}
