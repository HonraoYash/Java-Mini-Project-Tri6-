package com.Balance;

import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CashDeposit.CashDeposit_Dao;


/**
 * Servlet implementation class Balance
 */
@WebServlet("/Balance")
public class Balance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Balance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int acnt=Integer.parseInt(request.getParameter("acnt"));
		//int cash=Integer.parseInt(request.getParameter("cash"));
		String pass=request.getParameter("pass");
		
		BalanceDao dao=new BalanceDao();
		
		if(dao.viewbalance(acnt,pass))
		{
			response.sendRedirect("ViewBalance.jsp");
		}
		else
		{
			response.sendRedirect("Error.jsp");
		}
		
		/*PrintWriter out = response.getWriter();  
        response.setContentType("text/html");  
        out.println("<html><body> Your Balance is </body></html>"); 
        
        
        
		
		int acnt=Integer.parseInt(request.getParameter("acnt"));
	    String pass=request.getParameter("pass");
	  
	    BalanceDao dao=new BalanceDao();
	    
	    if(dao.viewbalance(acnt, pass))
	    {
	    	response.sendRedirect("ViewBalance.jsp");
	    } */
	    
	   // String message = dao.viewbalance(acnt, pass);
        // request.setAttribute("message", message); // This will be available as ${message}
        // request.getRequestDispatcher("Balance.jsp").forward(request, response);
	  
	    //out.println(s);
	    //out.println("<html><body> s </body></html>"); 
	  
	}
	   
	  /*try 
      {  
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
          Connection con = DriverManager.getConnection("jdbc:odbc:mydsn", "system", "pintu");  
          // Here dsnname- mydsn,user id- system(for oracle 10g),password is pintu.  
          Statement stmt = con.createStatement();  
          ResultSet rs = stmt.executeQuery("select * from employee");  
          out.println("<table border=1 width=50% height=50%>");  
          out.println("<tr><th>EmpId</th><th>EmpName</th><th>Salary</th><tr>");  
          while (rs.next()) 
          {  
              String n = rs.getString("empid");  
              String nm = rs.getString("empname");  
              int s = rs.getInt("sal");   
              out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>");   
          }  
          out.println("</table>");  
          out.println("</html></body>");  
          con.close();  
         }  
	  
	} */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
