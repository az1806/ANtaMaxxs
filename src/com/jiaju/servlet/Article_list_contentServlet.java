package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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

public class Article_list_contentServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		NewsintypeDao ntd = new NewsintypeDaoImpl();
		List<Newsintype> list = ntd.getAllNewsintypeDao();
		request.setAttribute("list", list);
      
	
		String i = request.getParameter("id");

		NewsinDao nsd = new NewsinDaoImpl();
		if(i==null){
			i="1";
			int	id = Integer.parseInt(i);
			List<Newsin> nsn = nsd.getAllNewsinDaos(id);
			request.setAttribute("nsn", nsn);
       }else{
    	   int	id = Integer.parseInt(i);
			List<Newsin> nsn = nsd.getAllNewsinDaos(id);
			request.setAttribute("nsn", nsn);
       }
		
		request.getRequestDispatcher("article_list_content.jsp").forward(
				request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
