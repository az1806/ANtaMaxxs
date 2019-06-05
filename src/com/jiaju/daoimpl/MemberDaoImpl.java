package com.jiaju.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.jiaju.dao.MemberDao;
import com.jiaju.entity.Member;
import com.jiaju.util.DBManager;


public class MemberDaoImpl implements MemberDao{

	@Override
	public Member querySQL(String userName,String userPassword) {
		
		ResultSet rs=DBManager.querySQL("SELECT * FROM antadb.member where userName='"+userName+"'and userPassword'"+userPassword+"';");
		try {
			while(rs.next()){
				String name=rs.getString(2);
				String pass=rs.getString(3);
				Member list=new Member(name,pass);
				return list;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
