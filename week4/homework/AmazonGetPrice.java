package week4.homework;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonGetPrice {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String price = driver.findElement(By.className("a-price-whole")).getText();
		System.out.println("Price " +price);
//		WebElement element = driver.findElement(By.xpath("//a[@class='a-popover-trigger a-declarative']"));
////		WebElement element = driver.findElement(By.xpath("//span[@class='a-icon-alt'][1]"));
//		
//		Actions builder = new Actions(driver);
//		builder.moveToElement(element).perform();
//		Thread.sleep(8000);
//	
//		String ratings = driver.findElement(By.xpath("//span[contains(@class,'totalRatingCount')]")).getText();
//		System.out.println(ratings);
		driver.findElement(By.xpath("//div[contains(@class,'s-title-instructions-style')][1]//a")).click();
		Thread.sleep(5000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./Snapshots/amazonProduct.png");
		FileUtils.copyFile(source, target);
		
		Set<String> handles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(handles);
		driver.switchTo().window(windows.get(1));
		
		Thread.sleep(6000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(driver.findElement(By.id("add-to-cart-button"))).perform();
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		String priceCart = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println(priceCart);
		if(priceCart.contains(price))
			System.out.println("Price same");
		driver.close();
		driver.switchTo().window(windows.get(0));
		driver.close();
	}

}
