package com.smart_wash_admin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class File_download {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		 new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("http://50.63.13.165:8080/trucom/login");
		driver.findElement(By.id("mobile")).sendKeys("8867752286");
		Thread.sleep(3000);
		driver.findElement(By.id("inputPassword")).sendKeys("12345678");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'Orders')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr[1]//td[9]")).click();
		Thread.sleep(3000);
		Actions build1 = new Actions(driver);
		Thread.sleep(3000);
		WebElement image = driver.findElement(By.xpath("//img[contains(@class,'rounded-circle')]"));
		build1.moveToElement(image).contextClick().build().perform();
		driver.findElement(By.xpath("//button[contains(text(),'Generate Invoice')]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 4; i++) {
			js.executeScript("window.scrollBy(0,250)");
			System.out.println("page is scrolled");
			js.executeScript("window.scrollBy(0,-200)");
			System.out.println("scroll upped");
			System.out.print("Iis the successsfully scrolled");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Download Invoice')]")).click();
		TakesScreenshot srs = (TakesScreenshot) driver;
		File srcfile = srs.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Selenium\\Selenium Tool1\\photos.png");
		FileUtils.copyFile(srcfile, des);
	}

}
