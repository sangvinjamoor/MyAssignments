package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		// Login
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// LInk CRM
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// Create Lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		// Filling up form
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("SangtrialComp");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("SangtrialFirst");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("SangtrialLast");
		//driver.findElement(By.xpath("//select[contains(@id,'dataSourceId')]")).click();
		WebElement element = driver.findElement(By.xpath("//select[contains(@id,'dataSourceId')]"));
		Select sel = new Select(element);
		sel.selectByIndex(1);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		driver.close();

	}

}
