package week4.homework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		System.out.println(driver.getWindowHandle());
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windowsList = new ArrayList<>(windowHandles);
		System.out.println(windowsList.size());
		driver.switchTo().window(windowsList.get(1));
	
		System.out.println(driver.getTitle());
		List<WebElement> firstRow = driver.findElements(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td"));
		WebElement link = firstRow.get(0).findElement(By.tagName("a"));
		System.out.println(link.getText());
		link.click();
		driver.switchTo().window(windowsList.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		System.out.println(driver.getWindowHandle());
		Set<String> windowHandles2 = driver.getWindowHandles();
		
		List<String> windowsList2 = new ArrayList<>(windowHandles2);
		System.out.println(windowsList2.size());
		driver.switchTo().window(windowsList2.get(1));
		System.out.println(driver.getTitle());
		
		List<WebElement> secondRow = driver.findElements(By.xpath("(//table[@class='x-grid3-row-table'])[2]/tbody/tr[1]/td"));
		WebElement link2 = secondRow.get(0).findElement(By.tagName("a"));
		System.out.println(link2.getText());
		link2.click();
		driver.switchTo().window(windowsList2.get(0));
		
		driver.findElement(By.linkText("Merge")).click();
		
		Alert al = driver.switchTo().alert();
		al.accept();
		System.out.println(driver.getTitle());
		driver.close();

	}
}
