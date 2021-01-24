package abp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LOGIN3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement textuser = driver.findElement(By.id("email"));
		Thread.sleep(4000);
		Actions builder = new Actions(driver);
		Thread.sleep(3000);
		Action SeriesofOperations = builder.moveToElement(textuser).click().keyUp(textuser, Keys.SHIFT)
				.sendKeys(textuser, "HELLO").keyDown(textuser, Keys.SHIFT).doubleClick(textuser).contextClick().build();
		Thread.sleep(30000);
		SeriesofOperations.perform();
		WebElement password1 = driver.findElement(By.id("pass"));
		Actions builder1 = new Actions(driver);
		Action series2 = builder1.moveToElement(password1).click().keyDown(password1, Keys.SHIFT)
				.sendKeys(password1, "HELLO").doubleClick().contextClick().build();
		series2.perform();
		driver.findElement(By.id("u_0_m")).sendKeys("laxman");
		driver.findElement(By.id("u_0_o")).sendKeys("G");
		driver.findElement(By.id("u_0_r")).sendKeys("8150043721");
		driver.findElement(By.id("u_0_y")).sendKeys("12345678");
		WebElement calendor = driver.findElement(By.id("day"));
		Select items = new Select(calendor);
		items.selectByIndex(6);
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("month"))).selectByIndex(7);
		Thread.sleep(3000);

		new Select(driver.findElement(By.id("year"))).selectByIndex(24);
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("login successfully");
		Thread.sleep(3000);
		driver.navigate().to("https://demoqa.com/droppable/");
		Thread.sleep(3000);
		WebElement from = driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		WebElement to = driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(from, to).build().perform();
		System.out.println("dropped successfully");

	}

}
