package com.jiaju.dao;

import java.util.List;

import com.jiaju.entity.Newsin;

public interface NewsinDao {

	List<Newsin> getAllNewsinDaos(int id);

	List<Newsin> getAllNewsinDao();
    int newsinadd(String zixun,String xiangqing,String date);
    int newsindelete(int id);
    Newsin getnew(int id);
    int newsinupdate(int id,String zixun,String xiangqing,String date,String fenlei);
}
