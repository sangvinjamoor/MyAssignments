package week2.homew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLeadByPhone {
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
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		// Filling up form
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("SangDelComp");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("SangDelFirst");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("SangDelLast");
		//driver.findElement(By.xpath("//select[contains(@id,'dataSourceId')]")).click();
		WebElement element = driver.findElement(By.xpath("//select[contains(@id,'dataSourceId')]"));
		Select sel = new Select(element);
		sel.selectByIndex(1);
		String phone="1234567890";
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone);
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys(phone);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		//Selection of first row from the results
		WebElement element1 = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-partyId')]/a)[1]"));
		String leadId = element1.getText();
		System.out.println(leadId);
		element1.click();
		
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
