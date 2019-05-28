package com.jiaju.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jiaju.dao.NewsintypeDao;
import com.jiaju.entity.Newsin;
import com.jiaju.entity.Newsintype;
import com.jiaju.util.DBManager;

public class NewsintypeDaoImpl implements NewsintypeDao {

	@Override
	public List<Newsintype> getAllNewsintypeDao() {
		List<Newsintype> list = new ArrayList<Newsintype>();
		
		
		ResultSet rs=DBManager.querySQL("SELECT * FROM antadb.newsintype;");
		
		try {
			while(rs.next()){
				Newsintype bl=new Newsintype();
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

}
