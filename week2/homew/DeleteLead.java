package week2.homew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
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
		String leadId = element.getText();
		System.out.println(leadId);
		element.click();
		
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String message = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if(message.equals("No records to display"))
			System.out.println("Record deleted successfully");
		else
			System.out.println("Error in Deletion");
		
		driver.close();
		

	}

}
