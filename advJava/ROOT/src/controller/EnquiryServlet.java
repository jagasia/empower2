package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Enquiry;
import model.EnquiryDAO;

/**
 * Servlet implementation class EnquiryServlet
 */
@WebServlet("/EnquiryServlet")
public class EnquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnquiryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int eid=1;
		if(request.getParameter("eid")!=null)
			eid=Integer.parseInt(request.getParameter("eid"));
		String firstName="";
		if(request.getParameter("firstName")!=null)
			firstName=request.getParameter("firstName");
		String lastName="";
		if(request.getParameter("lastName")!=null)
			lastName=request.getParameter("lastName");
		String email="";
		if(request.getParameter("email")!=null)
			email=request.getParameter("email");
		String phone="";
		if(request.getParameter("phone")!=null)
			phone=request.getParameter("phone");
		Enquiry enquiry=new Enquiry(firstName, lastName, email, phone);
		EnquiryDAO edao=new EnquiryDAO();
		try {
			edao.addEnquiry(enquiry);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			response.getWriter().println(e.getMessage());
		}
		response.getWriter().print("Thank you for writing to us. We will call you back or write to you shortly. Click<a href=http://upskillit.com > here </a>to go to Home page");
	}

}
