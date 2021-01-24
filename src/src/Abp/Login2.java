package src.Abp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2 {
	 static
	 {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		 
	 }
	  public static void main(String[]args)throws InterruptedException
	  {
		  WebDriver  driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://localhost/login.do");
	 	  WebElement unTB = driver.findElement(By.id("username"));
	 	  Thread.sleep(1000);
	 	  unTB.sendKeys("laxman");
	 	  
	 	  WebElement pwTB = driver.findElement(By.name("pwd"));
	 	  Thread.sleep(1000);
	 	  pwTB.sendKeys("beveari",Keys.ENTER);
	 	  
      }

	
		
	}
