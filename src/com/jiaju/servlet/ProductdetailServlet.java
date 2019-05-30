package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.ProductlistDao;
import com.jiaju.dao.ProducttypeDao;
import com.jiaju.daoimpl.ProductlistDaoImpl;
import com.jiaju.daoimpl.ProducttypeDaoImpl;
import com.jiaju.entity.Productlist;
import com.jiaju.entity.Producttype;

public class ProductdetailServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
             
		ProducttypeDao typedao=new ProducttypeDaoImpl();
		List<Producttype> typelist=typedao.getAllProducttype();
		   request.setAttribute("typelist", typelist);
		   
		   /**
		    * 获取所有产品;
		    */
		   int cpid;
			if(request.getParameter("cpid")!=null){
				
				 cpid=Integer.parseInt(request.getParameter("cpid"));
			}
			
			ProductlistDao prodaos=new ProductlistDaoImpl();
			List<Productlist> getpro=prodaos.Getproduct();
			request.setAttribute("getpro", getpro);
		   
		
		request.getRequestDispatcher("productdetails.jsp").forward(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
