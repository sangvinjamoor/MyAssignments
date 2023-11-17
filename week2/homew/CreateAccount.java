package week2.homew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		String acctName = "SangAccount2";
		driver.findElement(By.id("accountName")).sendKeys(acctName);
		driver.findElement(By.name("description")).sendKeys("Selenium automation tester");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select ind = new Select(industry);
		ind.selectByVisibleText("Computer Software");
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select owner = new Select(ownership);
		owner.selectByVisibleText("S-Corporation");
		
		WebElement dataSource = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(dataSource);
		source.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select marketing = new Select(marketingCampaign);
		marketing.selectByIndex(6);
		
		WebElement stateProvince = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(stateProvince);
		state.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String savedAcctName = driver.findElement(By.xpath("//span[text()='Account Name']/following::span")).getText();
		System.out.println(savedAcctName);
		System.out.println(savedAcctName.contains(acctName));
		driver.close();
		
	}
}
