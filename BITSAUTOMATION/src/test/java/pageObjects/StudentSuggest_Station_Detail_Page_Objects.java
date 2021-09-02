package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentSuggest_Station_Detail_Page_Objects {
	
	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[3]/a")
	public static WebElement SSMenu;

	///////////////////////////////////////// Add Station ////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[1]/div/div/div[2]/div/button")
	public static WebElement AddStation;

	@FindBy(xpath="/html/body/app-root/app-layout/app-add-station/div/div[2]/div/form/div/div[3]/div/div/button[2]")
	public static WebElement Submitbtn;

	@FindBy(xpath="/html/body/app-root/app-layout/app-add-station/div/div[2]/div/form/div/div[3]/div/div/button[1]")
	public static WebElement Cancelbtn;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement Closebtn;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement Okbtn;

	@FindBy(xpath="/html/body/app-root/app-layout/app-add-station/div/div[2]/div/form/div/div[1]/div[1]/a")
	public static WebElement Stationcollapse;

	@FindBy(xpath="/html/body/app-root/app-layout/app-add-station/div/div[2]/div/form/div/div[2]/div[1]/a")
	public static WebElement Contactcollapse;

	////////////////// Station Detail /////////////////

	@FindBy(id="stationName")
	public static WebElement SName;

	@FindBy(xpath="//*[@id=\"station\"]/div/div[1]/div[2]/div/div[1]/ng-autocomplete/div/div[1]/input")
	public static WebElement PCompany;

	@FindBy(xpath="//*[@id=\"station\"]/div/div[1]/div[3]/div/div/div[2]/label/input")
	public static WebElement PSType;

	@FindBy(id="stationTypeId")
	public static WebElement StationType;

	@FindBy(xpath="//*[@id=\"station\"]/div/div[2]/div[2]/div/select")
	public static WebElement PSProgram;

	@FindBy(id="domainId")
	public static WebElement BDomain;

	@FindBy(id="relation")
	public static WebElement SRelation;

	////////////////// Contact Detail /////////////////
	
	@FindBy(id="websiteAddress")
	public static WebElement URL;
	
	@FindBy(id="stationContactNumber")
	public static WebElement ContactNum;
	
	@FindBy(id="address1")
	public static WebElement Address1;
	
	@FindBy(id="address2")
	public static WebElement Address2;
	
	@FindBy(xpath="//*[@id=\"contact\"]/div/div[2]/div[2]/div/select")
	public static WebElement County;
	
	@FindBy(xpath="//*[@id=\"contact\"]/div/div[2]/div[3]/div/select")
	public static WebElement State;
	
	@FindBy(xpath="//*[@id=\"contact\"]/div/div[3]/div[1]/div/div/div/select")
	public static WebElement City;
	
	@FindBy(id="zip")
	public static WebElement Pincode;
	
	@FindBy(xpath="//*[@id=\"contact\"]/div/div[3]/div[3]/div/app-quill-editor/quill-editor/div[2]/div[1]/p")
	public static WebElement CompanyDes;
	
	////////////////////////////////////// Edit Faculty ///////////////////////////////////////////////
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr/td[2]/a")
	public static WebElement StationLink;

}
