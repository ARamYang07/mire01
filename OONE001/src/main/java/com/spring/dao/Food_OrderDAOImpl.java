package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.spring.dto.Food_OrderVO;

public class Food_OrderDAOImpl implements Food_OrderDAO{
	
	private SqlSession session;
	public void setSqlSession(SqlSession session) {
		this.session= session;
	}


	@Override
	public List<Food_OrderVO> selectList() throws SQLException {
		return session.selectList("Food_Order-Mapper.selectFood_OrderList");
	}

	public Food_OrderVO selectFood_OrderById(String user_id) throws SQLException {
		return session.selectOne("Food_Order-Mapper.selectFood_OrderById",user_id);
	}

	@Override
	public void insertFood_Order(Food_OrderVO food_order) throws SQLException {
		session.insert("Food_Order-Mapper.insertFood_Order",food_order);
		
	}

	@Override
	public void updateFood_Order(Food_OrderVO food_order) throws SQLException {
		session.update("Food_Order-Mapper.updateFood_Order",food_order);
	}

	@Override
	public void deleteFood_Order(String user_id) throws SQLException {
		session.delete("Food_Order-Mapper.deleteFood_Order",user_id);
	}
	
}


