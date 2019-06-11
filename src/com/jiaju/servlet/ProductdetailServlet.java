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

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProducttypeDao typedao = new ProducttypeDaoImpl();
		List<Producttype> typelist = typedao.getAllProducttype();
		request.setAttribute("typelist", typelist);

		/**
		 * 根据id获取产品;
		 */
		int cpid = 0;
		if (request.getParameter("cpid") != null) {
			cpid = Integer.parseInt(request.getParameter("cpid"));
		}
		ProductlistDao prodaos = new ProductlistDaoImpl();
		List<Productlist> getpro = prodaos.Getproduct(cpid);
		System.out.println(getpro);
		request.setAttribute("getpro", getpro);
		
		
		/**
		 * 获取所有产品
		 */
		ProductlistDao proall=new ProductlistDaoImpl();
		List<Productlist> proalls =proall.productAll();
		request.setAttribute("proalls",proalls);
		

		request.getRequestDispatcher("productdetails.jsp").forward(request,
				response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}