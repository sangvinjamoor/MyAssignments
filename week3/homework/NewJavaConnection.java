package week3.homework;

public class NewJavaConnection extends MySqlConnection implements DatabaseConnection {

	@Override
	public void executeUpdate(String updateData) {
		System.out.println("Executing the update "+updateData);
 
	}

	@Override
	public void executeQuery(String query) {
		System.out.println("Executing query " +query);
		

	}

	public static void main(String[] args) {
		NewJavaConnection conn = new NewJavaConnection();
		conn.connect("TrialDB");
		conn.executeUpdate("Sample update data");
		conn.executeQuery("sample query");
		conn.disConnect();

	}

}
