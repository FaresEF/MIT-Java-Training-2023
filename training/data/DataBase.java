package com.mit.training.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.db;

public class DataBase {
public static void main(String args[]) throws ClassNotFoundException,SQLException{
	String jdbcURL="";
	String jdbcdriver="";
	String jdbcUsername="";
	String jdbcPassword="";
	
	Class.forName("jdbcdriver");
	Connection com=DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
	
	String sql1="";
	
	Statement stmt=com.createStatement();
	ResultSet resultset=stmt.executeQuery(sql1);
	
	while(resultset.next()) {
		String CONTID=resultset.getString(1);
		System.out.println(CONTID);
	}
	
	String sql2="";
	int result=stmt.executeUpdate(sql2);
	
	resultset.close();
	stmt.close();
	com.close();
}
}
