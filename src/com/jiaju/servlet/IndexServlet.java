package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.CompanyDao;
import com.jiaju.dao.ProductlistDao;
import com.jiaju.dao.ProducttypeDao;
import com.jiaju.daoimpl.CompanyDaoImpl;
import com.jiaju.daoimpl.ProductlistDaoImpl;
import com.jiaju.daoimpl.ProducttypeDaoImpl;
import com.jiaju.entity.Company;
import com.jiaju.entity.Productlist;
import com.jiaju.entity.Producttype;

public class IndexServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * ��ȡ��˾��Ϣ
		 */
		CompanyDao cpd = new CompanyDaoImpl();
        Company cpdy = cpd.getAllCompanyDao();
    	request.setAttribute("cpdy", cpdy);
		 /**
		  * ��ȡ��Ʒ��Ϣ
		  */
    	ProductlistDao ldbao = new ProductlistDaoImpl();
		List<Productlist> ldlist = ldbao.getAllProductlistDao();
		request.setAttribute("ldlist", ldlist);
		
		/**
		 * ��ȡ��Ʒ����
		 */
		ProducttypeDao lbdao=new ProducttypeDaoImpl();
		List<Producttype> lblist=lbdao.getAllProducttype();
		request.setAttribute("lblist", lblist);
		
		/**
		 * ���ݲ���Ʒid��ȡ��Ʒ
		 */
		int cpid;
		if(request.getParameter("cpid")!=null){
			
			 cpid=Integer.parseInt(request.getParameter("cpid"));
		}
		
		ProductlistDao prodaos=new ProductlistDaoImpl();
		List<Productlist> getpro=prodaos.Getproduct();
		request.setAttribute("getpro", getpro);
		
		
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}
