package com.email;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailLogin {
	static {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 }

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.get("https://accounts.google.com/signin");
		   
		   driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Laxman10071996@gmail.com");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1db14me058");
		   driver.close();
		   //pom pattern testng data driver framework bdd cucumber gherkin
		     
		   
		
	
	}        

}
