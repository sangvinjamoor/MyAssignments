package week3.day1;

public class Safari extends Browser {
public void readerMode() {
	System.out.println("In Safari class - Entering reader mode");
}

public void fullScreenMode() {
	System.out.println("IN Safari class - entering full screen mode");
}

public static void main(String[] args) {
	Safari sf = new Safari();
	sf.readerMode();
	sf.openURL("https://google.com");
	sf.fullScreenMode();
	sf.closeBrowser();
}

	
}
