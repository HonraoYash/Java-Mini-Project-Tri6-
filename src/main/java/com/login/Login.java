package com.login;

import static java.lang.System.out;
import java.io.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.dao.LoginDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String wrong="Wrong Credentials :(";
		String enter="Enter credentials below";
		
		/*if(uname==null || pass==null)
		{
			request.setAttribute("enter", enter);
			RequestDispatcher rd=request.getRequestDispatcher("Login_Register.jsp");
	        rd.forward(request, response);
		}  */
		
		LoginDao dao=new LoginDao();
		
		if(dao.check2(uname,pass)==1)
		{
			request.setAttribute("errlist",enter);
	        RequestDispatcher rd=request.getRequestDispatcher("Login_Register.jsp");
	        rd.forward(request, response);
			//response.sendRedirect("Error.jsp");
		}
		else if(dao.check(uname, pass))
		{
			response.sendRedirect("Home.jsp");
		} 
		else 
		{
	        request.setAttribute("errlist",wrong );
	        RequestDispatcher rd=request.getRequestDispatcher("Login_Register.jsp");
	        rd.forward(request, response);
			//response.sendRedirect("Login_Register.jsp");
		}
		
	}
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
