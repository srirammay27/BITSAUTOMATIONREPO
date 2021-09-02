package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentRoleSem_Allot_List_Page_Objects {
	
	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[4]/a")
	public static WebElement SemAllotMenu;
	
	//////////////////////// Edit Grievance ////////////////////
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-student/div/div[2]/div[1]/div/table/tbody/tr/td[14]/a")
	public static WebElement EditG;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-edit/div/div[2]/div/form/div/div[8]/div/button[1]")
	public static WebElement CancelG;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement CloseG;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OkG;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-edit/div/div[2]/div/form/div/div[3]/div/div/div[2]/label/input")
	public static WebElement Q1No;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-edit/div/div[2]/div/form/div/div[4]/div/div/div[2]/label/input")
	public static WebElement Q2No;
	
	@FindBy(id="preferredDiscipline")
	public static WebElement PreferDiscipline;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-edit/div/div[2]/div/form/div/div[6]/div/div/div[2]/input")
	public static WebElement SemIIcheck;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[1]")
	public static WebElement CloseSubmit;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div[3]/button[2]")
	public static WebElement OkSubmit;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-edit/div/div[2]/div/form/div/div[8]/div/button[2]")
	public static WebElement Submit;
	
	

}
