package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllStudent_Allot_List_Page_Objects {

	@FindBy(xpath="//*[@id=\"navbarDropdown\"]")
	public static WebElement SAMenu;

	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[3]/div/a[1]")
	public static WebElement AllASMenu;

	///////////////// List Grid Sort //////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[1]/div/div/div/div/select")
	public static WebElement SearchSelect;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[2]/ul/li[1]/label")
	public static WebElement LabelSem1;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[2]/ul/li[3]/label")
	public static WebElement LabelSem2;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[2]/ul/li[5]/label")
	public static WebElement LabelSemboth;
	
	

	///////////////// First Row //////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[2]")
	public static WebElement Row11;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[3]")
	public static WebElement Row12;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[4]")
	public static WebElement Row13;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[5]")
	public static WebElement Row14;

	///////////////// Second Row //////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[2]/td[2]")
	public static WebElement Row21;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[2]/td[3]")
	public static WebElement Row22;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[2]/td[4]")
	public static WebElement Row23;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[2]/td[5]")
	public static WebElement Row24;

	///////////////// Third Row //////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[3]/td[2]")
	public static WebElement Row31;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[3]/td[3]")
	public static WebElement Row32;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[3]/td[4]")
	public static WebElement Row33;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[3]/td[5]")
	public static WebElement Row34;

	///////////////// Fourth Row //////////////////////////////////////////////////////

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[4]/td[2]")
	public static WebElement Row41;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[4]/td[3]")
	public static WebElement Row42;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[4]/td[4]")
	public static WebElement Row43;

	@FindBy(xpath="/html/body/app-root/app-layout/app-semester-preference-semester-allotment/div/div[2]/div[1]/div[3]/table/tbody/tr[4]/td[5]")
	public static WebElement Row44;

}
