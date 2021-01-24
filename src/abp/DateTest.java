package abp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateTest {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// Opening window tab in maximize mode
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Opening application
		driver.get("https://www.airbnb.co.in/");

		// Locate element via ID for Location field and store it in Webelement
		WebElement Location = driver.findElement(By.id("Koan-magic-carpet-koan-search-bar__input"));

		// Input value in Location field
		Location.sendKeys("Delhi", Keys.ENTER);

		// Locate element via ID for Check-in field and store it in Webelement
		WebElement Check_in = driver.findElement(By.id("checkin_input"));

		// Click on Check_in field to select the date
		Check_in.click();

		// Select the desired da
		driver.findElement(By.xpath("//div[@class='_1lds9wb']//tr[1]//td[5]")).click();

		// Locate element via ID for Check-out field and store it in Webelement
		WebElement Check_out = driver.findElement(By.id("checkout_input"));

		// Click on Check_out field to select the date
		Check_out.click();

		// Wait for date selection
		Thread.sleep(3500);

		// Select the desired date
		driver.findElement(By.xpath("//div[@class='_1lds9wb']//tr[1]//td[4]")).click();

		// Locating the submit button and clicking on it
		driver.findElement(By.tagName("button")).click();

		// close the driver
		driver.close();

	}

}
