package week4.homework;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement menFashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(menFashion).perform();
		driver.findElement(By.linkText("Sports Shoes")).click();
		String countText = driver.findElement(By.xpath("//span[contains(@class,'category-count')]")).getText();
		System.out.println(countText);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("(//div[@class='sort-selected']/following::ul)/li[2]")).click();
		Thread.sleep(5000);
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		int[] priceList = new int[prices.size()];
		int i =0;
		for(WebElement element:prices) {
			String price = element.getText();
			String temp=price.replaceAll("[^0-9]","");
			System.out.println(temp);
			priceList[i++] = Integer.parseInt(temp);
			System.out.println(priceList[i-1]);
		}
		//check if price is sorted
		boolean sorted = true;
		for(i=0;i<priceList.length-1;i++) {
			if(priceList[i] > priceList[i+1]) {
				sorted = false;
				break;
			}
		}
		if(sorted)
			System.out.println("Items are sorted..." + priceList);
		else
			System.out.println("Items are not sorted...." + priceList);
		driver.findElement(By.name("fromVal")).clear();
		String fromVal = "500";
		String toVal = "700";
		driver.findElement(By.name("fromVal")).sendKeys("500");
		driver.findElement(By.name("toVal")).clear();
		driver.findElement(By.name("toVal")).sendKeys("700");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		Thread.sleep(3000);
//		List<WebElement> coloursList = driver.findElements(By.xpath("//span[contains(@class,'filter-color-tile')]"));
//		System.out.println(coloursList.size());
		WebElement colourLink = driver.findElement(By.xpath("(//span[contains(@class,'filter-color-tile')])[2]/following-sibling::a"));
		String colour = colourLink.getText();
		System.out.println(colour);
		driver.findElement(By.xpath("(//span[contains(@class,'filter-color-tile')])[2]/parent::label")).click();
		Thread.sleep(3000);
//		coloursList.get(0).findElement(By.tagName("a")).click();
		List<WebElement> navs = driver.findElements(By.xpath("//div[@class='navFiltersPill']"));
		System.out.println(navs.size());
		for(WebElement el:navs) {
			String filterName = el.getText();
			System.out.println(filterName);
			if(filterName.contains(colour))
				System.out.println("Colour filter applied");
			if(filterName.contains(fromVal) && filterName.contains(toVal))
				System.out.println("Price filter applied");
		}
		WebElement product = driver.findElement(By.xpath("//img[contains(@class,'product-image')]"));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(product).perform();
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Price: " +price);
		System.out.println("Discount: " +discount);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./Snapshots/snapdeal.png");
	FileUtils.copyFile(source, target);
		driver.close();
	}
}
