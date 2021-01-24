package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddInventary {
	static {
		System.setProperty("webdriver.chrome.driver","C:/Selenium/Selenium Tool1/drivers/chromedriver.exe");

		System.setProperty("webdriver.gecko.drivers","C:\\Selenium\\Selenium Tool1/drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://50.63.13.165:8080/trucom/login");
		Thread.sleep(4000);
		driver.findElement(By.id("mobile")).sendKeys("8867752286");
		Thread.sleep(4000);
		driver.findElement(By.id("inputPassword")).sendKeys("12345678");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.navigate().to("http://192.168.1.100:8080/trucom/user/add-product");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@class,'nav-link active')]")).click();
		Thread.sleep(6000);
		WebElement t2 = driver.findElement(By.id("product_name"));
		t2.sendKeys("shoese");
		System.out.println(t2);
		Thread.sleep(4000);
		WebElement t3 = driver.findElement(By.xpath("//input[@id='product_brand']"));
		t3.sendKeys("nike");
		System.out.println(t3);
		Thread.sleep(2000);
		WebElement t4 = driver.findElement(By.xpath("//input[@id='product_mrp']"));
		t4.sendKeys("100.0");
		System.out.println(t4);
		Thread.sleep(2000);
		WebElement t5 = driver.findElement(By.xpath("//input[@id='product_sku']"));
		t5.sendKeys("1234");
		Thread.sleep(2000);
		WebElement t6 = driver.findElement(By.xpath("//input[@id='product_hsn']"));
		t6.sendKeys("2354");
		System.out.println(t6);
		Thread.sleep(2000);
		WebElement t7 = driver.findElement(By.xpath("//textarea[@id='productDescription']"));
		t7.sendKeys("it is use to wearing purpose");
		System.out.println(t7);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='product_usage']")).sendKeys("it  is the waterproof shoese");
		Thread.sleep(5000);
		WebElement st = driver.findElement(By.id("product_type"));
		Thread.sleep(3000);
		Select st1 = new Select(st);
		System.out.println(st1.isMultiple());
		st1.selectByIndex(2);
		Thread.sleep(3000);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='product_attribute']")).sendKeys("200");
		driver.findElement(By.xpath("//button[contains(text(),'Add Attribute')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='model_num']")).sendKeys("ka1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("product is good");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(text(),'Add Product')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link active']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='shipping_charges']")).sendKeys("20");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='cost_price']")).sendKeys("23");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='lim_qty']")).sendKeys("30");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='qty_at_disc']")).sendKeys("20");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='gst']")).sendKeys("21");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("inventary is added");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-md']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Add Product Image')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='product_image_path1']"))
				.sendKeys("C:\\Users\\bheemesh\\Desktop\\nature.jpg");

	}

}
