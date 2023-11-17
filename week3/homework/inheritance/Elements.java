package week3.homework.inheritance;

public class Elements {
	public static void main(String[] args) {
		WebElement element = new WebElement();
		TextField text = new TextField();
		text.setText("Sample");
		System.out.println("Text in the textfield " +text.getText());
		CheckBoxButton cb = new CheckBoxButton();
		cb.clickCheckButton();
		RadioButton rb = new RadioButton();
		rb.selectRadioButton();
		element.click();
		Button b = new Button();
		b.submit();
		
	}
}
