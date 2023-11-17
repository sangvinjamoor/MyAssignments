package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getTitle() + "    " +driver.getWindowHandle());
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		System.out.println(driver.getWindowHandle());
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		for(String each:windowHandles)
			System.out.println(each);
		List<String> windowsList = new ArrayList<>(windowHandles);
		driver.switchTo().window(windowsList.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(windowsList.get(0));
		System.out.println(driver.getTitle());
		driver.close();

		
	}
}
