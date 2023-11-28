package week1.day2;

public class Browser {

	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application launched successfully");
	}
	
	public static void main(String[] args) {
		Browser obj = new Browser();
		System.out.println("Returned browser name: " +obj.launchBrowser("firefox"));
		obj.loadUrl();
	}
}
