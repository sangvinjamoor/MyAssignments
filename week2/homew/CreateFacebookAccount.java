package week2.homew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.partialLinkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("DemoFirst");
		driver.findElement(By.name("lastname")).sendKeys("DemoLast");
		driver.findElement(By.xpath("//div[contains(text(),'Mobile')]/following-sibling::input")).sendKeys("1234567889");
		driver.findElement(By.id("password_step_input")).sendKeys("pass123$$");
		
		WebElement day = driver.findElement(By.id("day"));
		Select selDay = new Select(day);
		selDay.selectByValue("7");
		
		WebElement month = driver.findElement(By.id("month"));
		Select selMonth = new Select(month);
		selMonth.selectByIndex(2);
		
		WebElement year = driver.findElement(By.id("year"));
		Select selYear = new Select(year);
		selYear.selectByValue("1986");
		
		driver.findElement(By.xpath("//input[@type='radio' and @name='sex' and @value='1']")).click();
		
		driver.close();
	}

}
