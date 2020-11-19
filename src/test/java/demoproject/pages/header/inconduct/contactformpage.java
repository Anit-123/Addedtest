package demoproject.pages.header.inconduct;


	import static org.testng.Assert.assertEquals;

import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import demoproject.pages.header.contact.contactPage;
import selectors.ContactformLocators;

	

	
		public class contactformpage {
			
		private WebDriver driver;
	    private WebDriverWait wait;

	    public contactformpage(WebDriver driver){
	        this.driver = driver;
	        wait = new WebDriverWait(driver,30,1000);
	    }
	    @FindBy(how = How.XPATH,using = ContactformLocators.Name)
	    WebElement Fname;
	    @FindBy(how = How.XPATH,using = ContactformLocators.surname)
	    WebElement Sename;
	    @FindBy(how = How.XPATH,using = ContactformLocators.mailId)
	    WebElement Emailid;
	    @FindBy(how = How.XPATH,using = ContactformLocators.phoneNo)
	    WebElement Phonenumber;
	    @FindBy(how = How.XPATH,using = ContactformLocators.message)
	    WebElement messge;
	    @FindBy(how = How.XPATH,using = ContactformLocators.submitbutton)
	    WebElement submit;
	    @FindBy(how = How.XPATH,using = ContactformLocators.confirmationpageTitle)
	    WebElement titleinfor;
	    @FindBy(how = How.XPATH,using = ContactformLocators.backbutton)
	    WebElement backpress;
	    @FindBy(how = How.XPATH,using = ContactformLocators.alertmsg)
	    String alertmsgapp;
	    @FindBy(how = How.XPATH,using = ContactformLocators.sucessmsg)
	    String sucessmsg;
	    
	    
	    
   
	    public contactformpage clickevent(){
	       wait.until(ExpectedConditions.visibilityOf(submit));
	    	
	        Actions action = new Actions(driver);
	        action.moveToElement(submit).build().perform();
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
  			jse.executeScript("arguments[0].click()", submit);
	        System.out.println("alert");
	        //assertEquals(titleinfor.getText().toLowerCase(), "We welcome your feedback");
	        return PageFactory.initElements(driver, contactformpage.class);
	    }
	    
	    public contactPage backflip(){
	        wait.until(ExpectedConditions.visibilityOf(backpress));
	        
	        Actions action = new Actions(driver);
	        action.moveToElement(submit).build().perform();
	        backpress.click();
	        //assertEquals(titleinfor.getText().toLowerCase(), "We welcome your feedback");
	        return PageFactory.initElements(driver, contactPage.class);
	    }
	     public contactformpage fillform()
	     {
              fillformWithdetails("Fina", "Selenium", "Fina@Selenium.com", "0233334545",
                "NYC");
        return PageFactory.initElements(driver, contactformpage.class);
          } 
	     public contactPage invalidfillform()
	     {
              fillformWithdetails("1234", "3455", "1234Selenium.com", "abcd",
                "fillinuppercase");
        return PageFactory.initElements(driver, contactPage.class);
          } 

		public void fillformWithdetails(String Firstname, String Secondname, String Email,
				String phonentt, String messages1) {
			// TODO Auto-generated method stub
			
		    System.out.println("##################################");
		       
		        //Do the required operation
		        wait.until(ExpectedConditions.elementToBeClickable(Fname));
		        Fname.clear();
		        Fname.sendKeys(Firstname);
		        
		        Sename.clear();
		        Sename.sendKeys(Secondname);
		        wait.until(ExpectedConditions.visibilityOf(Emailid));
		        Emailid.clear();
		        Emailid.sendKeys(Email);
		        Phonenumber.clear();
		        Phonenumber.sendKeys(phonentt);
		        messge.clear();
		        messge.sendKeys(messages1);
		        submit.click();
		        
		        String actualText = alertmsgapp;
		        String ExpectedText = "We welcome your feedback - but we won't get it unless you complete the form correctly.";
		       // Boolean verifyTitle = alertmsgapp.equalsIgnoreCase("We welcome your feedback - tell it how it is.");
		        
		        SoftAssert assertion = new SoftAssert();
		        assertion.assertEquals(actualText,ExpectedText );
		        System.out.println("##################################");
				//assertion.assertAll();		
	           String ExpectedText1 = "We welcome your feedback - tell it how it is.";
			       // Boolean verifyTitle = alertmsgapp.equalsIgnoreCase("We welcome your feedback - tell it how it is.");
			  assertion.assertEquals(actualText,ExpectedText1 );
			  System.out.println("Message verified##################################");
					//assertion.assertAll();
					
			        
		           
		        /*String text= alertmsgapp;
		        if (text.contains("We are Welcome"))
		        { 
		            System.out.println("Successfully completed");
		        }else{
		            System.out.println("Please enter all details");
		        }   */   

		      
		} 
		public contactformpage msgconfirmed(){
	       // wait.until(ExpectedConditions.visibilityOf(sucessmsg));
			String text= sucessmsg;
	        if (text.contains("Thanks"))
	        { 
	            System.out.println("Successfully completed");
	        }else{
	            System.out.println("Please enter all details");
	        } 
			//SoftAssert assertion = new SoftAssert();
	        //assertion.assertEquals(sucessmsg, " Thanks " + Fname + ", we appreciate your feedback.");
	        return PageFactory.initElements(driver, contactformpage.class);
	    }
	    
		public contactPage validatestate()
	     {
			String actualText = alertmsgapp;
	        String ExpectedText = "We welcome your feedback - but we won't get it unless you complete the form correctly.";
	       // Boolean verifyTitle = alertmsgapp.equalsIgnoreCase("We welcome your feedback - tell it how it is.");
	        
	        SoftAssert assertion = new SoftAssert();
	        assertion.assertEquals(actualText,ExpectedText );
	        System.out.println("##################################");
			assertion.assertAll();
	        
            return PageFactory.initElements(driver, contactPage.class);
         } 
		


	}






