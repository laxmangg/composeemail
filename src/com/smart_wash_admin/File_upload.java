package com.smart_wash_admin;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class File_upload {
	 static
	 {
		 System.setProperty("webdriver.chrome.drivers","./drivers/chromedriver.exe");
		
		// System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	 }

	   public static void main(String[] args) throws InterruptedException {
		      // WebDriver driver = new FirefoxDriver();
		                       WebDriver driver = new ChromeDriver();
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
				for(int i=1;i<1000;i++)
				{
				driver.findElement(By.xpath("(//a[@class='nav-link'])[2]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.id("category_name")).sendKeys("grocery");
		        Thread.sleep(3000);
		        
		       WebElement upload = driver.findElement(By.id("image_path"));
		         upload.sendKeys("C:\\Users\\bheemesh\\Downloads");
		         Thread.sleep(3000);
		         driver.findElement(By.xpath("//button[@type='submit']")).click();
		         driver.findElement(By.id("1")).click();
		         Thread.sleep(3000);
		        
		         
		         driver.findElement(By.id("submitButton")).click();
		         Thread.sleep(3000);
		        driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
				}
				 System.out.println("upto sixth loop printed");
		        
		        
		     
		       
		      
		      
	

	}

}
