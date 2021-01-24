package abp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabs {
	static {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

	}
	

	public static void main(String[] args) throws AWTException {
		   WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.get("http://www.google.com");

		 //Use robot class to press Ctrl+t keys    		
		 Robot robot = new Robot();                          
		 robot.keyPress(KeyEvent.VK_CONTROL); 
		 robot.keyPress(KeyEvent.VK_T); 
		 robot.keyRelease(KeyEvent.VK_CONTROL); 
		 robot.keyRelease(KeyEvent.VK_T);

		 //Switch focus to new tab
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(2)).getCurrentUrl();

		 //Launch URL in the new tab
		 driver.get("http://google.com");


	}

}
