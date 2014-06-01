	package DefaultNamespace;

import java.io.IOException;

//import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import viewPackage.View_adv;
//import java.util.*;
//import java.io.*;


/**
 * Servlet implementation class viewAdd
 */
public class viewAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MarketServiceProxy proxy = new MarketServiceProxy();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
//	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
//	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	//public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
	//	return null;
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
		response.setContentType("text/html");
		HttpSession session = request.getSession(); 	
		proxy.setEndpoint("http://localhost/SimpleMarketPlace/services/marketService?wsdl");
		String userid = (String) session.getAttribute("userid");
		System.out.println("userid in viewAdd"+userid);
		View_adv[] l = proxy.viewAdv(userid);
		//System.out.println(" View_adv object "+ l);
		session.setAttribute("counter","1"); 	

		System.out.println("Inside view add servlet"); 	
	
		session.setAttribute("l",l); 		
		session.setAttribute("counter","1");
		
		 RequestDispatcher rd=request.getRequestDispatcher("/JSP/viewAdv.jsp");  
		    rd.forward(request,response);  
		}catch(NullPointerException e) { System.out.println("Null Pointer Exception");
			}

	}

}
