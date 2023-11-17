package week4.homework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement brands = driver.findElement(By.linkText("Brands"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();
		String brand="L'Oréal Paris";
		driver.findElement(By.id("brandSearchBox")).sendKeys(brand);
		Thread.sleep(3000);
		driver.findElement(By.linkText("L'Oréal Paris")).click();
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris"))
			System.out.println("Title contains brand " +title);
		else
			System.out.println("Title doesnt have brand "+title);
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Colour Protection']")).click();
		Thread.sleep(5000);
		List<WebElement> filters = driver.findElements(By.xpath("//span[@class='filter-value']"));
		for(WebElement el:filters) {
			String text = el.getText();
			if(text.contains("Shampoo"))
				System.out.println("Shampoo filter applied");
		}
		driver.findElement(By.xpath("//div[contains(@class,'productWrapper')]//img")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> windows = new ArrayList<>(handles);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		String price = driver.findElement(By.xpath("//span[text()='MRP:']/following-sibling::span")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		Thread.sleep(5000);
		//switch to iframe
		WebElement frameRef = driver.findElement(By.xpath("//div[@id='portal-root']//iframe"));
		driver.switchTo().frame(frameRef);
		String grandTotal = driver.findElement(By.xpath("//span[text()='Grand Total']/preceding::span[1]")).getText();
		System.out.println(grandTotal);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.switchTo().defaultContent();
		String price1 = driver.findElement(By.xpath("(//div[contains(@class,'leftSelector')])[2]/p")).getText();
		System.out.println(price1);
		if(grandTotal.equals(price1))
			System.out.println("Grand total match");
		else
			System.out.println("Grand total mismatch");
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.close();
		driver.switchTo().window(windows.get(0));
		driver.close();
	}

}
