package assignmentCSSLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorById {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		WebElement entermessage = driver.findElement(By.cssSelector("#single-input-field"));
		entermessage.sendKeys("TestData");
		WebElement showButton = driver.findElement(By.cssSelector("#button-one"));
		showButton.click();


	}

}
