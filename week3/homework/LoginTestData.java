package week3.homework;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Entering the user name " +super.username);
	}
	
	public void enterPassword() {
		System.out.println("Entering the password " +super.password);
	}
	
	public static void main(String[] args) {
		LoginTestData login = new LoginTestData();
		login.navigateToHomePage();
		login.enterCredentials();
		login.enterUsername();
		login.enterPassword();
		
		
	}
}
