package com.Transfer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CashDeposit.CashDeposit_Dao;

/**
 * Servlet implementation class Transfer
 */
@WebServlet("/Transfer")
public class Transfer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transfer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int acnt=Integer.parseInt(request.getParameter("acnt"));
		int cash=Integer.parseInt(request.getParameter("cash"));
		int acnt2=Integer.parseInt(request.getParameter("acnt2"));
		String pass=request.getParameter("pass");
		
		TransferDao dao=new TransferDao();
		
		if(dao.check(acnt,pass,cash,acnt2))
		{
			response.sendRedirect("Success.jsp");
		}
		else
		{
			response.sendRedirect("Error.jsp");
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
