package abp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailCommunication {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();// launch the browser
		driver.get("https://pcdev.trucvr.com/enrollment-communication");// enter the url

		driver.manage().window().maximize();// maximize the screen

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Laxman_Z"); // enter the username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Laxman@12345");// enter the passwword

		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Email Communication")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Claims Communication")).click();
		Thread.sleep(3000);
		WebElement st = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		st.sendKeys("HDFC ERGO General Insurance Co. Ltd.");
		st.sendKeys(Keys.ARROW_DOWN);
		st.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[contains(@class,'fa fa-plus add')])[2]")).click();

		WebElement com = driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
		Thread.sleep(3000);
		com.sendKeys("SMS");
		com.sendKeys(Keys.ARROW_DOWN);
		com.sendKeys(Keys.ENTER);
		WebElement con = driver.findElement(By.xpath("(//input[ contains(@type,'text')])[4]"));
		con.sendKeys("Insurer");
		con.sendKeys(Keys.ARROW_DOWN);
		con.sendKeys(Keys.ENTER);

		WebElement mail = driver.findElement(By.xpath("(//input[ contains(@type,'text')])[5]"));
		Thread.sleep(3000);
		mail.sendKeys("Provider");
		mail.sendKeys(Keys.ARROW_DOWN);
		mail.sendKeys(Keys.ENTER);
		WebElement event = driver.findElement(By.xpath("(//input[ contains(@type,'text')])[6]"));

		event.sendKeys("Pre Auth Submit");
		event.sendKeys(Keys.ARROW_DOWN);
		event.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='Enter Subject Line']")).sendKeys("pre-auth submit requist");

		driver.findElement(By.xpath("//input[@placeholder='Enter CC']")).sendKeys("laxman@truecover.net");
		WebElement send = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		Thread.sleep(3000);
		send.sendKeys("testtrueclaim@uhcpindia.com");
		send.sendKeys(Keys.ARROW_DOWN);
		send.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("schedule communication successfully---------");

	}

}
