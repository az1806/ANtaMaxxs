package com.jiaju.dao;

import java.util.List;

import com.jiaju.entity.Productlist;

public interface ProductlistDao {
     
	
	        List<Productlist> getAllProductlistDao();
	        
	        /**
	         * ��Ʒ���
	         * @param id
	         * @return
	         */
	   
	        List<Productlist> getAllProduct(int typeid);
	        /**
	         * ��ȡ���в�Ʒ
	         * @return
	         */
	        
	        List<Productlist> Getproduct();
	        
}
