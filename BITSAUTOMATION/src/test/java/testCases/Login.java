package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
//import bsh.Console;
import pageObjects.Login_Page_Objects;

public class Login extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(Login.class);
	
	@Test(priority = 0)
	public void ValidUserandinvalidPass() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Login Authentication Validation");
		logger.info("Launching the Application");
		logger.info("Checking Login with valid UserId and invalid Password");
		PageFactory.initElements(driver, Login_Page_Objects.class);
		
		/*
		 * extenttestCase.log(Status.INFO,
		 * "Verifying Login Authentication with Valid User Id and Invalid Password");
		 * 
		 * Login_Page_Objects.UserId.sendKeys(getExcelData("Login", 1, 0));
		 * Thread.sleep(2000);
		 * 
		 * Login_Page_Objects.Password.sendKeys(getExcelData("Login", 1, 1));
		 * Thread.sleep(2000);
		 * 
		 * Login_Page_Objects.SignIn.click();
		 */
	}
	
	@Test(priority = 1)
	public void InvalidUserIdandPassword() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Login Authentication with Invalid User Id and Password");
		
		//System.out.println("Start From Here");
		Login_Page_Objects.UserId.clear();
		Thread.sleep(2000);
		Login_Page_Objects.UserId.sendKeys(getExcelData("Login", 8, 0));
		Thread.sleep(2000);
		Login_Page_Objects.Password.clear();
		Thread.sleep(2000);
		
		Login_Page_Objects.Password.sendKeys(getExcelData("Login", 8, 1));
		Thread.sleep(2000);
		
		Login_Page_Objects.SignIn.click();
		Thread.sleep(2000);
		
		String LoginWarn = Login_Page_Objects.LoginWarn.getText();
		
		if(LoginWarn.contentEquals("Invalid User Id or password"))
		{
			extenttestCase.log(Status.PASS, "Login validation done with Invalid User Id and Password");
		}
		
		else
		{
			extenttestCase.log(Status.INFO, "Login validation Failed with Invalid User Id and Password");
		}
		
	}
	
	@Test(enabled = false)
	public void InvalidUserandPassword() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Login Authentication with Invalid User Id and Invalid Password");
		
		Login_Page_Objects.UserId.clear();
		Thread.sleep(2000);
		
		Login_Page_Objects.UserId.sendKeys(getExcelData("Login", 8, 0));
		Thread.sleep(2000);
		
		Login_Page_Objects.Password.clear();
		Thread.sleep(2000);
		
		Login_Page_Objects.Password.sendKeys(getExcelData("Login", 8, 1));
		Thread.sleep(2000);
		
		Login_Page_Objects.SignIn.click();
		Thread.sleep(3500);
		
		String LoginWarn = Login_Page_Objects.LoginWarn.getText();
		System.out.println(LoginWarn);
		
		if(LoginWarn.contentEquals("Invalid User Id or password"))
		{
			extenttestCase.log(Status.PASS, "Login validation done with Invalid User Id and Invalid Password");
		}
		
		else
		{
			extenttestCase.log(Status.INFO, "Login validation Failed with Invalid User Id and Invalid Password");
		}
		
	}
	
	@Test(priority = 2)
	public void ValidUserIdandPassword() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Login Authentication with Valid User Id and Password");
		
		Login_Page_Objects.UserId.clear();
		Thread.sleep(2000);
		
		Login_Page_Objects.UserId.sendKeys(getExcelData("Login", 1, 0));
		Thread.sleep(2000);
		
		Login_Page_Objects.Password.clear();
		Thread.sleep(2000);
		
		Login_Page_Objects.Password.sendKeys(getExcelData("Login", 1, 1));
		Thread.sleep(2000);
		
		Login_Page_Objects.SignIn.click();
		Thread.sleep(3000);
		
		if (Login_Page_Objects.WelcomeMsg.getText().toString().contains("Welcome"))
		{
			extenttestCase.log(Status.PASS, "Login validation done with Valid User Id and Password");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Login validation not successfull");
		}	
	}
}
