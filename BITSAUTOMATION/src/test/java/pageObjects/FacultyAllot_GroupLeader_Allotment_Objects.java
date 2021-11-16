package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonFunctions.CommonFunctions;

public class FacultyAllot_GroupLeader_Allotment_Objects {
	
	
	
	//-----------Faculty Allotment dropdown list----------------
	@FindBy(xpath="//a[text()=' Faculty Allotment ']")
	public static WebElement  FacultyAllotment;

	@FindBy(xpath="//a[text()='Group Leader Allotment']")
	public static WebElement GroupLeaderAllot_Listval;	

	@FindBy(xpath="//a[text()='Station/Faculty wise Allotment']")
	public static WebElement StationOrFacultyAllot_Listval;
	
	@FindBy(xpath="//a[text()='View Faculty Allotment']")
	public static WebElement ViewFaculty_Listval;
	
//-------------------Group Leader Page---------------------------	
	

	@FindBy(xpath="//li[@class='breadcrumb-item active']")
	public static WebElement  GrpLeadPage;

	@FindBy(xpath="//input[@placeholder='Enter the Station name']")
	public static WebElement  StationName_ip;
	
	@FindBy(xpath="//input[@placeholder='Enter the City name']")
	public static WebElement  CityName_ip;
	
	@FindBy(xpath="//button[text()=' Allot Group Leader ']")
	public static WebElement  AllotGroupLeader_btn;
	
	@FindBy(xpath = "/html/body/app-root/app-layout/app-station-faculty-groupleader/div/div[2]/div/div[1]/div/div/div/div[3]/div/select")
	public static WebElement  BatchYear;
		
	@FindBy(xpath="//select//ancestor::div[@class='col-12 col-sm-12 col-md-6 col-lg-6 col-xl-2']//following-sibling::div/div/select")
	public static WebElement  PStypeSelect;

	@FindBy(xpath="//select//ancestor::div[@class='col-12 col-sm-12 col-md-6 col-lg-6 col-xl-2']//following-sibling::div[2]/div/select")
	public static WebElement  Semester;
	
	@FindBy(xpath="//select//ancestor::div[@class='col-12 col-sm-12 col-md-6 col-lg-6 col-xl-2']//following-sibling::div[3]/div/select")
	public static WebElement  AllotPS2;

	@FindBy(xpath="//select//ancestor::div[@class='col-12 col-sm-12 col-md-6 col-lg-6 col-xl-2']//following-sibling::div[2]//select")
	public static WebElement  AllotPS1;

	@FindBy(xpath="//button[text()=' Update ']")
	public static WebElement  Update;
	
	@FindBy(xpath="//*[contains(text(),'Record')]")
	public static WebElement RecordsInGrid;
	
	//@FindBy(xpath="//*[contains(text(),'Records:')]")
	//public static WebElement RecordsNotFound;

	@FindBy(xpath="//table")
	public static List<WebElement> DynamicGrid;
	
	@FindBy(xpath="//table/thead/tr/th")
	public static List<WebElement> DynamicGridcol;
	
	@FindBy(xpath="//table/tbody/tr/td[6]/div/select")
	public static List<WebElement> DynamicGridrow;

	
	@FindBy(xpath="//button[contains(text(),'Allot Group Leader')]")
	public static WebElement AllotGrpLead_btn;
	
	@FindBy(xpath="//button[contains(text(),'Publish')]")
	public static WebElement Publish_btn;
	
	@FindBy(xpath="//div[@class='modal-footer']/button[text()='Okay']")
	public static WebElement Okay_alertbtn;
	
	
	@FindBy(xpath="//div[@class='modal-footer']/button[text()='Close']")
	public static WebElement Close_alertbtn;
	
	@FindBy(xpath="//div[contains(text(),'Record(s) updated successfully')]")
	public static WebElement Toaster;
	
	
}
