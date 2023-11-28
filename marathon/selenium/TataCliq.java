package marathon.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class TataCliq {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("wzrk-confirm")).click();
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();
		Thread.sleep(3000);
		WebElement watches = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		
		
		builder.moveToElement(watches).perform();
		
		driver.findElement(By.xpath("//div[text()='Featured brands']/following-sibling::div")).click();
		
		WebElement sortBy = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select sortOptions = new Select(sortBy);
		sortOptions.selectByValue("isProductNew");
		driver.findElement(By.xpath("//div[text()='Men']")).click();
		Thread.sleep(5000);
		//Find Prices
		
		List<WebElement> prices = driver.findElements(By.xpath("//div[contains(@class,'ProductDescription__priceHolder')]/h3"));
		String priceFirst = prices.get(0).getText();
		System.out.println(prices.size());
		for(WebElement el:prices) {
			
			System.out.println(el.getText());
		}
		//Clicking first product
		
		driver.findElement(By.xpath("//div[@class='ProductModule__base']/a")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> windows = new ArrayList<>(handles);
		driver.switchTo().window(windows.get(1));
		String priceOfFirst = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']")).getText();
		System.out.println("Price of First product " +priceOfFirst);
		if(priceOfFirst.equals(priceFirst))
			System.out.println("Prices match");
		else
			System.out.println("Prices mismatch");
		
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	}
}
