package jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;
import java.util.Iterator;

public class RegDriver2 {

	public static void main(String[] args) {
		System.setProperty("jdbc.drivers", "com.microsoft.sqlserver" + "jdbc.SQLServerDriver");
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		Iterator<Driver> driIter = drivers.asIterator();
		driIter.forEachRemaining(System.out::println);
		
		
	}

}
