package jdbc;

public class RegDriver1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //載入java的dirver
			System.out.println("OK");
		} catch (ClassNotFoundException e) {
			System.out.println("NG");
			e.printStackTrace();
		}

	}

}
