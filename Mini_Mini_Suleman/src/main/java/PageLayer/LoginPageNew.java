package PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Package.Base;

public class LoginPageNew extends Base
{
    @FindBy(xpath ="//input[@name='uid']")
    WebElement username;
	
    @FindBy(xpath ="//input[@name='password']")
    WebElement pass;
	
    @FindBy(xpath ="//input[@name='btnLogin']")
    WebElement button;
    
    
    
  //Initializing the Page Objects:
  public LoginPageNew() throws IOException {
  PageFactory.initElements(driver, this);
  
  }

  
  
//Action - validate Login and action on Elements
  public HomePage login22(String un, String pwd) throws IOException{
      /*
       * Performing actions on identified objects
       */
      username.sendKeys(un);
      pass.sendKeys(pwd);
     // LocationChoose.click();
      button.click();
	return new HomePage();

  }
}
