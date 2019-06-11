package com.jiaju.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jiaju.dao.NewsinDao;
import com.jiaju.entity.Newsin;
import com.jiaju.entity.Productlist;
import com.jiaju.util.DBManager;

public class NewsinDaoImpl implements NewsinDao {
/**
 * 根据id获取资讯详情
 */
	@Override
	public List<Newsin> getAllNewsinDaos(int id) {
		List<Newsin> list = new ArrayList<Newsin>();

		ResultSet rs = DBManager
				.querySQL("SELECT * FROM antadb.newsin where id=" + id);
		try {
			while (rs.next()) {
				Newsin bl = new Newsin();
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
/**
 * 获取资讯列表
 */
	public List<Newsin> getAllNewsinDao() {
		List<Newsin> list = new ArrayList<Newsin>();

		ResultSet rs = DBManager.querySQL("SELECT * FROM antadb.newsin ");
		try {
			while (rs.next()) {
				Newsin bl = new Newsin();
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

	
	
	
	
	/**
	 * 根据id跳转上一篇下一篇资讯详情
	 */
	
	@Override
	public int newsinadd(String zixun, String xiangqing, String date) {
		return DBManager.updateSQL("INSERT INTO antadb.newsin (zixun,xiangqing,date) VALUES ('"+zixun+"','"+xiangqing+"','"+date+"');");
	}

	@Override
	public int newsindelete(int id) {
		return DBManager.updateSQL("delete from antadb.newsin where id=" + id);
		
	}

	@Override
	public Newsin getnew(int id) {
		ResultSet rs= DBManager.querySQL("select * from antadb.newsin where id=" + id);
		try {
			while(rs.next()){
				int Id=rs.getInt(1);
				String zixun=rs.getString(2);
				String xiangqing=rs.getString(3);
				String date=rs.getString(4);
				String fenlei = rs.getString(5);
				return new Newsin(Id,zixun,xiangqing,date,fenlei);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int newsinupdate(int id, String zixun, String xiangqing,
			String date, String fenlei) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}


