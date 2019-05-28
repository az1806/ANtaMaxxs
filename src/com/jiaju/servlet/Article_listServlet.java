package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.NewsinDao;
import com.jiaju.daoimpl.NewsinDaoImpl;
import com.jiaju.entity.Newsin;


public class Article_listServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		   NewsinDao nsd = new   NewsinDaoImpl();
		   List <Newsin> nsn = nsd.getAllNewsinDao();
		   request.setAttribute("nsn", nsn);
		

		request.getRequestDispatcher("article_list.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
