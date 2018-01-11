package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import common.common2;

public class homepage extends common2 {
	
	  private WebDriver driver;
   
	  @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/div/div[1]/a[1]/u")
      private WebElement logyourselflink;
     
      @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/div[2]/div/form/table/tbody/tr[1]/td[2]/input")
      private WebElement email;
      
      @FindBy(how = How.NAME, using = "password")
      private WebElement PWD;
      
      @FindBy(how = How.XPATH, using = "//*[@id='tdb5']")
      private WebElement signinbutton;
      
      @FindBy(how = How.XPATH, using = "//*[@id='tdb4']/span")
      private WebElement logoffbutton;
      
     
      
      
      
   public homepage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
      
    
	public void Login(String UserName, String sPassWord)
	{
		click(logyourselflink);
	     Sendusername(email,UserName);
	     sendpassword(PWD, sPassWord);
	    clickon(signinbutton);
	    clicklogoff(logoffbutton);
	}
	
	



}