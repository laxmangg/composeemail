package abp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ActualTitle {
	static {
		// System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

	}

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://50.63.13.165:8080/trucom/user/home");
		String expectedtitle = "Admin";
		String Actualtitle = driver.getTitle();
		
		System.out.println(Actualtitle);
		if (Actualtitle.contentEquals(expectedtitle)) {
			System.out.println("test is passed");
		} else {

			System.out.println("test is failed");
		}

	}
}
