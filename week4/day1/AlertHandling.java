package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::button")).click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("Test message");
		al.accept();
		System.out.println(driver.findElement(By.id("confirm_result")).getText());
		driver.close();
		
	}
}
