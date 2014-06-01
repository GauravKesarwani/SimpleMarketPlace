package DefaultNamespace;


import java.io.IOException;

import javax.servlet.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
/**
 * Servlet implementation class postAdd
 */
public class postAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MarketServiceProxy proxy;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public postAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		proxy = new MarketServiceProxy();
		proxy.setEndpoint("http://localhost/SimpleMarketPlace/services/marketService?wsdl");
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
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
		
		HttpSession session = request.getSession();
		String itemname= request.getParameter("itemName");
		String desc = request.getParameter("desc");
		String sellerInfo =  request.getParameter("sellerInfo");
		String price = request.getParameter("price");
		String quantity = request.getParameter("quty");
		String userid= (String)session.getAttribute("userid");
		proxy.postAdv(itemname,desc,sellerInfo,price,quantity,userid);
	}

}
