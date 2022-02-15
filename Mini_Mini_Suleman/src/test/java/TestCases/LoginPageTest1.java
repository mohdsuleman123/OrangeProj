package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Package.Base;
import PageLayer.HomePage;
import PageLayer.LoginPageNew;

public class LoginPageTest1 extends Base {

	public LoginPageNew lp;
    HomePage homePage;
    //Step 1
    public LoginPageTest1() throws IOException {
        super();

    }
    //Step2

    @BeforeMethod
    public void SSSetUp() throws IOException {
        /*
         * Setting up browser and website to execute test scripts
         */
        initialization();
        /*
         * To access all login elements and actions we made an object of LoginPageNew
         * class
         */
        lp=new LoginPageNew();   
    }
    @Test
    public void validateLoginnnn() throws IOException
    {    

    	lp.login22("mngr385749", "rEsybuh");
    }
	
}
