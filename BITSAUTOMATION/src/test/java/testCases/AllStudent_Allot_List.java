package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import pageObjects.AllStudent_Allot_List_Page_Objects;

public class AllStudent_Allot_List extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(AllStudent_Allot_List.class);
	
	@Test(priority = 0)
	public void AllStudentMenu() throws InterruptedException, IOException
	{
		extenttestCase=extentReport.createTest("Verifying All Allotment Student List Page");
		PageFactory.initElements(driver, AllStudent_Allot_List_Page_Objects.class);
		extenttestCase.log(Status.INFO,"Landing into All Allotment Student List");
		AllStudent_Allot_List_Page_Objects.SAMenu.click();
		Thread.sleep(2000);
		AllStudent_Allot_List_Page_Objects.AllASMenu.click();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("AllAllotedStudentList.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("AllAllotedStudentList.png");
	}
	
	@Test(priority = 1)
	public void VerifyTotalSem1() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Total No.of Semester I Students");
		
		String LabelSem1 =AllStudent_Allot_List_Page_Objects.LabelSem1.getText();
		String value = LabelSem1.substring(30);
		int totalsem1 = Integer.parseInt(value);
		System.out.println(totalsem1);
		
		String Row12 = AllStudent_Allot_List_Page_Objects.Row12.getText();
		int IntRow12 = Integer.parseInt(Row12);
		System.out.println(IntRow12);
		Thread.sleep(1000);
		
		String Row22 = AllStudent_Allot_List_Page_Objects.Row22.getText();
		int IntRow22 = Integer.parseInt(Row22);
		System.out.println(IntRow22);
		Thread.sleep(1000);
		
		String Row32 = AllStudent_Allot_List_Page_Objects.Row32.getText();
		int IntRow32 = Integer.parseInt(Row32);
		System.out.println(IntRow32);
		Thread.sleep(1000);
		
		String Row42 = AllStudent_Allot_List_Page_Objects.Row42.getText();
		int IntRow42 = Integer.parseInt(Row42);
		System.out.println(IntRow42);
		Thread.sleep(1000);
		
		int TotalSemI = (IntRow12+IntRow22+IntRow32+IntRow42);
		System.out.println(TotalSemI);
		Thread.sleep(1000);
		
		extenttestCase.log(Status.PASS,"Fetched Semester I Student Counts From Grid Successfully");
		
		try{
			Assert.assertEquals(totalsem1, TotalSemI);

			extenttestCase.log(Status.PASS,"Sum of Semester I Students Verified Successfully");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Semester I Students Doesn't Matched");

		}
		
		System.out.println("*********************************************************");
		
	}
	
	@Test(priority = 2)
	public void VerifyTotalSem2() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Total No.of Semester II Students");
		
		String LabelSem2 =AllStudent_Allot_List_Page_Objects.LabelSem2.getText();
		String value = LabelSem2.substring(31);
		int totalsem2 = Integer.parseInt(value);
		System.out.println(totalsem2);
		
		String Row13 = AllStudent_Allot_List_Page_Objects.Row13.getText();
		int IntRow13 = Integer.parseInt(Row13);
		System.out.println(IntRow13);
		Thread.sleep(1000);
		
		String Row23 = AllStudent_Allot_List_Page_Objects.Row23.getText();
		int IntRow23 = Integer.parseInt(Row23);
		System.out.println(IntRow23);
		Thread.sleep(1000);
		
		String Row33 = AllStudent_Allot_List_Page_Objects.Row33.getText();
		int IntRow33 = Integer.parseInt(Row33);
		System.out.println(IntRow33);
		Thread.sleep(1000);
		
		String Row43 = AllStudent_Allot_List_Page_Objects.Row43.getText();
		int IntRow43 = Integer.parseInt(Row43);
		System.out.println(IntRow43);
		Thread.sleep(1000);
		
		int TotalSemII = (IntRow13+IntRow23+IntRow33+IntRow43);
		System.out.println(TotalSemII);
		Thread.sleep(1000);
		
		extenttestCase.log(Status.PASS,"Fetched Semester II Student Counts From Grid Successfully");
		
		try{
			Assert.assertEquals(totalsem2, TotalSemII);

			extenttestCase.log(Status.PASS,"Sum of Semester II Students Verified Successfully");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Semester II Students Doesn't Matched");

		}
		
		System.out.println("*********************************************************");
		
	}
	
	@Test(priority = 3)
	public void VerifyBothSemTotal() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Total No.of Both Semester Students");
		
		String LabelSemboth =AllStudent_Allot_List_Page_Objects.LabelSemboth.getText();
		String value = LabelSemboth.substring(33);
		int totalboth = Integer.parseInt(value);
		System.out.println(totalboth);
		
		String Row14 = AllStudent_Allot_List_Page_Objects.Row14.getText();
		int IntRow14 = Integer.parseInt(Row14);
		System.out.println(IntRow14);
		Thread.sleep(1000);
		
		String Row24 = AllStudent_Allot_List_Page_Objects.Row24.getText();
		int IntRow24 = Integer.parseInt(Row24);
		System.out.println(IntRow24);
		Thread.sleep(1000);
		
		String Row34 = AllStudent_Allot_List_Page_Objects.Row34.getText();
		int IntRow34 = Integer.parseInt(Row34);
		System.out.println(IntRow34);
		Thread.sleep(1000);
		
		String Row44 = AllStudent_Allot_List_Page_Objects.Row44.getText();
		int IntRow44 = Integer.parseInt(Row44);
		System.out.println(IntRow44);
		Thread.sleep(1000);
		
		int TotalBothSem = (IntRow14+IntRow24+IntRow34+IntRow44);
		System.out.println(TotalBothSem);
		Thread.sleep(1000);
		
		extenttestCase.log(Status.PASS,"Fetched Both Semester Student Counts From Grid Successfully");
		
		try{
			Assert.assertEquals(totalboth, TotalBothSem);

			extenttestCase.log(Status.PASS,"Sum of Both Semester Students Verified Successfully");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Both Semester Students Doesn't Matched");

		}
		
		System.out.println("*********************************************************");
		
	}
	
	
	@Test(priority = 4)
	public void VerifyFirstRow() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Fetching Student List in First Row");
		
		String Row11 = AllStudent_Allot_List_Page_Objects.Row11.getText();
		int IntRow11 = Integer.parseInt(Row11);
		System.out.println(IntRow11);
		Thread.sleep(1000);

		String Row12 = AllStudent_Allot_List_Page_Objects.Row12.getText();
		int IntRow12 = Integer.parseInt(Row12);
		System.out.println(IntRow12);
		Thread.sleep(1000);
		
		String Row13 = AllStudent_Allot_List_Page_Objects.Row13.getText();
		int IntRow13 = Integer.parseInt(Row13);
		System.out.println(IntRow13);
		Thread.sleep(1000);
		
		String Row14 = AllStudent_Allot_List_Page_Objects.Row14.getText();
		int IntRow14 = Integer.parseInt(Row14);
		System.out.println(Row14);
		Thread.sleep(1000);
		
		int Total = (IntRow12+IntRow13+IntRow14);
		System.out.println(Total);
		Thread.sleep(1000);
		extenttestCase.log(Status.PASS,"Fetched Student Counts From First Row Successfully");
		
		try{
			Assert.assertEquals(Total, IntRow11);

			extenttestCase.log(Status.PASS,"Sum of Students Verified Successfully in First Row");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Students not matched in First Row");

		}
		
		System.out.println("*********************************************************");
		
	}
	
	@Test(priority = 5)
	public void VerifySecondRow() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Fetching Student List in Second Row");
		
		String Row21 = AllStudent_Allot_List_Page_Objects.Row21.getText();
		int IntRow21 = Integer.parseInt(Row21);
		System.out.println(IntRow21);
		Thread.sleep(1000);

		String Row22 = AllStudent_Allot_List_Page_Objects.Row22.getText();
		int IntRow22 = Integer.parseInt(Row22);
		System.out.println(IntRow22);
		Thread.sleep(1000);
		
		String Row23 = AllStudent_Allot_List_Page_Objects.Row23.getText();
		int IntRow23 = Integer.parseInt(Row23);
		System.out.println(IntRow23);
		Thread.sleep(1000);
		
		String Row24 = AllStudent_Allot_List_Page_Objects.Row24.getText();
		int IntRow24 = Integer.parseInt(Row24);
		System.out.println(Row24);
		Thread.sleep(1000);
		
		int Total = (IntRow22+IntRow23+IntRow24);
		System.out.println(Total);
		Thread.sleep(1000);
		extenttestCase.log(Status.PASS,"Fetched Student Counts From Second Row Successfully");
		
		try{
			Assert.assertEquals(Total, IntRow21);

			extenttestCase.log(Status.PASS,"Sum of Students Verified Successfully in Second Row");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Students not matched in Second Row");

		}
		
		System.out.println("*********************************************************");
	}
	
	@Test(priority = 6)
	public void VerifyThirdRow() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Fetching Student List in Third Row");
		
		String Row31 = AllStudent_Allot_List_Page_Objects.Row31.getText();
		int IntRow31 = Integer.parseInt(Row31);
		System.out.println(IntRow31);
		Thread.sleep(1000);

		String Row32 = AllStudent_Allot_List_Page_Objects.Row32.getText();
		int IntRow32 = Integer.parseInt(Row32);
		System.out.println(IntRow32);
		Thread.sleep(1000);
		
		String Row33 = AllStudent_Allot_List_Page_Objects.Row33.getText();
		int IntRow33 = Integer.parseInt(Row33);
		System.out.println(IntRow33);
		Thread.sleep(1000);
		
		String Row34 = AllStudent_Allot_List_Page_Objects.Row34.getText();
		int IntRow34 = Integer.parseInt(Row34);
		System.out.println(Row34);
		Thread.sleep(1000);
		
		int Total = (IntRow32+IntRow33+IntRow34);
		System.out.println(Total);
		Thread.sleep(1000);
		extenttestCase.log(Status.PASS,"Fetched Student Counts From Third Row Successfully");
		
		try{
			Assert.assertEquals(Total, IntRow31);

			extenttestCase.log(Status.PASS,"Sum of Students Verified Successfully in Third Row");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Students not matched in Third Row");

		}
		
		System.out.println("*********************************************************");
	}
	
	@Test(priority = 7)
	public void VerifyFourthRow() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Fetching Student List in Fourth Row");
		
		String Row41 = AllStudent_Allot_List_Page_Objects.Row41.getText();
		int IntRow41 = Integer.parseInt(Row41);
		System.out.println(IntRow41);
		Thread.sleep(1000);

		String Row42 = AllStudent_Allot_List_Page_Objects.Row42.getText();
		int IntRow42 = Integer.parseInt(Row42);
		System.out.println(IntRow42);
		Thread.sleep(1000);
		
		String Row43 = AllStudent_Allot_List_Page_Objects.Row43.getText();
		int IntRow43 = Integer.parseInt(Row43);
		System.out.println(IntRow43);
		Thread.sleep(1000);
		
		String Row44 = AllStudent_Allot_List_Page_Objects.Row44.getText();
		int IntRow44 = Integer.parseInt(Row44);
		System.out.println(Row44);
		Thread.sleep(1000);
		
		int Total = (IntRow42+IntRow43+IntRow44);
		System.out.println(Total);
		Thread.sleep(1000);
		extenttestCase.log(Status.PASS,"Fetched Student Counts From Fourth Row Successfully");
		
		try{
			Assert.assertEquals(Total, IntRow41);

			extenttestCase.log(Status.PASS,"Sum of Students Verified Successfully in Fourth Row");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Students not matched in Fourth Row");

		}
		
		System.out.println("*********************************************************");
		
		driver.navigate().refresh();
	}
	
	
	
	
	@Test(priority = 8)
	public void SelectPilani() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Select Pilani Campus");
		Thread.sleep(2000);
		AllStudent_Allot_List_Page_Objects.SearchSelect.sendKeys(getExcelData("AllAllotStudentList", 1, 0));
		Thread.sleep(2000);
		String LabelSem1 =AllStudent_Allot_List_Page_Objects.LabelSem1.getText();
		String value = LabelSem1.substring(30);
		int totalsem1 = Integer.parseInt(value);
		System.out.println(totalsem1);
		
		String Row12 = AllStudent_Allot_List_Page_Objects.Row12.getText();
		int IntRow12 = Integer.parseInt(Row12);
		System.out.println(IntRow12);
		Thread.sleep(1000);
		
		String Row22 = AllStudent_Allot_List_Page_Objects.Row22.getText();
		int IntRow22 = Integer.parseInt(Row22);
		System.out.println(IntRow22);
		
		int TotalSemI = (IntRow12+IntRow22);
		System.out.println(TotalSemI);
		Thread.sleep(1000);
		
		extenttestCase.log(Status.PASS,"Fetched Semester I Student Counts From Grid Successfully");
		
		try{
			Assert.assertEquals(totalsem1, TotalSemI);

			extenttestCase.log(Status.PASS,"Sum of Semester I Students Verified Successfully");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Semester I Students Doesn't Matched");

		}
		
		System.out.println("*********************************************************");
		
		String LabelSem2 =AllStudent_Allot_List_Page_Objects.LabelSem2.getText();
		String value1 = LabelSem2.substring(31);
		int totalsem2 = Integer.parseInt(value1);
		System.out.println(totalsem2);
		
		String Row13 = AllStudent_Allot_List_Page_Objects.Row13.getText();
		int IntRow13 = Integer.parseInt(Row13);
		System.out.println(IntRow13);
		Thread.sleep(1000);
		
		String Row23 = AllStudent_Allot_List_Page_Objects.Row23.getText();
		int IntRow23 = Integer.parseInt(Row23);
		System.out.println(IntRow23);
		Thread.sleep(1000);
		
		int TotalSemII = (IntRow13+IntRow23);
		System.out.println(TotalSemII);
		Thread.sleep(1000);
		
		extenttestCase.log(Status.PASS,"Fetched Semester II Student Counts From Grid Successfully");
		
		try{
			Assert.assertEquals(totalsem2, TotalSemII);

			extenttestCase.log(Status.PASS,"Sum of Semester II Students Verified Successfully");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Semester II Students Doesn't Matched");

		}
		
		System.out.println("*********************************************************");
		
		String LabelSemboth =AllStudent_Allot_List_Page_Objects.LabelSemboth.getText();
		String value2 = LabelSemboth.substring(33);
		int totalboth = Integer.parseInt(value2);
		System.out.println(totalboth);
		
		String Row14 = AllStudent_Allot_List_Page_Objects.Row14.getText();
		int IntRow14 = Integer.parseInt(Row14);
		System.out.println(IntRow14);
		Thread.sleep(1000);
		
		String Row24 = AllStudent_Allot_List_Page_Objects.Row24.getText();
		int IntRow24 = Integer.parseInt(Row24);
		System.out.println(IntRow24);
		Thread.sleep(1000);
		
		int TotalBothSem = (IntRow14+IntRow24);
		System.out.println(TotalBothSem);
		Thread.sleep(1000);
		
		extenttestCase.log(Status.PASS,"Fetched Both Semester Student Counts From Grid Successfully");
		
		try{
			Assert.assertEquals(totalboth, TotalBothSem);

			extenttestCase.log(Status.PASS,"Sum of Both Semester Students Verified Successfully");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Both Semester Students Doesn't Matched");

		}
		
		System.out.println("*********************************************************");
		
		Thread.sleep(1000);
		VerifyFirstRow();
		VerifySecondRow();
		
		driver.navigate().refresh();
	}
	
	@Test(priority = 9)
	public void SelectHyderabad() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Select Hyderabad Campus");
		Thread.sleep(2000);
		AllStudent_Allot_List_Page_Objects.SearchSelect.sendKeys(getExcelData("AllAllotStudentList", 2, 0));
		Thread.sleep(2000);
		
		String LabelSem1 =AllStudent_Allot_List_Page_Objects.LabelSem1.getText();
		String value = LabelSem1.substring(30);
		int totalsem1 = Integer.parseInt(value);
		System.out.println(totalsem1);
		
		String Row12 = AllStudent_Allot_List_Page_Objects.Row12.getText();
		int IntRow12 = Integer.parseInt(Row12);
		System.out.println(IntRow12);
		Thread.sleep(1000);
		
		String Row22 = AllStudent_Allot_List_Page_Objects.Row22.getText();
		int IntRow22 = Integer.parseInt(Row22);
		System.out.println(IntRow22);
		
		String Row32 = AllStudent_Allot_List_Page_Objects.Row32.getText();
		int IntRow32 = Integer.parseInt(Row32);
		System.out.println(IntRow32);
		Thread.sleep(1000);
		
		int TotalSemI = (IntRow12+IntRow22+IntRow32);
		System.out.println(TotalSemI);
		Thread.sleep(1000);
		
		extenttestCase.log(Status.PASS,"Fetched Semester I Student Counts From Grid Successfully");
		
		try{
			Assert.assertEquals(totalsem1, TotalSemI);

			extenttestCase.log(Status.PASS,"Sum of Semester I Students Verified Successfully");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Semester I Students Doesn't Matched");

		}
		
		System.out.println("*********************************************************");
		
		String LabelSem2 =AllStudent_Allot_List_Page_Objects.LabelSem2.getText();
		String value1 = LabelSem2.substring(31);
		int totalsem2 = Integer.parseInt(value1);
		System.out.println(totalsem2);
		
		String Row13 = AllStudent_Allot_List_Page_Objects.Row13.getText();
		int IntRow13 = Integer.parseInt(Row13);
		System.out.println(IntRow13);
		Thread.sleep(1000);
		
		String Row23 = AllStudent_Allot_List_Page_Objects.Row23.getText();
		int IntRow23 = Integer.parseInt(Row23);
		System.out.println(IntRow23);
		Thread.sleep(1000);
		
		String Row33 = AllStudent_Allot_List_Page_Objects.Row33.getText();
		int IntRow33 = Integer.parseInt(Row33);
		System.out.println(IntRow33);
		Thread.sleep(1000);
		
		int TotalSemII = (IntRow13+IntRow23+IntRow33);
		System.out.println(TotalSemII);
		Thread.sleep(1000);
		
		extenttestCase.log(Status.PASS,"Fetched Semester II Student Counts From Grid Successfully");
		
		try{
			Assert.assertEquals(totalsem2, TotalSemII);

			extenttestCase.log(Status.PASS,"Sum of Semester II Students Verified Successfully");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Semester II Students Doesn't Matched");

		}
		
		System.out.println("*********************************************************");
		
		String LabelSemboth =AllStudent_Allot_List_Page_Objects.LabelSemboth.getText();
		String value2 = LabelSemboth.substring(33);
		int totalboth = Integer.parseInt(value2);
		System.out.println(totalboth);
		
		String Row14 = AllStudent_Allot_List_Page_Objects.Row14.getText();
		int IntRow14 = Integer.parseInt(Row14);
		System.out.println(IntRow14);
		Thread.sleep(1000);
		
		String Row24 = AllStudent_Allot_List_Page_Objects.Row24.getText();
		int IntRow24 = Integer.parseInt(Row24);
		System.out.println(IntRow24);
		Thread.sleep(1000);
		
		String Row34 = AllStudent_Allot_List_Page_Objects.Row34.getText();
		int IntRow34 = Integer.parseInt(Row34);
		System.out.println(IntRow34);
		Thread.sleep(1000);
		
		int TotalBothSem = (IntRow14+IntRow24+IntRow34);
		System.out.println(TotalBothSem);
		Thread.sleep(1000);
		
		extenttestCase.log(Status.PASS,"Fetched Both Semester Student Counts From Grid Successfully");
		
		try{
			Assert.assertEquals(totalboth, TotalBothSem);

			extenttestCase.log(Status.PASS,"Sum of Both Semester Students Verified Successfully");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Both Semester Students Doesn't Matched");

		}
		
		System.out.println("*********************************************************");
		
		
		VerifyFirstRow();
		VerifySecondRow();
		VerifyThirdRow();
		
		driver.navigate().refresh();
	}
	
	@Test(priority = 10)
	public void SelectGoa() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Select Goa Campus");
		Thread.sleep(2000);
		AllStudent_Allot_List_Page_Objects.SearchSelect.sendKeys(getExcelData("AllAllotStudentList", 3, 0));
		Thread.sleep(2000);
		
		String LabelSem1 =AllStudent_Allot_List_Page_Objects.LabelSem1.getText();
		String value = LabelSem1.substring(30);
		int totalsem1 = Integer.parseInt(value);
		System.out.println(totalsem1);
		
		String Row12 = AllStudent_Allot_List_Page_Objects.Row12.getText();
		int IntRow12 = Integer.parseInt(Row12);
		System.out.println(IntRow12);
		Thread.sleep(1000);
		
		String Row22 = AllStudent_Allot_List_Page_Objects.Row22.getText();
		int IntRow22 = Integer.parseInt(Row22);
		System.out.println(IntRow22);
		
		int TotalSemI = (IntRow12+IntRow22);
		System.out.println(TotalSemI);
		Thread.sleep(1000);
		
		extenttestCase.log(Status.PASS,"Fetched Semester I Student Counts From Grid Successfully");
		
		try{
			Assert.assertEquals(totalsem1, TotalSemI);

			extenttestCase.log(Status.PASS,"Sum of Semester I Students Verified Successfully");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Semester I Students Doesn't Matched");

		}
		
		System.out.println("*********************************************************");
		
		String LabelSem2 =AllStudent_Allot_List_Page_Objects.LabelSem2.getText();
		String value1 = LabelSem2.substring(31);
		int totalsem2 = Integer.parseInt(value1);
		System.out.println(totalsem2);
		
		String Row13 = AllStudent_Allot_List_Page_Objects.Row13.getText();
		int IntRow13 = Integer.parseInt(Row13);
		System.out.println(IntRow13);
		Thread.sleep(1000);
		
		String Row23 = AllStudent_Allot_List_Page_Objects.Row23.getText();
		int IntRow23 = Integer.parseInt(Row23);
		System.out.println(IntRow23);
		Thread.sleep(1000);
		
		int TotalSemII = (IntRow13+IntRow23);
		System.out.println(TotalSemII);
		Thread.sleep(1000);
		
		extenttestCase.log(Status.PASS,"Fetched Semester II Student Counts From Grid Successfully");
		
		try{
			Assert.assertEquals(totalsem2, TotalSemII);

			extenttestCase.log(Status.PASS,"Sum of Semester II Students Verified Successfully");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Semester II Students Doesn't Matched");

		}
		
		System.out.println("*********************************************************");
		
		String LabelSemboth =AllStudent_Allot_List_Page_Objects.LabelSemboth.getText();
		String value2 = LabelSemboth.substring(33);
		int totalboth = Integer.parseInt(value2);
		System.out.println(totalboth);
		
		String Row14 = AllStudent_Allot_List_Page_Objects.Row14.getText();
		int IntRow14 = Integer.parseInt(Row14);
		System.out.println(IntRow14);
		Thread.sleep(1000);
		
		String Row24 = AllStudent_Allot_List_Page_Objects.Row24.getText();
		int IntRow24 = Integer.parseInt(Row24);
		System.out.println(IntRow24);
		Thread.sleep(1000);
		
		int TotalBothSem = (IntRow14+IntRow24);
		System.out.println(TotalBothSem);
		Thread.sleep(1000);
		
		extenttestCase.log(Status.PASS,"Fetched Both Semester Student Counts From Grid Successfully");
		
		try{
			Assert.assertEquals(totalboth, TotalBothSem);

			extenttestCase.log(Status.PASS,"Sum of Both Semester Students Verified Successfully");

		}

		catch(Throwable e)
		{   
			extenttestCase.log(Status.INFO,"Sum of Both Semester Students Doesn't Matched");

		}
		
		System.out.println("*********************************************************");
	
		VerifyFirstRow();
		VerifySecondRow();
		
		driver.navigate().refresh();
	}
}
