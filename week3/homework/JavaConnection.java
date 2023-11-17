package week3.homework;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect(String dbName) { 
		System.out.println("Connectiing to the data base " + dbName);
	}

	@Override
	public void disConnect() {
		System.out.println("Disconnecting from DB");

	}

	@Override
	public void executeUpdate(String updateData) {
		System.out.println("Executing the update " +updateData);

	}
	
	
	public static void main(String[] args) {
		DatabaseConnection db = new JavaConnection();
		db.connect("TrialDB");
		db.executeUpdate("updateTable");
		db.disConnect();
	}

}
