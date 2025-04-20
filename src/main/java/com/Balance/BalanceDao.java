package com.Balance;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BalanceDao {
	String sql ="Select * from balance";
	String url="jdbc:mysql://localhost:3306/piggy_bank";
	String username="root";
	String password="Lienel@4858"; 
	
	public boolean viewbalance(int acnt,String pass)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			
			Statement statement=con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next())
			{
				int c=rs.getInt(3);
				int a=rs.getInt(1);
				String p=rs.getString(2);
			 if(acnt==a )
			 {
				 return true;
			 }
			}
			
		   }
		   catch (Exception e)
		   {
			e.printStackTrace();
		    }
			
			
			
			return false;
		}
}
