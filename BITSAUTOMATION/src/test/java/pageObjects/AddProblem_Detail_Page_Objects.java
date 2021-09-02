package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProblem_Detail_Page_Objects {

	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[3]/a")
	public static WebElement PBMenu;

	/////////////////////////////// Add Problem Detail ///////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[1]/div/div/div[2]/button")
	public static WebElement AddProblemClick;

	@FindBy(xpath="/html/body/app-root/app-layout/app-general-info/div/div[2]/div/div[2]/div[1]/button")
	public static WebElement Cancel;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement Close;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement Ok;

	////////////////////////////////////////// General Info /////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-general-info/div/div[2]/div/div[2]/div[2]/button")
	public static WebElement SaveNext;

	@FindBy(xpath="/html/body/app-root/app-layout/app-general-info/div/div[2]/div/div[1]/form/div[3]/div[1]/div[1]/div/select")
	public static WebElement PSType;

	@FindBy(xpath="/html/body/app-root/app-layout/app-general-info/div/div[2]/div/div[1]/form/div[3]/div[1]/div[2]/div/div/ng-multiselect-dropdown/div/div[1]/span")
	public static WebElement SName;

	@FindBy(xpath="/html/body/app-root/app-layout/app-general-info/div/div[2]/div/div[1]/form/div[3]/div[1]/div[2]/div/div/ng-multiselect-dropdown/div/div[2]/ul[1]/li/input")
	public static WebElement SearchSName;

	@FindBy(xpath="/html/body/app-root/app-layout/app-general-info/div/div[2]/div/div[1]/form/div[3]/div[1]/div[2]/div/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]/div")
	public static WebElement CheckSName;

	@FindBy(xpath="/html/body/app-root/app-layout/app-general-info/div/div[2]/div/div[1]/form/div[3]/div[1]/div[3]/div/select")
	public static WebElement Sem;

	@FindBy(xpath="/html/body/app-root/app-layout/app-general-info/div/div[2]/div/div[1]/form/div[3]/div[1]/div[4]/div/select")
	public static WebElement PSBatch;

	@FindBy(xpath="//*[@id=\"title\"]")
	public static WebElement PTitle;

	@FindBy(xpath="/html/body/app-root/app-layout/app-general-info/div/div[2]/div/div[1]/form/div[3]/div[1]/div[6]/div/app-quill-editor/quill-editor/div[2]/div[1]/p")
	public static WebElement PDesc;

	@FindBy(xpath="//*[@id=\"mentorName\"]")
	public static WebElement MName;

	@FindBy(xpath="//*[@id=\"mentorContactNumber\"]")
	public static WebElement CDetail;

	@FindBy(xpath="//*[@id=\"mentorEmailId\"]")
	public static WebElement EmailId;

	///////////////////////////////////////////// Discipline ///////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-discipline/div/div[2]/div/div[1]/form/div[4]/div[1]/a")
	public static WebElement DDHeader;

	@FindBy(xpath="//*[@id=\"dgraduate\"]/div/div[6]/a")
	public static WebElement ConstraintsHeader;

	@FindBy(xpath="//*[@id=\"cgpamin\"]")
	public static WebElement CGPAL;

	@FindBy(xpath="//*[@id=\"cgpamax\"]")
	public static WebElement CGPAU;

	@FindBy(xpath="//*[@id=\"totalrequirement\"]")
	public static WebElement TotalR;

	@FindBy(xpath="//*[@id=\"maleRequirement\"]")
	public static WebElement Male;

	@FindBy(xpath="//*[@id=\"femaleRequirement\"]")
	public static WebElement Female;

	@FindBy(xpath="//*[@id=\"dgraduate\"]/div/div[3]/div/div[1]/div/label/input")
	public static WebElement FDegree;

	@FindBy(xpath="//*[@id=\"dcourse\"]/div/div[1]/div/div/div/label/input")
	public static WebElement SCourseAll;
	
	@FindBy(xpath="//*[@id=\"dcourse\"]/div/div[2]/div[1]/div/div[2]/div[1]/input")
	public static WebElement BECourse;

	@FindBy(xpath="//*[@id=\"dcondition\"]/div/table/tbody/div[3]/tr/td/div/div/label/input")
	public static WebElement OtherConstraints;

	@FindBy(xpath="//*[@id=\"dcondition\"]/div/table/tbody/div[3]/tr/div/td/div/div/input")
	public static WebElement NoOfS;

	@FindBy(xpath="/html/body/app-root/app-layout/app-discipline/div/div[2]/div/div[1]/form/div[5]/div[2]/div/button[2]")
	public static WebElement AddDG;

	@FindBy(xpath="/html/body/app-root/app-layout/app-discipline/div/div[2]/div/div[1]/form/div[6]/div/table/tbody/tr/td[11]/a/em")
	public static WebElement DeleteDG;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement CloseDelete;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OkDelete;

	@FindBy(xpath="/html/body/app-root/app-layout/app-discipline/div/div[2]/div/div[2]/div[2]/button")
	public static WebElement SaveNextDis;

	///////////////////////////////////////////// Skill Set ///////////////////////////////////////////////////////

	                           /////////////////// Tech Skill /////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-skills-subject/div/div[2]/div/div[1]/form/div[1]/div/div[2]/button")
	public static WebElement AddSkill;

	@FindBy(xpath="//*[@id=\"myModal\"]/div/div/div[3]/button[1]")
	public static WebElement CancelSkill;

	@FindBy(xpath="//*[@id=\"myModal\"]/div/div/div[3]/button[2]")
	public static WebElement SubmitSkill;

	@FindBy(xpath="//*[@id=\"myModal\"]/div/div/div[2]/form/div/div[1]/div/select")
	public static WebElement SkillType;

	@FindBy(xpath="//*[@id=\"addSkill\"]")
	public static WebElement NewSkill;

	@FindBy(xpath="/html/body/app-root/app-layout/app-skills-subject/div/div[2]/div/div[1]/form/div[3]/div/div[1]/div/div/ng-multiselect-dropdown/div/div[1]/span")
	public static WebElement SelectSkill;

	@FindBy(xpath="/html/body/app-root/app-layout/app-skills-subject/div/div[2]/div/div[1]/form/div[3]/div/div[1]/div/div/ng-multiselect-dropdown/div/div[2]/ul[1]/li[2]/input")
	public static WebElement SearchSkill;

	@FindBy(xpath="/html/body/app-root/app-layout/app-skills-subject/div/div[2]/div/div[1]/form/div[3]/div/div[1]/div/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]")
	public static WebElement CheckSkill;

	                      /////////////////// Non-Tech Skill /////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-skills-subject/div/div[2]/div/div[1]/form/div[3]/div/div[2]/div/ng-multiselect-dropdown/div/div[1]/span")
	public static WebElement SelectNonTech;

	@FindBy(xpath="/html/body/app-root/app-layout/app-skills-subject/div/div[2]/div/div[1]/form/div[3]/div/div[2]/div/ng-multiselect-dropdown/div/div[2]/ul[1]/li[2]/input")
	public static WebElement SearchNTech;

	@FindBy(xpath="/html/body/app-root/app-layout/app-skills-subject/div/div[2]/div/div[1]/form/div[3]/div/div[2]/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]")
	public static WebElement CheckNTech;
	
	               /////////////////////////// Add New Domain ///////////////////////
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-skills-subject/div/div[2]/div/div[1]/form/div[4]/div[2]/div[1]/div/div[2]/button")
	public static WebElement AddDomain;

	@FindBy(xpath="//*[@id=\"domainModal\"]/div/div/div[3]/button[1]")
	public static WebElement CancelDomain;

	@FindBy(xpath="//*[@id=\"domainModal\"]/div/div/div[3]/button[2]")
	public static WebElement SubmitDomain;

	@FindBy(xpath="//*[@id=\"domainModal\"]/div/div/div[2]/form/div/div[1]/div/select")
	public static WebElement DomainType;

	@FindBy(xpath="//*[@id=\"domainModal\"]/div/div/div[2]/form/div/div[2]/div/input")
	public static WebElement NewDomain;
	
	@FindBy(xpath="//*[@id=\"domainModal\"]/div/div/div[2]/form/div/div[2]/div/div/ng-multiselect-dropdown/div/div[1]/span")
	public static WebElement SelectPDomain;
	
	@FindBy(xpath="//*[@id=\"domainModal\"]/div/div/div[2]/form/div/div[2]/div/div/ng-multiselect-dropdown/div/div[2]/ul[1]/li/input")
	public static WebElement SearchPDomain;
	
	@FindBy(xpath="//*[@id=\"domainModal\"]/div/div/div[2]/form/div/div[2]/div/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]")
	public static WebElement CheckPDomain;
	
	@FindBy(xpath="//*[@id=\"domainModal\"]/div/div/div[2]/form/div/div[3]/div/input")
	public static WebElement NewSubDomain;

	@FindBy(xpath="/html/body/app-root/app-layout/app-skills-subject/div/div[2]/div/div[1]/form/div[4]/div[2]/div[3]/div[1]/div/ng-multiselect-dropdown/div/div[1]/span")
	public static WebElement SelectPD;

	@FindBy(xpath="/html/body/app-root/app-layout/app-skills-subject/div/div[2]/div/div[1]/form/div[4]/div[2]/div[3]/div[1]/div/ng-multiselect-dropdown/div/div[2]/ul[1]/li/input")
	public static WebElement SearchPD;

	@FindBy(xpath="/html/body/app-root/app-layout/app-skills-subject/div/div[2]/div/div[1]/form/div[4]/div[2]/div[3]/div[1]/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]")
	public static WebElement CheckPD;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-skills-subject/div/div[2]/div/div[1]/form/div[4]/div[2]/div[3]/div[2]/div/ng-multiselect-dropdown/div/div[1]/span")
	public static WebElement SelectPSD;

	@FindBy(xpath="/html/body/app-root/app-layout/app-skills-subject/div/div[2]/div/div[1]/form/div[4]/div[2]/div[3]/div[2]/div/ng-multiselect-dropdown/div/div[2]/ul[1]/li/input")
	public static WebElement SearchPSD;

	@FindBy(xpath="/html/body/app-root/app-layout/app-skills-subject/div/div[2]/div/div[1]/form/div[4]/div[2]/div[3]/div[2]/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]")
	public static WebElement CheckPSD;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-skills-subject/div/div[2]/div/div[2]/div[2]/button")
	public static WebElement SaveNextSkill;
	
	/////////////////////////////////////////////// Electives ////////////////////////////////////////
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-electives/div/div[2]/div/div[1]/div[1]/div/div[2]/button/em")
	public static WebElement AddCourse;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-electives/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div/ng-multiselect-dropdown/div/div[1]/span")
	public static WebElement SelectCourse;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-electives/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div/ng-multiselect-dropdown/div/div[2]/ul[1]/li/input")
	public static WebElement SearchCourse;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-electives/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li/div")
	public static WebElement CheckCourse;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-electives/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/select")
	public static WebElement ChooseGrade;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-electives/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div/a/em")
	public static WebElement DeleteCourse;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement CloseCourse;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OkCourse;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-electives/div/div[2]/div/div[2]/div[2]/button")
	public static WebElement SaveNextElectives;
	
	///////////////////////////////////////////////// Facility ///////////////////////////////////////
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-facility/div/div[2]/div/div[1]/div[4]/div[1]/a")
	public static WebElement ExpandStipend;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-facility/div/div[2]/div/div[1]/div[5]/div[1]/a")
	public static WebElement ExpandOtiming;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-facility/div/div[2]/div/div[1]/div[6]/div[1]/a")
	public static WebElement ExpandAccomodation;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-facility/div/div[2]/div/div[1]/div[7]/div[1]/a")
	public static WebElement ExpandOthers;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-facility/div/div[2]/div/div[2]/div[2]/button")
	public static WebElement SaveNextF;
	
                   /////////////////////// Stipend ///////////////////////////
	
	@FindBy(xpath="//*[@id=\"facility\"]/div/div[1]/div/select")
	public static WebElement Currency;
	
	@FindBy(xpath="//*[@id=\"facility\"]/div/div[2]/div/input")
	public static WebElement Scholarship;
	
	@FindBy(xpath="//*[@id=\"facility\"]/div/div[3]/div/input")
	public static WebElement SFDegree;
	
	@FindBy(xpath="//*[@id=\"facility\"]/div/div[4]/div/input")
	public static WebElement SHDegree;
	
	               /////////////////////// Office Time ///////////////////////////
	
	@FindBy(xpath="//*[@id=\"facility\"]/div/div[1]/div/input")
	public static WebElement StartTime;
	
	@FindBy(xpath="(//*[@id=\"facility\"]/div/div[2]/div/input)[2]")
	public static WebElement EndTime;
	
	@FindBy(xpath="//*[@id=\"facility\"]/div/div[3]/div/div/ng-multiselect-dropdown/div/div[1]/span")
	public static WebElement SelectWO;

	@FindBy(xpath="//*[@id=\"facility\"]/div/div[3]/div/div/ng-multiselect-dropdown/div/div[2]/ul[1]/li/input")
	public static WebElement SearchWO;
	
	@FindBy(xpath="//*[@id=\"facility\"]/div/div[3]/div/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]")
	public static WebElement CheckWO;
	
	  /////////////////////// Accomodation ///////////////////////////
	
	@FindBy(xpath="//*[@id=\"facility\"]/div[1]/div/div/div[1]/label/input")
	public static WebElement YesAccom;
	
	@FindBy(xpath="//*[@id=\"facility\"]/div[2]/div/div/div[1]/label/input")
	public static WebElement YesBoys;
	
	@FindBy(xpath="//*[@id=\"boysAccomodationAddress1\"]")
	public static WebElement BAddress1;
	
	@FindBy(xpath="//*[@id=\"boysAccomodationAddress2\"]")
	public static WebElement BAddress2;
	
	@FindBy(xpath="//*[@id=\"facility\"]/div[3]/div[3]/div/select")
	public static WebElement BCountry;
	
	@FindBy(xpath="//*[@id=\"facility\"]/div[3]/div[4]/div/select")
	public static WebElement BState;
	
	@FindBy(xpath="//*[@id=\"facility\"]/div[3]/div[5]/div/div/div/select")
	public static WebElement BCity;
	
	@FindBy(xpath="//*[@id=\"boysAccomodationPincode\"]")
	public static WebElement BPin;
	
	@FindBy(xpath="//*[@id=\"facility\"]/div[4]/div/div/div[1]/label/input")
	public static WebElement YesGirls;
	
	@FindBy(xpath="//*[@id=\"girlsAccomodationAddress1\"]")
	public static WebElement GAddress1;
	
	@FindBy(xpath="//*[@id=\"girlsAccomodationAddress2\"]")
	public static WebElement GAddress2;
	
	@FindBy(xpath="//*[@id=\"facility\"]/div[5]/div[3]/div/select")
	public static WebElement GCountry;
	
	@FindBy(xpath="//*[@id=\"facility\"]/div[5]/div[4]/div/select")
	public static WebElement GState;
	
	@FindBy(xpath="//*[@id=\"facility\"]/div[5]/div[5]/div/div/div/select")
	public static WebElement GCity;
	
	@FindBy(xpath="//*[@id=\"girlsAccomodationPincode\"]")
	public static WebElement GPin;
	
	 /////////////////////// Others ///////////////////////////
	
	@FindBy(xpath="//*[@id=\"facility\"]/div/div[1]/div/div[1]/label/input")
	public static WebElement YesTA;
	
	@FindBy(xpath="//*[@id=\"facility\"]/div/div[2]/div/div[1]/label/input")
	public static WebElement YesDA;

	@FindBy(xpath="//*[@id=\"facility\"]/div/div[3]/div/div[1]/label/input")
	public static WebElement YesConvey;

	@FindBy(xpath="//*[@id=\"facility\"]/div/div[4]/div/div[1]/label/input")
	public static WebElement YesMedical;

	@FindBy(xpath="//*[@id=\"facility\"]/div/div[5]/div/div[1]/label/input")
	public static WebElement YesTravel;

	@FindBy(xpath="//*[@id=\"facility\"]/div/div[6]/div/div[1]/label/input")
	public static WebElement YesLunch;
	
	//////////////////////// Verify Added Problem Bank ////////////////////////
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-project-details/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/input")
	public static WebElement SearchProblem;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-project-details/div/div[2]/div/div[3]/table/tbody/tr/td[3]/a")
	public static WebElement CheckProblem;
}
