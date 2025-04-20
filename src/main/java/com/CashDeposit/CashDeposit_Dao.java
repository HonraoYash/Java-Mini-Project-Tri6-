package com.CashDeposit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CashDeposit_Dao {
	String sql ="UPDATE balance SET balance=balance+? WHERE accountnumber=? and transactionpassword=?";
	String url="jdbc:mysql://localhost:3306/piggy_bank";
	String username="root";
	String password="Lienel@4858";
	
	
	
	public boolean deposit(int acnt,int cash,String pass)
	{
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(2,acnt);
		pstmt.setInt(1,cash);
		pstmt.setString(3,pass);
		
		pstmt.executeUpdate();
		
		return true;
	
		

	   }
	   catch (Exception e)
	   {
		e.printStackTrace();
	    }
		
		
		
		return false;
	}


}
