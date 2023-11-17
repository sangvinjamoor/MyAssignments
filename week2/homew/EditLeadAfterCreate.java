package week2.homew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAfterCreate {

	public static void main(String[] args) {
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

		// Create Lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		// Filling up form
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("SangComp");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("SangFirst");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("SangLast");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("SangLastLocal");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TrialDept");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Adding a trial description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@test.com");
		
		//driver.findElement(By.xpath("//select[contains(@id,'dataSourceId')]")).click();
		WebElement element = driver.findElement(By.xpath("//select[contains(@id,'StateProvinceGeoId')]"));
		Select sel = new Select(element);
		sel.selectByVisibleText("New York");
		
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Updating important note");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("Page title " + driver.getTitle());
		
		driver.close();
	}

}
