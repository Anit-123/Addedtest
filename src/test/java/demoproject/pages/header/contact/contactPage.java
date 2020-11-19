package demoproject.pages.header.contact;

import demoproject.pages.header.inconduct.*;
import demoproject.pages.header.inshop.ShopdisplayPage;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;


//import com.syed.madison_island.pages.header.men.MenPage;

import selectors.ContactformLocators;
import selectors.addToPageLocators;
import selectors.shopLocators;

public class contactPage {
	
		private WebDriver driver;
	    private WebDriverWait wait;
	    private Actions action;
        
	    @FindBy(how = How.XPATH,using = addToPageLocators.Contact)
	    WebElement cont;
	    
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
	    @FindBy(how = How.XPATH,using = ContactformLocators.Titledisplay)
	    WebElement titleshow;
	    @FindBy(how = How.XPATH,using = ContactformLocators.backbutton)
	    WebElement backpress;
	    @FindBy(how = How.XPATH,using = shopLocators.shopMenu)
	    WebElement shopButton;
	    @FindBy(how = How.XPATH,using = ContactformLocators.alertmsg)
	    WebElement alertmsgapp;
	    @FindBy(how = How.XPATH,using = ContactformLocators.sucessmsg)
	    WebElement sucessmsg;
	    
	    
	    public contactPage(WebDriver driver){
	        this.driver = driver;
	        wait = new WebDriverWait(driver,30,1000);
	    }
	    
	    public contactformpage gotocontactform() {
	    	
	    	
	    	wait.until(ExpectedConditions.visibilityOf(cont));
	    	Actions action = new Actions(driver);
	       action.moveToElement(cont).build().perform();
	        wait.until(ExpectedConditions.elementToBeClickable(cont));
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()", cont);
		   return PageFactory.initElements(driver, contactformpage.class);
	    }
	    
          public ShopdisplayPage gotoshopToys() {
	    	
	    	wait.until(ExpectedConditions.visibilityOf(shopButton));
	        wait.until(ExpectedConditions.elementToBeClickable(shopButton));
	        shopButton.click();
	        return PageFactory.initElements(driver, ShopdisplayPage.class);
	    }
	    
	    public contactPage gotofillattribute()
	    {
	    	wait.until(ExpectedConditions.elementToBeClickable(Fname));
	        //menPageLink.click();
	        wait.until(ExpectedConditions.titleIs("Jupiter Toys"));
	        return PageFactory.initElements(driver, contactPage.class);
	    }
	    public contactformpage backflip(){
	        wait.until(ExpectedConditions.visibilityOf(backpress));
	        Actions action = new Actions(driver);
	        action.moveToElement(backpress).build().perform();
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()", backpress);
	        //assertEquals(titleinfor.getText().toLowerCase(), "We welcome your feedback");
	        return PageFactory.initElements(driver, contactformpage.class);
	    }
	}




