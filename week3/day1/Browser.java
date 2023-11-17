package week3.day1;

public class Browser {
	public String browserName;
	public String browserVersion;
	
	public void openURL(String url) {
		System.out.println("OPening URL");
	}
	
	public void closeBrowser() {
		System.out.println("Closing browser in Parent class");
	}
	
	public void navigateBack() {
		System.out.println("Navigating back..(Parent class)");
	}

}
