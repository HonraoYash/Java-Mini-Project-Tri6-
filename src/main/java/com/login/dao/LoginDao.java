package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

	String sql ="select * from users where username=? and password=?";
	String url="jdbc:mysql://localhost:3306/piggy_bank";
	String username="root";
	String password="Lienel@4858";
	
	public boolean check(String uname,String pass)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			
			PreparedStatement st= con.prepareStatement(sql);
			st.setString(1,uname);
			st.setString(2,pass);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				return true;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
	
	public int check2(String uname,String pass)
	{
		if(uname==null || pass==null)
		{
			return 1;
		}
		return 0;
	}
	
	public boolean register(String uname,String pass,int acnt,String fname,String lname,int mob)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			
			String query="insert into users values(?,?,?,?,?)" ;
			String query2="insert into balance values(?,?,?)" ;
			
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1,uname);
			pstmt.setString(2,pass);
			pstmt.setString(3,fname);
			pstmt.setString(4,lname);
			pstmt.setInt(5,mob);
			pstmt.executeUpdate();
			
			PreparedStatement st = con.prepareStatement(query2);
			st.setInt(1,acnt);
			st.setString(2,pass);
			st.setInt(3,0);
			st.executeUpdate();
			
			/*PreparedStatement st = con.prepareStatement(query2);
			st.setInt(1,acnt);
			st.setInt(1,acnt);
			st.setInt(1,acnt);
			st.executeUpdate(); */
			
			return true;
		}
		catch (Exception e)
		{
			System.out.println("Please enter valid details");
			//e.printStackTrace();
		}
		return false;
	}
	
}
