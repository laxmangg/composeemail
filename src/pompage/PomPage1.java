package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PomPage1 {
	// declaration of elements
	WebDriver driver;

	@FindBy(id = "mobile")
	WebElement username;
	@FindBy(id = "inputPassword")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement lgbtn;
	// Initialization of elements
	/*
	 * public void pagefactory(WebDriver driver) { PageFactory.initElements(driver,
	 * this); }
	 */

	// utilization of elements
	public void setUsername(String un) throws InterruptedException {
		System.out.println(un);

		username.sendKeys(un);
		Thread.sleep(3000);

	}

	public void setPassword(String pwd) throws InterruptedException

	{
		System.out.println(pwd);
		password.sendKeys(pwd);
		Thread.sleep(3000);

	}

	public void loginbtn() throws InterruptedException {
		System.out.println("login");
		lgbtn.click();
		Thread.sleep(3000);

	}

}
