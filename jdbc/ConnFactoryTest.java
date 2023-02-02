package jdbc;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import connectionUtil.ConnectionFactory;

public class ConnFactoryTest {

	public static void main(String[] args) {
		ConnectionFactory connF = new ConnectionFactory();
		String lastName = JOptionPane.showInputDialog(connF);
		String firstName = JOptionPane.showInputDialog(lastName);
		
		String sql = "SELECT [EmployeeID]\r\n" + "      ,[LastName]\r\n" + "      ,[FirstName]\r\n"
				+ "      ,[Title]\r\n" + "      ,[TitleOfCourtesy]\r\n" + "      ,[BirthDate]\r\n"
				+ "      ,[HireDate]\r\n" + "      ,[Address]\r\n" + "      ,[City]\r\n" + "      ,[Region]\r\n"
				+ "      ,[PostalCode]\r\n" + "      ,[Country]\r\n" + "      ,[HomePhone]\r\n"
				+ "      ,[Extension]\r\n" + "      ,[Photo]\r\n" + "      ,[Notes]\r\n" + "      ,[ReportsTo]\r\n"
				+ "      ,[PhotoPath]\r\n" + "  FROM [dbo].[Employees] where Lastname ='" + lastName
				+ "' and FistName='" + firstName + "'";

		try (Connection conn = connF.getConnection()) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getString(2));// 取select第？個
			}

			System.out.print("ok");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
