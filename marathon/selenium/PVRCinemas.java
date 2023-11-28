package marathon.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		WebElement cityName = driver.findElement(By.name("city"));
		Select city = new Select(cityName);
		city.selectByValue("Chennai");
		WebElement genreName = driver.findElement(By.name("genre"));
		Select genre = new Select(genreName);
		genre.selectByVisibleText("ANIMATION");
		WebElement langName = driver.findElement(By.name("lang"));
		Select lang = new Select(langName);
		lang.selectByIndex(1);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(5000);
		
		WebElement cinema = driver.findElement(By.name("cinemaName"));
		Select cine= new Select(cinema);
		cine.selectByIndex(1);
		
		WebElement timings = driver.findElement(By.name("timings"));
		Select time= new Select(timings);
		time.selectByIndex(1);
		
		driver.findElement(By.name("name")).sendKeys("Sangeetha");
		driver.findElement(By.name("mobile")).sendKeys("8754497386");
		driver.findElement(By.name("email")).sendKeys("sangeetha.tv@gmail.com");
		driver.findElement(By.name("noOfTickets")).sendKeys("2");
		driver.findElement(By.xpath("//div[contains(@class,'pvr-datepicker')]")).click();
		driver.findElement(By.xpath("//span[text()='7']")).click();
		
		WebElement food = driver.findElement(By.name("food"));
		Select f= new Select(food);
		f.selectByVisibleText("Yes");
		
		driver.findElement(By.name("comment")).sendKeys("none");
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		System.out.println("Title: " +driver.getTitle());
				driver.close();
	}
}
