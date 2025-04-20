package com.Register;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.dao.LoginDao;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		int acnt=Integer.parseInt(request.getParameter("acnt"));
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		int mob=Integer.parseInt(request.getParameter("mob"));
		
		/*if(uname==null || pass==null || fname==null || lname==null )
		{
			request.setAttribute("loginError","Incorrect password");
		} */
		
		LoginDao dao=new LoginDao();
		
		if(dao.register(uname,pass,acnt,fname,lname,mob))
		{
			response.sendRedirect("RegistrationSuccessful.jsp");
		}
		else
		{
			response.sendRedirect("Login_Register.jsp");
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
