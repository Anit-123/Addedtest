package demoproject.pages.header.inshop;
	

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



import selectors.shopLocators;


public class ShopdisplayPage {
	
		    private WebDriver driver;
		    private WebDriverWait wait;
		    private Actions actions;

		    //Planit page
		    @FindBy(how = How.XPATH,using = shopLocators.home)
		    WebElement home1;
		    @FindBy(how = How.XPATH,using = shopLocators.fluffyBunny)
		    WebElement bunny;
		    @FindBy(how = How.XPATH,using = shopLocators.FunnyCow)
		    WebElement FluCow;
		    @FindBy(how = How.XPATH, using = shopLocators.cartMenu)
		    WebElement cartitems;
		    @FindBy(how = How.XPATH,using = shopLocators.verifyforBunny)
		    WebElement firstitem;
		    @FindBy(how = How.XPATH,using = shopLocators.xx)
		    WebElement fi;
		    @FindBy(how = How.XPATH,using = shopLocators.buyclick)
		    WebElement buy1;
		    @FindBy(how = How.XPATH,using = shopLocators.shopMenu)
		    WebElement shopButton;
		    @FindBy(how = How.XPATH,using = shopLocators.checked1)
		    WebElement F1;
		    @FindBy(how = How.XPATH,using = shopLocators.checked2)
		    WebElement F2;
		    
		    public ShopdisplayPage(WebDriver driver)
		    {
		    	 this.driver = driver;
			        wait = new WebDriverWait(driver,30,1000);

		    }
		    
		
		    public ShopdisplayPage addToys(){
		    	wait.until(ExpectedConditions.elementToBeClickable(home1));
		    	Actions action = new Actions(driver);
		        action.moveToElement(home1).build().perform();
		        JavascriptExecutor jse = (JavascriptExecutor)driver;
		    	jse.executeScript("arguments[0].click()", home1);
				System.out.println("#####");
		    	//home1.sendKeys(Keys.ENTER);
		    	wait.until(ExpectedConditions.elementToBeClickable(shopButton));
		    	JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		    	jse1.executeScript("arguments[0].click()", shopButton);
		    	wait.until(ExpectedConditions.visibilityOf(buy1));
		        buy1.click();
		        return PageFactory.initElements(driver, ShopdisplayPage.class);
		    }

		    public ShopdisplayPage addtocartcow(){
		    	wait.until(ExpectedConditions.elementToBeClickable(FluCow));
		    	Actions action = new Actions(driver);
		        action.moveToElement(FluCow).build().perform();
		        JavascriptExecutor jse = (JavascriptExecutor)driver;
		    	jse.executeScript("arguments[0].click()", FluCow);
		    	wait.until(ExpectedConditions.elementToBeClickable(fi));
		    	  //fi.click();
		    	  System.out.println("cow added");
		     //assertEquals(titleinfor.getText().toLowerCase(), "We welcome your feedback");
		        return PageFactory.initElements(driver, ShopdisplayPage.class);
		    } 
		    public ShopdisplayPage addtocartbunny(){
		    	wait.until(ExpectedConditions.elementToBeClickable(bunny));
		    	Actions action = new Actions(driver);
		        action.moveToElement(bunny).build().perform();
		    	  
		    	bunny.click();
		    	
		    	System.out.println("bunny added");
		        return PageFactory.initElements(driver, ShopdisplayPage.class);
		    } 
		    public ShopdisplayPage gotoCart(){
		    	wait.until(ExpectedConditions.elementToBeClickable(cartitems));
		    	Actions action = new Actions(driver);
		        action.moveToElement(cartitems).build().perform();
		        cartitems.click();
		        return PageFactory.initElements(driver, ShopdisplayPage.class);
		        
		    } 
		    public ShopdisplayPage gotoverify(){
		    	
		    	wait.until(ExpectedConditions.visibilityOf(F1));
		    	wait.until(ExpectedConditions.visibilityOf(F2));
		    	String bunny1=F1.getText();
		    	Assert.assertTrue(bunny1.contains("Fluffy Bunny")," string vlaues match");
		    	String cow=F2.getText();
		    	Assert.assertTrue(cow.contains("$9.99")," string vlaues match");
		       return PageFactory.initElements(driver, ShopdisplayPage.class);
		        
		    } 
		    
		    
		
}




