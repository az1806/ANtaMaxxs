package com.jiaju.dao;

import java.util.List;

import com.jiaju.entity.Company;

public interface CompanyDao {

	
	       Company getAllCompanyDao();
	      
	       int updatecompany(int id, String Corporation,String Address,String jieshao,String Zipcode,String email,String city,String img,String jianjie,String wenhua);
}
