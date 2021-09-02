package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Project_List_Page_Objects {

	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[3]/a")
	public static WebElement PBMenu;

	///////////////// Problem Bank List Grid Search //////////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/input")
	public static WebElement SearchField;

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/tbody/tr/td[2]/a")
	public static WebElement PBLink;

	///////////////// Project List Grid Search //////////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-project-details/div/div[1]/div/div/div[3]/button")
	public static WebElement AddProject;

	@FindBy(xpath="/html/body/app-root/app-layout/app-project-details/div/div[2]/div/div[3]/table/thead/tr/th[3]/em")
	public static WebElement SortTitle;

	@FindBy(xpath="/html/body/app-root/app-layout/app-project-details/div/div[2]/div/div[3]/table/thead/tr/th[4]/em")
	public static WebElement SortDiscipline;

	@FindBy(xpath="/html/body/app-root/app-layout/app-project-details/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/input")
	public static WebElement SearchProblem;

	//////////////////////////////////// Delete Problem Bank //////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-project-details/div/div[2]/div/div[3]/table/tbody/tr/td[1]/div/input")
	public static WebElement Checkbox;

	@FindBy(xpath="/html/body/app-root/app-layout/app-project-details/div/div[2]/div/div[3]/table/thead/tr/th[1]/div/div/div[2]")
	public static WebElement DeleteDrop;

	@FindBy(xpath="/html/body/app-root/app-layout/app-project-details/div/div[2]/div/div[3]/table/thead/tr/th[1]/div/div/div[2]/div/a")
	public static WebElement Deletebtn;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement Close;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OK;

	//////////////////////////////////// Edit Problem Bank //////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-project-details/div/div[2]/div/div[3]/table/tbody/tr/td[3]/a")
	public static WebElement EditLink;

	//////////////////////////////////// Go Back PB List //////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-project-details/div/div[1]/div/div/div[1]/nav/ol/li[2]/a")
	public static WebElement PBList;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/tbody/tr/td[1]/div/input")
	public static WebElement CheckPB;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/thead/tr/th[1]/div/div/div[2]")
	public static WebElement PBDrop;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/thead/tr/th[1]/div/div/div[2]/div/a")
	public static WebElement DeletePB;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement CloseDPB;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OKDPB;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[2]/table/tbody/tr/td")
	public static WebElement ListWarn;
	
	

	///////////////// List Grid Sort //////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/thead/tr/th[2]/em")
	public static WebElement SortSName;

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/thead/tr/th[4]/em")
	public static WebElement SortSCity;

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/thead/tr/th[5]/em")
	public static WebElement SortBDomain;

	///////////////// List Grid Search //////////////////////////////////////////////////////////



	

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[1]/div/div/div/div[1]/div/select")
	public static WebElement SearchSelect;

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[1]/div/div/div/div[3]/div/select")
	public static WebElement SearchPSType;

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[1]/div/div/div/div[4]/div/select")
	public static WebElement SearchPSBatch;

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/tbody/tr/td[2]")
	public static WebElement SNameResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/tbody/tr/td[4]")
	public static WebElement CityResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/tbody/tr/td[5]")
	public static WebElement BDResult;
	
	

}
