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

public class ProductlistServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProducttypeDao lbdao=new ProducttypeDaoImpl();
		List<Producttype> lblist=lbdao.getAllProducttype();
		request.setAttribute("lblist", lblist);
		

		request.getRequestDispatcher("productlist.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
