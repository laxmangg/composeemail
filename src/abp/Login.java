package abp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	static {
		// System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		Thread.sleep(1000);
		driver.get("http://localhost/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		Thread.sleep(1000);
		unTB.sendKeys("admin");

		WebElement pwTB = driver.findElement(By.name("pwd"));
		Thread.sleep(1000);
		pwTB.sendKeys("manager", Keys.ENTER);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Selenium\\MaghasalAdminPanel\\photos.png");
		FileUtils.copyFile(src, des);
		driver.close();

	}

}
