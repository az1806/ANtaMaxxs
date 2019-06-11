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
/**
 * 获取所有资讯类别
 */
	@Override
	public List<Newsintype> getAllNewsintypeDao() {
		List<Newsintype> list = new ArrayList<Newsintype>();
		
		
		ResultSet rs=DBManager.querySQL("SELECT * FROM antadb.newsintype");
		
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

	/**
	 * 根据id获取资讯类别
	 */
	
	@Override
	public int zxadd(String leibie) {
		return DBManager.updateSQL("insert into antadb.newsintype(leibie) value('"+leibie+"')");
	}

	@Override
	public int zxdelete(int id) {
		return DBManager.updateSQL("delete from antadb.newsintype where id=" + id);
	}

	@Override
	public Newsintype getzx(int id) {
		try {
			
			ResultSet rs = DBManager.querySQL("select * from antadb.newsintype where id=" + id);
			while(rs.next()){
				int Id = rs.getInt(1);
				String leibie = rs.getString(2);
				return new Newsintype(Id, leibie);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int zxupdate(int id, String leibie) {
		return DBManager.updateSQL("update antadb.newsintype set leibie='"+leibie+"' where id=" + id);
	}

}
