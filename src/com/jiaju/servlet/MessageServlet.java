package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.MessageDao;
import com.jiaju.daoimpl.MessageDaoImpl;



public class MessageServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		MessageDao mDao = new MessageDaoImpl();
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String content = request.getParameter("content");
		
		if (username==null || username.equals("") || email==null || email.equals("")) {
			out.println("<script>alert('信息不能为空!');" +
					"location.href='message.jsp';</script>");
		} else {
			int n = mDao.insertMessage(username, email, phone, content);
			if (n > 0) {
				out.println("<script>alert('留言成功!');" +
						"location.href='index.jsp';</script>");
			} else {
				out.println("<script>alert('留言失败!');" +
						"location.href='message.jsp';</script>");
			}
		}
		
		request.getRequestDispatcher("message.jsp").forward(request, response);
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
