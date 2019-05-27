package com.jiaju.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jiaju.dao.ProductlistDao;
import com.jiaju.entity.Productlist;
import com.jiaju.entity.Producttype;
import com.jiaju.util.DBManager;

public class ProductlistDaoImpl  implements ProductlistDao{

	@Override
	public List<Productlist> getAllProductlistDao() {
		List<Productlist> list = new ArrayList<Productlist>();
		
		ResultSet rs=DBManager.querySQL("select * from productlist");
		
		try {
			while(rs.next()){
				Productlist bl=new Productlist();
			bl.setId(rs.getInt(1));
			bl.setName(rs.getString(2));
			bl.setSize(rs.getString(3));
			bl.setColor(rs.getString(4));
			bl.setSum(rs.getString(5));
			bl.setJiaqian(rs.getString(6));
			bl.setFenlei(rs.getString(7));
			bl.setXilie(rs.getString(8));
			bl.setImg(rs.getString(9));
			
			list.add(bl);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
