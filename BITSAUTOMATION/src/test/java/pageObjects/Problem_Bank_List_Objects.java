package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Problem_Bank_List_Objects {
	
	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[4]/a")
	public static WebElement PBMenu;

	///////////////// List Grid Sort //////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/thead/tr/th[2]/em")	               
	public static WebElement SortSName;

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/thead/tr/th[4]/em")
	public static WebElement SortSCity;

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/thead/tr/th[5]/em")
	public static WebElement SortBDomain;

	///////////////// List Grid Search //////////////////////////////////////////////////////////

	//@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/input")
	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/ng-autocomplete/div[1]/div[1]/input")
	public static WebElement SearchField; 
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/ng-autocomplete/div[1]/div[2]/ul/li[1]/div/a")
	public static WebElement SearchFieldItem; 

	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/tbody/tr/td")	              
	public static WebElement ListWarn;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/ng-autocomplete/div[1]/div[4]/div")	              
	public static WebElement SearchFieldNoItems;

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
	
	//@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr/td[6]")
	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/tbody/tr[1]/td[3]")
	public static WebElement PSTypeResult;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/tbody/tr[1]/td[1]/div/input")
	public static WebElement Checkbox;	
		
	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[2]/div/div[1]/div/a")
	public static WebElement ActionClick;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[2]/div/div[1]/div/div/a")
	public static WebElement DeleteClick;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement ClosePopup;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OkPopup;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[3]/table/tbody/tr")
	public static WebElement Grid;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/ng-autocomplete/div[1]/div[1]/div/i")
	public static WebElement ClearSearch;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-problem-bank/div/div[2]/div/div[2]/div/div[2]/div/span")
	public static WebElement GridRecCount;

}
