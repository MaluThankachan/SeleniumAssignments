package assignemntIDlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		WebElement entermessage = driver.findElement(By.id("single-input-field"));
		entermessage.sendKeys("malu123");
		WebElement showbuttonclick = driver.findElement(By.id("button-one"));
		showbuttonclick.click();
	
	}

}
