package com.ysd.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.ProducttypeDao;
import com.jiaju.daoimpl.ProducttypeDaoImpl;
import com.jiaju.util.DBManager;

public class ProductServlet extends BaseServlet {
	ProducttypeDao pdao=new ProducttypeDaoImpl();
	public void add(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String leibie=request.getParameter("leibie");
		int lei=DBManager.updateSQL(leibie);
		if(lei>0){
			System.out.println("success");
		}
	}

}
