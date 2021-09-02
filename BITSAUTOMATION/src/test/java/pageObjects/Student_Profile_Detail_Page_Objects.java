package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Student_Profile_Detail_Page_Objects {

	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a")
	public static WebElement ProfileMenu;

	///////////////////////////////////////// Upload Photo ////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profile/div/div[2]/div/div/div[1]/div[1]/div/div[2]/label")
	public static WebElement UploadPhoto;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profile/div/div[2]/div/div/div[2]/div/button[1]")
	public static WebElement CancelClick;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement CloseCancel;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OkCancel;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profile/div/div[2]/div/div/div[2]/div/button[2]")
	public static WebElement Submitbtn;

	///////////////////////////////////////// Upload Photo ////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profile/div/div[1]/div/div/div[2]/button[1]")
	public static WebElement PInfoMenu;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[3]/div/button[1]")
	public static WebElement CancelPInfo;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement ClosePInfo;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OkPInfo;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[3]/div/button[2]")
	public static WebElement SubmitPInfo;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[1]/div[4]/div/input")
	public static WebElement MNumber;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[1]/div[5]/div/input")
	public static WebElement AMNumber;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[1]/div[6]/div/input")
	public static WebElement PEmailID;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[1]/div[7]/div/input")
	public static WebElement AadharNum;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[1]/div[8]/div/input")
	public static WebElement PAN;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[1]/div[9]/div/select")
	public static WebElement COrigin;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[1]/div[10]/div/input")
	public static WebElement ParentName;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[1]/div[11]/div/input")
	public static WebElement PMNumber;

	/////////////////////////// Permanent Address ///////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[2]/div[1]/div/div[3]/input")
	public static WebElement Address1;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[2]/div[1]/div/div[4]/input")
	public static WebElement Address2;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[2]/div[1]/div/div[5]/select")
	public static WebElement County;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[2]/div[1]/div/div[6]/select")
	public static WebElement State;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[2]/div[1]/div/div[7]/div/div/select")
	public static WebElement City;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[2]/div[1]/div/div[8]/input")
	public static WebElement PIN;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div[2]/div/label/input")
	public static WebElement CopyToParent;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profiledetails/div/div[2]/div/div/div[2]/div[3]/div/div[1]/div[2]/div/label/input")
	public static WebElement CopyToCurrent;

	/////////////////////////// Add Academic ///////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[1]/div/div/div[2]/button")
	public static WebElement AddAcabtn;

	@FindBy(xpath="//*[@id=\"details-add\"]/div/div/div[3]/button[2]")
	public static WebElement SubmitAcad;

	@FindBy(xpath="//*[@id=\"details-add\"]/div/div/div[3]/button[1]")
	public static WebElement CloseAcad;

	@FindBy(xpath="//*[@id=\"details-add\"]/div/div/div[2]/div/div/div[1]/div/select")
	public static WebElement Academic;

	@FindBy(xpath="//*[@id=\"institutionName\"]")
	public static WebElement SName;

	@FindBy(xpath="//*[@id=\"boardUniversity\"]")
	public static WebElement BName;

	@FindBy(xpath="//*[@id=\"details-add\"]/div/div/div[2]/div/div/div[4]/div/select")
	public static WebElement YOP;

	@FindBy(xpath="//*[@id=\"percentageOrGrade\"]")
	public static WebElement Grade;

	@FindBy(xpath="//*[@id=\"branch\"]")
	public static WebElement Branch;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div[1]/div[1]/table/tbody/tr[1]/td[7]/a/em")
	public static WebElement DeleteAcademic;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div[1]/div[1]/table/tbody/tr/td")
	public static WebElement ListWarn;

	/////////////////////////// Bio-Data ///////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profile/div/div[1]/div/div/div[2]/button[2]")
	public static WebElement BioDataMenu;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div[1]/div[5]/div/button[1]")
	public static WebElement CancelBioData;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-bio-data/div/div[2]/div/div[1]/div[5]/div/button[2]")
	public static WebElement SubmitBD;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement ClosePopup;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OkPopup;

	@FindBy(xpath="//*[@id=\"objective\"]")
	public static WebElement Objective;

	@FindBy(xpath="//*[@id=\"membership\"]")
	public static WebElement PBodies;

	@FindBy(xpath="//*[@id=\"coCurricularActivities\"]")
	public static WebElement COCA;

	@FindBy(xpath="//*[@id=\"projectCompleted\"]")
	public static WebElement Pcomplete;

	@FindBy(xpath="//*[@id=\"extraCurricularActivities\"]")
	public static WebElement ECOCA;

	@FindBy(xpath="//*[@id=\"softwareSkills\"]")
	public static WebElement SoftSkills;


	/////////////////////////// View Course ///////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profile/div/div[1]/div/div/div[2]/button[3]")
	public static WebElement VCMenu;

	/////////////////////////// Sort View Course ///////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/thead/tr/th[3]/em")
	public static WebElement SortSem;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/thead/tr/th[4]/em")
	public static WebElement SortID;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/thead/tr/th[5]/em")
	public static WebElement SortSubject;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/thead/tr/th[6]/em")
	public static WebElement SortCatalog;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/thead/tr/th[7]/em")
	public static WebElement SortDes;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/thead/tr/th[8]/em")
	public static WebElement SortGrade;

	/////////////////////////// View Course List Grid ///////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[1]/div/div/div/div[1]/div/select")
	public static WebElement SearchSelect;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/input")
	public static WebElement SearchField;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/tbody/tr/td")
	public static WebElement VCListWarn;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/tbody/tr[1]/td[7]")
	public static WebElement DesResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/tbody/tr[1]/td[5]")
	public static WebElement SubjectResult;

	/////////////////////////// Preview Resume ///////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-profile/div/div[1]/div/div/div[2]/button[4]")
	public static WebElement PreviewResume;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-resume/div/div[1]/div/div/div[2]/button")
	public static WebElement DownloadResume;


}
