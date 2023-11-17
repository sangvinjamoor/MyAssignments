package week2.homew;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundCheckBox1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		WebElement check = driver.findElement(By.xpath("//span[text()='Basic']/preceding::input"));
//		System.out.println(check.getAriaRole());
//		System.out.println(check.getAttribute("aria-checked"));
//		System.out.println(check.isSelected());
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		String text = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if(text.equals("Checked"))
			System.out.println("Ajax checked");
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		Thread.sleep(2000);
		text = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println(text);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]/div[2]")).click();
		Thread.sleep(3000);
		String state = driver.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p")).getText();
		System.out.println("State: " +state);
		
		driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]/div[2]")).click();
		Thread.sleep(3000);
		state = driver.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p")).getText();
		System.out.println("State: " +state);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		state = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println("State: " +state);
		WebElement disabled = driver.findElement(By.xpath("//span[text()='Disabled']/preceding::input[1]"));
		System.out.println(disabled.isEnabled());
		
		driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::div")).click();
		driver.findElement(By.xpath("//label[text()='London']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Berlin']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Paris']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//span[contains(@class,'ui-icon-circle-close')]")).click();
		
		List<WebElement> countriesList = driver.findElements(By.xpath("//span[@class='ui-selectcheckboxmenu-token-label']"));
		for(WebElement el:countriesList)
			System.out.println(el.getText());

		
       driver.close(); 
		
	}

}
