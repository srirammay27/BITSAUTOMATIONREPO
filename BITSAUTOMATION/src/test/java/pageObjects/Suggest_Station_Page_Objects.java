package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Suggest_Station_Page_Objects {

	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[3]/a")
	public static WebElement mnuSuggestStation;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[1]/div/div/div[1]/nav/ul/li[2]")		
	public static WebElement brdCrumbs;	
	
	/*@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[1]/div/div/div[1]/nav/ul/li[2]")
	public static WebElement brdCrumbs;	*/
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[1]/div/div/div[2]/div/button")
	public static WebElement btnAddStation;	
 	
	/////////////// Filter Criterias ///////////////
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[1]/div/div/div/div[1]/div/select")
	public static WebElement drpSearchCriteria;
	
	@FindBy(xpath="//html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/input")
	public static WebElement searchBox;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[1]/div/div/div/div[3]/div/select")
	public static WebElement drpStatus;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[1]/div/div/div/div[4]/div/select")
	public static WebElement drpPSType;
	
	/////////////// Grid controls ///////////////
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[2]/div/div[1]/div/a")
	public static WebElement btnAction;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[2]/div/div[1]/div/div/a")
	public static WebElement btnActionDelete;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]")
	public static WebElement StationGrid;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/thead/tr/th[2]/em")
	public static WebElement gridSortByStationName;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/thead/tr/th[3]/em")
	public static WebElement gridSortByCity;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/thead/tr/th[4]/em")
	public static WebElement gridSortByDomain;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/thead/tr/th[5]/em")
	public static WebElement gridSortByParentCmpny;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/thead/tr/th[6]/em")
	public static WebElement gridSortByPsType;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[2]/div/div[2]/div/span")
	public static WebElement recordCountTop;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[4]/div/div/span")
	public static WebElement recordCountBottom;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/thead/tr/th[1]/div/div/div/div/input")
	public static WebElement chkBoxSelectAll;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr/td[1]/div/input")
	public static WebElement chkBoxInsideGrid;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr/td")
	public static WebElement grdRecordNotFound;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr/td[2]/a")
	public static WebElement grdRowStationNameColumn;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr/td[4]")
	public static WebElement grdRowBusDomainColumn;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr/td[5]")
	public static WebElement grdRowParentCmpnyColumn;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr/td[6]")
	public static WebElement grdRowPSType;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr/td[7]")
	public static WebElement grdRowStatus;
	
	@FindBy(xpath="//*[@id=\"toast-container\"]")
	public static WebElement toaster;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-add-station/div/div[1]/div/div/div[1]/h2")
	public static WebElement pageTitle;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-add-station/div/div[1]/div/div/div[1]/nav/ol/li[3]")
	public static WebElement brdCrumbs1;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-manage-station/div/div[2]/div/div[3]/table/tbody/tr[7]/td[1]/div/input")
	public static WebElement grdCheckbox;
	
}
