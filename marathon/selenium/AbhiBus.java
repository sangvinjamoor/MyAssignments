package marathon.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		driver.findElement(By.xpath("//div[@class='container date ']/span[text()='2']")).click();
		driver.findElement(By.linkText("Search")).click();
		String travels = driver.findElement(By.xpath("(//div[contains(@class,'operator-info')])[1]/h5")).getText();
		System.out.println("First travels name " +travels);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		String seatsAvailable = driver.findElement(By.xpath("(//div[@class='text-grey'])[1]/small")).getText();
		System.out.println("Seats available " +seatsAvailable);
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='seat sleeper'])[1]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'checkbox-container')])[2]/input")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'checkbox-container')])[2]/input")).click();
		String seat = driver.findElement(By.xpath("//span[text()='Seat Selected :']/span")).getText();	
		String fare = driver.findElement(By.xpath("//span[text()='Base Fare :']/span")).getText();
		String title = driver.getTitle();
		System.out.println("Seat " +seat);
		System.out.println("Fare " +fare);
		System.out.println("Title of the page " +title);
		driver.close();
	}
}
