package DefaultNamespace;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Register
 */
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
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try {
			String userid = request.getParameter("userid");
			String fName = request.getParameter("firstname");
			String lName = request.getParameter("lastname");
			String passwd = request.getParameter("passwd");   
			String emailId = request.getParameter("email");
		//	System.out.println("Inside Servlet");
			MarketServiceProxy proxy = new MarketServiceProxy();
			proxy.setEndpoint("http://localhost/SimpleMarketPlace/services/marketService?wsdl");
			proxy.register(userid,fName,lName,emailId,passwd); 	
		
			RequestDispatcher rd = request.getRequestDispatcher("/JSP/signin.jsp");
			rd.forward(request,response);
			//out.println("Welecome to MarketPlace");
		}catch(Exception e){ }
	}
}


