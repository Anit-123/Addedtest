package Planit_Demo;


	

	import com.syed.madison_island.pages1.Homepage;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;

	import selectors.addToPageLocators;


	public class demopageLanding {
		
		
		

		    private WebDriver driver;
		    private WebDriverWait wait;
		    private Actions actions;

		    //Plan page
		    @FindBy(how = How.XPATH,using = addToPageLocators.Contact)
		    WebElement PageLink;
		    @FindBy(how = How.XPATH,using = addToPageLocators.Clickbutton)
		    WebElement click;
		    @FindBy(how = How.XPATH, using = addToPageLocators.ShopMenu)
		    WebElement shopbutton;
		    @FindBy(how = How.XPATH,using = addToPageLocators.Addtocart)
		    WebElement AddonC;
		    
		   
		    public demopageLanding(WebDriver driver){
		        this.driver = driver;
		        wait = new WebDriverWait(driver,45,3000);
		        
		        actions = new Actions(driver);
		        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		        

		    }

		    
		    
		    // Returns pages in the Women Sections
		    public Homepage goTohomePage(){
		        wait.until(ExpectedConditions.elementToBeClickable(PageLink));
		        PageLink.click();
		        wait.until(ExpectedConditions.titleIs("We welcome your feedback - tell it how it is."));
		        return PageFactory.initElements(driver,Homepage.class);
		    }
		    public ContactformPage goTocontactPage(){
		        wait.until(ExpectedConditions.visibilityOf(PageLink));
		        actions.moveToElement(PageLink).build().perform();
		      /*  wait.until(ExpectedConditions.elementToBeClickable(blazers));
		        blazers.click();
		        wait.until(ExpectedConditions.titleIs("Blazers - Men")); */
		        return PageFactory.initElements(driver, ContactformPage.class); 
		    }
		

	}


