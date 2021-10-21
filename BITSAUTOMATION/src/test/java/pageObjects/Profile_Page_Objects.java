package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Profile_Page_Objects {
	
	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a")
	/*@FindBy(xpath="//*[@id=\\'Profile\\']/ul/li[2]/a")*/
	public static WebElement mnuProfile;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[2]/div/button[1]")
	public static WebElement btnCancel;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement btnClose;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement btnOkay;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[2]/div/button[2]")
	public static WebElement btnSave;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[1]/div/input")
	public static WebElement fldFacultyName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[3]/div/select")
	public static WebElement fldGender;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[4]/div/select")
	public static WebElement fldDept;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[5]/div/input")
	public static WebElement fldAreaOfSpc;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[6]/div/select")
	public static WebElement fldCampus;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[7]/div/input")
	public static WebElement fldPrsnlEmail;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[8]/div/input")	               
	public static WebElement fldOffclEmail;	
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[9]/div/input")
	public static WebElement fldMobNo;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[10]/div/input")
	public static WebElement fldLandLine;
	
	/*@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[10]/div/select")
	public static WebElement fldFacType;*/
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[11]/div/input")
	public static WebElement fldHomeTown;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[12]/div/input")
	public static WebElement fldAddr1;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[13]/div/input")
	public static WebElement fldAddr2;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[14]/div/select")
	public static WebElement fldCountry;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[15]/div/select")
	public static WebElement fldState;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[16]/div/div/div/select")
	public static WebElement fldCity;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[17]/div/input")
	public static WebElement fldPin;

	//@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[18]/div/td/div/label/input")
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[18]/div/div/label/input")
	public static WebElement fldGrpLeader;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[1]/div/div/div/nav/ol/li[2]")
	public static WebElement brdCrumbs;	
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div\r\n")
	public static WebElement Pageclick;	
	
	@FindBy(xpath="//*[@id=\"toast-container\"]")
	public static WebElement toaster;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[8]/div/div")
	public static WebElement InvalidEmail;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[17]/div/div")
	public static WebElement InvalidPIN;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[9]/div/div")
	public static WebElement InvalidMob;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-profile/div/div[2]/div/div/div[1]/div[10]/div/div")
	public static WebElement InvalidLanline;
}
