package com.jiaju.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.jiaju.dao.CompanyDao;
import com.jiaju.entity.Company;

import com.jiaju.util.DBManager;

public class CompanyDaoImpl implements CompanyDao {

	/**
	 * 获取所有公司信息
	 */
	@Override
	public Company getAllCompanyDao() {

		ResultSet rs = DBManager.querySQL("select * from company ");
		Company lb = new Company();
		try {
			while (rs.next()) {

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

	
	
	
	
	@Override
	public int updatecompany(int id, String Corporation, String Address, String jieshao,
			String Zipcode, String email, String city, String img,
			String jianjie, String wenhua) {
		return DBManager.updateSQL("update company set Corporation='"+Corporation+"' Address='"+Address+"' " +
				"jieshao='"+jieshao+"' Zipcode='"+Zipcode+"' email='"+email+"' city='"+city+"' img='"+img+
				"' jianjie='"+jianjie+"' wenhua='"+wenhua+"'  where id=" + id);
	}

}
