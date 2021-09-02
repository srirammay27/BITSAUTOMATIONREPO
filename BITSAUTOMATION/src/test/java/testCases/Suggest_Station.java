package testCases;
import java.util.List;
//import java.awt.List;
import java.util.concurrent.TimeUnit;

//import org.apache.bcel.generic.Select;
import org.apache.log4j.Logger;
//import org.apache.xpath.operations.Bool;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
//import com.google.common.base.Converter;

import CommonFunctions.CommonFunctions;
//import pageObjects.Profile_Page_Objects;
//import pageObjects.Profile_Page_Objects;
import pageObjects.Suggest_Station_Page_Objects;

import org.openqa.selenium.support.ui.Select;

public class Suggest_Station extends CommonFunctions
{
	static Logger logger=Logger.getLogger(Edit_Profile.class);
	String strPageTitle=""; 
	String brdCrumbs="";
	
	@Test(priority=1)
	public void validateNavigatetoSuggestStation() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Navigate to Suggest Station Validation");
		logger.info("Navigating to Suggest Station Page");		
		PageFactory.initElements(driver, Suggest_Station_Page_Objects.class);
		Suggest_Station_Page_Objects.mnuSuggestStation.click();		
		Thread.sleep(5000);			
		extenttestCase.log(Status.PASS, "Successfully navigated to Suggest Station Page");
	}
	
	@Test(priority=2)
	public void validateBreadCrumbs() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Checking Breadcrumbs");
		logger.info("Checking Breadcrumbs");		
		PageFactory.initElements(driver, Suggest_Station_Page_Objects.class);
		
		String bread = Suggest_Station_Page_Objects.brdCrumbs.getText();
		if (bread=="Manage Station")
		{
			extenttestCase.log(Status.PASS, "Bread crumbs text pass");
		}
	}
	
	@Test(priority=3)
	public void validateGridOnPageLoad() throws Throwable
	{  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Validating the Grid records on Page Load");
		logger.info("Validating the Grid records on Page Load");		
		PageFactory.initElements(driver, Suggest_Station_Page_Objects.class);
		
		int intGridRowCount = driver.findElements(By.tagName("tr")).size();
		int intGridRowsWithoutHeader=driver.findElements(By.tagName("tr")).size()-1;
		
		if(intGridRowCount>1)
		{			
			if (Suggest_Station_Page_Objects.grdRecordNotFound.getText().contains("Record(s) not found"))
			{
				//System.out.println("Record Count not found");
				extenttestCase.log(Status.PASS, "There is no Station data for the faculty");
			}
			else
			{	
				String[] RecordCountTop = Suggest_Station_Page_Objects.recordCountTop.getText().trim().split(" ");
				String[] RecordCountBottom = Suggest_Station_Page_Objects.recordCountBottom.getText().trim().split(" ");
				String strRecordCountTop = RecordCountTop[1];
				String strRecordCountBottom = RecordCountBottom[1];
				
				RecordCountTop=strRecordCountTop.trim().split("/");
				RecordCountBottom=strRecordCountBottom.trim().split("/");
				strRecordCountTop=RecordCountTop[0];
				strRecordCountBottom=RecordCountBottom[0];
				int intRecordCountTop= Integer.parseInt(strRecordCountTop);
				int intRecordCountBottom= Integer.parseInt(strRecordCountBottom);
				
				if (intRecordCountTop == intGridRowsWithoutHeader)
				{					
					extenttestCase.log(Status.PASS, "Grid record count matches Records on top of grid");
				}
				if (intRecordCountTop != intGridRowsWithoutHeader)
				{						
					extenttestCase.log(Status.FAIL, "Grid record count do not Match Records on top of grid");
				}
				
				if (intRecordCountBottom == intGridRowsWithoutHeader)
				{					
					extenttestCase.log(Status.PASS, "Grid record count matches Records on Bottom of grid");
				}	
				if (intRecordCountBottom != intGridRowsWithoutHeader)
				{
					extenttestCase.log(Status.PASS, "Grid record count do not match Records on Bottom of grid");
				}		
			}
		}
		else if(intGridRowCount==1)
		{
			if (Suggest_Station_Page_Objects.grdRecordNotFound.getText().contains("Record(s) not found"))
			{
				extenttestCase.log(Status.PASS, "There is no Station data for the faculty");
			}
		}
	}
	
	@Test(priority=4)
	public void validateSearchCriteriaDropdown() throws Throwable
	{  		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Vaidating the Search criteria drop downs and search box");
		logger.info("Vaidating the Search criteria drop downs and search box");		
		PageFactory.initElements(driver, Suggest_Station_Page_Objects.class);		
				
		Select dropdown = new Select(Suggest_Station_Page_Objects.drpSearchCriteria);
		List <WebElement> listoptions = dropdown.getOptions();		 
		int size = listoptions.size();
		//System.out.println(size);
		for(int i =0; i<size ; i++)
		{
			String options = String.valueOf(listoptions.get(i).getText().trim());
	        String excelvalue=String.valueOf(getExcelData("ManageStation", i+1, 0).trim());
	        
	        boolean noRecordsinGrid=false;
	        boolean recordCountMatch = false;
	        
	        if(options.equalsIgnoreCase(excelvalue))
	         {	        	
	    		System.out.println("loop" + i + options + (i+1));
	    		Suggest_Station_Page_Objects.drpSearchCriteria.click();
	     		Thread.sleep(3000);
	        	Suggest_Station_Page_Objects.drpSearchCriteria.sendKeys(options);
	     		Thread.sleep(2000);
	     		Suggest_Station_Page_Objects.searchBox.clear();
	     		Thread.sleep(2000);
	     		Suggest_Station_Page_Objects.searchBox.sendKeys(getExcelData("ManageStation", i+1,1).toString());
	     		Thread.sleep(2000);
	     		
	     		if (Suggest_Station_Page_Objects.grdRecordNotFound.getText().contains("Record(s) not found"))
	    		{
	     			noRecordsinGrid=true;
	    			System.out.println("Record Count not found");
	    			extenttestCase.log(Status.PASS, "There is no Station data for the selected drop down :" + options);
	    		}
	     		
	     		if(noRecordsinGrid==false && i==0 && Suggest_Station_Page_Objects.grdRowStationNameColumn.getText().toString().toLowerCase().contains(getExcelData("ManageStation", i+1,1).toString().toLowerCase()))
	     		{
	     			recordCountMatch=validateGridOnFilter();
	     			if(recordCountMatch)
	     			{
	     				extenttestCase.log(Status.PASS, "Grid record count matches");
	     			}
	     			else
	     			{
	     				extenttestCase.log(Status.FAIL, "Grid record count do not match");
	     			}
	     			
	     			extenttestCase.log(Status.PASS, "Search Result successfully retrieved for Station Name : " + Suggest_Station_Page_Objects.grdRowStationNameColumn.getText().toString());
	     			System.out.println(recordCountMatch);
	     		}
	     		else if (noRecordsinGrid==false && i==1 && Suggest_Station_Page_Objects.grdRowBusDomainColumn.getText().toString().toLowerCase().contains(getExcelData("ManageStation", i+1,1).toString().toLowerCase()))
	     		{
	     			recordCountMatch=validateGridOnFilter();
	     			if(recordCountMatch)
	     			{
	     				extenttestCase.log(Status.PASS, "Grid record count matches");
	     			}
	     			else
	     			{
	     				extenttestCase.log(Status.FAIL, "Grid record count do not match");
	     			}
	     			extenttestCase.log(Status.PASS, "Search Result successfully retrieved for Business Domain : " + Suggest_Station_Page_Objects.grdRowBusDomainColumn.getText().toString());
	     			System.out.println(recordCountMatch);
	     		}
	     		else if (noRecordsinGrid==false && i==2 && Suggest_Station_Page_Objects.grdRowParentCmpnyColumn.getText().toString().toLowerCase().contains(getExcelData("ManageStation", i+1,1).toString().toLowerCase()))
	     		{
	     			recordCountMatch=validateGridOnFilter();
	     			if(recordCountMatch)
	     			{
	     				extenttestCase.log(Status.PASS, "Grid record count matches");
	     			}
	     			else
	     			{
	     				extenttestCase.log(Status.FAIL, "Grid record count do not match");
	     			}
	     			extenttestCase.log(Status.PASS, "Search Result successfully retrieved For Parent Company : " + Suggest_Station_Page_Objects.grdRowParentCmpnyColumn.getText().toString());
	     			System.out.println(recordCountMatch);
	     		}
	     		else
	     		{
	     			System.out.println(Suggest_Station_Page_Objects.grdRowParentCmpnyColumn.getText().toString() + "" + (getExcelData("ManageStation", i+1,1).toString()));
	     			extenttestCase.log(Status.FAIL, "Search Result not retrieved");
	     			System.out.println("fail");
	     		}
	         }
		}
		driver.navigate().refresh();
	}
	public boolean validateGridOnFilter()
	{  
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Validating the Grid records on Page Load");*/
		logger.info("Checking the Record counts during grid filter");		
		PageFactory.initElements(driver, Suggest_Station_Page_Objects.class);
		
		int intGridRowCount = driver.findElements(By.tagName("tr")).size();
		int intGridRowsWithoutHeader=driver.findElements(By.tagName("tr")).size()-1;
		
		boolean finalstatus=false;
		
		if(intGridRowCount>1)
		{			
			if (Suggest_Station_Page_Objects.grdRecordNotFound.getText().contains("Record(s) not found"))
			{
				System.out.println("Record Count not found");
				extenttestCase.log(Status.PASS, "There is no Station data for the faculty");
			}
			else
			{	
				String[] RecordCountTop = Suggest_Station_Page_Objects.recordCountTop.getText().trim().split(" ");
				String[] RecordCountBottom = Suggest_Station_Page_Objects.recordCountBottom.getText().trim().split(" ");
				String strRecordCountTop = RecordCountTop[1];
				String strRecordCountBottom = RecordCountBottom[1];
				
				RecordCountTop=strRecordCountTop.trim().split("/");
				RecordCountBottom=strRecordCountBottom.trim().split("/");
				strRecordCountTop=RecordCountTop[0];
				strRecordCountBottom=RecordCountBottom[0];
				int intRecordCountTop= Integer.parseInt(strRecordCountTop);
				int intRecordCountBottom= Integer.parseInt(strRecordCountBottom);
				
				if (intRecordCountTop == intGridRowsWithoutHeader && intRecordCountBottom == intGridRowsWithoutHeader)
				{	
					finalstatus=true;
					extenttestCase.log(Status.INFO, "Grid record count matches Records on top of grid");
				}
				if (intRecordCountTop != intGridRowsWithoutHeader || intRecordCountBottom != intGridRowsWithoutHeader)
				{		
					finalstatus=false;
					extenttestCase.log(Status.INFO, "Grid record count do not Match Records on top of grid");
				}	
			}
		}
		else if(intGridRowCount==1)
		{
			if (Suggest_Station_Page_Objects.grdRecordNotFound.getText().contains("Record(s) not found"))
			{
				finalstatus=true;
				extenttestCase.log(Status.INFO, "There is no Station data for the faculty");
			}
		}
		return finalstatus;
	}	

	@Test(priority=5)
	public void validateStatusDropDownFilter() throws Throwable
	{  		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Vaidating the Grid Filter : Status drop down");
		logger.info("Vaidating the Grid Filter : Status drop down");		
		PageFactory.initElements(driver, Suggest_Station_Page_Objects.class);		
		
		//int intGridRowCount = driver.findElements(By.tagName("tr")).size();
		//int intGridRowsWithoutHeader=driver.findElements(By.tagName("tr")).size()-1;
		
		Select dropdown = new Select(Suggest_Station_Page_Objects.drpStatus);
		List <WebElement> listoptions = dropdown.getOptions();		 
		int size = listoptions.size();
		
		for(int i =1; i<size-1 ; i++)
		{
			String options = String.valueOf(listoptions.get(i+1).getText().trim());
	              
	        Suggest_Station_Page_Objects.drpStatus.sendKeys(options);
     		Thread.sleep(5000);
     		
     		if (options.trim().toLowerCase().equals(Suggest_Station_Page_Objects.grdRowStatus.getText().toString().trim().toLowerCase())) 
     		{
     			extenttestCase.log(Status.PASS, "Search Result successfully Status : " + options);     			
     		}
     		else
     		{
     			extenttestCase.log(Status.FAIL, "Search Result not valid");     			
     		}     		
		}
		driver.navigate().refresh();
	}
	@Test(priority=6)
	public void validatePSTypeDropDownFilter() throws Throwable
	{  		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Vaidating the Grid Filter : Status drop down");
		logger.info("Vaidating the Grid Filter : Status drop down");		
		PageFactory.initElements(driver, Suggest_Station_Page_Objects.class);		
		
		//int intGridRowCount = driver.findElements(By.tagName("tr")).size();
		//int intGridRowsWithoutHeader=driver.findElements(By.tagName("tr")).size()-1;
		
		Select dropdown = new Select(Suggest_Station_Page_Objects.drpPSType);
		List <WebElement> listoptions = dropdown.getOptions();		 
		int size = listoptions.size();
		System.out.println("drop down size "+size);
		for(int i =0; i<size-1 ; i++)
		{
			String options = String.valueOf(listoptions.get(i+1).getText().trim());
	               
	        System.out.println(options);
	        System.out.println("First option");
	        Suggest_Station_Page_Objects.drpPSType.sendKeys(options);
	        System.out.println("First option selected");
	        System.out.println(options.trim().toLowerCase());
	        System.out.println(Suggest_Station_Page_Objects.grdRowPSType.getText().toString().trim().toLowerCase());
     		Thread.sleep(5000);
     		//System.out.println("Compare " +options.trim().toLowerCase()+ " And " +Suggest_Station_Page_Objects.grdRowPSType.getText().toString().trim().toLowerCase());
     		if (options.trim().toLowerCase().equals(Suggest_Station_Page_Objects.grdRowPSType.getText().toString().trim().toLowerCase())) 
     		{
     			extenttestCase.log(Status.PASS, "Search Result successfully Status : " + options);
     			System.out.println("success");
     		}
     		else
     		{
     			extenttestCase.log(Status.FAIL, "Search Result not valid");
     			System.out.println("Fail");
     		}     		
		}
		driver.navigate().refresh();
	}
	@Test(priority=7)
	public void validateNavigatetoAddStation() throws Throwable
	{  		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Vaidating the Grid Filter : Status drop down");
		logger.info("Vaidating the Grid Filter : Status drop down");		
		PageFactory.initElements(driver, Suggest_Station_Page_Objects.class);		
		
		//int intGridRowCount = driver.findElements(By.tagName("tr")).size();
		//int intGridRowsWithoutHeader=driver.findElements(By.tagName("tr")).size()-1;
		
		Suggest_Station_Page_Objects.btnAddStation.click();
		Thread.sleep(15);
		strPageTitle=Suggest_Station_Page_Objects.pageTitle.getText().toString().trim();
		brdCrumbs=Suggest_Station_Page_Objects.brdCrumbs1.getText().toString().trim();
		System.out.println(strPageTitle);
		
		if (brdCrumbs.toString().trim().equals("Add/Edit Station"))
		{
			extenttestCase.log(Status.PASS, "Successfully Navigated to Station Page");
 			System.out.println("Successfully Navigated to Station Page" + brdCrumbs);
		}
		else
 		{
 			extenttestCase.log(Status.FAIL, "Navigation to Station page not successfull");
 			System.out.println("Navigation to Station page not successfull" + brdCrumbs);
 		}     
			
		
		driver.navigate().refresh();
	}
	
	@Test(priority = 8)
	public void ClickDelete () throws Throwable
	{
			
		extenttestCase.log(Status.INFO,"Verifying Delete Record");
		
		Suggest_Station_Page_Objects.grdCheckbox.click();
		Thread.sleep(2000);
	}
		
		/*Suggest_Station_Page_Objects.ActionClick.click();
		Thread.sleep(2000);
		
		Suggest_Station_List_Page_Objects.Deleteclick.click();
		Thread.sleep(2000);
		
		Suggest_Station_List_Page_Objects.ClosePopup.click();
		Thread.sleep(2000);
		
		Suggest_Station_List_Page_Objects.ActionClick.click();
		Thread.sleep(2000);
		
		Suggest_Station_List_Page_Objects.Deleteclick.click();
		Thread.sleep(2000);
		
		Suggest_Station_List_Page_Objects.OkPopup.click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 7)
	public void validateDeleteStation() throws Throwable
	{
		
		Suggest_Station_List_Page_Objects.SearchField.clear();
		Thread.sleep(2000);
		
		Suggest_Station_List_Page_Objects.SearchField.sendKeys(getExcelData("SStationList", 6, 1));
		Thread.sleep(2000);

		String ListWarn =  Suggest_Station_List_Page_Objects.ListWarn.getText();
		System.out.println(ListWarn);
		Thread.sleep(2000);

		if(ListWarn.contains("Record(s) not found"))
		{
			extenttestCase.log(Status.PASS, "New Station Deleted Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "New Station Deletion Failed");
		}
		
		driver.navigate().refresh();
	}*/

	}
	     		
	         
	     
	

