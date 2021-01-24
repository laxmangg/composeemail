package com.smart_wash_admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


   
public class AdminUtility {
	
	 public WebDriver utility()
	 {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
  
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.manage().window().maximize();
  
     driver.get("http://18.191.129.95:8080/maghsala/user/onboard-step1");
     return driver;
	 }


}
