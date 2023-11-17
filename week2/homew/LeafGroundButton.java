package week2.homew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//1. Click to confirm
		driver.findElement(By.xpath("//h5[contains(text(),'Confirm title')]/following-sibling::button")).click();
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("dashboard"))
			System.out.println("Title is " + title);
		else
			System.out.println("Title mismatch. ");
		driver.navigate().back();
		//2. Disabled button check
		WebElement button = driver.findElement(By.xpath("//span[text()='Disabled']/parent::button"));
		boolean enabled = button.isEnabled();
		if(enabled)
			System.out.println("The button is not disabled");
		else
			System.out.println("The button is disabled");
		
		
		//3.POsition of submit button
		Point p = driver.findElement(By.xpath("//h5[contains(text(),'position')]/following-sibling::button")).getLocation();
		System.out.println("Position of the button : "+p.getX() + " , " +p.getY());
		
		//4.Colour of the button
		
		WebElement colourButton = driver.findElement(By.xpath("//span[text()='Save']/parent::button"));
		String colour = colourButton.getCssValue("background-color");
		System.out.println("The colour of the Save button is " +colour);
		Color c =Color.fromString(colour);
		System.out.println("Colour is " + c.toString());
		//5.Height and Width of the button
		
		WebElement sizeButton = driver.findElement(By.xpath("//h5[contains(text(),'width')]/following-sibling::button"));
		Dimension dim = sizeButton.getSize();
		
	System.out.println("Dimensions of the button are :\n Height: " + dim.getHeight() + "\nWidth: "+ dim.getWidth());	
		
	
	driver.close();
		
		
	}

}
