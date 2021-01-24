package abp;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HowToFetchAllLinks {
	static {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

	}
	
	
		
		public static void main(String[] args){
			WebDriver driver = new FirefoxDriver();
			
			//Launching sample website
			driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
			driver.manage().window().maximize();
			
			//Get list of web-elements with tagName  - a
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			 int counts = allLinks.size();
			  System.out.println(counts);
			
			//Traversing through the list and printing its text along with link address
			for(WebElement link:allLinks){
				System.out.println(link.getText() + " - " + link.getAttribute("href"));
			}
			
			//Commenting driver.quit() for user to verify the links printed
			//driver.quit();
		}	
		
	}
	


