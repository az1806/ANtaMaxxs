package com.anta.servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.ProducttypeDao;
import com.jiaju.daoimpl.ProducttypeDaoImpl;
import com.jiaju.entity.Producttype;


public class ProductServlet extends BaseServlet {
	
	ProducttypeDao lbdao=new ProducttypeDaoImpl();
	public void getAllProductCates(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		List<Producttype> list = lbdao.getAllProducttype();
		request.setAttribute("list", list);
		request.getRequestDispatcher("product-cate.jsp").forward(request, response);
	}
	public void Producttypeadd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String leibie=request.getParameter("leibie");
		int lei=lbdao.Producttypeadd(leibie);
		if(lei>0){
			List<Producttype> list = lbdao.getAllProducttype();
			request.setAttribute("list", list);
			request.getRequestDispatcher("product-cate.jsp").forward(request, response);
		}
	}
	public void deletetype(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		int lei = lbdao.deletetypeById(id);
		if (lei > 0) {
			List<Producttype> list = lbdao.getAllProducttype();
			request.setAttribute("list", list);
			request.getRequestDispatcher("product-cate.jsp").forward(request, response);
		}
	}
	public void gettypeById(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		Producttype lei = lbdao.gettypeById(id);
		request.setAttribute("lei", lei);
		request.getRequestDispatcher("ProductUpdate.jsp").forward(request, response);
	}
	public void updatetypeById(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String leibie = request.getParameter("leibie");
		int n = lbdao.updatetypeById(id, leibie);
		if (n > 0) {
			out.println("<script>window.parent.location.reload();</script>");
		}
	}
}
