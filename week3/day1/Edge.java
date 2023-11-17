package week3.day1;

public class Edge extends Browser{
	public void takeSnap() {
		System.out.println("In Edge class - taking snap");
	}
	
	public void clearCookies() {
		System.out.println("In Edge class - clearing cookies");
	}
	
	@Override
	public void openURL(String name) {
		super.openURL(name);
	}
	public static void main(String[] args) {
		Edge ed= new Edge();
		ed.clearCookies();
		ed.openURL("https://google.com");
		ed.takeSnap();
		ed.closeBrowser();
	}
}

