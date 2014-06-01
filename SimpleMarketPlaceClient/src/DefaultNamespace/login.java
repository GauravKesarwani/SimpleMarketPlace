package DefaultNamespace;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;


/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext servContext;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login(){
        super();
       // servContext = config.getServletContext();
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
		
		String userid=request.getParameter("username");
		String passwd=request.getParameter("passwd1");
		
		System.out.println("userid entered "+ userid);
		System.out.println("password entered "+ passwd);
		HttpSession session = request.getSession();
		
		
		MarketServiceProxy proxy = new MarketServiceProxy();
		proxy.setEndpoint("http://localhost/SimpleMarketPlace/services/marketService?wsdl");
		
		String llogin = proxy.llogin(userid);
		if (llogin!="")
		{
			session.setAttribute("llogin",llogin);
		}
		boolean flag = proxy.login(userid,passwd);
		if (flag){ 		
		
			session.setAttribute("userid",userid);	
			String userDetails=proxy.getUserDetails(userid); 			
			session.setAttribute("loginUser",userDetails);
			response.sendRedirect("/SimpleMarketPlaceClient/JSP/advertise.jsp"); 			
		}
			
		else {
			request.setAttribute("errorSignup","Invalid password!!Please enter correct password.");
		RequestDispatcher rd = request.getRequestDispatcher("/JSP/signin.jsp");
		rd.forward(request,response); }
		
		}
}
