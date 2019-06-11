package com.anta.servlet.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.ProductlistDao;
import com.jiaju.daoimpl.ProductlistDaoImpl;
import com.jiaju.entity.Productlist;



public class Productlistservlet extends BaseServlet {

	
	ProductlistDao gd = new ProductlistDaoImpl();
	public void queryGoods(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProductlistDao gdd = new ProductlistDaoImpl();
		 List<Productlist> gdss= gdd.getAllProductlistDao();
		 request.setAttribute("gdss", gdss);
		
		 request.getRequestDispatcher("list.jsp").forward(request, response);

	}
}
