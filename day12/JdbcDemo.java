package com.demo.jdbc;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/jdbc";
		String userName="root";
		String pwd="12345";
		String query="select * from sample";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,userName,pwd);
		Statement st=con.createStatement();
//		st.executeQuery(query);
		ResultSet rs=st.executeQuery(query);
		while (rs.next()) {
//			int id=rs.getInt(1);
			String name=rs.getString(2);
			String email=rs.getString(3);
			System.out.println("Name is "+name+" email is :"+email);
		}
		st.close();
		con.close();
	}
}

