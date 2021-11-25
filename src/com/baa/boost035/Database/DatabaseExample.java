package com.baa.boost035.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseExample {
	
	public static void main(String[] args) {
		
		String url = "jdbc:postgresql://localhost:5432/northwind?user=gulukal&password=root";
		
		String select = "SELECT employeeid, firstname, lastname FROM employees ORDER BY firstname;";
		
		String orderSelect = "SELECT orderid, customerid, employeeid, freight, shipname FROM orders WHERE employeeid=? ORDER BY customerid LIMIT 5 ";
		
		try (Connection con = DriverManager.getConnection(url);
				
				// duz ve tek bir sorgu yapiyorum statement ile
				Statement stmt = con.createStatement();) {
			// prepared statement ile ? yerlerine veri girebiliriz
			PreparedStatement pStmt = con.prepareStatement(orderSelect);
			// sonuclari atamak icin olusturuyoruz
			ResultSet rs = stmt.executeQuery(select);
			
			System.out.println("\t+============+======================+");
			System.out.println("\t| İsim | Soyisim |");
			System.out.println("\t+============+======================+");
			
			while (rs.next()) {
				
				int id = rs.getInt("employeeid");
				String first = rs.getString("firstname");
				String last = rs.getString("lastname");
				
				System.out.printf("\t| %10s | %20s |\n", first, last);
				System.out.println("\t+------------+----------------------+");
				
				// ? yerine degerler atadim bu kisimda
				
				pStmt.setInt(1, id);
				
				ResultSet ordersResultSet = pStmt.executeQuery();
				
				while (ordersResultSet.next()) {
					System.out.println("\t\t--> | " + ordersResultSet.getInt(1) + " | " + ordersResultSet.getString(2)
							+ " | " + ordersResultSet.getDouble(3) + " |");
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	
}
