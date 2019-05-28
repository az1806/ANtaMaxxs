package com.jiaju.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jiaju.dao.NewsinDao;
import com.jiaju.entity.Newsin;
import com.jiaju.entity.Productlist;
import com.jiaju.util.DBManager;

public class NewsinDaoImpl implements NewsinDao{

	@Override
	public List<Newsin> getAllNewsinDao() {
		List<Newsin> list =new ArrayList<Newsin>();
		
		
		ResultSet rs=DBManager.querySQL("SELECT * FROM antadb.newsin;");
		try {
			while(rs.next()){
				Newsin bl=new Newsin();
			bl.setId(rs.getInt(1));
		    bl.setZixun(rs.getString(2));
		    bl.setXiangqing(rs.getString(3));
		    bl.setDate(rs.getString(4));
		
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
