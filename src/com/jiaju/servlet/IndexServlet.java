package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.CompanyDao;
import com.jiaju.dao.ProductlistDao;
import com.jiaju.daoimpl.CompanyDaoImpl;
import com.jiaju.daoimpl.ProductlistDaoImpl;
import com.jiaju.entity.Company;
import com.jiaju.entity.Productlist;

public class IndexServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CompanyDao cpd = new CompanyDaoImpl();
        Company cpdy = cpd.getAllCompanyDao();
    	request.setAttribute("cpdy", cpdy);
		 
    	ProductlistDao ldbao = new ProductlistDaoImpl();
		List<Productlist> ldlist = ldbao.getAllProductlistDao();
		request.setAttribute("ldlist", ldlist);
		
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}
