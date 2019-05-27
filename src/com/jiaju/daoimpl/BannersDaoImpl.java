package com.jiaju.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import com.jiaju.dao.BannersDao;
import com.jiaju.entity.Banners;
import com.jiaju.entity.Producttype;
import com.jiaju.util.DBManager;

public class BannersDaoImpl implements BannersDao {

	@Override
	public List<Banners> getAllBannersDao() {
		 List<Banners> list = new ArrayList<Banners>();
		 ResultSet rs=DBManager.querySQL("select * from banners");
		 try {
				while(rs.next()){
					Banners bl=new Banners();
				bl.setId(rs.getInt(1));
				bl.setImages(rs.getString(2));
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
