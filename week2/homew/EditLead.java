package week2.homew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Login
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// LInk CRM
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		driver.findElement(By.linkText("Find Leads")).click();
		//driver.findElement(By.name("firstName")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("sang");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		//Selection of first row from the results
		WebElement element = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-partyId')]/a)[1]"));
		
		System.out.println(element.getText());
		element.click();
		if(driver.getTitle().contains("View Lead"))
			System.out.println("Verified title");
		else
			System.out.println("Title mismatch in View lead page");
		driver.findElement(By.linkText("Edit")).click();
		WebElement compName = driver.findElement(By.id("updateLeadForm_companyName"));
		String oldName = compName.getAttribute("value");
		String newName = oldName + "_modified";
		compName.clear();
		compName.sendKeys(newName);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String updated = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(updated.contains(newName))
			System.out.println("Company name updated successfully");
		else
			System.out.println("Error in updation of company name");
		
		driver.close();
		
	}

}
