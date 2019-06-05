package com.ysd.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.MemberDao;
import com.jiaju.daoimpl.MemberDaoImpl;
import com.jiaju.entity.Member;

public class HProductServlet extends BaseServlet {

		MemberDao pdao =new MemberDaoImpl();
	public void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		    String userName=request.getParameter("username");
		    String userPassword=request.getParameter("password");
		    Member list=pdao.querySQL(userName, userPassword);
		    if(list!=null){
		    	request.getRequestDispatcher("admin/index.jsp").forward(request, response);
		    }
	}

}
