package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Student_Data_List_Page_Objects {

	@FindBy(id="navbarDropdown")
	public static WebElement MSMenu;

	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[3]/div/a[1]")
	public static WebElement SDMenu;

	///////////////// List Grid Sort //////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[3]/table/thead/tr[1]/th[3]/em")
	public static WebElement SortName;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[3]/table/thead/tr[1]/th[5]/em")
	public static WebElement SortCGPA;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[3]/table/thead/tr[1]/th[8]/em")
	public static WebElement SortCampus;

	///////////////// List Grid Search //////////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[1]/div/div[1]/div/div[2]/div/div/input")
	public static WebElement SearchField;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[3]/table/thead/tr[2]/td")
	public static WebElement ListWarn;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/select")
	public static WebElement SearchSelect;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[3]")
	public static WebElement StudentResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[2]")
	public static WebElement CampusIDResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[8]")
	public static WebElement CampusNameResult;


	///////////////// Upload Faculty Validation //////////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[1]/div/div[2]/button[1]")
	public static WebElement UploadClick;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-upload/div/div[2]/div/div/div[2]/div/button[1]")
	public static WebElement CancelUpload;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-upload/div/div[2]/div/div/div[2]/div/button[2]")
	public static WebElement UploadFile;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-upload/div/div[2]/div/div/div[1]/div[1]/div/div")
	public static WebElement UploadTypeWarn;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-upload/div/div[2]/div/div/div[1]/div[2]/div/div")
	public static WebElement UploadBatchWarn;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-upload/div/div[2]/div/div/div[1]/div[3]/div/div[2]")
	public static WebElement UploadWarn;

	///////////////// Upload Valid Faculty //////////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-upload/div/div[2]/div/div/div[1]/div[1]/div/select")
	public static WebElement SelectPSType;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-upload/div/div[2]/div/div/div[1]/div[2]/div/select")
	public static WebElement SelectPSBatch;

	@FindBy(xpath="//*[@id=\"importFile\"]")
	public static WebElement ChooseFile;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-upload/div/div[2]/div/div/div[4]/div[1]/div/div[2]/a")
	public static WebElement Refresh;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-upload/div/div[2]/div/div/div[4]/div[1]/div/div[1]/a")
	public static WebElement UploadStatus;

	////////////////////////////////////////////// Select PS Type and PS Batch ////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[1]/div/div[1]/div/div[3]/div/select")
	public static WebElement PSType;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[1]/div/div[1]/div/div[4]/div/select")
	public static WebElement PSBatch;

	//////////////////////////////Inactive Record //////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[1]/div/input")
	public static WebElement Checkbox;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[2]/div/div[1]/div/a")
	public static WebElement ActionClick;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[2]/div/div[1]/div/div/a[2]")
	public static WebElement Inactiveclick;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement ClosePopup;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OkPopup;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[11]")
	public static WebElement StatusLabel;

	////////////////////////////// Active Record //////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[2]/div/div[1]/div/div/a[1]")
	public static WebElement Activeclick;

	//////////////////////////////Delete Record //////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[2]/div/div[1]/div/div/a[3]")
	public static WebElement Deleteclick;

	//////////////////////////////Export Record //////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-list/div/div[2]/div[1]/div[1]/div/div[2]/button[2]")
	public static WebElement ExportClick;

}
