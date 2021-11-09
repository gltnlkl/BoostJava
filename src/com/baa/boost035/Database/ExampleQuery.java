package com.baa.boost035.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.baa.boost.CodingMarathon.SchoolApplication.Utils.GltnUtils;

public class ExampleQuery {
	
	public static void main(String[] args) {
		
		// URL TANIMLIYORUM - DBA - PORT - DATABASE - USER- SIFRE
		String url = "jdbc:postgresql://localhost:5432/northwind?user=gulukal&password=root";
		
		// SQL SORGUSU TANIMLIYORUM
		String orderSelect = "SELECT DISTINCT em.firstname, categoryname FROM categories ca INNER JOIN products p on ca.categoryid = p.categoryid INNER JOIN order_details ord on p.productid = ord.productid INNER JOIN orders ors on ors.orderid = ord.orderid INNER JOIN employees em ON em.employeeid = ors.employeeid WHERE categoryname IN (?);";
		
		// TRY- CATCH ICINE BAGLANTIYI VE ISLEMLERI YAZIYORUM
		try (Connection con = DriverManager.getConnection(url); // URL ILE TANIMLANAN DATABASE ILE BAGLANTI KURULDU
				// PREPARED STATEMENT OLUSTURULDU VE ARGUMANINA SQL QUERY YAZILDI
				PreparedStatement pStmt = con.prepareStatement(orderSelect);) {
			
			String inputCategory = GltnUtils.readString("Kategori giriniz");
			// PREPAREDSTATEMENT SET (STRING-INT-DOUBLE)OLARAK CAGRILIP ? ILE TANIMLANAN
			// YERE GELECEK BILGI GIRILDI
			pStmt.setString(1, inputCategory);
			// SORGUDAN GELEN BILGI RESULTSET ILE BIR DEGISKENE ATANDI
			ResultSet ordersResultSet = pStmt.executeQuery();
			
			int i = 1;
			
			while (ordersResultSet.next()) {
				// DONGU ILE TEK TEK VERILER OKUNUP CONSOLA BASILDI
				System.out.println(i++ + " | " + ordersResultSet.getString(1));
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	
}
