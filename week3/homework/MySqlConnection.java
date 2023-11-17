package week3.homework;

public abstract class MySqlConnection implements DatabaseConnection {

	@Override
	public void connect(String dbName) {
		System.out.println("Connecting to DB from abstract class "+dbName);

	}

	@Override
	public void disConnect() {
		System.out.println("Disconnecting DB from abstract class");

	}
	
	public abstract void executeQuery(String query);

	

}
