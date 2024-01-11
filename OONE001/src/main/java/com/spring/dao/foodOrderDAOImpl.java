package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.spring.dto.foodOrderVO;

public class foodOrderDAOImpl implements foodOrderDAO{
	
	private SqlSession session;
	public void setSqlSession(SqlSession session) {
		this.session= session;
	}


	@Override
	public List<foodOrderVO> selectList() throws SQLException {
		return session.selectList("foodOrder-Mapper.selectfoodOrderList");
	}

	@Override
	public void deletefoodOrder(String order_id) throws SQLException {
		session.delete("foodOrder-Mapper.deletefoodOrder", order_id);
	}


	@Override
	public foodOrderVO selectfoodOrderById(String order_id) throws SQLException {
		return session.selectOne("foodOrder-Mapper.selectfoodOrderById", order_id);
	}


	@Override
	public void insertfoodOrder(foodOrderVO foodOrder) throws SQLException {
		session.insert("foodOrder-Mapper.insertfoodOrder",foodOrder);
		
	}


	@Override
	public void updatefoodOrder(foodOrderVO foodOrder) throws SQLException {
		session.update("foodOrder-Mapper.updatefoodOrder",foodOrder);
		
	}
	
}


