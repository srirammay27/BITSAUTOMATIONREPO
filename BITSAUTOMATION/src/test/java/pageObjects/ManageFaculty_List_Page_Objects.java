package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageFaculty_List_Page_Objects {

	@FindBy(xpath="//*[@id='collapsibleNavbar']/ul/li[4]/a")
	public static WebElement MFMenu;

	///////////////// List Grid Sort //////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[3]/table/thead/tr/th[2]/em")
	public static WebElement SortPSRN;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[3]/table/thead/tr/th[3]/em")
	public static WebElement SortFName;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[3]/table/thead/tr/th[4]/em")
	public static WebElement SortDpt;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[3]/table/thead/tr/th[5]/em")
	public static WebElement SortCampus;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[3]/table/thead/tr/th[6]/em")
	public static WebElement SortFType;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[3]/table/thead/tr/th[7]/em")
	public static WebElement SortStatus;

	///////////////// List Grid Search //////////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/input")
	public static WebElement SearchField;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[3]/table/tbody/tr/td")
	public static WebElement ListWarn;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div/select")
	public static WebElement SearchSelect;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[3]/table/tbody/tr[1]/td[3]")
	public static WebElement FacultyResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[3]/table/tbody/tr[1]/td[4]")
	public static WebElement DepartmentResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[3]/table/tbody/tr[1]/td[5]")
	public static WebElement CampusResult;

	///////////////// Upload Faculty Validation //////////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[1]/div/div[2]/button[1]")
	public static WebElement UploadClick;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-upload/div/div[2]/div/div/div[2]/div/button[1]")
	public static WebElement CancelUpload;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-upload/div/div[2]/div/div/div[2]/div/button[2]")
	public static WebElement UploadFile;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-upload/div/div[2]/div/div/div[1]/div/div/div[2]")
	public static WebElement UploadWarn;

	///////////////// Upload Valid Faculty //////////////////////////////////////////////////////////

	@FindBy(xpath="//*[@id=\"importFile\"]")
	public static WebElement ChooseFile;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-upload/div/div[2]/div/div/div[4]/div[1]/div/div[2]/a")
	public static WebElement Refresh;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-upload/div/div[2]/div/div/div[4]/div[1]/div/div[1]/a")
	public static WebElement UploadStatus;

	///////////////////////////// Show More/Less ////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[5]/div/button[1]")
	public static WebElement ShowMore;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[5]/div/button[2]")
	public static WebElement ShowLess;

	////////////////////////////// Inactive Record //////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[3]/table/tbody/tr/td[1]/div/input")
	public static WebElement Checkbox;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[2]/div/div[1]/div/a")
	public static WebElement ActionClick;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[2]/div/div[1]/div/div/a[2]")
	public static WebElement Inactiveclick;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement ClosePopup;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OkPopup;

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[3]/table/tbody/tr/td[7]")
	public static WebElement StatusLabel;

	////////////////////////////// Active Record //////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[2]/div/div[1]/div/div/a[1]")
	public static WebElement Activeclick;

	////////////////////////////// Delete Record //////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[2]/div/div[1]/div/div/a[3]")
	public static WebElement Deleteclick;

	////////////////////////////// Export Record //////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-faculty-list/div/div[2]/div/div[1]/div/div[2]/button[2]")
	public static WebElement ExportClick;



}
