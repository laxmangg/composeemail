package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Onboard {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.drivers", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://50.63.13.165:8080/trucom/user/onboard-user");
		
		driver.findElement(By.id("mobile")).sendKeys("4400223355");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
