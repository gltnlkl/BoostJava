package com.baa.boost035.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {
	
	private static DatabaseHelper instance;
	
	private final String URL;
	private Connection conn;
	
	private DatabaseHelper() {
		super();
		this.URL = "jdbc:postgresql://localhost:5432/northwind?user=gulukal&password=root";
		this.conn = null;
	}
	
	public String getUrl() {
		return URL;
	}
	
	public static DatabaseHelper getInstance() {
		if (instance == null) {
			
			try {
				this.conn = new DatabaseHelper();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		return instance;
		
	}
	
	public Connection getConnection() {
		
		if (this.conn == null) { // --> lazy instantination: eger objenin degeri null ise
			try {
				
				this.conn = DriverManager.getConnection(this.URL);
				
			} catch (SQLException ex) {
				
				System.out.println(ex.getMessage());
			}
			
		}
		return conn; // --> null degil ise olusmus nesneyi dondurur
	}
	
}
