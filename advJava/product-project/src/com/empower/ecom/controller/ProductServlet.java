package com.empower.ecom.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empower.ecom.model.Product;
import com.empower.ecom.model.ProductDao;
import com.empower.ecom.model.ProductDaoImpl;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet({ "/ProductServlet", "/product.do", "/product" })
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
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
		String btn=request.getParameter("btn");
		PrintWriter out = response.getWriter();
//		out.print("You pressed "+btn+" button");
		Product product=new Product();
		ProductDao pdao=new ProductDaoImpl();
		Integer id=0;
		String name="";
		Double price=0.0;
		switch(btn)
		{
		case "Add":
			id=Integer.parseInt(request.getParameter("id"));
			name=request.getParameter("name");
			price=Double.parseDouble(request.getParameter("price"));
			product.setId(id);
			product.setName(name);
			product.setPrice(price);
			try {
				pdao.create(product);
			} catch (SQLException e) {
				out.print(e.getMessage());
			}
			break;
		case "Update":
			System.out.println("Update started");
			id=Integer.parseInt(request.getParameter("id"));
			name=request.getParameter("name");
			price=Double.parseDouble(request.getParameter("price"));
			product.setId(id);
			product.setName(name);
			product.setPrice(price);
			try {
				pdao.update(product);
			} catch (SQLException e) {
				out.print(e.getMessage());
			}
			break;
		case "Delete":
			id=Integer.parseInt(request.getParameter("id"));
			try {
				pdao.delete(id);
			} catch (SQLException e) {
				out.print(e.getMessage());
			}
			break;
		}
		response.sendRedirect("product.jsp");
	}

}
