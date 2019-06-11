package com.jiaju.dao;

import java.util.List;

import com.jiaju.entity.Newsintype;

public interface NewsintypeDao {

	
	 		List<Newsintype> getAllNewsintypeDao();
	 		int zxadd(String leibie);
	 		int zxdelete(int id);
	 		Newsintype getzx(int id);
	 		int zxupdate(int id,String leibie);
}
