package week3.homework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioSearch {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(5000);
		String numOfResults = driver.findElement(By.className("length")).getText();
		
		System.out.println(numOfResults);
		String countString = numOfResults.split(" ")[0];
		
		String count = new String();
		if(countString.contains(",")) {
			String[] countArr = countString.split(",");
			for(String s:countArr) {
				count = count.concat(s);
			}
			
			
		}
		
		Integer intResults = Integer.parseInt(count);
		System.out.println("Number of Results " +intResults);
		List<WebElement> brandsList = driver.findElements(By.className("brand"));
		List<WebElement> bagsList = driver.findElements(By.className("nameCls"));
		List<String> brandNames = new ArrayList<>();
		List<String> bagNames = new ArrayList<>();
		for(WebElement elem:brandsList) {
			brandNames.add(elem.getText());
			
		}
		
		
		
		for(WebElement elem:bagsList) {
			bagNames.add(elem.getText());
		}
		
		for(int i=0;i<brandNames.size();i++) {
			System.out.print("Brand :" +brandNames.get(i));
			System.out.println(" -----  Bag : "+bagNames.get(i));
		}
		
		driver.close();

	}
}
