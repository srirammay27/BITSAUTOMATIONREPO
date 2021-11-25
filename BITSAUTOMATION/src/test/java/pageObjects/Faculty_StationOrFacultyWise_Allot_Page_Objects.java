package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Faculty_StationOrFacultyWise_Allot_Page_Objects {

	
	//----------------Faculty Allotment dropdown list----------------
	@FindBy(xpath="//a[text()=' Faculty Allotment ']")
	public static WebElement  FacultyAllotment;

	@FindBy(xpath="//a[text()='Station/Faculty wise Allotment']")
	public static WebElement StationOrFacultyAllot_Listval;	

	//-------------Station/Faculty wise Allotment Page Objects------------
	
	@FindBy(xpath="	//li[contains(text(),'Allot Stations to Faculty')]")
	public static WebElement StatOrFacultyPage;
	
	@FindBy(xpath="//*[@class='filter-section']//select")
	public static WebElement BatchYear;
		
	@FindBy(xpath="//*[@class='filter-section']//following::select")
	public static WebElement  PStypeSelect;

	@FindBy(xpath="//*[@class='filter-section']//following::select[2]")
	public static WebElement  Semester;

	//-------------Select Allotment Type------------
	
	@FindBy(xpath="//label[contains(text(),'Allot by Station')]")
	public static WebElement AllotByStation_rd_btn;
	
	@FindBy(xpath="//label[contains(text(),'Allot by Faculty')]")
	public static WebElement AllotByFaculty_rd_btn;

	@FindBy(xpath="//label[contains(text(),'Select Station to Allot')]/parent::div//div[@class='multiselect-dropdown']")
	public static WebElement Station_span;

	@FindBy(xpath="//label[contains(text(),'Select Faculty to Allot Station')]/parent::div//div[@class='multiselect-dropdown']")
	public static WebElement Faculty_span;	
	
	@FindBy(xpath="//label[contains(text(),'Select Station to Allot')]/parent::div//li[@class='multiselect-item-checkbox']")
	public static List<WebElement> Station_drpdwn; 

	@FindBy(xpath="//button[text()='Back']")
	public static WebElement Back_btn;

	@FindBy(xpath="//label[contains(text(),'Select Faculty to Allot Station')]/parent::div//li[@class='multiselect-item-checkbox']")
	public static List<WebElement> Faculty_drpdwn; 

	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	public static WebElement Cancel_btn; 

	@FindBy(xpath="//button[contains(text(),'Save')]")
	public static WebElement Save_btn; 
	

}
