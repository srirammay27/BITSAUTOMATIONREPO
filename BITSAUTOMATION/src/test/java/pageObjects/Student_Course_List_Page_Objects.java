package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Student_Course_List_Page_Objects {

	@FindBy(id="navbarDropdown")
	public static WebElement MSMenu;

	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[3]/div/a[2]")
	public static WebElement SCMenu;

	///////////////// List Grid Sort //////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/thead/tr/th[3]/em")
	public static WebElement SortName;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/thead/tr/th[5]/em")
	public static WebElement SortSem;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/thead/tr/th[6]/em")
	public static WebElement SortCID;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/thead/tr/th[7]/em")
	public static WebElement SortSubject;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/thead/tr/th[8]/em")
	public static WebElement SortCatalog;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/thead/tr/th[9]/em")
	public static WebElement SortDesc;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/thead/tr/th[10]/em")
	public static WebElement SortGradeIn;

	///////////////// List Grid Search //////////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/input")
	public static WebElement SearchField;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/tbody/tr/td")
	public static WebElement ListWarn;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div/select")
	public static WebElement SearchSelect;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/tbody/tr[1]/td[3]")
	public static WebElement StudentResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/tbody/tr[1]/td[9]")
	public static WebElement DescResult;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/tbody/tr[1]/td[7]")
	public static WebElement SubjectResult;

	///////////////// Upload Faculty Validation //////////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[1]/div/div[2]/button[1]")
	public static WebElement UploadClick;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-upload/div/div[2]/div/div/div[2]/div/button[1]")
	public static WebElement CancelUpload;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-upload/div/div[2]/div/div/div[2]/div/button[2]")
	public static WebElement UploadFile;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-upload/div/div[2]/div/div/div[1]/div/div/div[2]")
	public static WebElement UploadWarn;

	///////////////// Upload Valid Faculty //////////////////////////////////////////////////////////

	@FindBy(xpath="//*[@id=\"importFile\"]")
	public static WebElement ChooseFile;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-upload/div/div[2]/div/div/div[4]/div[1]/div/div[2]/a")
	public static WebElement Refresh;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course-upload/div/div[2]/div/div/div[4]/div[1]/div/div[1]/a")
	public static WebElement UploadStatus;

	////////////////////////////// Delete Record //////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[3]/table/tbody/tr[1]/td[1]/div/input")
	public static WebElement Checkbox;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[2]/div/div[1]/div/a")
	public static WebElement ActionClick;

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[2]/div/div[1]/div/div/a")
	public static WebElement Deleteclick;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement ClosePopup;

	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OkPopup;

	////////////////////////////// Export Record //////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-student-course/div/div[2]/div/div[1]/div/div[2]/button[2]")
	public static WebElement ExportClick;

}
