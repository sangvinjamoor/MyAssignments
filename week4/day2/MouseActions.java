package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ajio.com/");
		
//		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");// - for right click use this url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.linkText("MEN"));
		Actions builder = new Actions(driver);
		builder.moveToElement(element).perform();
		
	
		
	}
}
