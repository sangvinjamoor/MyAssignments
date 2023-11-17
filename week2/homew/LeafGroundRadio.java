package week2.homew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.*;
import java.util.List;

public class LeafGroundRadio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);
//		WebElement browserRadio = driver.findElement(By.xpath("//h5[text()='Your most favorite browser']/following::label[1]"));
//		WebElement browserRadio1 = driver.findElement(By.xpath("//h5[text()='Your most favorite browser']/following::input[1]"));
//		browserRadio.click();
//		System.out.println("Browser Radio button "+browserRadio.isSelected());
		WebElement browser =  driver.findElement(By.xpath("//h5[text()='Your most favorite browser']/following::input[1]"));
		WebElement browserName = driver.findElement(By.xpath("//h5[text()='Your most favorite browser']/following::label[1]"));
		browserName.click();
		String label = browserName.getText();
		System.out.println(browser.isSelected() +" browserName: " +label);
		
		driver.findElement(By.xpath("//h5[text()='UnSelectable']/following::label[1]")).click();
		WebElement unselectRadio =  driver.findElement(By.xpath("//h5[text()='UnSelectable']/following::input[1]"));
		System.out.println("Unselectable radio status " + unselectRadio.isSelected());
		driver.findElement(By.xpath("//h5[text()='UnSelectable']/following::label[1]")).click();
		System.out.println("Deselected. Checking the status now " +unselectRadio.isSelected());
		
		
		//Default Select radio button
		
		List<WebElement> defaultRadios = driver.findElements(By.xpath("//h5[text()='Find the default select radio button']/following::input[contains(@value,'Option')]"));
		for(WebElement option:defaultRadios) {
			String val = option.getAttribute("value");
			String text = option.findElement(By.xpath("following::label")).getText();
			if(option.isSelected()) {
				
				System.out.println("Selected " + text);
			}
		
		}
		
		List<WebElement> ageOptions = driver.findElements(By.xpath("//h5[contains(text(),'age group')]/following::input[contains(@value,'Years')]"));
		for(WebElement age:ageOptions) {
			String text=age.findElement(By.xpath("following::label")).getText();
			if(age.isSelected()) {
				System.out.println("The option " + text + " is selected");
			}
		}
		driver.close();
		

	}

}
