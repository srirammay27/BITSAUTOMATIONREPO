package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentSem_Allot_List_Page_Objects {

	@FindBy(xpath="//*[@id=\"navbarDropdown\"]")
	public static WebElement SAMenu;

	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[3]/div/a[2]")
	public static WebElement SSAMenu;

	///////////////// List Grid Sort //////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[5]/table/thead/tr/th[2]/em")
	public static WebElement SortSName;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[5]/table/thead/tr/th[3]/em")
	public static WebElement SortCampus;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[5]/table/thead/tr/th[4]/em")
	public static WebElement SortTag;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[5]/table/thead/tr/th[5]/em")
	public static WebElement SortCGPA;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[5]/table/thead/tr/th[7]/em")
	public static WebElement SortPrefer;

	///////////////// List Grid Search //////////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[1]/div/div/div/div[2]/div/div/input")
	public static WebElement SearchField;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[3]/table/tbody/tr/td")
	public static WebElement ListWarn;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div/select")
	public static WebElement SearchSelect;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[1]/div/div/div/div[3]/div/select")
	public static WebElement SearchCampus;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[1]/div/div/div/div[6]/div/select")
	public static WebElement SearchGot;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[1]/div/div/div/div[7]/div/select")
	public static WebElement SearchSem;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[5]/table/tbody/tr[1]/td[2]")
	public static WebElement StudentResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[5]/table/tbody/tr[1]/td[1]")
	public static WebElement CIDResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[5]/table/tbody/tr[1]/td[3]")
	public static WebElement CampusResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[5]/table/tbody/tr[1]/td[8]")
	public static WebElement GotResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[5]/table/tbody/tr[1]/td[6]")
	public static WebElement SemResult;

	///////////////// Row and Column List Count Check //////////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[5]/table/tbody/tr")
	public static List<WebElement> row;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[5]/table/thead/tr/th")
	public static List<WebElement> col;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[6]/span")
	public static WebElement ListResult;

	///////////////// Update & Publish //////////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[5]/table/tbody/tr[1]/td[9]/input")
	public static WebElement TickSemI;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[2]/div[1]/div[3]/div/button")
	public static WebElement ClickUpdate;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-allotment-team/div/div[1]/div/div/div[2]/button[1]")
	public static WebElement ClickPublish;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement ClosePublish;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OkPublish;

}
