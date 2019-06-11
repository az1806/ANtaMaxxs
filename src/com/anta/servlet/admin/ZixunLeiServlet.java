package com.anta.servlet.admin;

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

public class ZixunLeiServlet extends BaseServlet {
	NewsintypeDao lbdao=new NewsintypeDaoImpl();
	public void getAllNewsintypeDao(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Newsintype> list = lbdao.getAllNewsintypeDao();
		request.setAttribute("list", list);
		request.getRequestDispatcher("product-cate.jsp").forward(request, response);
	}

	public void zxadd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String leibie=request.getParameter("leibie");
		int lei=lbdao.zxadd(leibie);
		if(lei>0){
			List<Newsintype> list = lbdao.getAllNewsintypeDao();
			request.setAttribute("list", list);
			request.getRequestDispatcher("newsintype.jsp").forward(request, response);
		}
	}
	public void zxdelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		int lei = lbdao.zxdelete(id);
		if (lei > 0) {
			List<Newsintype> list = lbdao.getAllNewsintypeDao();
			request.setAttribute("list", list);
			request.getRequestDispatcher("newsintype.jsp").forward(request, response);
		}
	}
	public void getzx(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		Newsintype lei = lbdao.getzx(id);
		request.setAttribute("lei", lei);
		request.getRequestDispatcher("newsintypeUpdate.jsp").forward(request, response);
	}
	public void zxupdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String leibie = request.getParameter("leibie");
		int n = lbdao.zxupdate(id, leibie);
		if (n > 0) {
			out.println("<script>window.parent.location.reload();</script>");
		}
	}
	
	
	
	
	
	
	
}
