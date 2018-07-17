package com.revature.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletContext;

public class Connections {

	private final static String FILE_NAME = "dbprops.properties";
	private static Properties prop = null;
	private static Connection con = null;

	public static Connection getConnection() {

		try {

			String props[] = System.getenv("DBProps").split(";");

			Class.forName(props[0]);
			con = DriverManager.getConnection(props[1], props[2], props[3]);

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DATABASE CONNECTION FAILED");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Could not find OracleDriver");
		}

		return con;
	}

}
