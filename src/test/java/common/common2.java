package common;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class common2 {

	  public WebDriver driver;
	  public  Logger logger= Logger.getLogger(common2.class);
	  //public ReadExl obj=new ReadExl();
	  /*
	  ReadExl object=new ReadExl();
		String fname=object.sendfirstname();
		String lname=object.sendlastname();
		String sendstate=object.sendstate();
	    String sendcity=object.sendcity();
	    String fon=object.sendphone();
	    String pass=object.sendPwd();
	    String cpass=object.sendPwd();
	    String dob=object.sendDOB();
	    String email=object.sendemail();
	    String cntry=object.sendcountry();
	    String pcode=object.sendpostcode();
	    String gnder=object.gender();
	  String sendstreet=object.sendstreet();
	  */
	   public WebDriver OpenBrowser(String sBrowserType)  {
		   
		  // readProperty read=new readProperty();
			 // String getBrowserType = read.datapass("BrowserType");
			  
		   if(sBrowserType.equalsIgnoreCase("Firefox")) {
			    System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\driver\\geckodriver.exe");
			    logger.info("opening browser");
				  driver = new FirefoxDriver();
			}else if(sBrowserType.equalsIgnoreCase("Chrome")){
				 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
				    logger.info("opening browser");
					  driver = new ChromeDriver();
			}
			else if(sBrowserType.equalsIgnoreCase("InternetExplorer")){
				 System.setProperty("webdriver.ie.driver", "C:\\Selenium\\driver\\IEDriverServer.exe");
				    logger.info("opening browser");
					  driver = new InternetExplorerDriver();
			}
		   else {
			   logger.info("No browser Selected");
				}
				
			//String getUrl= read.datapass("URL");
				//  driver.get(getUrl);       //"http://107.170.213.234/catalog/"  is url given in config.properties and calling from readProperties.java
			//    System.out.println("opened oscommerce");
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    return driver;
			    
			    
			  }
		 
	  
	   
	   
	   public void Openurl()
	   {
	
		  driver.get("http://107.170.213.234/catalog/");
		  logger.info("opened oscommerce");
		
	   
	      }
	 
		
		  public void closeBrowser() 
		{
		    driver.quit();
		}
		  
		  public void click(WebElement selement)
		  {
			  try
			  {
				 selement.click();
				 logger.info(selement+ "clicked ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  
		  public void Sendusername(WebElement email , String username) {
			  try {
				  email.sendKeys(username);
				  logger.info(username+ "entered ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  public void sendpassword(WebElement PWD , String spassword) {
			  try {
				  PWD.sendKeys(spassword);
				  logger.info(spassword+ "entered ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  
		  public void clickon(WebElement signinbutton)
		  {
			  try
			  {
				  signinbutton.click();
				 logger.info(signinbutton+ "clicked ");
			  }
			  catch(Exception e){
				  Assert.fail();
			  }	  

}
		  public void clicklogoff(WebElement logoffbutton)
		  {
			  try
			  {
				  logoffbutton.click();
				 logger.info(logoffbutton+ "clicked ");
			  }
			  catch(Exception e){
				  Assert.fail();
			  }	  

}
		
}
