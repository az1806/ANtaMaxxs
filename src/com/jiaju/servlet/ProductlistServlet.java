package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.jiaju.dao.ProductlistDao;
import com.jiaju.dao.ProducttypeDao;
import com.jiaju.daoimpl.ProductlistDaoImpl;
import com.jiaju.daoimpl.ProducttypeDaoImpl;
import com.jiaju.entity.Productlist;
import com.jiaju.entity.Producttype;

public class ProductlistServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * 获取商品分类
		 */
		ProducttypeDao lbdao=new ProducttypeDaoImpl();
		List<Producttype> lblist=lbdao.getAllProducttype();
		request.setAttribute("lblist", lblist);
		
	  /**
	   * 根据类别显示产品列表
	   */
		Integer typeid;
		if(request.getParameter("typeid")!=null){
			typeid=Integer.parseInt(request.getParameter("typeid"));
			
		}else{
			
			typeid=1;
		}
		
		
		
		int cpid;
		if(request.getParameter("cpid")!=null){
			
			 cpid=Integer.parseInt(request.getParameter("cpid"));
		}
		
		ProductlistDao prodaos=new ProductlistDaoImpl();
		List<Productlist> getpro=prodaos.Getproduct();
		request.setAttribute("getpro", getpro);
		
		
		
		ProductlistDao prodao=new ProductlistDaoImpl();
		List<Productlist> prolist=prodao.getAllProduct(typeid);
          request.setAttribute("prolist", prolist);
		
		

		request.getRequestDispatcher("productlist.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
