package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionUtil.ConnectionFactory;

public class ConnFactoryTest {

	public static void main(String[] args) {
		ConnectionFactory connF = new ConnectionFactory();
//		String lastName = JOptionPane.showInputDialog(connF);
//		String firstName = JOptionPane.showInputDialog(lastName);
		
		String sql = "SELECT [EmployeeID]\r\n" + "      ,[LastName]\r\n" + "      ,[FirstName]\r\n"
				+ "      ,[Title]\r\n" + "      ,[TitleOfCourtesy]\r\n" + "      ,[BirthDate]\r\n"
				+ "      ,[HireDate]\r\n" + "      ,[Address]\r\n" + "      ,[City]\r\n" + "      ,[Region]\r\n"
				+ "      ,[PostalCode]\r\n" + "      ,[Country]\r\n" + "      ,[HomePhone]\r\n"
				+ "      ,[Extension]\r\n" + "      ,[Photo]\r\n" + "      ,[Notes]\r\n" + "      ,[ReportsTo]\r\n"
				+ "      ,[PhotoPath]\r\n" + "  FROM [dbo].[Employees]";
		try (Connection conn = connF.getConnection()) {//通過调用connF.getConnection()方法獲取一個數據庫連接。
			Statement stmt = conn.createStatement();//創建一個Statement對象，它用於向數據庫發送SQL語句。
			ResultSet rs = stmt.executeQuery(sql);//通過調用stmt.executeQuery(sql)方法執行SQL查詢，並返回一個ResultSet對象，它包含了查詢結果的行和列。
			
			while (rs.next()) {
				System.out.println(rs.getString(2));// 取select第？個
			}

			System.out.print("ok");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
