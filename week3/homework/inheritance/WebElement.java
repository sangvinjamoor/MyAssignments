package week3.homework.inheritance;

public class WebElement {
	String elementText;
	public void click() {
		System.out.println("Clicking in parent class");
	}
	
	public void setText(String text) {
		elementText = text;
		System.out.println("Setting the text " +text);
	}
}
