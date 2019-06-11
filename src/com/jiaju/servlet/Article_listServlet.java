package com.jiaju.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.NewsinDao;
import com.jiaju.dao.NewsintypeDao;
import com.jiaju.daoimpl.NewsinDaoImpl;
import com.jiaju.daoimpl.NewsintypeDaoImpl;
import com.jiaju.entity.Newsin;
import com.jiaju.entity.Newsintype;

public class Article_listServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(123);
		/*
		 * 获取资讯详情
		 */
		NewsinDao nsd = new NewsinDaoImpl();
		List<Newsin> nsn = nsd.getAllNewsinDao();
		System.out.println(nsn);
		request.setAttribute("nsn", nsn);

		/*
		 * 获取资讯类别
		 */

		NewsintypeDao newsdao = new NewsintypeDaoImpl();

		List<Newsintype> listss = newsdao.getAllNewsintypeDao();
		System.out.println(listss);

		request.setAttribute("listss", listss);

		request.getRequestDispatcher("article_list.jsp").forward(request,
				response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
