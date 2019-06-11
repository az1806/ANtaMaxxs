package com.jiaju.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jiaju.dao.ProductlistDao;
import com.jiaju.entity.Productlist;
import com.jiaju.entity.Producttype;
import com.jiaju.util.DBManager;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class ProductlistDaoImpl  implements ProductlistDao{
/**
 * 随机获取6件商品
 */
	@Override
	public List<Productlist> getAllProductlistDao() {
		List<Productlist> list = new ArrayList<Productlist>();
		
		ResultSet rs=DBManager.querySQL("SELECT * FROM antadb.productlist order by rand() limit 6;");
		
		try {
			while(rs.next()){
				Productlist bl=new Productlist();
			bl.setId(rs.getInt(1));
			bl.setName(rs.getString(2));
			bl.setSize(rs.getString(3));
			bl.setColor(rs.getString(4));
			bl.setSum(rs.getString(5));
			bl.setJiaqian(rs.getString(6));
			bl.setFenlei(rs.getString(7));
			bl.setXilie(rs.getString(8));
			bl.setImg(rs.getString(9));
			
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
 * 根据id获取商品类别
 */
	@Override
	public List<Productlist> getAllProduct(int typeid) {
		 ResultSet rs=DBManager.querySQL("select * from productlist where fenlei="+typeid );
         List<Productlist> list=new  ArrayList <Productlist>();
try {
	while(rs.next()){
		
		Productlist bl=new Productlist();
		bl.setId(rs.getInt(1));
		bl.setName(rs.getString(2));
		bl.setSize(rs.getString(3));
		bl.setColor(rs.getString(4));
		bl.setSum(rs.getString(5));
		bl.setJiaqian(rs.getString(6));
		bl.setFenlei(rs.getString(7));
		bl.setXilie(rs.getString(8));
		bl.setImg(rs.getString(9));
		
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
 * 根据id获取商品详情
 */
	@Override
	public List<Productlist> Getproduct(int id) {
		
		 ResultSet rs=DBManager.querySQL("select * from productlist where id=" + id);
         List<Productlist> list=new  ArrayList <Productlist>();
try {
	while(rs.next()){
		
		Productlist bl=new Productlist();
		bl.setId(rs.getInt(1));
		bl.setName(rs.getString(2));
		bl.setSize(rs.getString(3));
		bl.setColor(rs.getString(4));
		bl.setSum(rs.getString(5));
		bl.setJiaqian(rs.getString(6));
		bl.setFenlei(rs.getString(7));
		bl.setXilie(rs.getString(8));
		bl.setImg(rs.getString(9));
		
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
	public int addlist(String name, String size, String color, String sum,
			String jiaqian, String fenlei, String xilie, String img) {
		int rs = DBManager.updateSQL("INSERT INTO antadb.productlist ( name, size, color, sum, jiaqian, fenlei, xilie, img) VALUES ('"+ name+ "','"
				+ size+ "','"+ color+ "','"+ sum+ "','"+ jiaqian+ "','"+ fenlei+ "','"+ xilie+ "','" + img + "');");
		return rs;
	}

	public int deletelistById(int id) {
		return DBManager.updateSQL("delete from productlist where id=" + id);
	}
	public Productlist getlistById(int id) {
		ResultSet rs = DBManager.querySQL("select * from productlist where id=" + id);
		try {
		
			
			while(rs.next()){
				int Id = rs.getInt(1);
				String Name = rs.getString(2);
				String Size = rs.getString(3);
				String Color = rs.getString(4);
				String sum = rs.getString(5);
				String jiaqian = rs.getString(6);
				String fenlei = rs.getString(7);
				String xilie = rs.getString(8);
				String img = rs.getString(9);
				return new Productlist(Id, Name,Size,Color,sum,jiaqian,fenlei,xilie,img);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public int updatelistById(int id,String name,String size,String color,String sum,String jiaqian,String fenlei,String xilie,String img) {
		return DBManager.updateSQL("update productlist set name='"+name+"' size='"+size+"' color='"+color+"' sum='"+sum+"' " +
				"jiaqian='"+jiaqian+"' fenlei='"+fenlei+"' xilie='"+xilie+"' img='"+img+"' where id=" + id);
	}

	@Override
	public List<Productlist> productAll() {
		
		 ResultSet rs=DBManager.querySQL("select * from productlist");
        List<Productlist> list=new  ArrayList <Productlist>();
try {
	while(rs.next()){
		
		Productlist bl=new Productlist();
		bl.setId(rs.getInt(1));
		bl.setName(rs.getString(2));
		bl.setSize(rs.getString(3));
		bl.setColor(rs.getString(4));
		bl.setSum(rs.getString(5));
		bl.setJiaqian(rs.getString(6));
		bl.setFenlei(rs.getString(7));
		bl.setXilie(rs.getString(8));
		bl.setImg(rs.getString(9));
		
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
