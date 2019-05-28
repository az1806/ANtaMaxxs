package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.NewsintypeDao;
import com.jiaju.daoimpl.NewsintypeDaoImpl;
import com.jiaju.entity.Newsintype;

public class Article_list_contentServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  
		NewsintypeDao ntd = new NewsintypeDaoImpl();
		List<Newsintype> list = ntd.getAllNewsintypeDao();
		request.setAttribute("list", list);
		

		request.getRequestDispatcher("article_list_content.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
