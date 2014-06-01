package DefaultNamespace;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import viewPackage.*;

/**
 * Servlet implementation class buyProd
 */
public class buyProd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public buyProd() {
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

		String myform[] = request.getParameterValues("htmlFormName");
		String action = request.getParameter("action");
		request.getParameter("hiddenqty");
		HttpSession session = request.getSession();
		System.out.println(action);
		ArrayList<View_adv>  productList = (ArrayList<View_adv>)session.getAttribute("List");
		if(null==productList){
			productList =new ArrayList<View_adv>();
		}
		if (action.equals("BUYPRODUCT")) {
			View_adv[] l= (View_adv[]) session.getAttribute("l");
			boolean flag=false;
			for(int i=0;i<l.length;i++){ 			
				if (myform[0].equals("myForm"+i)){ 								

					request.setAttribute("myform", myform[0]);
					View_adv a=new View_adv();
					a.setAdvID(l[i].getAdvID());
					a.setItemDesc(l[i].getItemDesc());
					a.setItemName(l[i].getItemName());
					a.setItemPrice(l[i].getItemPrice());
					a.setItemQuantity(l[i].getItemQuantity());
					a.setSellerInfo(l[i].getSellerInfo());
					
					System.out.println(request.getParameter("qty"));
					if(null==request.getParameter("qty"))
					{
						a.setNewQuantity("1");
					}else{
						l[i].setNewQuantity(request.getParameter("qty"));
						a.setNewQuantity(request.getParameter("qty"));
					}
					for (View_adv p: productList){
						if (p.getAdvID() == a.getAdvID()){
							a.setNewQuantity(request.getParameter("qty"));
							p.setNewQuantity(request.getParameter("qty"));
							flag=true;
						}
					}

					if(!flag)productList.add(a);
				}}
			session.setAttribute("List", productList);	
			session.setAttribute("l",l);
			RequestDispatcher rd = request.getRequestDispatcher("/JSP/buyProduct.jsp");
			rd.forward(request,response);

		}	

		if(action.equals("DELETE")){

			String del = request.getParameter("delindex");
			int d = (new Integer(del)).intValue();
			productList.remove(d);
			session.setAttribute("List", productList);	
			RequestDispatcher rd = request.getRequestDispatcher("/JSP/buyProduct.jsp");
			rd.forward(request,response);

		}if(action.equals("SHOPPING")){

			session.setAttribute("List", productList);	
			RequestDispatcher rd = request.getRequestDispatcher("/JSP/viewAdv.jsp");
			rd.forward(request,response);
		}
		if(action.equals("ORDER")){
			float total =0;
			productList = (ArrayList<View_adv>)session.getAttribute("List");
			
		      for (int i=0; i< productList.size();i++) {
		        
		    	View_adv obj = (View_adv) productList.get(i);
		        float price= Float.parseFloat(obj.getItemPrice());
		        int qty = Integer.parseInt(obj.getNewQuantity());
		        total += (price * qty);
		      }
		      total += 0.005;
		      String amount = new Float(total).toString();
		      int n = amount.indexOf('.');
		      amount = amount.substring(0,n+3);
		      session.setAttribute("amount",amount);
			
			RequestDispatcher rd = request.getRequestDispatcher("/JSP/payment.jsp");
			rd.forward(request,response);
		}




	}
}


