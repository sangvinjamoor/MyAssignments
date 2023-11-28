package week1.day2;

public class EdgeBrowser {
public static void main(String[] args) {
	System.out.println("************");
	System.out.println("In class EdgeBrowser");
	Browser brObj = new Browser();
	System.out.println("Returned browser name: " +brObj.launchBrowser("edge"));
	brObj.loadUrl();
}
}
