package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Edit_Station_Page_Objects {
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-add-station/div/div[1]/div/div/div[1]/h2")
	public static WebElement pageTitle;
	

}
