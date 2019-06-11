package com.jiaju.dao;

import java.util.List;

import com.jiaju.entity.Member;

public interface MemberDao {

	Member login(String userName,String userPassword);
}
