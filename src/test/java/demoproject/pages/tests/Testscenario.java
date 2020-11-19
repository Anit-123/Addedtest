/**
 * 
 */
/**
 * @author muthukumar
 *
 */
package demoproject.pages.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import demoproject.pages.header.contact.contactPage;
import demoproject.pages.header.inconduct.contactformpage;
import demoproject.pages.header.inshop.ShopdisplayPage;


public class Testscenario {

    private WebDriver driver;
    private contactPage page;
    private ShopdisplayPage page1;

    @BeforeSuite
    public void setUp(){
    	System.setProperty("webdriver.chrome.driver", "/Users/muthukumar/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get(" http://jupiter.cloud.planittesting.com");
        page = PageFactory.initElements(driver,contactPage.class);
        page1 = PageFactory.initElements(driver, ShopdisplayPage.class);
    }
    @Test
    public void conditioncheck(){
         page.gotocontactform()
            .clickevent()
            .fillform();
           } 
  
   @Test void conditioncheck1()
    {
    	page.gotocontactform()
          .fillform()
       .clickevent();
      // .msgconfirmed()
      // .backflip();
       
        
    } 
   @Test
    public void conditioncheck2(){
        page .gotocontactform()
             .invalidfillform();
                 
    } 
    
    @Test
    public void conditioncheck3(){
       
    	page1 .addToys()
    	      .addtocartcow()
    	      .addtocartbunny()
    	      .gotoCart()
    	      .gotoverify();
            
    }        
    
   
   
    @AfterMethod
    public void clearCookies(){
        driver.manage().deleteAllCookies();
    } 
    @AfterSuite
    public void tearDown(){
       driver.close();
    }
}
