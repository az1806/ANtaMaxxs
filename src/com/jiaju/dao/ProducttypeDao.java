package com.jiaju.dao;

import java.util.List;

import com.jiaju.entity.Producttype;

public interface ProducttypeDao {
	//���ݲ�Ʒ������
	
	
	
	  List<Producttype> getAllProducttype();
	  int Producttypeadd(String leibie);
	  int deletetypeById(int id);
	  Producttype gettypeById(int id);
	  int updatetypeById(int id, String leibie);
}
