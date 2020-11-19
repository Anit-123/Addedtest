package openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class seleniumdriveSampletest {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/muthukumar/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yahoo.com");
	}
	
	

	

}


