package com.anta.servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.CompanyDao;
import com.jiaju.daoimpl.CompanyDaoImpl;
import com.jiaju.entity.Company;

public class CompanyServlet extends BaseServlet {
	CompanyDao gsdao = new CompanyDaoImpl();

	public void getAllCompanyDao(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Company gs = gsdao.getAllCompanyDao();
		request.setAttribute("gs", gs);
		request.getRequestDispatcher("admin/company.jsp").forward(request,response);
	}
	public void updatecompany(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String Corporation = request.getParameter("Corporation");
		String Address = request.getParameter("Address");
		String jieshao = request.getParameter("jieshao");
		String Zipcode = request.getParameter("Zipcode");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		String img = request.getParameter("img");
		String jianjie = request.getParameter("jianjie");
		String wenhua = request.getParameter("wenhua");
		int n = gsdao.updatecompany(id, Corporation, Address, jieshao, Zipcode, email, city, img, jianjie, wenhua);
		if (n > 0) {
			out.println("<script>window.location.reload();</script>");
		}
	}
}