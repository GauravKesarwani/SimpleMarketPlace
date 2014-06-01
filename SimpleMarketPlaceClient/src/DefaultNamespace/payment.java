package DefaultNamespace;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import viewPackage.View_adv;

import java.util.ArrayList;

/**
 * Servlet implementation class payment
 */
public class payment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public payment() {
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
		
		int i=0;
		HttpSession session= request.getSession();
		String userid = (String)session.getAttribute("userid");
		ArrayList<View_adv> l = (ArrayList<View_adv>)session.getAttribute("List");
		if(l!=null){
		for(i=0;i<l.size();i++){
			View_adv val=l.get(i);
			MarketServiceProxy proxy = new MarketServiceProxy();
			proxy.updateSoldItems(val.getAdvID(), val.getNewQuantity());			
			proxy.updateBoughtItems(val.getAdvID(),userid,val.getNewQuantity());
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher("/JSP/paySuccess.jsp");
		rd.forward(request,response);
	}
}

