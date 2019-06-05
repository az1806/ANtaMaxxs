package com.jiaju.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.jiaju.dao.ProducttypeDao;
import com.jiaju.entity.Producttype;
import com.jiaju.util.DBManager;


public class ProducttypeDaoImpl  implements ProducttypeDao {

	@Override
	public List<Producttype> getAllProducttype() {
		List<Producttype> list = new ArrayList<Producttype>();
		
		
		ResultSet rs=DBManager.querySQL("select * from Producttype ");
		
		try {
			while(rs.next()){
			Producttype bl=new Producttype();
			bl.setId(rs.getInt(1));
			bl.setLeibie(rs.getString(2));
			list.add(bl);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public int add(String leibie) {
		// TODO Auto-generated method stub
		return DBManager.updateSQL("INSERT INTO antadb.producttype (leibie) VALUES ('"+leibie+"');");
	}

	

}
