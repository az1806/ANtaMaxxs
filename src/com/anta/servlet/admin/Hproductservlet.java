package com.anta.servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.MemberDao;
import com.jiaju.daoimpl.MemberDaoImpl;
import com.jiaju.entity.Member;
import com.jiaju.util.Result;



public class Hproductservlet extends BaseServlet {
	/**
	 * 
	 */
	MemberDao pdao=new MemberDaoImpl();
	public void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			response.setCharacterEncoding("UTF-8");
			
			PrintWriter out = response.getWriter();
			String name=request.getParameter("username");
			String pass=request.getParameter("password");
		
			Member denglu=pdao.login(name,pass);
			if(denglu!=null){
				
				out.println(Result.toClient(true,"µÇÂ½³É¹¦"));
			}else {
				out.println(Result.toClient(false,"µÇÂ½Ê§°Ü"));
			}
	}

}
