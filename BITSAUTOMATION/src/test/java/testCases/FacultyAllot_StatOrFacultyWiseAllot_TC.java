package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import pageObjects.Faculty_StationOrFacultyWise_Allot_Page_Objects;

public class FacultyAllot_StatOrFacultyWiseAllot_TC extends CommonFunctions{

	
	public void Selectdrpdwn(WebElement Bat,String sheetname, int row, int col) {
		
		Select Batch = new Select(Bat);
		String BatchYr = null; 
		try {
			BatchYr = getExcelData(sheetname, row, col);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Batch.selectByVisibleText(BatchYr);				
		extenttestCase.log(Status.INFO,"Selected the Batch name");
			
	}

	public void MultiSelectListdrpdwn(List<WebElement> station_drpdwn,String sheetname, int row, int col) {
		
List<WebElement> ln= station_drpdwn;
String station_name = null;
try {
	station_name = getExcelData(sheetname, row, col);
} catch (Throwable e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		for(WebElement a:ln) {
			
		String ele =a.getText();
		if (ele.equalsIgnoreCase(station_name)) {
			a.click();	
		}
		
		}
	
	}
	
	

	@Test(priority = 0)
	public void VerifyStationOrFaculty_WiseAllotPage() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Verifying Faculty Group Leader Allotment Page");
		PageFactory.initElements(driver, Faculty_StationOrFacultyWise_Allot_Page_Objects.class);
		
		Faculty_StationOrFacultyWise_Allot_Page_Objects.FacultyAllotment.click();
		extenttestCase.log(Status.INFO,"Clicked on Faculty Allotment in Menu");
		
		Faculty_StationOrFacultyWise_Allot_Page_Objects.StationOrFacultyAllot_Listval.click();
		extenttestCase.log(Status.INFO,"Clicked on Station/Faculty wise Allotment in Faculty Allotment List");
		//FacultyAllot_GroupLeader_Allotment_Objects.StationOrFacultyAllot_Listval.click();//element to chech fail 

		String GrpLeadpage=Faculty_StationOrFacultyWise_Allot_Page_Objects.StatOrFacultyPage.getText();
		
		if(GrpLeadpage.contains("Allot Stations to Faculty")) { 
			
			extenttestCase.log(Status.PASS, "User successfully navigated to Station/Faculty wise Allotment Page");
		}
		
		else
		{
			extenttestCase.log(Status.FAIL, "User is not navigated to Station/Faculty wise Allotment Page");
		}
	}

	@Test(priority = 1)
	public void AllotFaculty_using_AllotByStationOption() throws Throwable {
		
		Selectdrpdwn(Faculty_StationOrFacultyWise_Allot_Page_Objects.BatchYear, "StationOrFacultyWiseAllot", 2, 1);
		Selectdrpdwn(Faculty_StationOrFacultyWise_Allot_Page_Objects.PStypeSelect, "StationOrFacultyWiseAllot", 5, 1);		
		
		Faculty_StationOrFacultyWise_Allot_Page_Objects.AllotByStation_rd_btn.click();
		
		Faculty_StationOrFacultyWise_Allot_Page_Objects.Station_span.click();
		
		MultiSelectListdrpdwn(Faculty_StationOrFacultyWise_Allot_Page_Objects.Station_drpdwn, "StationOrFacultyWiseAllot", 9,1 );
		Faculty_StationOrFacultyWise_Allot_Page_Objects.Faculty_span.click();
		
		MultiSelectListdrpdwn(Faculty_StationOrFacultyWise_Allot_Page_Objects.Faculty_drpdwn, "StationOrFacultyWiseAllot", 9,1 );
		
		Faculty_StationOrFacultyWise_Allot_Page_Objects.Save_btn.click();
		
	}
	
	@Test(priority = 1)
	public void AllotFaculty_using_AllotByFacultyOption() throws Throwable {
		
		Selectdrpdwn(Faculty_StationOrFacultyWise_Allot_Page_Objects.BatchYear, "StationOrFacultyWiseAllot", 2, 1);
		Selectdrpdwn(Faculty_StationOrFacultyWise_Allot_Page_Objects.PStypeSelect, "StationOrFacultyWiseAllot", 5, 1);		
		
		Faculty_StationOrFacultyWise_Allot_Page_Objects.AllotByFaculty_rd_btn.click();
		
		Faculty_StationOrFacultyWise_Allot_Page_Objects.Faculty_span.click();
		
		MultiSelectListdrpdwn(Faculty_StationOrFacultyWise_Allot_Page_Objects.Faculty_drpdwn, "StationOrFacultyWiseAllot", 9,1 );
		
		
		Faculty_StationOrFacultyWise_Allot_Page_Objects.Station_span.click();
		
		MultiSelectListdrpdwn(Faculty_StationOrFacultyWise_Allot_Page_Objects.Station_drpdwn, "StationOrFacultyWiseAllot", 9,1 );
		
		Faculty_StationOrFacultyWise_Allot_Page_Objects.Save_btn.click();
		
	}


}
