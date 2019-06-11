package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.BannersDao;
import com.jiaju.dao.CompanyDao;
import com.jiaju.daoimpl.BannersDaoImpl;
import com.jiaju.daoimpl.CompanyDaoImpl;
import com.jiaju.entity.Banners;
import com.jiaju.entity.Company;


public class ContactServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	/**
	 * 联系我们的公司信息
	 */
		
	 	CompanyDao cpd = new CompanyDaoImpl();
        Company cpdy = cpd.getAllCompanyDao();
    	request.setAttribute("cpdy", cpdy);
		request.getRequestDispatcher("contact.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
