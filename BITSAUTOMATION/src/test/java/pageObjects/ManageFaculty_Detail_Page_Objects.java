package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageFaculty_Detail_Page_Objects {
	
	///////////////////////////////////////// Add Faculty ////////////////////////////////////////////////
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[1]/div/div/div[2]/button")
	public static WebElement AddFaculty;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[2]/div/button[1]")
	public static WebElement CancelAddFaculty;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[2]/div/button[2]")
	public static WebElement SaveAddFaculty;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement ClosePopup;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OkPopup;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[1]/div/input")
	public static WebElement FName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[2]/div/input")
	public static WebElement AddPSRN;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[3]/div/select")
	public static WebElement AddGender;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[4]/div/select")
	public static WebElement AddDepart;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[5]/div/select")
	public static WebElement AddCampus;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[6]/div/input")
	public static WebElement AddPEmail;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[7]/div/input")
	public static WebElement AddOEmail;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[8]/div/input")
	public static WebElement AddMNumber;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[9]/div/input")
	public static WebElement AddLNumber;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[10]/div/select")
	public static WebElement AddFType;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[11]/div/input")
	public static WebElement AddAddress1;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[12]/div/input")
	public static WebElement AddAddress2;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[13]/div/select")
	public static WebElement AddCountry;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[14]/div/select")
	public static WebElement AddState;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[15]/div/div/div/select")
	public static WebElement AddCity;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[16]/div/input")
	public static WebElement AddPIN;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[17]/div/input")
	public static WebElement AddHometown;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[18]/div/td/div/label/input")
	public static WebElement CheckGroup;
	
	////////////////////////////////////// Edit Faculty ///////////////////////////////////////////////
	
	@FindBy(xpath="//a[starts-with(@href,'/faculty/edit/')]")
	public static WebElement PSRNLink;

}
