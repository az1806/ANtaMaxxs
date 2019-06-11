package com.jiaju.dao;

import java.util.List;

import com.jiaju.entity.Productlist;

public interface ProductlistDao {
     
	
	        List<Productlist> getAllProductlistDao();
	        
	        /**
	         * 产品类别
	         * @param id
	         * @return
	         */
	   
	        List<Productlist> getAllProduct(int typeid);
	        /**
	         * 获取所有产品
	         * @return
	         */
	        
	        List<Productlist> Getproduct(int id);
	        List<Productlist> productAll();
	        
	        
	        int addlist(String name,String size,String color,String sum,String jiaqian,String fenlei,String xilie,String img);
	        int deletelistById(int id);
	        Productlist getlistById(int id);
	        int updatelistById(int id,String name,String size,String color,String sum,String jiaqian,String fenlei,String xilie,String img);
	        
}
