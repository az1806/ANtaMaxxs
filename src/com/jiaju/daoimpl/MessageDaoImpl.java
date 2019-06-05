package com.jiaju.daoimpl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import com.jiaju.dao.MessageDao;
import com.jiaju.entity.Message;
import com.jiaju.util.DBManager;

public class MessageDaoImpl implements MessageDao {

	@Override
	public int insertMessage(String username, String phone, String email,
			String neirong) {
		return DBManager.updateSQL("INSERT INTO antadb.message " +
				"(name, phone, email, neirong) VALUES ('"+username+"','"+phone+"', '"+email+"', '"+neirong+"');");
	}

	


}
