package com.Transfer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransferDao {
	String sql ="Select * from balance";
	String sql2 ="UPDATE balance SET balance=balance-? WHERE accountnumber=? and transactionpassword=?";
	String sql3 ="UPDATE balance SET balance=balance+? WHERE accountnumber=?";
	String url="jdbc:mysql://localhost:3306/piggy_bank";
	String username="root";
	String password="Lienel@4858";
	
	public boolean check(int acnt,String pass,int cash,int acnt2)
	{		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		
		/*Statement stmt=con.createStatement();
		String query2="select * from balance";
		ResultSet  rs=stmt.executeQuery(query2);
		
		while(rs.next())
		{
		int id=rs.getInt(1);
		String name= rs.getString(2);
		
		if(id==acnt && name==pass)
		{
			//try
			{
				PreparedStatement pstmt = con.prepareStatement(sql2);
				pstmt.setInt(2,acnt);
				pstmt.setInt(1,cash);
				pstmt.setString(3,pass);
				pstmt.executeUpdate();
				
				PreparedStatement st = con.prepareStatement(sql3);
				st.setInt(2,acnt2);
				st.setInt(1,cash);
			    st.executeUpdate();  
			    
			    return true;
			}
			
		 }
		} */
		
		Statement stmt=con.createStatement();
		ResultSet  rs=stmt.executeQuery(sql);
		
		
		while(rs.next())
		{
			int c=rs.getInt(3);
			int a=rs.getInt(1);
			String p=rs.getString(2);
			
			{
				PreparedStatement pstmt = con.prepareStatement(sql2);
				pstmt.setInt(2,acnt);
				pstmt.setInt(1,cash);
				pstmt.setString(3,pass);
				pstmt.executeUpdate();
				
				PreparedStatement st = con.prepareStatement(sql3);
				st.setInt(2,acnt2);
				st.setInt(1,cash);
			    st.executeUpdate();  
			    
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
