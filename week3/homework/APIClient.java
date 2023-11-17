package week3.homework;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println("Inside the method with endpoint parameter alone " +endpoint);
	}
	
	
	public void sendRequest(String endPoint,String requestBody,boolean requestStatus) {
		System.out.println("Inside 3 parameters method ");
		System.out.println(endPoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);
	}
	
	public static void main(String[] args) {
		APIClient client = new APIClient();
		client.sendRequest("https://google.com");
		client.sendRequest("https://google.com","searchString:mobiles",true);
		

	}

}
