package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonConditions {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
//		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");// - for right click use this url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.partialLinkText("Conditions of Use"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(element).perform();
		System.out.println(element.getText());
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./Snapshots/amazonCond.png");
	FileUtils.copyFile(source, target);	
	}
}
