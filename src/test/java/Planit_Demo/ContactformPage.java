package Planit_Demo;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import selectors.ContactformLocators;

public class ContactformPage {
	
	private WebDriver driver;
    private WebDriverWait wait;

    public ContactformPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15,100);
    }
    @FindBy(how = How.ID,using = ContactformLocators.Name)
    WebElement Fname;
    @FindBy(how = How.ID,using = ContactformLocators.surname)
    WebElement Sename;
    @FindBy(how = How.ID,using = ContactformLocators.mailId)
    WebElement Emailid;
    @FindBy(how = How.XPATH,using = ContactformLocators.phoneNo)
    WebElement Phonenumber;
    @FindBy(how = How.XPATH,using = ContactformLocators.message)
    WebElement messge;
    @FindBy(how = How.XPATH,using = ContactformLocators.submitbutton)
    WebElement submit;
    @FindBy(how = How.XPATH,using = ContactformLocators.confirmationpageTitle)
    WebElement titleinfor;
    
    public ContactformPage checkoutAsGuestAndPlaceOrder(){
        checkoutGuest("Syed", "Selenium", "Syed@Selenium.com", "0233334545",
                "NYC");
        return this;
    }
    public ContactformPage clickevent(){
        wait.until(ExpectedConditions.visibilityOf(submit));
        assertEquals(titleinfor.getText().toLowerCase(), "We welcome your feedback");
        return this;
    }

	public void checkoutGuest(String Firstname, String Secondname, String Email,
			String phonentt, String messages1) {
		// TODO Auto-generated method stub
		
		 
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
	}
    

}



