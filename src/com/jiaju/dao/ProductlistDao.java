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
	        
	        List<Productlist> Getproduct();
	        
}
