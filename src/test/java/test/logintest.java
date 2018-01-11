package test;

import java.io.File;
//import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;

import common.ReadExl;
import common.common2;
import pages.homepage;

public class logintest {
	private WebDriver driver;
	public common2 obj1;
	
	public  Logger logger= Logger.getLogger(logintest.class);
	
	@Parameters({ "BrowserType"})
	@BeforeMethod
	public void setUp(String sBrowserType)
	{
	obj1=new common2();
	driver=obj1.OpenBrowser(sBrowserType);
	obj1.Openurl();
	logger.info("first comment");
	
	}
	
	@Test
	public void mainTest()
	{
		   ReadExl object=new ReadExl();
			String name=object.sendUsername();
			String Pwd=object.sendPwd();
		
		homepage obj2=new homepage(driver);
		obj2.Login(name, Pwd);
		
		logger.info("second comment");
		
	}
	
	
	
	@AfterMethod(alwaysRun=true)
	public void screenShot(ITestResult result){
		//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
			if(ITestResult.FAILURE==result.getStatus()){
				try{
					
					TakesScreenshot screenshot=(TakesScreenshot)driver;
					// Call method to capture screenshot
					File src=screenshot.getScreenshotAs(OutputType.FILE);
					// Copy files to specific location 
					// result.getName() will return name of test case so that screenshot name will be same as test case name
					FileUtils.copyFile(src, new File("C:\\Users\\anmol\\eclipse-workspace\\MavenProject1\\screenshot\\"+result.getName()+".png"));
					logger.info("Successfully captured a screenshot");
				}catch (Exception e){
					logger.info("Exception while taking screenshot "+e.getMessage());
				} 
		}
		driver.quit();
		}
	/*
	public void teardown()
	{
		
		//obj1.closeBrowser();
	// Take screenshot and store as a file format
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:\\Users\\anmol\\eclipse-workspace\\MavenProject1\\screenshot\\error.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
}*/
	}
