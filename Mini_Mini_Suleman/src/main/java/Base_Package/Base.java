package Base_Package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Base {
	 
    public  static WebDriver driver;
    public  static Properties prop;
    
         public Base() throws IOException{

    }
  
    public static void initialization(){
    
    	
    	 System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
         driver= new ChromeDriver();
  
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);  
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  driver.get(prop.getProperty("url"));
        driver.get("https://demo.guru99.com/V4");

    }


}
