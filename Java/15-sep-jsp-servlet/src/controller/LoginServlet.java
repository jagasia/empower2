package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		response.setContentType("text/html");	//MIME type 
		PrintWriter out = response.getWriter();
		if(username.equals(password))
		{
//			out.print("<font color=red>Login Failed</font>");
//			response.sendRedirect("login.jsp?message=Login Failed");
			out.print("<form action=\"LoginServlet\" method=\"post\">\r\n" + 
					"	Username:<input type=\"text\" name=\"username\" /><br/>\r\n" + 
					"	Password:<Input type=\"password\" name=\"password\" /><br/>\r\n" + 
					"	<input type=\"submit\" value=\"Login\" />\r\n" + 
					"</form><br/><p style=color:red>Login Failed abcd....</p>");
		}else
		{
			out.println("<p style=color:green>Login Successful</p>");
		}
	}
	

}
