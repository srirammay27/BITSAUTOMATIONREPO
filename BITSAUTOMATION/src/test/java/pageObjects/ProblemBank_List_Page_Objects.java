package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProblemBank_List_Page_Objects {

	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[3]/a")
	public static WebElement PBMenu;

	///////////////// List Grid Sort //////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/thead/tr/th[2]/em")
	public static WebElement SortSName;

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/thead/tr/th[4]/em")
	public static WebElement SortSCity;

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/thead/tr/th[5]/em")
	public static WebElement SortBDomain;

	///////////////// List Grid Search //////////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/input")
	public static WebElement SearchField;

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[2]/table/tbody/tr/td")
	public static WebElement ListWarn;

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
