package week3.homework.inheritance;

public class TextField extends WebElement{

	public String getText() {
		System.out.println("In Get text method . Getting the text value " +super.elementText);
		return elementText;
	}
}
