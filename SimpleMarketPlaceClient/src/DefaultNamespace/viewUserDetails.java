package DefaultNamespace;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import viewPackage.BoughtItems;
import viewPackage.SoldItems;

/**
 * Servlet implementation class viewUserDetails
 */
public class viewUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewUserDetails() {
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
		
	//	String userid=request.getParameter("userid");
		HttpSession s = request.getSession();
		String userid = (String) s.getAttribute("userid");
		
		MarketServiceProxy proxy = new MarketServiceProxy();
		proxy.setEndpoint("http://localhost/SimpleMarketPlace/services/marketService?wsdl");
		BoughtItems[] userA = proxy.getUserAccount(userid);
		SoldItems[] soldA = proxy.getUserSoldItems(userid);
		
		s.setAttribute("userA", userA);
		s.setAttribute("soldA", soldA);

		RequestDispatcher rd=request.getRequestDispatcher("/JSP/userDetails.jsp");  
		rd.forward(request,response); 
	}

}
