package com.jiaju.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jiaju.dao.CompanyDao;
import com.jiaju.entity.Company;

import com.jiaju.util.DBManager;

public class CompanyDaoImpl implements CompanyDao {

	@Override
	public Company getAllCompanyDao() {
	
	 
	 
	 ResultSet rs=DBManager.querySQL("select * from company ");
	 Company lb=new Company();
	 try {
			while(rs.next()){
				
				
			lb.setId(rs.getInt(1));
			lb.setCorporation(rs.getString(2));
			lb.setAddress(rs.getString(3));
			lb.setJieshao(rs.getString(4));
			lb.setZipcode(rs.getString(5));
			lb.setEmail(rs.getString(6));
			lb.setCity(rs.getString(7));
			lb.setImg(rs.getString(8));
		   lb.setJianjie(rs.getString(9));
		   lb.setWenhua(rs.getString(10));
			
			
				
			}
			return lb;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return null;
	}

}
