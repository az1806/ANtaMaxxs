package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.CompanyDao;
import com.jiaju.dao.NewsinDao;
import com.jiaju.dao.ProductlistDao;
import com.jiaju.dao.ProducttypeDao;
import com.jiaju.daoimpl.CompanyDaoImpl;
import com.jiaju.daoimpl.NewsinDaoImpl;
import com.jiaju.daoimpl.ProductlistDaoImpl;
import com.jiaju.daoimpl.ProducttypeDaoImpl;
import com.jiaju.entity.Company;
import com.jiaju.entity.Newsin;
import com.jiaju.entity.Productlist;
import com.jiaju.entity.Producttype;

public class IndexServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * 获取公司信息
		 */
		CompanyDao cpd = new CompanyDaoImpl();
        Company cpdy = cpd.getAllCompanyDao();
    	request.setAttribute("cpdy", cpdy);
		 /**
		  * 获取商品信息
		  */
    	ProductlistDao ldbao = new ProductlistDaoImpl();
		List<Productlist> ldlist = ldbao.getAllProductlistDao();
		request.setAttribute("ldlist", ldlist);
		
		/**
		 * 获取产品分类
		 */
		ProducttypeDao lbdao=new ProducttypeDaoImpl();
		List<Producttype> lblist=lbdao.getAllProducttype();
		request.setAttribute("lblist", lblist);
		
		/**
		 * 根据产产品id获取商品
		 */
		int cpid=0;
		if(request.getParameter("cpid")!=null){
			
			 cpid=Integer.parseInt(request.getParameter("cpid"));
		}
		
		ProductlistDao prodaos=new ProductlistDaoImpl();
		List<Productlist> getpro=prodaos.Getproduct(cpid);
		request.setAttribute("getpro", getpro);
		/**
		 * 获取资讯列表
		 */
		NewsinDao nsd = new NewsinDaoImpl();
		List<Newsin> nsn = nsd.getAllNewsinDao();
		System.out.println(nsn);
		request.setAttribute("nsn", nsn);
		
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}
