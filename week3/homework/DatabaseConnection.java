package week3.homework;

public interface DatabaseConnection {
	public void connect(String dbName);
	
	public void disConnect();
	
	public void executeUpdate(String updateData);
	
}
