package com.anta.servlet.admin;

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

public class ZiXunServlet extends BaseServlet {
	NewsinDao listdao=new NewsinDaoImpl(); 
	public void getAllNewsinDao(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		List<Newsin> list = listdao.getAllNewsinDao();
		request.setAttribute("list", list);
		request.getRequestDispatcher("newsin.jsp").forward(request, response);
	}
	public void newsinadd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String zixun=request.getParameter("zixun");
		String xiangqing=request.getParameter("xiangqing");
		String date=request.getParameter("date");
		int zx=listdao.newsinadd(zixun, xiangqing, date);
		if(zx>0){
			List<Newsin> list = listdao.getAllNewsinDao();
			request.setAttribute("list", list);
			request.getRequestDispatcher("newsin.jsp").forward(request, response);
		}
	}
	public void newsindelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		int shan=listdao.newsindelete(id);
		if(shan>0){
			List<Newsin> list = listdao.getAllNewsinDao();
			request.setAttribute("list", list);
			request.getRequestDispatcher("newsin.jsp").forward(request, response);
		}
	}
	public void getnew(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Newsin list = listdao.getnew(id);
		request.setAttribute("list", list);
		request.getRequestDispatcher("newsinupdate.jsp").forward(request, response);
	}
	public void newsinupdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String zixun=request.getParameter("zixun");
		String xiangqing=request.getParameter("xiangqing");
		String date=request.getParameter("date");
		String fenlei=request.getParameter("fenlei");
		int n=listdao.newsinupdate(id, zixun, xiangqing, date,fenlei);
		if(n>0){
			out.print("<script>window.parent.location.reload();</script>");
		}
		
	}
	
	
	
}
