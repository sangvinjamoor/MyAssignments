package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcWindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/nget/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Parent page title " + driver.getTitle() + "    " +driver.getWindowHandle());
		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<>(windowHandles);
		driver.switchTo().window(windowsList.get(1));
		System.out.println("Child window title " +driver.getTitle());
		driver.switchTo().window(windowsList.get(0));
		System.out.println("Switched to parent window");
		System.out.println(driver.getTitle());
		driver.close();

		
	}
}
