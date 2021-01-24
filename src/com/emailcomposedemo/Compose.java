package com.emailcomposedemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compose {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();// launch the browser
		driver.get("https://accounts.google.com/ServiceLogin");// enter the url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		driver.findElement(By.id("identifierId")).sendKeys("laxman10071996@gmail.com");// enter username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click(); //clicking next button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1db14me@058");// enter  the password
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//textarea[@class='vO'])[1]")).sendKeys("laxman123@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='aoT']")).sendKeys("composeissue");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Please find attached file");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\":om\"]")).click();
	}

}
