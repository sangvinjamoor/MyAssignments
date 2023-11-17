package week3.day1;

public class Chrome extends Browser{

	public void openIncognito() {
		System.out.println("In subclass Chrome - opening incognito");
	}
	
	public void clearCache() {
		System.out.println("In subclass Chrome - clearing cache");
	}
	public static void main(String[] args) {
		Chrome ch = new Chrome();
		ch.openIncognito();
		ch.openURL("https://google.com");
		ch.clearCache();
		ch.closeBrowser();
	}
}
