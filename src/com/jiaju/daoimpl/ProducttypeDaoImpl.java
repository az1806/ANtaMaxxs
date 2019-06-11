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
	public int Producttypeadd(String leibie) {
		return DBManager.updateSQL("insert into producttype(leibie) value('"+leibie+"')");
	}
	@Override
	public int deletetypeById(int id) {
		return DBManager.updateSQL("delete from producttype where id=" + id);
	}
	@Override
	public Producttype gettypeById(int id) {
		try {
		
			ResultSet rs = DBManager.querySQL("select * from producttype where id=" + id);
			while(rs.next()){
				int Id = rs.getInt(1);
				String leibie = rs.getString(2);
				return new Producttype(Id, leibie);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int updatetypeById(int id, String leibie) {
		return DBManager.updateSQL("update producttype set leibie='"+leibie+"' where id=" + id);
	}


}



