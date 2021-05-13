package com.nma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConn {
	
	
	@Value("${SQL.driver}")
	private String driver;
	
	@Value("${SQL.url}")
	private String url;
	
	@Value("${SQL.username}")
	private String username;
	
	@Value("${SQL.password}")
	private String password;
	
	public void dsiplay() {
		System.out.println("Driver" +driver);
		System.out.println("URL" +url);
		System.out.println("Username " +username);
		System.out.println("Password " +password);
	}

	public void jdbcConnection() {
		
		try{  
			Class.forName(driver);  
			Connection con=DriverManager.getConnection(url, username, password);  			
			System.out.println("Connection done...!");
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
		} 
	
}
