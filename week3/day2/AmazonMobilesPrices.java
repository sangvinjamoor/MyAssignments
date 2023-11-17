package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobilesPrices {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus");
	driver.findElement(By.id("nav-search-submit-button")).click();
	List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	System.out.println("Number of mobiles returned in 1st page " +elements.size());
	for(WebElement each:elements) {
		System.out.println("Price : " + each.getText());
	}
	driver.close();
}
}
